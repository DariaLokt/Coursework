public class Main {
    public static void printAllInformation(Employee [] employee) {
        for (Employee value : employee) {
            System.out.println(value);
            System.out.println("----------------------------");
        }
    }

    public static int countMonthlySalarySpending(Employee [] employee) {
        int monthlySpending = 0;
        for (Employee value : employee) {
            monthlySpending += value.getSalary();
        }
        return monthlySpending;
    }

    public static void findLowestSalary(Employee [] employee) {
        Employee minSalary = employee[0];
        for (Employee value : employee) {
            if (value.getSalary() < minSalary.getSalary()) {
                minSalary = value;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " +
                minSalary.getSurname() + " " + minSalary.getName() + " " + minSalary.getPatronym() + '\n' +
                "Его/её зарплата: " + minSalary.getSalary());
    }

    public static void findHighestSalary(Employee [] employee) {
        Employee maxSalary = employee[0];
        for (Employee value : employee) {
            if (value.getSalary() > maxSalary.getSalary()) {
                maxSalary = value;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " +
                maxSalary.getSurname() + " " + maxSalary.getName() + " " + maxSalary.getPatronym() + '\n' +
                "Его/её зарплата: " + maxSalary.getSalary());
    }

    public static int countSalaryMean(Employee [] employee) {
        int monthlySpending = countMonthlySalarySpending(employee);
        return monthlySpending / employee.length;
    }

    public static void printFullNames(Employee [] employee) {
        for (Employee value : employee) {
            System.out.println(value.getSurname() + " " + value.getName() + " " + value.getPatronym());
        }
    }

    public static void main(String[] args) {
        Employee [] employees = new Employee[10];
        employees[0] = new Employee("Василий", "Николаевич", "Петров", 1, 25_000);
        employees[1] = new Employee("Ксения", "Сергеевна", "Кубанова", 2, 17_000);
        employees[2] = new Employee("Артём", "Константинович", "Шлейхер", 3, 35_000);
        employees[3] = new Employee("Виктор", "Сергеевич", "Братов", 4, 26_000);
        employees[4] = new Employee("Андрей", "Дмитриевич", "Гладких", 5, 30_000);
        employees[5] = new Employee("Мария", "Александровна", "Славина", 1, 19_000);
        employees[6] = new Employee("Александра", "Петровна", "Яшминская", 2, 28_000);
        employees[7] = new Employee("Максим", "Павлович", "Цитко", 3, 26_000);
        employees[8] = new Employee("Павел", "Максимович", "Трапов", 4, 29_000);
        employees[9] = new Employee("Мария", "Игоревна", "Романова", 5, 20_000);
        printAllInformation(employees);
        int salarySpending = countMonthlySalarySpending(employees);
        System.out.println("salarySpending = " + salarySpending);
        findLowestSalary(employees);
        findHighestSalary(employees);
        int salaryMean = countSalaryMean(employees);
        System.out.println("salaryMean = " + salaryMean);
        printFullNames(employees);
    }
}