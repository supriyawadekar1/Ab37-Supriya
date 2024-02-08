package first_package;
class one_1
{
	void add()
	{
		System.out.println("i am add function of class one");
	}
}
class two_2 extends one_1
{
	void sub()
	{
		System.out.println("i am sub function of class two");
	}
}
class three_3 extends two_2
{
	void multi()
	{
		System.out.println(" i am multi function of class three");
	}
}
public class assignment_92 extends three_3
{
	public static void main(String[] args)
	{
		two_2 t2=new three_3();
		t2.add();
		t2.sub();
	}

}
