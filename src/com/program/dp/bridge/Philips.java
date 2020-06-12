package com.program.dp.bridge;

public class Philips extends TV
{
    private Remote remote;

    public Philips(Remote remote)
    {
        super(remote);
        this.remote = remote;
    }

    @Override
    public void on() {
        System.out.println("Philips TV ON");
        remote.on();
    }

    @Override
    public void off() {
        System.out.println("Philips TV OFF");
        remote.off();
    }
}
