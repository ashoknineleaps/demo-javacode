package com.program.dp.bridge;

public interface Remote {

    void on();

    default void off() {
        System.out.println("By Default Remote is OFF Mode");
    }
}
