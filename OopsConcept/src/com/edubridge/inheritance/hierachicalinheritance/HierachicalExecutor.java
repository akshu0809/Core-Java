package com.edubridge.inheritance.hierachicalinheritance;
//derived class
public class HierachicalExecutor {

	public static void main(String[] args) {
		Tiramisu t=new Tiramisu();
		SnowCone s=new SnowCone();
		t.deviceName="IQOOZ7s";
		t.version="Android 13";
		s.deviceName="Samsung";
		s.version="Android 12";
		t.print();
		s.print();

	}

}
