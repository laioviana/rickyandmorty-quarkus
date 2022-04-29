package com.laio.controller;

import com.laio.service.EpisodeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/episode")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@AllArgsConstructor
@Slf4j
public class EpisodeController {

    EpisodeService episodeService;

    @GET
    public Response findAll() {
        return episodeService.getAllEpisodes()
                .map(episodes -> Response.ok(episodes).build())
                .orElse(Response.status(Response.Status.NO_CONTENT).build());
    }

    @GET
    @Path("/{id}")
    public Response findEpisodeById (@PathParam("id") Long id) {
        return episodeService.getEpisodeById(id)
                .map(episode -> Response.ok(episode).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

}
