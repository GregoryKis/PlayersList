package com.webapp;

public class Player implements Comparable<Player>{

    private int id;
    private String name;

    public Player(){   }

    public Player(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return " ID : " + this.id + "   Name : " + this.name;
    }

    public int compareTo(Player o) {
        return this.id - o.id;
    }
}
