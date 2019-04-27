package br.edu.unicesumar.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class CalculadoraService {
	
	@GET
	@Path("/teste")
	public Response olaMundo() {
		return Response.status(200).entity("ola Mundo").build();
	}

}
