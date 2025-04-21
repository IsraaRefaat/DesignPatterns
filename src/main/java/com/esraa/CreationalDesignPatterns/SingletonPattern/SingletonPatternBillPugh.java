package com.esraa.CreationalDesignPatterns.SingletonPattern;

public class SingletonPatternBillPugh {
    private static SingletonPatternBillPugh instance;

    private SingletonPatternBillPugh() {}

    private static class SingletonHelper {
        private static final SingletonPatternBillPugh instance = new SingletonPatternBillPugh();
    }

    public static SingletonPatternBillPugh getInstance() {
        return SingletonHelper.instance;
    }

}
