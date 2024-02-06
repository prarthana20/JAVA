package com.insurance.entity;

public class Payment {
	
	private int paymentId;
    private String paymentDate;
    private double paymentAmount;
    private int clientId; 

    public Payment() {}
    
    public Payment(int paymentId, String paymentDate, double paymentAmount, int clientId) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.clientId = clientId;
    }

    // Getters - setters Methods
    public int getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }
    public String getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    public double getPaymentAmount() {
        return paymentAmount;
    }
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    
    //print methods
    public void printPaymentDetails() {
        System.out.println("Payment Details: ");
        System.out.println("paymentId: " + paymentId);
        System.out.println("paymentDate: " + paymentDate);
        System.out.println("paymentAmount: " + paymentAmount);
        System.out.println("clientId: " + clientId);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", clientId=" + clientId +
                '}';
    }

}
