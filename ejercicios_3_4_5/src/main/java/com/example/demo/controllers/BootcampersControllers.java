/*package com.example.demo.controllers;

import com.example.demo.models.Bootcamper;
import com.example.demo.services.BootcamperService;
import jakarta.ws.rs.*;
//import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersControllers {
    private BootcamperService bootcamperService;

    public BootcampersControllers(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno"));
        this.bootcamperService.add(new Bootcamper("dos"));
        this.bootcamperService.add(new Bootcamper("tre"));
        this.bootcamperService.add(new Bootcamper("cuarto"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("appication/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @POST
    @Path("/bootcampers")
    @Produces("appication/json")
    @Consumes("appication/json")
    public Response meterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getName())
        ).build();
    }
}
*/
package com.example.demo.controllers;

import com.example.demo.models.Bootcamper;
import com.example.demo.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersControllers {
    private final BootcamperService bootcamperService;

    public BootcampersControllers(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno"));
        this.bootcamperService.add(new Bootcamper("dos"));
        this.bootcamperService.add(new Bootcamper("tres"));
        this.bootcamperService.add(new Bootcamper("cuatro"));
        this.bootcamperService.add(new Bootcamper("cinco"));

    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);
    }


    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getName())
        ).build();
    }
}

