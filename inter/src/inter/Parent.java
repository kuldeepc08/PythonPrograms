package inter;

public class Parent {

	void m1()
	{
		System.out.println("");
	}
	
}
class Child extends Parent{
	
	void m2()
	{
		
	}
}

class Animal {
	Parent m3()
	{
		return null;
		
	}
}

class Dog extends Animal{
	
	Child m4()
	{
		return null;
		
	}
}
