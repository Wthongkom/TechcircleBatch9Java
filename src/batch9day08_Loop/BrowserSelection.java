package batch9day08_Loop;

public class BrowserSelection {

	public static void main(String[] args) {
		
		
		String targetBrowser = "IE";

		switch (targetBrowser) {
		case "Chrome":
			// WebDriver drive = new ChromeDriver();
			System.out.println("Open Chrome browser");
			break;
			
		case "IE":
			// WebDriver drive = new IE();
			System.out.println("Open IE browser");
			break;
			
		case "Safari":
			// WebDriver drive = new Safari();
			System.out.println("Open Safari browser");
			break;

		default:
			break;
		}
	
	
	
	
	
	}

}
