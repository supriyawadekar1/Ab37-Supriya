package first_package;
interface inter2
{
	void mod();
}
interface inter1 extends inter2
{
	void mul();
}
abstract class demo implements inter1
{
	abstract void add();
	void sub()
	{
		System.out.println("this is concrete method");
	}
}
public class assignment_55 extends demo
{
	public static void main(String[] args)
	{
		assignment_55 ref=new assignment_55();
        ref.add();
        ref.sub();
        ref.mul();
        ref.mod();
    }
	void add() 
	{
		System.out.println("done..implementation");
		
	}

	public void mul() {
		System.out.println("this is also done");
		
	}
	public void mod() {
		System.out.println("this is mod function");
		
	}

}

