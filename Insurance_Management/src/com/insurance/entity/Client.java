package com.insurance.entity;

public class Client {
	
	private int clientId;
    private String clientName;
    private String contactInfo;
    private String policy;

    public Client() {}//constructor
    
    public Client(int clientId, String clientName, String contactInfo, String policy) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.contactInfo = contactInfo;
        this.policy = policy;
    }

    // Getters - setters Method
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public String getPolicy() {
        return policy;
    }
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    //print methods
    public void printClientDetails() {
        System.out.println("Client Details: ");
        System.out.println("clientId: " + clientId);
        System.out.println("clientName: " + clientName);
        System.out.println("contactInfo: " + contactInfo);
        System.out.println("policy: " + policy);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", policy='" + policy + '\'' +
                '}';
    }

}
