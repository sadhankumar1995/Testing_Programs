package A12_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A63_StaticTable {

	public static void main(String[] args) {
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/statictable");
		WebElement table = wd.findElement(By.id("table1"));
		
		List<WebElement> rows =	table.findElements(By.tagName("tr"));		// Here TAG name concept is used. Finding Rows in a Table. 
		
		for(int i=0;i<rows.size();i++)
		{
																						// Here TAG name concept is used Bcoz, datas are tagged under columns.
			
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));		// Here "rows.get(i)" used. Finding columns in the rows.
			
			for(int j=0;j<columns.size();j++)
			{
				String text = columns.get(j).getText();									// Here "columns.get(j)" used. Getting values is stored in the columns.
				System.out.print(text+" ");
				
				}
			
				System.out.println();
			}
		}
	}
