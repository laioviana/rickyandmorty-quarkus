package com.laio.controller;

import com.laio.service.EpisodeService;
import com.laio.service.LocationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/location")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@AllArgsConstructor
@Slf4j
public class LocationController {

    LocationService locationService;

    @GET
    public Response findAll() {
        return locationService.getAllLocations()
                .map(locations -> Response.ok(locations).build())
                .orElse(Response.status(Response.Status.NO_CONTENT).build());
    }

    @GET
    @Path("/{id}")
    public Response findLocationById (@PathParam("id") Long id) {
        return locationService.getLocationById(id)
                .map(location -> Response.ok(location).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

}
