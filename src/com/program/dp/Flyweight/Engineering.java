package com.program.dp.Flyweight;

import java.util.Random;

public class Engineering {

    private static String[]  employeeType = {"Developer", "Tester"};
    private static String[]  skills = {"Java", "Spring Boot", "C++", "C", "Python", ".Net", "ReactJS"};

    public static void main(String[] args) {

        for (int i=0; i<10; i++)
        {
            Employee employee = EmployeeFlyweight.getEmployee(getRandomEmployee());

            employee.assignSkill(getRandomSkill());
            employee.task();
        }
    }

    public static String getRandomEmployee()
    {
        Random random = new Random();
        int randomInt = random.nextInt(employeeType.length);

        return employeeType[randomInt];
    }

    public static String getRandomSkill()
    {
        Random random = new Random();
        int randomInt = random.nextInt(skills.length);

        return skills[randomInt];
    }
}
