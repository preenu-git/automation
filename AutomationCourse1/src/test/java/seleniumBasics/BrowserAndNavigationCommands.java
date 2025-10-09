package seleniumBasics;


public class BrowserAndNavigationCommands extends Base{
	public void browerCommands()
	{
	String title =driver.getTitle();//Retrieves the title of the current web page
	System.out.println(title);//prints the title in the console
	//String source=driver.getPageSource();
	//System.out.println(source);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String handleId=driver.getWindowHandle();
	System.out.println(handleId);
	}
	public void navigationCommand()
	{
		driver.navigate().to("https://www.amazon.in/");//opens obsqura testing to amazon
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommands command=new BrowserAndNavigationCommands();
		command.initializeBrowser();
		//command.browerCommands();
		command.navigationCommand();
		
		

	}

}
