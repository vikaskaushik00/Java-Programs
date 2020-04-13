package vikdev.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee vikas = new Employee("Vikas kaushik", 21);
        Employee ansh = new Employee("Ansh kaushik", 16);
        Employee akash = new Employee("Akash kaushik", 23);
        Employee Sarthak = new Employee("Sarthak tyagi", 22);
        Employee Shubham  = new Employee("Shubham Dharawal",22);
        Employee Archit = new Employee("Archit Sharma",21);
        Employee sid = new Employee("Sid Mudgal",17);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(vikas);
        employeeList.add(ansh);
        employeeList.add(akash);
        employeeList.add(Sarthak);
        employeeList.add(Shubham);
        employeeList.add(Archit);
        employeeList.add(sid);

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' '));
        };

//        String last = getLastName.apply(employeeList.get(1));
//        System.out.println("Last name is : " + last);

        Function<Employee,String> getfirstName = (Employee employee) -> {
          return employee.getName().substring(0,employee.getName().indexOf(' '));
        };
//        String first = getfirstName.apply(employeeList.get(1));
//        System.out.println("First name is : " + first);

      for (Employee employee : employeeList){
         String first =  getAName(getfirstName,employee);
         System.out.print("First name : " + first);

          String last =  getAName(getLastName,employee);
          System.out.println(" Last name : " + last);
      }

      Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
      Function<String,String> firstName = name -> name.substring(0,name.indexOf(' '));
      Function chained = upperCase.andThen(firstName);
     //   Function chained = firstName.compose(upperCase); (it works in the reverse order of andThen method)
      System.out.println(chained.apply(employeeList.get(0)));

        BiFunction<String , Employee , String> concatenate = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upper =upperCase.apply(employeeList.get(0));
        System.out.println(concatenate.apply(upper,employeeList.get(0)));

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));

//        for (Employee employee : employeeList){
//            if(employee.getAge() > 20){
//                System.out.println(employee.getName());
//            }
//        }
//
//        employeeList.forEach(employee -> {
//            if(employee.getAge() > 20) {
//                System.out.println(employee.getName());
//            }
////        });
//     printEmployee(employeeList,"Employee under and equals 20 ",employee -> employee.getAge() <= 20);
//     printEmployee(employeeList,"Employee over 20",employee -> employee.getAge() > 20);
//
//        IntPredicate greaterThan15 = i -> i > 15;
//        IntPredicate lessThan100 = i -> i < 100;
//
//
//        System.out.println(greaterThan15.test(500));
//        System.out.println(greaterThan15.and(lessThan100).test(50));
//
//        Random random = new Random();
//        Supplier<Integer> randomNumber = () -> random.nextInt(1000);
//        for (int i = 0; i < 10; i++){
//            System.out.println(randomNumber.get());
//        }
//
//        employeeList.forEach(employee ->{
//            String last =  employee.getName().substring(employee.getName().indexOf(' '));
//            System.out.println("Last name is of " + employee.getName() + " -> " + last);
//        });
    }
    public static String getAName(Function<Employee,String> name, Employee employee){
        return name.apply(employee);
    }
    public static void printEmployee(List<Employee> emp, String age, Predicate<Employee>
                                     ageCondition){
        System.out.println(age);
        System.out.println("=============================");

        for (Employee employee : emp){
            if (ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}
