package SikuliForFlash.SikuliForFlash;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Youtubevideotest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(05, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=L67njBCJvZY&list=RDL67njBCJvZY&start_radio=1");

		//create the object of screen class--sikuli
		Screen s=new Screen();
		
		
		//settings icon 
		/*Pattern settings=new Pattern("Youtbe settings.PNG");
		s.wait(settings,2000);
		s.click();
		s.click();*/
		//pause icon
				Pattern pauseimg=new Pattern("Youtube Pause.PNG");
				s.wait(pauseimg,2000);
				s.click();
				/*s.click();
		//play icon
		Pattern play=new Pattern("Youtube Play.PNG");
		s.wait(play,2000);
		s.click();
		s.click();*/
		
	}

}
