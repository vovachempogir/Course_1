import java.util.Objects;

public class Employee {
    private final String name;

    private int department;

    private int salary;

    private static int count;

    private int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        if (checkDepartmentValue(department)) {
            this.department = department;
        }
        this.salary = salary;
        id = count++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        if (checkDepartmentValue(department)) {
            this.department = department;
        }
    }

    private boolean checkDepartmentValue(int department) {

        if (department > 5 || department <= 0) {
            throw new IllegalArgumentException(" Значение отдела должно быть от 1 до 5 ");
        }
        return true;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employee.salary==0 && salary== 0 && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }

    @Override
    public String toString() {
        return "Номер в реестре: " + id + ", " + "Имя сотрудника: " + name + ", " + "Отдел: " + department + ", " + "Заработная плата: " + salary + " рублей";
    }
}

