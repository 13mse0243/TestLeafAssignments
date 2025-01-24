package week3.assignment.StringArray;

public class ReverseOddWords {

	public static void main(String[] args) {

		System.out.println(reverseOddWords("I am a software tester"));

	}
	public static String reverseOddWords(String str)
	{
		StringBuffer sb=new StringBuffer();
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(i%2==1)
			{
				sb.append(new StringBuffer(s[i]).reverse().toString());
			}
			else
			{
				sb.append(s[i]);
			}
			if(i<s.length-1)
			{
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
