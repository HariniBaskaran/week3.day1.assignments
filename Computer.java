package week3.day1.assignments;

//  ------------------------------
//	Class        :Computer
//	Methods   :computerModel()
//	-------------------------------
//	
//	Class        :Desktop
//	Methods   :desktopSize()
//	-------------------------------
//
//	Description:
//	create above 2 class and call all your class methods into the Desktop using single inheritance.
//  -----------------------------------------------------------------------------------------------

public class Computer {

	public void computerModel()
	{
		System.out.println("The computer model is Lenovo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("The Desktop size is 32 inches");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop mydesk = new Desktop();
		mydesk.computerModel();
		mydesk.desktopSize();
	}
}