package com.program.dp.bridge;

public class Client {

    public static void main(String[] args) {

        TV sonyTVOldRemote = new SonyTV(new OldRemote());
        sonyTVOldRemote.on();
        sonyTVOldRemote.off();
        System.out.println("========================");

        TV sonyTVNewRemote = new SonyTV(new NewRemote());
        sonyTVNewRemote.on();
        sonyTVNewRemote.off();
        System.out.println("========================");

        TV philipsTVOldRemote = new Philips(new OldRemote());
        philipsTVOldRemote.on();
        philipsTVOldRemote.off();
        System.out.println("========================");

        TV philipsTVNewRemote = new Philips(new NewRemote());
        philipsTVNewRemote.on();
        philipsTVNewRemote.off();
        System.out.println("========================");

    }
}
