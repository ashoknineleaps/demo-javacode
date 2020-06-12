package com.program.dp.Flyweight;

public class Tester implements Employee{

    private final String job;

    private String skill;

    public Tester()
    {
        this.job = "Test the Issue";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Tester with skill: "+this.skill+" with job: "+this.job);
    }
}
