package Entities;

public class Offer {
	private int id;
	private String name;
	private int discountRate;
	private double offerPrice;

	public Offer(int id, String name, int discountRate, double offerPrice) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
		this.offerPrice = offerPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

}