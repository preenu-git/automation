package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement tab=driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(tab.getText());
		WebElement tabRow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(tabRow.getText());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling table=new TableHandling();
		table.initializeBrowser();
		table.verifyTable();
		
		

	}

}
