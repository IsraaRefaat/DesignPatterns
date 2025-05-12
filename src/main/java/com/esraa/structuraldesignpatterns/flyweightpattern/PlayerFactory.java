package com.esraa.structuraldesignpatterns.flyweightpattern;

import java.util.HashMap;

public class PlayerFactory {
    private HashMap<String, Player> players = new HashMap<>();

    public Player getPlayer(String type) {
        if(players.containsKey(type)) {
            return players.get(type);
        }
        else {
            if(type.equalsIgnoreCase("RedTeamPlayer")) {
                players.put(type, new RedTeamPlayer());
                return players.get(type);
            }
            else if(type.equalsIgnoreCase("BlueTeamPlayer")) {
                players.put(type, new BlueTeamPlayer());
                return players.get(type);
            }
            else{
                throw new RuntimeException("Unrecognized player type");
            }
        }
    }

}
