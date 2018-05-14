package com.webapp.resource;

import com.google.gson.*;
import com.webapp.Player;
import com.webapp.PlayerList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/players-list")
public class PlayersListResource {

    private PlayerList players = new PlayerList();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String GetPlayers() {

        return new Gson().toJson(players.getPlayerList());
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String insertPlayer(Player player) {

        players.addPlayer(player);

        return GetPlayers();
    }
}
