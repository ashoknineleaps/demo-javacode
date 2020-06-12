package com.program.dp.decorator2;

import java.util.Date;

public abstract class EmployeeDecorator implements Employee{

    protected Employee employee;

    public EmployeeDecorator(Employee employee)
    {
        this.employee = employee;
    }

    @Override
    public void joinDate(Date joindate) {
        employee.joinDate(joindate);
    }

    @Override
    public void terminate(Date terminatedate) {
        employee.terminate(terminatedate);
    }
}
