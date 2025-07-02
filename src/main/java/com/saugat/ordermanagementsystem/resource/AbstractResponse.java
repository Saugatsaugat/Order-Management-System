package com.saugat.ordermanagementsystem.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;

import java.util.Collection;

public abstract class AbstractResponse {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public ResponseEntity<String> responseBuilder(boolean success, String message, Object object) {
        try {
            JSONObject jsonObject = new JSONObject()
                    .put("success", success)
                    .put("message", message);

            if (object instanceof JSONObject) {
                jsonObject.put("result", object);
            } else if (object instanceof Collection) {
                Collection<?> col = (Collection<?>) object;
                jsonObject.put("result", new JSONArray(objectMapper.writeValueAsString(col)));
            } else if (object != null) {
                jsonObject.put("result", new JSONObject(objectMapper.writeValueAsString(object)));
            } else {
                jsonObject.put("result", new JSONObject());
            }
            return ResponseEntity.ok(jsonObject.toString());

        } catch (Exception ex) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
