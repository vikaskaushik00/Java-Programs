package vikdev.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//    new Thread(() -> {
//        System.out.println("Printing the message");
//        System.out.println("This is corona time ");
//        System.out.println("Stay home be Safe");
//    }).start();

    Employee vikas = new Employee("Vikas", 21);
    Employee ansh = new Employee("Ansh", 16);
    Employee akash = new Employee("Akash", 23);
    Employee Sarthak = new Employee("Sarthak", 22);

    List<Employee> employeeList = new ArrayList<Employee>();
    employeeList.add(vikas);
    employeeList.add(ansh);
    employeeList.add(akash);
    employeeList.add(Sarthak);





//        Collections.sort(employeeList, new Comparator<Employee>(){
//            public int compare(Employee employee1, Employee employee2){
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employeeList, ( employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

//       for (Employee employee : employeeList){
//           System.out.println(employee.getName());
//           new Thread(() -> System.out.println(employee.getAge())).start();
//       }

        employeeList.forEach(employee -> {
            System.out.println(employee.getName() + " -> " + employee.getAge());
        });
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

