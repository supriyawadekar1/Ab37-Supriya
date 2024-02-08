package first_package;
class encapsulation
{
	private String username="abc@grotechmind.com";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
public class assignment_95
{
	public static void main(String[] args)
	{
		encapsulation e1=new encapsulation();
		e1.setUsername("supriya@gmail.com");
		System.out.println(e1.getUsername());

	}

}
