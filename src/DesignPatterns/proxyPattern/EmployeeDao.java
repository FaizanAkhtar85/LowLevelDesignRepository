package DesignPatterns.proxyPattern;

public interface EmployeeDao {
    void create(String client, Employee employee) throws Exception;
    void delete(String client, int employeeId) throws Exception;
    Employee get(String client, int employeeId) throws Exception;
}
