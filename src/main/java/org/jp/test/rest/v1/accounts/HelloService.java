/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jp.test.rest.v1.accounts;

import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
import org.jp.test.config.JerseyConfiguration;

/**
 * @author daniel.hernandez01
 */
@Component
@Path("/v1/foo")
public class HelloService {

    private final Logger logger = Logger.getLogger(HelloService.class.getName());

    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response sayHello() {
        Response response = Response.status(JerseyConfiguration.SUCCESS_REPONSE).entity("Hi !" + new Date()).build();
        return response;
    }
}
