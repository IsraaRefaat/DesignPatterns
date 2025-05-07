package com.esraa.creationaldesignpatterns.singletonpattern.captainelection.lazyapproach;

/*
    Pros:
      - Straightforward and cleaner
      - Thread-safe
      - There is a small lag time when the application is already in execution
        mode because all kinds of stuff is already loaded in memory.

    Cons:
      - The application will take longer to start (compared to lazy
        initialization) because everything needs to be loaded first.

 */


public final class Captain {
    private static Captain captain;
    private Captain() {}

    public static synchronized Captain getCaptain() {
        if(captain == null) {
            captain = new Captain();
            System.out.println("Captain Elected");
        }
        else {
            System.out.println("You are already have a captain");
        }
        return captain;

    }
}
