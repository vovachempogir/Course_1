public class EmployeeService {

    public static void printListEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void calculateSalarySumPrint(Employee[] employees) {
        System.out.println("Зарплата всех сотрудников: " + calculateSalarySum(employees) + " рублей");
    }

    private static int calculateSalarySum(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salarySum += employee.getSalary();
            }
        }
        return salarySum;
    }

    public static void calculateMinSalaryPrint(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() == calculateMinSalary(employees)) {
                    System.out.println("Сотрудник с минимальной зарплатой: " + employee + " рублей");
                }
            }
        }
    }

    private static int calculateMinSalary(Employee[] employees) {
        int minSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                minSalary = employees[i].getSalary();
            }
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public static void calculationMaxSalaryPrint(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() == calculationMaxSalary(employees)) {
                    System.out.println("Сотрудник с максимальной зарплатой: " + employee + " рублей");
                }
            }
        }
    }

    private static int calculationMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        return maxSalary;
    }

    public static void calculationAverageSalaryPrint(Employee[] employees) {
        System.out.println(" Средняя зарплата сотрудников: " + calculationAverageSalary(employees) + " рублей");
    }

    private static int calculationAverageSalary(Employee[] employees) {
        int averageSalary = 0;
        int count = 0;
        for (Employee employee:employees ) {
            if (employee != null) {
                count++;
            }
        }
        averageSalary = calculateSalarySum(employees) / count;
        return averageSalary;
    }

    public static void allNameEmployeePrint(Employee[] employees) {
        StringBuilder allName = new StringBuilder();
        allName.append("Имена сотрудников: " + "\n");
        for (Employee employee : employees) {
            if (employee != null) {
                String s = employee.getName();
                allName.append(s).append("\n");
            }
        }
        String name = allName.toString();
        System.out.println(name);
    }
}
