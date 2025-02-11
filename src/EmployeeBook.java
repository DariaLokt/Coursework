public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String name, String patronym, String surname, int departmentNumber, int salary) {
        if (size >= employees.length) {
            throw new ArrayIndexOutOfBoundsException("Нельзя добавить контакт, закончилось место");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(name, patronym, surname, departmentNumber, salary);
                employees[i] = newEmployee;
                size++;
                break;
            }
        }
    }

    public void fireEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Сотрудник " + employees[i].getId() + " удален");
                employees[i] = null;
                size--;
                return;
            }
        }
    }

    public void findEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println(employee);
            }
        }
    }

    public int countPeopleInDepartment(int departmentNumber) {
        int peopleInDepartment = 0;
        for (Employee value : employees) {
            if (value.getDepartmentNumber() == departmentNumber) {
                peopleInDepartment++;
            }
        }
        return peopleInDepartment;
    }

    public Employee[] groupDepartment(int departmentNumber) {
        Employee [] department = new Employee[countPeopleInDepartment(departmentNumber)];
        int i = 0;
        for (Employee value : employees) {
            if (value.getDepartmentNumber() == departmentNumber) {
                department[i] = value;
                i++;
            }
        }
        return department;
    }

    public void printAllInformation() {
        for (Employee value : employees) {
            System.out.println(value);
            System.out.println("----------------------------");
        }
    }

    public void printAllInformationOfDepartment(int departmentNumber) {
        Employee [] department = groupDepartment(departmentNumber);
        for (Employee value : department) {
            System.out.println(value);
            System.out.println("----------------------------");
        }
    }

    public int countMonthlySalarySpending() {
        int monthlySpending = 0;
        for (Employee value : employees) {
            monthlySpending += value.getSalary();
        }
        return monthlySpending;
    }

    public int countMonthlySalarySpendingInDepartment(int departmentNumber) {
        Employee [] department = groupDepartment(departmentNumber);
        int monthlySpending = 0;
        for (Employee value : department) {
            monthlySpending += value.getSalary();
        }
        return monthlySpending;
    }

    public float countSalaryMean() {
        int monthlySpending = countMonthlySalarySpending();
        return (float)monthlySpending / employees.length;
    }

    public float countSalaryMeanInDepartment(int departmentNumber) {
        int monthlySpending = countMonthlySalarySpendingInDepartment(departmentNumber);
        return (float)monthlySpending / groupDepartment(departmentNumber).length;
    }

    public void findLowestSalary() {
        Employee minSalary = employees[0];
        for (Employee value : employees) {
            if (value.getSalary() < minSalary.getSalary()) {
                minSalary = value;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " +
                minSalary.getSurname() + " " + minSalary.getName() + " " + minSalary.getPatronym() + '\n' +
                "Его/её зарплата: " + minSalary.getSalary());
    }

    public void findLowestSalaryInDepartment(int departmentNumber) {
        Employee [] department = groupDepartment(departmentNumber);
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

    public void findHighestSalary() {
        Employee maxSalary = employees[0];
        for (Employee value : employees) {
            if (value.getSalary() > maxSalary.getSalary()) {
                maxSalary = value;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " +
                maxSalary.getSurname() + " " + maxSalary.getName() + " " + maxSalary.getPatronym() + '\n' +
                "Его/её зарплата: " + maxSalary.getSalary());
    }

    public void findHighestSalaryInDepartment(int departmentNumber) {
        Employee [] department = groupDepartment(departmentNumber);
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

    public void indexSalary(int percent) {
        for (Employee value : employees) {
            float newSalary = value.getSalary() * (1 + (float)percent/100);
            value.setSalary((int)newSalary);
        }
    }

    public void indexSalaryInDepartment(int departmentNumber, int percent) {
        for (Employee value : employees) {
            if (value.getDepartmentNumber() == departmentNumber) {
                float newSalary = value.getSalary() * (1 + (float)percent/100);
                value.setSalary((int)newSalary);
            }
        }
    }

    public void printFullNames() {
        for (Employee value : employees) {
            System.out.println(value.getSurname() + " " + value.getName() + " " + value.getPatronym());
        }
    }

    public void printSalaryLowerThan(int salary) {
        for (Employee value : employees) {
            if (value.getSalary() < salary) {
                System.out.println("Сотрудник " + value.getId() + ": " +
                        value.getSurname() + " " + value.getName() + " " + value.getPatronym() +
                        " с зарплатой " + value.getSalary());
                System.out.println("-------------------");
            }
        }
    }

    public void printSalaryHigherThan(int salary) {
        for (Employee value : employees) {
            if (value.getSalary() >= salary) {
                System.out.println("Сотрудник " + value.getId() + ": " +
                        value.getSurname() + " " + value.getName() + " " + value.getPatronym() +
                        " с зарплатой " + value.getSalary());
                System.out.println("-------------------");
            }
        }
    }
}
