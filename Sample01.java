package Encapsulation;

public class Sample01 {
	
	
	static int a=10;
	int b=20;
	static void m1()
	{
		System.out.println("m1 is static method");
	}
void m2()
{
	System.out.println("m2 is non static method");
}
	public static void main(String[] args) {
	System.out.println(a);
	m1();

	}

}
