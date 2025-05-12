package com.esraa.structuraldesignpatterns.flyweightpattern;

public class Client {
    public static void main(String[] args) {
        PlayerFactory factory = new PlayerFactory();
        Player player1 = factory.getPlayer("BlueTeamPlayer");
        player1.mission = "Go to the home";
        player1.weapon = "Sword";
        player1.render();


        Player player2 = factory.getPlayer("BlueTeamPlayer");
        player2.mission = "Go to the Kitchen";
        player2.weapon = "Knife";
        player2.render();

        System.out.println(player1);
        System.out.println(player2);

    }
}
