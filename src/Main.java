

public class Main {
    private final static Employee[] employees = new Employee[10];
    private static String getFullname;


    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 15000);
        employees[1] = new Employee("Danilov Misha Ivanovich", 1, 25000);
        employees[2] = new Employee("Sidorova Maria Nikolaevna", 2, 10000);
        employees[3] = new Employee("Sergeev Ivan Sergeevich", 2, 15500);
        employees[4] = new Employee("Garanin Roman Vladimirovich", 3, 35000);
        employees[5] = new Employee("Islamov Ruslan Alexandrovich", 3, 16000);
        employees[6] = new Employee("Mavrina Olga Sergeevna", 4, 18000);
        employees[7] = new Employee("Davidova Irina Ivanovna", 4, 19000);
        employees[8] = new Employee("Alekseev Bulat Nikolaevich", 5, 21000);
        employees[9] = new Employee("Suvorov Ivan Sergeevich", 5, 27000);
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("Сумма затрат на зарплату в месяц: " + sumSalary());
        System.out.println("Максимальная зарплата: " + maxSalary());
        System.out.println("Минимальная зарплата: " + minSalary());
        System.out.println("Средняя зарплата: " + middleSalary());
        printFullName();
    }

    public static void printFullName() {
        for (Employee employees : employees) {
            if (employees != null) {
                System.out.println("ФИО: " + employees.getFullName());
            }
        }
    }


    public static int sumSalary() {
        int sum = 0;
        for (Employee employees : employees) {
            if (employees != null) {
                sum += employees.getSalary();
            }
        }
        return sum;
    }

    public static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employees : employees) {
            if (employees != null && employees.getSalary() > max) {
                max = employees.getSalary();
                targetEmployee = employees;
            }
        }
        return targetEmployee;
    }

    public static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employees : employees) {
            if (employees != null && employees.getSalary() < min) {
                min = employees.getSalary();
                targetEmployee = employees;
            }
        }
        return targetEmployee;
    }

    public static int middleSalary() {
        int middle = 0;
        int employeeCount = 0;
        for (Employee employees : employees) {
            if (employees != null) {
                employeeCount++;
            }
        }
        middle = sumSalary() / employeeCount;
        return middle;
    }

    public static int [] massive(int[] arr)  {
        int[] massive2 = new int[5];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
            if (i >= 3 && i <= 7) {
                massive2[j] = arr[i];
                j++;
            }
        }
        return massive2;
    }
}