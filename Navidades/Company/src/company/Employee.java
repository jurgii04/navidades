package company;

public class Employee extends Person {
    private int money;
    private MobilePhone mobile;

    public Employee(String name, String dni, int height, int weight, MobilePhone mobile) {
        super(name, dni, height, weight);
        this.money = 0;
        this.mobile = mobile;
    }

    public void earnMoney(int amount) {
        money += amount;
    }

    public void spendMoney(int amount) {
        money -= amount;
    }

    public void work() {
        mobile.use();
        earnMoney(10);
    }

    public String toString() {
        return super.toString() + " " + money + " " + mobile.getBattery();
    }
}