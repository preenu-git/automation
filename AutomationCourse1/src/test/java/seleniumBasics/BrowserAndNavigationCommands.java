package seleniumBasics;


public class BrowserAndNavigationCommands extends Base{
	public void browerCommands()
	{
	String title =driver.getTitle();//Retrieves the title of the current web page
	System.out.println(title);//prints the title in the console
	String source=driver.getPageSource();
	System.out.println(source);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommands command=new BrowserAndNavigationCommands();
		command.initializeBrowser();
		command.browerCommands();
		

	}

}
