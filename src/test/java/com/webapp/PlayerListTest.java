package com.webapp;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerListTest {

    @Test
    public void testPlayersListAdd(){
        PlayerList list = new PlayerList();

        Player player = new Player(1 , "a");

        list.addPlayer(player);

        assertTrue(list.getPlayerList().contains(player));
    }

    @Test
    public void testPlayersListSorted(){
        PlayerList list1 = new PlayerList();
        PlayerList list2 = new PlayerList();

        Player player1 = new Player(1 , "a");
        Player player2 = new Player(2 , "b");
        Player player3 = new Player(3 , "c");

        list1.addPlayer(player1);
        list1.addPlayer(player3);
        list1.addPlayer(player2);

        list2.addPlayer(player2);
        list2.addPlayer(player3);
        list2.addPlayer(player1);

        assertTrue(list1.getPlayerList().equals(list2.getPlayerList()));
        assertTrue(list1.getPlayerList().toArray()[0].equals(list2.getPlayerList().toArray()[0]));
    }
}