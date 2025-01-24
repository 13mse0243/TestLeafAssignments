package week3.day2.classroom;

public class Chrome extends Browser {
	public void openIncognito()
	{
		System.out.println("Opening browser in Incognito----> Chrome class");
	}
	public void clearCache()
	{
		System.out.println("Clearing cache----> Chrome Class");
	}
	public static void main(String[] args) {
		Chrome ch=new Chrome();
		System.out.println(ch.browserName="Chrome");
		System.out.println(ch.browserVersion=21.5D);
		ch.openIncognito();
		ch.clearCache();
		ch.openURL();
		ch.navigateBack();
		ch.closeBrowser();
	}
}
