package com.insurance.entity;

public class Claim {
	
	private int claimId;
    private String claimNumber;
    private String dateFiled;
    private double claimAmount;
    private String status;
    private String policy;
    private int clientId; 

    public Claim() {}//constructor

    public Claim(int claimId, String claimNumber, String dateFiled, double claimAmount, String status,
                 String policy, int clientId) {
        this.claimId = claimId;
        this.claimNumber = claimNumber;
        this.dateFiled = dateFiled;
        this.claimAmount = claimAmount;
        this.status = status;
        this.policy = policy;
        this.clientId = clientId;
    }

    // Getters - setters Method
    public int getClaimId() {
        return claimId;
    }
    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }
    public String getClaimNumber() {
        return claimNumber;
    }
    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }
    public String getDateFiled() {
        return dateFiled;
    }
    public void setDateFiled(String dateFiled) {
        this.dateFiled = dateFiled;
    }
    public double getClaimAmount() {
        return claimAmount;
    }
    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPolicy() {
        return policy;
    }
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    //print methods
    public void printClaimDetails() {
        System.out.println("Claim Details: ");
        System.out.println("claimId: " + claimId);
        System.out.println("claimNumber: " + claimNumber);
        System.out.println("dateFiled: " + dateFiled);
        System.out.println("claimAmount: " + claimAmount);
        System.out.println("status: " + status);
        System.out.println("policy: " + policy);
        System.out.println("clientId: " + clientId);
    }
    
    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", claimNumber='" + claimNumber + '\'' +
                ", dateFiled='" + dateFiled + '\'' +
                ", claimAmount=" + claimAmount +
                ", status='" + status + '\'' +
                ", policy='" + policy + '\'' +
                ", clientId=" + clientId +
                '}';
    }

}
