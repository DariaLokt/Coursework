public class Main {
    public static int countPeopleInDepartment(Employee [] employee, int departmentNumber) {
        int peopleInDepartment = 0;
        for (Employee value : employee) {
            if (value.getDepartmentNumber() == departmentNumber) {
                peopleInDepartment++;
            }
        }
        return peopleInDepartment;
    }

    public static Employee[] groupDepartment(Employee [] employee, int departmentNumber) {
        Employee [] department = new Employee[countPeopleInDepartment(employee,departmentNumber)];
        int i = 0;
        for (Employee value : employee) {
            if (value.getDepartmentNumber() == departmentNumber) {
                department[i] = value;
                i++;
            }
        }
        return department;
    }

    public static void printAllInformation(Employee [] employee) {
        for (Employee value : employee) {
            System.out.println(value);
            System.out.println("----------------------------");
        }
    }

    public static void printAllInformationOfDepartment(Employee [] employee, int departmentNumber) {
        Employee [] department = groupDepartment(employee, departmentNumber);
        for (Employee value : department) {
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

    public static int countMonthlySalarySpendingInDepartment(Employee [] employee, int departmentNumber) {
        Employee [] department = groupDepartment(employee, departmentNumber);
        int monthlySpending = 0;
        for (Employee value : department) {
            monthlySpending += value.getSalary();
        }
        return monthlySpending;
    }

    public static float countSalaryMean(Employee [] employee) {
        int monthlySpending = countMonthlySalarySpending(employee);
        return (float)monthlySpending / employee.length;
    }

    public static float countSalaryMeanInDepartment(Employee [] employee, int departmentNumber) {
        int monthlySpending = countMonthlySalarySpendingInDepartment(employee, departmentNumber);
        return (float)monthlySpending / groupDepartment(employee, departmentNumber).length;
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

    public static void findLowestSalaryInDepartment(Employee [] employee, int departmentNumber) {
        Employee [] department = groupDepartment(employee, departmentNumber);
        Employee minSalary = department[0];
        for (Employee value : department) {
            if (value.getSalary() < minSalary.getSalary()) {
                minSalary = value;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + departmentNumber + ": " +
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

    public static void findHighestSalaryInDepartment(Employee [] employee, int departmentNumber) {
        Employee [] department = groupDepartment(employee, departmentNumber);
        Employee maxSalary = department[0];
        for (Employee value : department) {
            if (value.getSalary() > maxSalary.getSalary()) {
                maxSalary = value;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + departmentNumber + ": " +
                maxSalary.getSurname() + " " + maxSalary.getName() + " " + maxSalary.getPatronym() + '\n' +
                "Его/её зарплата: " + maxSalary.getSalary());
    }

    public static void indexSalary(Employee[] employee, int percent) {
        for (Employee value : employee) {
            float newSalary = value.getSalary() * (1 + (float)percent/100);
            value.setSalary((int)newSalary);
        }
    }

    public static void indexSalaryInDepartment(Employee[] employee, int departmentNumber, int percent) {
        for (Employee value : employee) {
            if (value.getDepartmentNumber() == departmentNumber) {
                float newSalary = value.getSalary() * (1 + (float)percent/100);
                value.setSalary((int)newSalary);
            }
        }
    }

    public static void printFullNames(Employee [] employee) {
        for (Employee value : employee) {
            System.out.println(value.getSurname() + " " + value.getName() + " " + value.getPatronym());
        }
    }

    public static void printSalaryLowerThan(int salary, Employee [] employee) {
        for (Employee value : employee) {
            if (value.getSalary() < salary) {
                System.out.println("Сотрудник " + value.getId() + ": " +
                        value.getSurname() + " " + value.getName() + " " + value.getPatronym() +
                        " с зарплатой " + value.getSalary());
                System.out.println("-------------------");
            }
        }
    }

    public static void printSalaryHigherThan(int salary, Employee [] employee) {
        for (Employee value : employee) {
            if (value.getSalary() >= salary) {
                System.out.println("Сотрудник " + value.getId() + ": " +
                        value.getSurname() + " " + value.getName() + " " + value.getPatronym() +
                        " с зарплатой " + value.getSalary());
                System.out.println("-------------------");
            }
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

        findLowestSalaryInDepartment(employees,2);
        findHighestSalaryInDepartment(employees, 2);
        int salarySpendingInDepartment1 = countMonthlySalarySpendingInDepartment(employees, 1);
        System.out.println(salarySpendingInDepartment1);
        float salaryMeanInDepartment1 = countSalaryMeanInDepartment(employees, 1);
        System.out.println("salaryMeanInDepartment1 = " + salaryMeanInDepartment1);
        System.out.println(employees[0].getSalary() + " " + employees[5].getSalary());
        indexSalaryInDepartment(employees, 1, 10);
        System.out.println(employees[0].getSalary() + " " + employees[5].getSalary());
        printAllInformationOfDepartment(employees, 1);
        printSalaryLowerThan(20_000, employees);
        printSalaryHigherThan(25_000, employees);
    }
}