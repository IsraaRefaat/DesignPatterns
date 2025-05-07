package com.esraa.creationaldesignpatterns.singletonpattern.captainelection.billpughapproach;

/*

    - It uses a static inner class to create the singleton instance,
      taking advantage of the Java class loader mechanism to ensure lazy initialization and thread safety.

    | Feature             | Description                                                                    |
    | ------------------- | ------------------------------------------------------------------------------ |
    | Lazy Initialization | The instance is created only when `getInstance()` is called.                   |
    | Thread-Safe         | No need for `synchronized` keyword. Java ensures class loading is thread-safe. |
    | Efficient           | No unnecessary synchronization or locking.                                     |
    | Simple              | Clean and concise compared to other singleton approaches.                      |


 */


public final class Captain {

    private Captain() {
        System.out.println("Captain Elected for the team");
    }

    static class BillPughEx {
        private static final Captain captain = new Captain();
    }

        public static Captain getCaptain() {
            return BillPughEx.captain;
        }

}
