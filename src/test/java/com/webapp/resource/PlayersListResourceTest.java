package com.webapp.resource;

import com.google.gson.Gson;
import com.webapp.Player;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlayersListResourceTest {

    private Gson gson = new Gson();

    @Test
    public void testGetPlayers() {
        Player player1 = new Player(1, "a");
        Player player2 = new Player(2, "b");
        Player player3 = new Player(3, "c");

        PlayersListResource resource = new PlayersListResource();
        resource.insertPlayer(player1);
        resource.insertPlayer(player3);
        resource.insertPlayer(player2);

        assertEquals(resource.GetPlayers(), gson.toJson(Arrays.asList(player1,player2, player3)));
    }

    @Test
    public void testInsertPlayer() {
        Player player1 = new Player(1, "a");
        Player player2 = new Player(2, "b");

        PlayersListResource resource = new PlayersListResource();

        String ret = resource.insertPlayer(player1);

        assertFalse(ret.isEmpty());
        assertEquals(ret, gson.toJson(Arrays.asList(player1)));

        ret = resource.insertPlayer(player2);
        assertEquals(ret, gson.toJson(Arrays.asList(player1,player2)));

        ret = resource.insertPlayer(player1);
        assertEquals(ret, gson.toJson(Arrays.asList(player1,player2)));
    }
}