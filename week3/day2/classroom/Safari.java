package week3.day2.classroom;

public class Safari extends Browser {
	public void readeMode()
	{
		System.out.println("Safari in reader mode----> Safari class");
	}
	public void fullScreenMode()
	{
		System.out.println("Opening safari in full screen----> safari class");
	}
	public static void main(String[] args) {
		Safari sf=new Safari();
		System.out.println(sf.browserName="Safari");
		System.out.println(sf.browserVersion=12.1D);
		sf.openURL();
		sf.closeBrowser();
		sf.navigateBack();
		sf.readeMode();
		sf.fullScreenMode();
	}
}
