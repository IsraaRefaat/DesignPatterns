package com.esraa.creationaldesignpatterns.singletonpattern.captainelection.eagerapproach;

public final class Captain {
    private static final Captain captain = new Captain();

    private Captain() {
        System.out.println("Captain Elected for the team");
    }

    public static Captain getInstance() {
        System.out.println("You already have a captain");
        return captain;
    }
}
