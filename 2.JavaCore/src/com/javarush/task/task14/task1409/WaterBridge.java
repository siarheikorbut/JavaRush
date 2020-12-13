package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge {

    private final int COUNT = 500;

    @Override
    public int getCarsCount() {
        return COUNT;
    }
}