public class Employee {
    private final String fullName;

    private int department;
    private int salary;
    private final int id;
    public static int counter;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    public String toString() {
        return "id: " + this.getId() + " Ф.И.О.: " + this.fullName + " Отдел: " + this.getDepartment() + " Зарплата: " + this.getSalary();
    }


    public String getFullName() {
        return this.fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = this.department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

