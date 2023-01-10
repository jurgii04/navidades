package Salon;

import java.util.Date;

public class Prueba {
    public static void main(String[] args) {
        Salon salon = new Salon(10, 10);

        Cliente c1 = new Cliente("Miren", "123456");
        Cliente c2 = new Cliente("Anuel", "234567");
        Cliente c3 = new Cliente("Jordan", "345678");
        salon.addClient(c1);
        salon.addClient(c2);
        salon.addClient(c3);

        salon.setMembershipClient("123456", "Premium");
        salon.setMembershipClient("234567", "Gold");

        salon.addVisit("123456", new Date());
        salon.addVisit("234567", new Date());
        salon.addVisit("345678", new Date());

        Visita[] c1Visits = salon.getClientVisits("123456");
        for (Visita v : c1Visits) {
            if (v != null) {
                v.applyDiscount(100);
            }
        }

        salon.showClients();
        salon.showVisits();
    }
}