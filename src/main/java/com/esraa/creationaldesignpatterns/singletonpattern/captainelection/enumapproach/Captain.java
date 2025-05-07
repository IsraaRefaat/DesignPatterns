package com.esraa.creationaldesignpatterns.singletonpattern.captainelection.enumapproach;

/*

    ✅ 1. Thread-Safety by Default
          Enums in Java are inherently thread-safe and handled by the JVM.
          You don’t need to write synchronization code manually.

    ✅ 2. Serialization Safe
           With enums, you don't need to override readResolve()
           to maintain the singleton property during deserialization
           — Java ensures a single instance per enum constant.

    ✅ 3. Reflection-Proof
           Unlike other Singleton implementations,
           enums are immune to breaking via reflection.
           You can’t instantiate an enum with reflection (without using unsafe hacks).

    ✅ 4. Simplicity

    ✅ 5. Maintained by the JVM
          Enum singletons are handled specially by the JVM, giving you a level of safety
          and guarantee that’s harder to achieve manually.


 */


public enum Captain {
    CAPTAIN;

    public static Captain getCaptain() {
        return Captain.CAPTAIN;
    }
}
