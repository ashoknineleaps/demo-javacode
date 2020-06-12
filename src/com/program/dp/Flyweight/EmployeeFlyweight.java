package com.program.dp.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFlyweight {

    private static Map<String, Employee> map = new HashMap<>();

    public static Employee getEmployee(String type)
    {
        Employee employee = null;

        if(map.containsKey(type))
        {
            employee = map.get(type);
        }
        else
        {
            switch (type)
            {
                case "Developer":
                    System.out.println("Developer Created");
                    employee = new Developer();
                    break;

                case "Tester":
                    System.out.println("Tester Created");
                    employee = new Tester();
                    break;

                default:
                    System.out.println("No Such Employee");
            }

            map.put(type, employee);
        }

        return employee;
    }
}
