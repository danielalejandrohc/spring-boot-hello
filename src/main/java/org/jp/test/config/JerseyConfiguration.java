package org.jp.test.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.jp.test.rest.v1.accounts.HelloService;

/**
 * 
 * @author daniel
 */
@Configuration
@ApplicationPath("rest")
public class JerseyConfiguration extends ResourceConfig {

    // JSON file with some accounts
    public static final String ACCOUNT_FILE = "accounts.json";
    
    public static final int SUCCESS_REPONSE = 200;
    public static final int ERROR_REPONSE = 500;
    public static final String OK_JSON_RESPONSE = "{\n" +
            "    \"code\": 200,\n" +
            "    \"message\": \"Operation performed\"\n" +
            "}";

    public JerseyConfiguration() {

    }
    
    /**
     * Setup the services that we will provide
     */
    @PostConstruct
    public void setUp() {
        register(GenericExceptionMapper.class);
        register(HelloService.class);
    }
}
