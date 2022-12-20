public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Михаил", 1, 65410),
                new Employee("Ольга", 2, 64610),
                new Employee("Константин", 3, 74620),
                new Employee("Владимир", 4, 95460),
                new Employee("Евгений", 1, 75520),
                new Employee("Владислав", 5,57840),
                new Employee("Валерия",3,84520)
        };
        EmployeeService.printListEmployee(employees);
        EmployeeService.calculateSalarySumPrint(employees);
        EmployeeService.calculateMinSalaryPrint(employees);
        EmployeeService.calculationMaxSalaryPrint(employees);
        EmployeeService.calculationAverageSalaryPrint(employees);
        EmployeeService.allNameEmployeePrint(employees);
    }


}