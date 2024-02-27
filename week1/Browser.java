package week1.day2;

public class Browser {
 public String launchBrowser(String browserName) {
	return browserName;
	 
 }
 public void loadUrl() {
     System.out.println("Application URL loaded successfully");
 }
 public static void main(String[] args) {
	Browser obj=new Browser();
	obj.launchBrowser("Firefox");
	System.out.println("Browser launched successfully");
	obj.loadUrl();
}
}

	
