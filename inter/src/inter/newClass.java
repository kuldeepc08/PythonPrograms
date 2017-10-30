package inter;

public class newClass implements ANiket,Aniket1{

	@Override
	public void KC() {
		// TODO Auto-generated method stub
		System.out.println("teste1");
		
	}

	@Override
	public void KC1() {
		// TODO Auto-generated method stub
		System.out.println("teste2");
	}
	
	public static void main(String[] args)
	{
		newClass obj = new newClass();
		obj.KC();
		obj.KC1();
	}

}
