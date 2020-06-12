package com.program.dp.decorator2;

public class Manager extends EmployeeDecorator
{
    public Manager(Employee employee)
    {
        super(employee);
    }

    public void assignedTask()
    {
        System.out.println("Manager Assigned task");
    }

    public void employeeProfiling()
    {
        System.out.println("Manager profiling employees.");
    }

    public void createRequirement()
    {
        System.out.println("Manager creating requirement documents");
    }
}
