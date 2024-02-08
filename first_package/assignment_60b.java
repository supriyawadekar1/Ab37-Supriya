package first_package;
import second_package.assignment_60a;

public class assignment_60b extends assignment_60a {

	public static void main(String[] args)
	{
		assignment_60b ref=new assignment_60b();
		ref.add();
		//ref.sub(); //cant access private
		ref.mul();
		//ref.div(); //cant access package

	}

}
