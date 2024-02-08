package first_package;
class txt
	{
		void typing()
		{
			System.out.println("hiiiii");
		}
	}
class exel1 extends txt
	{
		void datafetching()
		{
			System.out.println("hello");
		}
	}
public class assignment_91 extends exel1{
		void login()
		{
			System.out.println("i am login");
		}
		public static void main(String[] args)
		{
			exel1 e2=new assignment_91();
			e2.typing();
			e2.datafetching();

		}
	}


