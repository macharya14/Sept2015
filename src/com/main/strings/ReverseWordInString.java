package com.main.strings;

/*
 *  Write a program to reverse each individual word in a sentence.
 *  Because of Ambiguity, there are two ways to do this - 
 *  
 *  Sentence: "Mary had a little lamb whose fleece was white as snow."
 *  1) "snow as white was fleece whose lamb little a had Mary"
 *  2) "wons sa etihw saw eceelf esohw bmal elttil a dah yraM"
 *  
 *  @author: Manjula Acharya
 */

public class ReverseWordInString {
	
	public static String wordReversalInString(String inStr)
	{
		String outStr = "";
		
		String[] splitStr = inStr.split("\\s++");
		int len = splitStr.length;
		
		for(int i = len - 1; i >= 0; i--)
		{
			if( i > 0 )
				outStr = outStr + splitStr[i] + " ";
			else
				outStr = outStr + splitStr[i];
		}
		return outStr;
	}

	public static void main(String[] args) {
		String inputStr = "Mary had a little lamb whose fleece was white as snow";
		
		System.out.println(wordReversalInString(inputStr));
		
		System.out.println(ReverseString.reverseString(inputStr));

	}

}
