package com.edubridge.inheritance.multilevel;

public class Activa6G extends Activa5G{
	

	public int speed;
	public int price;
	
	public Activa6G(int speed,int price) {
		
		super(speed,price);
		this.speed=speed;
		this.price=price;
		super.price=110000;	
		super.speed=100;
	}

	@Override
	public String toString() {
		return "Activa6G [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	

}
