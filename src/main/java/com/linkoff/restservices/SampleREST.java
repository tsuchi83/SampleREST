package com.linkoff.restservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
/*
@Path("/foo")
public class SampleREST {
 
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String foo() {
    	System.out.println("access foo!");
        return "<b>Hello, World!</b>";
    }
 
}
*/

@Path("/time")
public class SampleREST {

    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Time get() {
    	System.out.println("access foo!");
        return new Time();
    }

}