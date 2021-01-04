import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void showAllEmployee(){
        for (Employee e:employeeList
             ) {
            System.out.println(e);
        }
    }

    public void addNewEmployee(Employee e){
        employeeList.add(e);
    }
    public int getAvgSalary(){
        int sumSalary=0;
        for (Employee e:employeeList
             ) {
            sumSalary += e.getSalary();
        }
        int avgSalary = sumSalary/employeeList.size();
        return avgSalary;
    }

    public List<Employee> getAllEmployeeSalaryUnder(int salary){
        List<Employee> employees = new ArrayList<>();
        for (Employee e:employeeList
             ) {
            if (e.getSalary()< salary) employees.add(e);
        }
        return employees;
    }

    public int getAllSalaryOfPartTime(){
        int sum = 0;
        for (Employee e:employeeList
             ) {
            if(e instanceof PartTimeEmployee) sum+= e.getSalary();
        }
        return sum;
    }

    public List<Employee> sortSalaryFutime(){
        List<Employee> employees = new ArrayList<>();
        for (Employee e:employeeList
             ) {
            if (e instanceof FullTimeEmployee) employees.add(e);
        }

        for (int i = 1; i < employees.size(); i++) {
            for (int j = 0; j < employees.size()-i; j++) {
                if (employees.get(j).getSalary() > employees.get(j+1).getSalary()){
                    Employee e = employees.get(j);
                    employees.set(j, employees.get(j+1));
                    employees.set(j+1, e);
                }
            }
        }

        return employees;
    }
}