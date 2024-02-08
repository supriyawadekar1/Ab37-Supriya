package first_package;
public class assignment_57
{
	public void add()
	{
		System.out.println("public method");
	}
	private void sub()
	{
		System.out.println("private method");
	}
	protected void mul()
	{
		System.out.println("protected method");
	}
	void div()
	{
		System.out.println("package/default method");
	}
	public static void main(String[] args)
	{
		assignment_57 ref=new assignment_57();
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();

	}

}
