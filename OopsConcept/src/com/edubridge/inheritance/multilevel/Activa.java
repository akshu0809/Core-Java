package com.edubridge.inheritance.multilevel;

public class Activa {
	public int speed;
	public int price;
	
	public Activa(int speed,int price) {
		super ();
		this.speed=speed;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "Activa [speed=" + speed + ", price=" + price + "]";
	}

}
