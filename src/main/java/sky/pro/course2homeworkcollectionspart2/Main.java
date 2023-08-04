package sky.pro.course2homeworkcollectionspart2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static Map<String, Employee> employees;

    public static void main(String[] args) {
        employees = new HashMap<>(Map.of());
//                "Виноградов Иван Максимович",
//                new Employee("Виноградов Иван Максимович", 320000,1),
//                "Егоров Вадим Маркович",
//                new Employee("Егоров Вадим Маркович", 320000, 1),
//               "Филатов Макар Дмитриевич",
//                new Employee("Филатов Макар Дмитриевич", 320000, 1),
//                "Нечаев Александр Александрович",
//                new Employee(""Нечаев Александр Александрович", 320000, 2);
        System.out.println(getEmployees());
        if (employees.isEmpty()) {
            System.out.println("ybxtuj");
        }
        ;
    }

    public static StringBuilder getEmployees() {
        StringBuilder rezString = new StringBuilder("");
        for (Employee employee : employees.values()) {
            rezString.append(employee.getFullName() + " " + employee.getSalary() + " " + employee.getId() + "\n");
        }
        return rezString;
    }
}

//    public static Map<String, Employee> getEmployees() {
//        return employees;
//    }
