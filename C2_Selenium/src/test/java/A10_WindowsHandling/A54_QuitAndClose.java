package A10_WindowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.LoginScenario;

public class A54_QuitAndClose {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd=LoginScenario.loginVcentryApplication();	
		wd.get("https://djangovinoth.pythonanywhere.com/multiwindow/");		
		wd.findElement(By.id("id1")).click();
		
		Set<String> windowid=	wd.getWindowHandles(); // (((((1)))))   // here using linkedhashset. it will maintain the insertion order.
		Iterator<String> it=	windowid.iterator();			// IF we r using SET. Definitely next step is ITERATOR.
		
		String parent =	it.next();
		String child1 =	it.next();
		String child2 =	it.next();
		
		
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		Thread.sleep(2000);
		
		wd.switchTo().window(child1);				// ((((2)))switchTo().window()) Important point for interview.
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		Thread.sleep(2000);
		
		wd.switchTo().window(child2);  
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		Thread.sleep(2000);
		

		wd.quit(); // it will close all the window after completing the execution.
		//wd.close(); // it will close only the current window which we accessing.
	}
	}

