package com.program.dp.decorator2;

public class TeamMember extends EmployeeDecorator{

    private String name;

    public TeamMember(Employee employee)
    {
        super(employee);
    }

    public void performTask()
    {
        System.out.println(name+": Performing Assigned task");
    }

    public void coordinateWithOthers()
    {
        System.out.println(name+": coordinating with other members of his team");
    }
}
