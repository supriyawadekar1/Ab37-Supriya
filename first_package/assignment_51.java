package first_package;
interface single
{
	void mul();
}
abstract class dual implements single
{
	abstract void add();
	void sub()
	{
		System.out.println("this is concrete method");
	}
}
public class assignment_51 extends dual
{
	public static void main(String[] args)
	{
		System.out.println("extending abstract class which is implementing interface");
        assignment_51 ref=new assignment_51();
        ref.add();
        ref.sub();
        ref.mul();
    }
	void add() 
	{
		System.out.println("done..implementation");
		
	}

	public void mul() {
		System.out.println("this is also done");
		
	}

}
