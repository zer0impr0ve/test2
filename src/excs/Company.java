package excs;

import java.util.Arrays;

public class Company {
    private String name;
    private Employee[] employees = new Employee[5];

    public Company(String name){
        this.name = name;
    }

    public void setEmployees(Employee[] employees){
        this.employees = employees;
    }

    public double getAverageAge(){
        int sum = 0;
        for (int i = 0; i < employees.length; i++){
           sum += employees[i].getAge();
        }
        return ((double) sum / employees.length);
    }

    @Override
    public String toString() {
        return "Company name: " + name + ",\n Employees: " + Arrays.toString(employees)
                + ",\n their average age: " + getAverageAge();
    }
}
