package com.webapp;

import java.util.Set;
import java.util.TreeSet;

public class PlayerList {

    private Set<Player> sortedListOfPlayers = new TreeSet<Player>();


    public Set<Player> getPlayerList(){
        return sortedListOfPlayers;
    }

    public void addPlayer(Player player){
        sortedListOfPlayers.add(player);
    }
}
