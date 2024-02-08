package first_package;
class type1
{
	void add()
	{
		System.out.println("this is supriya");
	}
}
class type2 extends type1
{
	void sub()
	{
		System.out.println("hi..my name is supriya");
	}
}
public class assignment_90 extends type2
{
	public static void main(String[] args) 
	{
		type1 t1=new assignment_90();
		t1.add();

	}

}
