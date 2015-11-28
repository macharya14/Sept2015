package com.main.strings;

/*
* Write a program to find a substring in a given string and 
* then replace it with another string.
* 
* @author: Manjula Acharya
*/
public class ReplaceSubString {
	
public static String replaceString(String inputStr, String subStr, String replaceStr)
{
	
	if (inputStr.contains(subStr))
		return inputStr.replaceAll(subStr,  replaceStr);
	else
		return(inputStr);
}


	public static void main(String[] args) {
		String inputStr = "The cow jumped over the moon";
		String subStr = "jumped";
		String replaceStr = "walked";
		
		System.out.println(replaceString(inputStr, subStr, replaceStr));
	}

}
