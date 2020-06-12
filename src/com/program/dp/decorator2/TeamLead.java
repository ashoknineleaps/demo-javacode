package com.program.dp.decorator2;

public class TeamLead extends EmployeeDecorator{

    public TeamLead(Employee employee)
    {
        super(employee);
    }

    public void planing()
    {
        System.out.println("Team Lead Planing");
    }

    public void motivate()
    {
        System.out.println("Team Lead Motivating his member");
    }
}
