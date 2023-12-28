package DesignPatterns.proxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDao;

    public EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.equals("Admin")){
            employeeDao.create(client,employee);
        }
        else{
            throw new Exception("Insufficient previlage to create an employee");
        }

    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("Admin")){
            employeeDao.delete(client,101);
        }
        else
            throw new Exception("Insufficient previlage to delete an employee");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.equals("Admin") || client.equals("User")){
            return employeeDao.get(client,employeeId);
        }
        else
            throw new Exception("Insufficient previlage to fetch an employee");
    }
}
