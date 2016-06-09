package com.Shanklish.CountAppearance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAppearance 
{
	public static void main(String[] args) 
	{
		String s1 = "The rain in Spain falls mainly on the plain";
		
		String s2 = "This is the end of this sentence, isn't it?";
		
		System.out.println("'in' appears in " + s1 + " " + count(s1, "in") + " times");
		
		System.out.println("'ain' appears in " + s1 + " " + count(s1, "ain") + " times");
		
		System.out.println("'is' appears in " + s2 + " " + count(s2, "is") + " times");
		//bonus: add a countWhole method which only counts appearances of the target String as a whole word
		//System.out.println("'is' appears as a whole word in " + s2 + " " + countWhole(s2, "is") + " times");		
	}
	
	public static int count (String sentence, String target) 
	{
		int n = 0;
		
		Pattern p = Pattern.compile(target);
		
		Matcher m = p.matcher(sentence);
		
		while(m.find())
		    {
			n++;
		    }
		
		
		return n;
	}
}