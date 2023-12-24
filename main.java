abstract class parent
{
	abstract void message();
	
}
class FirstSubclass extends parent{
	public void message() {
		System.out.println("This is a First SubClass ");
	}
}
class SecondSubclass extends parent{
	public void message() {
		System.out.println("This is a Second SubClass ");
}
public class main {
	public static void main(String[] args)
	{
		parent f=new FirstSubclass();
		parent s=new SecondSubclass();
		f.message();
		s.message();
	}
}
}
