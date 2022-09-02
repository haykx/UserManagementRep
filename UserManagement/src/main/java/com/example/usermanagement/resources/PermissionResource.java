package com.example.usermanagement.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/permission")
public class PermissionResource {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public static String permission(){
        return "<!DOCTYPE HTML><html><body><h1>permissions</h1></body></html>";
    }
}
