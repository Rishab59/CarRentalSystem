package entity;

import java.sql.Timestamp;

public class Payment {
    private int paymentID;
    private int leaseID;
    private Timestamp paymentDate;
    private double amount;

    public Payment() {
    }

    public Payment(int paymentID, int leaseID, Timestamp paymentDate, double amount) {
        this.paymentID = paymentID;
        this.leaseID = leaseID;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getLeaseID() {
        return leaseID;
    }

    public void setLeaseID(int leaseID) {
        this.leaseID = leaseID;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString() {
    	return "Payment { " +
		       "Payment ID = " + getPaymentID() +
		       ", Lease ID = " + getLeaseID() +
		       ", Amount = " + getAmount() +
		       ", Date = '" + getPaymentDate() + '\'' +
		       " }";
    }
    
    // J514 - Rishab H
}
