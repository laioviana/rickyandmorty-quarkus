package com.laio.controller;

import com.laio.service.CharacterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/character")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@AllArgsConstructor
@Slf4j
public class CharacterController {

    CharacterService characterService;

    @GET
    public Response findAll() {
        return characterService.getAllCharacter()
                .map(characters -> Response.ok(characters).build())
                .orElse(Response.status(Response.Status.NO_CONTENT).build());
    }

    @GET
    @Path("/{id}")
    public Response findEpisodeById (@PathParam("id") Long id) {
        return characterService.getCharacterById(id)
                .map(character -> Response.ok(character).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

}
