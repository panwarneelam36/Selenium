package orangeHRM_AUTO_Prac;

import java.io.IOException;

public class Main_File {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		Module_File d = new Module_File();
		
		d.navigate_functionality();
		d.username_functionality();
		d.buzz_functionality();
		d.buzz_POST();
		d.quit_functionality();
	}
}
