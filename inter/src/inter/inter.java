package inter;

public class inter implements Kuldee{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("this is first");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("This is second");
	}
	
	public static void main(String[] args) {
		
		inter obj = new inter();
		obj.test();
		obj.test1();
		
		
		Kuldee ob1 = new inter();
		ob1.test();
		ob1.test1();
				
				
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

}
