package first_package;
class a
{
	void A()
	{
		System.out.println("i am A of class a");
	}
}
class b extends a
{
	void B()
	{
		System.out.println("i am B of class b");
	}
}
class c extends b
{
	void C()
	{
		System.out.println("i am C of c class");
	}
}
public class assignment_93 extends c
{
	public static void main(String[] args)
	{
		b b1=new c();
		b1.A();
		b1.B();
		
		c c1=new assignment_93();
		assignment_93 a1=(assignment_93) c1;
		a1.A();
		a1.B();
		a1.C();
		

	}

}
