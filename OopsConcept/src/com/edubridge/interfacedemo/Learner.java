package com.edubridge.interfacedemo;
//implementable class
public class Learner implements Deletable {
	//it provides run-time information about the objects.
	public boolean delete(Object o)
	{
		if(o instanceof Deletable)
		    return true;
		return false;
	}

}
