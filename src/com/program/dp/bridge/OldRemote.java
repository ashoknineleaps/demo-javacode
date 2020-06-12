package com.program.dp.bridge;

public class OldRemote implements Remote{

    @Override
    public void on() {
        System.out.println("ON with OLD Remote");
    }

    @Override
    public void off() {
        System.out.println("OFF with OLD Remote");
    }
}
