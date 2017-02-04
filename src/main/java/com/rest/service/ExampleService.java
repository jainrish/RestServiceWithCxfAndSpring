package com.rest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.rest.model.Book;

@Path("/example")
@Produces("application/json")
public interface ExampleService {
	@GET
    @Path("{id : \\d+}")
    public List<Book> getBook(@PathParam("id") String id);
}
