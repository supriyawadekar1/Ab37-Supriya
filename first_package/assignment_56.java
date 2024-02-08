package first_package;
interface one1
{
	void first();
}
interface two2 extends one1
{
	void second();
}
interface three extends two2
{
	void third();
}
public class assignment_56 implements three {

	public static void main(String[] args) {
		assignment_56 ref=new assignment_56();
		ref.first();
		ref.second();
		ref.third();
		}
	public void second() {
		System.out.println("this is second method");
		
	}
	public void first() {
		System.out.println("this is first method");
	}
	public void third() {
		
		System.out.println("this is third method");
	}

}
