package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {

    private final int COUNT = 450;

    @Override
    public int getCarsCount() {
        return COUNT;
    }
}