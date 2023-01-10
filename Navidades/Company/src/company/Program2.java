package company;

public class Program2 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("623699789", 90);
        Employee owner = new Employee("Gouba", "34578645P", 180, 50, mobilePhone);
        Employee manager = new Employee("Luisa", "43569236Z", 170, 40, mobilePhone);

        Company company = new Company("Brrr AA S.L.", owner);
        company.hireManager(manager);

        System.out.println(company.toString());
        company.work();
        company.work();
        System.out.println(company.toString());
    }
}
