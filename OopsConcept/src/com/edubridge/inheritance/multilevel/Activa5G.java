package com.edubridge.inheritance.multilevel;

public class Activa5G extends Activa{
		public int speed;
		public int price;
		
		public Activa5G(int speed,int price) {
			super(speed,price);
			this.speed=speed;
			this.price=price;
			super.price=100000;	
			super.speed=60;
		}

		@Override
		public String toString() {
			return "Activa5G [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
		}
			

}
