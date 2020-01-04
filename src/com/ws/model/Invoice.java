package com.ws.model;

public class Invoice {
	private int idInvoice;
	private String nameClient;
	private int numberArticles;
	private double totalInvoice;
	private double priceArticles;
	
	public Invoice () {}
	public Invoice (int idInvoice, String nameClient, int numberArticles, double totalInvoice, double priceArticles) {
		{
			this.idInvoice = idInvoice;
			this.nameClient = nameClient;
			this.numberArticles = numberArticles;
			this.totalInvoice = totalInvoice;
			this.priceArticles = priceArticles;
			
		}
	}
	public int getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}
	public String getNameClient() {
		return nameClient;
	}
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	public double getTotalInvoice() {
		return totalInvoice;
	}
	public void setTotalInvoice(double totalInvoice) {
		this.totalInvoice = totalInvoice;
	}
	public int getNumberArticles() {
		return numberArticles;
	}
	public void setNumberArticles(int numberArticles) {
		this.numberArticles = numberArticles;
	}
	public double getPriceArticles() {
		return priceArticles;
	}
	public void setPriceArticles(double priceArticles) {
		this.priceArticles = priceArticles;
	}
	
	public double CalculateTotal(int numberArticles, double priceArticles) {
		this.totalInvoice = this.numberArticles*this.priceArticles;
		return this.totalInvoice;
	}
	
}
