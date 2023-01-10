package Salon;

import java.util.Date;

public class Visita {
    private Cliente cliente;
    private Date date;
    private double cost;

    public Visita(Cliente cliente, Date date) {
        this.cliente = cliente;
        this.date = date;
        this.cost = 0;
    }

    public Cliente getClient() {
        return this.cliente;
    }

    public void setClient(Cliente client) {
        this.cliente = cliente;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void applyDiscount(double amount) {
        this.cost = amount - (amount * this.cliente.getDiscount());
    }

    public String toString() {
        return this.cliente.getName() + " visited on " + this.date + " with a cost of $" + this.cost + ".";
    }
}