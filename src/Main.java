public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        //Проверка добавления
        employeeBook.addEmployee("Игорь", "Александрович", "Донов", 1, 25_000);
        employeeBook.addEmployee("Елена", "Александровна", "Донова", 2, 26_000);
        employeeBook.addEmployee("Станислав", "Максимович", "Шпак", 3, 16_000);
        employeeBook.addEmployee("Екатерина", "Андреевна", "Лебедева", 4, 28_000);
        employeeBook.addEmployee("Артём", "Михайлович", "Муркин", 5, 34_000);
        employeeBook.addEmployee("Жанна", "Аркадьевна", "Ижевская", 1, 18_000);
        employeeBook.addEmployee("Джон", "-", "Мотсон", 2, 30_000);
        employeeBook.addEmployee("Елена", "Леонидовна", "Шагал", 3, 29_000);
        employeeBook.addEmployee("Харитон", "Архипович", "Храпов", 4, 21_000);
        employeeBook.addEmployee("Мустафа", "-", "Халили", 5, 20_000);

        //Проверка увольнения
//        employeeBook.fireEmployee(3);
//        employeeBook.addEmployee("Михаил", "Лаврентьевич", "Гроздь", 4, 12_000);
//        employeeBook.fireEmployee(10);
//        employeeBook.addEmployee("Екатерина", "Андреевна", "Лебедева", 4, 28_000);
//        employeeBook.printAllInformation();

        //Проверка print
//        employeeBook.printAllInformationOfDepartment(1);
//        employeeBook.printFullNames();
//        employeeBook.printSalaryHigherThan(20_000);
//        employeeBook.printSalaryLowerThan(20_000);

        //Проверка count
//        int info;
//        float infof;
//        info = employeeBook.countMonthlySalarySpending();
//        info = employeeBook.countMonthlySalarySpendingInDepartment(1);
//        infof = employeeBook.countSalaryMean();
//        infof = employeeBook.countSalaryMeanInDepartment(1);
//        System.out.println(infof);
//        System.out.println(info);

        //Проверка find
//        employeeBook.findEmployee(9);
//        employeeBook.findHighestSalary();
//        employeeBook.findLowestSalary();
//        employeeBook.findHighestSalaryInDepartment(1);
//        employeeBook.findLowestSalaryInDepartment(1);

        //Проверка index
//        employeeBook.findEmployee(1);
//        employeeBook.indexSalary(10);
//        employeeBook.findEmployee(1);
//        employeeBook.indexSalaryInDepartment(2, 10);
//        employeeBook.findEmployee(1);
    }
}