package week3.assignment.inheritance;

public class Elements extends Button {

	public static void main(String[] args) {
		RadioButton radio=new RadioButton();
		radio.submit();
		radio.selectRadioButton();
		CheckBoxButton check=new CheckBoxButton();
		check.click();
		check.clickCheckButton();
		TextField text=new TextField();
		text.setText("Naveen");
		text.getText("Naveen");
		Button b=new Button();
		b.click();
	}

}
