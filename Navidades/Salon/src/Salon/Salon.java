package Salon;

import java.util.Date;

public class Salon {
    private Cliente[] clientes;
    private Visita[] visits;
    private int numClients;
    private int numVisits;

    public Salon(int maxNumClients, int maxNumVisits) {
        this.clientes = new Cliente[maxNumClients];
        this.visits = new Visita[maxNumVisits];
        this.numClients = 0;
        this.numVisits = 0;
    }

    public Cliente getClient(String identityCard) {
        for (Cliente c : this.clientes) {
            if (c != null && c.getIdentityCard().equals(identityCard)) {
                return c;
            }
        }
        return null;
    }

    public void addClient(Cliente client) {
        if (this.numClients < this.clientes.length) {
            this.clientes[this.numClients] = client;
            this.numClients++;
        } else {
            System.out.println("Error: Salon.Salon is full.");
        }
    }

    public void unsuscribeClient(String identityCard) {
        Cliente c = this.getClient(identityCard);
        if (c != null) {
            c.setIsMember(false);
            c.setMembershipType("");
        }
    }

    public void setMembershipClient(String identityCard, String membershipType) {
        Cliente c = this.getClient(identityCard);
        if (c != null) {
            c.setIsMember(true);
            c.setMembershipType(membershipType);
        }
    }

    public void addVisit(String identityCard, Date date) {
        Cliente c = this.getClient(identityCard);
        if (c != null) {
            if (this.numVisits < this.visits.length) {
                Visita v = new Visita(c, date);
                this.visits[this.numVisits] = v;
                this.numVisits++;
            } else {
                System.out.println("Error: Salon.Salon has reached the maximum number of visits.");
            }
        }
    }

    public Visita[] getClientVisits(String identityCard) {
        Visita[] clientVisits = new Visita[this.numVisits];
        int numClientVisits = 0;
        for (Visita v : this.visits) {
            if (v != null && v.getClient().getIdentityCard().equals(identityCard)) {
                clientVisits[numClientVisits] = v;
                numClientVisits++;
            }
        }
        return clientVisits;
    }

    public void showClients() {
        for (Cliente c : this.clientes) {
            if (c != null) {
                System.out.println(c.toString());
            }
        }
    }

    public void showVisits() {
        for (Visita v : this.visits) {
            if (v != null) {
                System.out.println(v.toString());
            }
        }
    }
}