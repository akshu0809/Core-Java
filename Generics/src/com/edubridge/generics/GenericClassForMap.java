package com.edubridge.generics;
//Multiple Paramerters of deiffrent type

class Dictionary<K,V>
{
	//where T defines any kind of type-value
	K key;
	V value;
	
	void print(K key,V value)
	{
		this.key=key;
		this.value=value;
		
		System.out.println("The Value is: "+key+" "+value);
	}
}
public class GenericClassForMap {

	public static void main(String[] args) {
		Dictionary<Character, String>obj=new Dictionary<>();
		obj.print('c', "Cathertic");
		obj.print('d', "dyanmic");

	}

}
