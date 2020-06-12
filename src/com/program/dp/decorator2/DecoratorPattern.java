package com.program.dp.decorator2;

import java.util.Date;

public class DecoratorPattern {

    public static void main(String[] args) {

        Employee employee = new TeamMember(new EmployeeImpl());
        employee.joinDate(new Date());
        employee.terminate(new Date());
        System.out.println();

        Employee employee1 = new Manager(new TeamLead(new TeamMember(new EmployeeImpl())));
        employee1.joinDate(new Date());
        employee1.terminate(new Date());

    }
}
