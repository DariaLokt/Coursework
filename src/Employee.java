import java.util.Objects;

public class Employee {
    private final String name;
    private final String surname;
    private final String patronym;
    private int departmentNumber;
    private int salary;
    private final int id;
    public static int idIncrease = 0;

    public Employee(String name, String patronym, String surname, int departmentNumber, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronym = patronym;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = idIncrease;
        idIncrease++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronym() {
        return patronym;
    }

    public int getId() {
        return id;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronym, employee.patronym);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronym, id);
    }

    @Override
    public String toString() {
        return "Сотрудник " + id + '\n' +
                "Фамилия: " + surname + '\n' +
                "Имя: " + name + '\n' +
                "Отчество: " + patronym + '\n' +
                "Номер отдела: " + departmentNumber + '\n' +
                "Зарплата: " + salary;
    }
}
