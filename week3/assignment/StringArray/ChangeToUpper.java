package week3.assignment.StringArray;

public class ChangeToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="ChangeMe";
		String result = "";
		//iterating through every character to find the odd char
		for(int i=0;i<text.length();i++)
		{
			//saving current char using charAt method
			char currentChar= text.charAt(i);
			//finding the odd index and converting it to upper case using wrapper class of character
			if(i%2!=0)
			{
				result=result+Character.toUpperCase(currentChar);
			}
			//adding the characters as it it, if it's not odd position
			else
			{
				result=result+currentChar;
			}
		}
		System.out.println(result);

	}

}
