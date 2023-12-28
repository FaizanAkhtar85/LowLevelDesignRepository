package DesignPatterns.proxyPattern;

public class Client {
    public static void main(String[] args) throws Exception {
        EmployeeDao proxy = new EmployeeDaoProxy();
        proxy.create("Admin",new Employee());
        proxy.delete("Admin",101);
        proxy.get("User",101);
    }
}
