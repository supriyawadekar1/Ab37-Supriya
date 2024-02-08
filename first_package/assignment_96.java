package first_package;
class encapsulation_1
{
	private int a=10;
	private char b=126;
	private boolean c=true;
	private String name="shweta@gmail.com";
	private float d=32000;
	private double e=3.678;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public char getB() {
		return b;
	}
	public void setB(char b) {
		this.b = b;
	}
	public boolean isC() {
		return c;
	}
	public void setC(boolean c) {
		this.c = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getD() {
		return d;
	}
	public void setD(float d) {
		this.d = d;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
}
public class assignment_96 
{
	public static void main(String[] args)
	{
		encapsulation_1 e=new encapsulation_1();
		e.setA(10);
		//e.setB(126);
		e.setC(false);
		e.setName("supriya@gmail.com");
		e.setD(560);
		e.setE(5.6);
		System.out.println(e.getA());
		System.out.println(e.getB());
		System.out.println(e.isC());
		System.out.println(e.getD());
		System.out.println(e.getE());
		System.out.println(e.getName());
	}

}
