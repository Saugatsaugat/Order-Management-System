package com.saugat.ordermanagementsystem.controller;

import com.saugat.ordermanagementsystem.constants.ApplicationConstants;
import com.saugat.ordermanagementsystem.service.IService;
import com.saugat.ordermanagementsystem.service.UserService;
import com.saugat.ordermanagementsystem.wrapper.UserVo;
import com.saugat.ordermanagementsystem.wrapper.login.LoginRequestDTO;
import com.saugat.ordermanagementsystem.wrapper.login.LoginResponseDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.stream.Collectors;

@RestController("userController")
@RequestMapping("/user")
public class UserController extends AbstractController<UserVo> {

    @Autowired
    private UserService service;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private Environment env;

    @Override
    protected IService getService() {
        return service;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> userLogin(@RequestBody LoginRequestDTO loginRequest) {
        String jwt = "";
        Authentication authentication = UsernamePasswordAuthenticationToken.unauthenticated(loginRequest.username(), loginRequest.password());
        Authentication authenticationResponse = authenticationManager.authenticate(authentication);

        if (null != authenticationResponse && authenticationResponse.isAuthenticated()) {
            if (null != env) {
                String secret = env.getProperty(ApplicationConstants.JWT_SECRET_KEY, ApplicationConstants.JWT_SECRET_DEFAULT_VALUE);
                SecretKey secretKey = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
                jwt = Jwts.builder().issuer("Order Management System").subject("JWT Token")
                        .claim("username", authenticationResponse.getName())
                        .claim("authorities", authenticationResponse.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.joining(",")))
                        .issuedAt(new Date())
                        .expiration(new Date((new Date()).getTime() + 3000000))
                        .signWith(secretKey).compact();
            }
        }
        return ResponseEntity.status(HttpStatus.OK).header(ApplicationConstants.JWT_HEADER, jwt)
                .body(new LoginResponseDTO(HttpStatus.OK.getReasonPhrase(), jwt));

    }
}