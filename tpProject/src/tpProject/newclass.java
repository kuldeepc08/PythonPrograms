package tpProject;

public class newclass  extends an{
	
	void marry()
	{
		System.out.println("Print");
	}
	
	public static void main(String[] args) {
		an obj = new newclass();
		obj.marry1();
		((newclass) obj).marry();
				
	}

}
