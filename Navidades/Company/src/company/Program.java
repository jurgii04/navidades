package company;

public class Program {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("623432423", 100);
        Employee employee = new Employee("Pep", "74392392L", 180, 80, mobilePhone);

        System.out.println(employee.toString());
        employee.work();
        employee.work();
        System.out.println("=============");
        System.out.println(employee.toString());
    }
}
