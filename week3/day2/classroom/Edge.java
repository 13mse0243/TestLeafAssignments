package week3.day2.classroom;

public class Edge extends Browser {
	public void takeSnap()
	{
		System.out.println("Take scheenshot of the step -----> Edge class");
	}
	public void clearCookies()
	{
		System.out.println("Clearing cookies ----> Edge class");
	}
	public static void main(String[] args) {
		Edge ed=new Edge();
		System.out.println(ed.browserName="Edge");
		System.out.println(ed.browserVersion=12.2D);
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
		ed.takeSnap();
		ed.clearCookies();
	}
}
