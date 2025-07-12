package com.saugat.ordermanagementsystem.config;

import com.saugat.ordermanagementsystem.rabbitMQ.Consumer;
import com.saugat.ordermanagementsystem.rabbitMQ.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeoutException;

@Component
public class SqlRunner {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    private Publisher publisher;

    @Autowired
    private Consumer consumer;

    public SqlRunner(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Value("classpath:sql/prequeries.sql")
    private Resource preSql;

    @Value("classpath:sql/postqueries.sql")
    private Resource postSql;

    @EventListener(ApplicationReadyEvent.class)
    public void runSqlScripts() throws IOException, TimeoutException {
        runSqlFile(preSql, "PreSQL");
        runSqlFile(postSql, "PostSQL");
        publisher.generateMessage();
    }

    public void runSqlFile(Resource resource, String label) throws IOException{
        if(resource.exists()){
            String sql = Files.readString(resource.getFile().toPath());
            for(String statement: sql.split(";")){
                String trimmed = statement.trim();
                if(!trimmed.isEmpty()){
                    jdbcTemplate.execute(trimmed);
                }
            }
            System.out.println(label + " executed successfully");

        }else {
            System.out.println(label + " file not found.");
        }
    }


}
