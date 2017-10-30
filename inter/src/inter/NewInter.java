package inter;

public interface NewInter {

	void m1();
	
	void m2();
	
	void m3();
}

abstract class Test1 implements NewInter
{

	public void m1()
	{
		
	}
public class Test2 extends Test1
{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	}
}