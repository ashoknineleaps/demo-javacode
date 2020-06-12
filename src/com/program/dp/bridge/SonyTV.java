package com.program.dp.bridge;

public class SonyTV extends TV
{
    private Remote remote;

    public SonyTV(Remote remote)
    {
        super(remote);
        this.remote = remote;
    }

    @Override
    public void on() {
        System.out.println("Sony TV ON");
        remote.on();
    }

    @Override
    public void off() {
        System.out.println("Sony TV OFF");
        remote.off();
    }
}
