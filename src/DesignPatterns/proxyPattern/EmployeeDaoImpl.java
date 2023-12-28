package DesignPatterns.proxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) {
        System.out.println("Employee is created successfully...");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Employee is deleted successfully...");
    }

    @Override
    public Employee get(String client, int employeeId) {
        System.out.println("fetch employee data...");
        return new Employee();
    }
}
