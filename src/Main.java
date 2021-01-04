import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("KA1", 100, 50, 200));
        employees.add(new FullTimeEmployee("KA2", 20, 10, 150));
        employees.add(new FullTimeEmployee("KA3", 15, 3, 170));
        EmployeeManager chau = new EmployeeManager();
        EmployeeManager oanh = new EmployeeManager();
        chau.setEmployeeList(employees);
        Employee nv1 = new PartTimeEmployee("KA4", 1);
//        chau.showAllEmployee();
        chau.addNewEmployee(nv1);
        chau.addNewEmployee(new PartTimeEmployee("KA5", 2));
        List<Employee> employees1 = chau.getEmployeeList();
        Collections.sort(employees1);
        for (Employee e:employees1
             ) {
            System.out.println(e);
        }
//        int sum = chau.getAllSalaryOfPartTime();
//        System.out.println(sum);
//        List<Employee> employees1 = chau.sortSalaryFutime();
//        for (Employee e: employees1){
//            System.out.println(e);
//        }
    }
}