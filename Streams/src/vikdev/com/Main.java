package vikdev.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {

    public static void main(String[] args) {

        List<String> someBingoNumber = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50",
                "I26", "I17", "I29",
                "O71"
        );

        List<String> gNumber = new ArrayList<>();

//        someBingoNumber.forEach((number) ->{
//            if (number.startsWith("G")){
//                gNumber.add(number);
//            }
//                }
//                );
//
//        gNumber.sort((String s1,String s2) -> s1.compareTo(s2));
//        gNumber.forEach(s -> System.out.println(s));

        someBingoNumber.stream().map(String :: toUpperCase).filter(s -> s.startsWith("G")).sorted().forEach(System.out::println);

        Stream<String> iNumber = Stream.of("I23", "I32", "N21", "I75", "I22");
        Stream<String> nNumber = Stream.of("I22", "N21", "N90", "I75");
        Stream<String> concatenate = Stream.concat(iNumber, nNumber);
        System.out.println("-----------------------------");
        System.out.println(concatenate.distinct().peek(System.out::println).count());

        System.out.println("-------------------------");

        Employee Vikas = new Employee("Vikas kaushik", 21);
        Employee Sarthak = new Employee("Sarthak Tyagi", 22);
        Employee Archit = new Employee("Archit Sharma", 2);
        Employee Shubham = new Employee("Shubham Dharawal", 28);

        Department hr = new Department("Human Resource");
        hr.addEmployee(Vikas);
        hr.addEmployee(Sarthak);
        hr.addEmployee(Archit);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(Shubham);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream().flatMap(department -> department.getEmployeeList().stream())
                        .forEach(System.out::println);

        System.out.println("-------------------------");
        List<String> sortedGNumber = someBingoNumber
                    .stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.startsWith("G"))
                    .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String s : sortedGNumber){
            System.out.println(s);
        }

        Map<Integer,List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployeeList().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));


        departments.stream().flatMap(department -> department.getEmployeeList().stream())
                .reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Stream.of("ABC","AC","AAA","ACC","BA")
                .filter(s ->{
                    System.out.println(s);
                    return s.length() == 3;
                }).count();


    }
}
