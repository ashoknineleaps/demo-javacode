package com.program.dp.decorator2;

import java.util.Date;

public class EmployeeImpl implements Employee
{
    private String name;

    @Override
    public void joinDate(Date joindate) {
        System.out.println(this.getName()+ " Join date: "+joindate);
    }

    @Override
    public void terminate(Date terminatedate) {
        System.out.println(this.getName()+ " Terminate date: "+terminatedate);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
