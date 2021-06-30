package programs.CH8;

public class EmployeeClass {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("Aman");
        emp.setSalary(10000);

        System.out.println("Name:" + emp.getName() + "\nSalary:" + emp.getSalary());
    }
}

class Employee {
    public int sal;
    public String name;

    public void setName(String n){
        name = n;
    }

    public void setSalary(int s) {
        sal = s;
    }

    public int getSalary() {
        return sal;
    }

    public String getName() {
        return name;
    }
}