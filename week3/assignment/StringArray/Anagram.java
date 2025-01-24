package week3.assignment.StringArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// String intilization using literals
		String text1="stops";
		String text2="potss";
		// check if both string length are equal
		if(text1.length()==text2.length())
		{
			// converting both text to char array
			char c1[]=text1.toCharArray();
			char c2[]=text2.toCharArray();
			//sorting them
			Arrays.sort(c1);
			Arrays.sort(c2);
			// check if two array are equal, if equal then print anagram
			if(Arrays.equals(c1, c2))
			{
				System.out.println("two given string are anagram");
			}
			else
			{
				System.out.println("Not a anagram");
			}
		}
		else
		{
			System.out.println("Not a anagram");
		}

	}

}
