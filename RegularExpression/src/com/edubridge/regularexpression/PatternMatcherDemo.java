package com.edubridge.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {
		String str="There are 30 rows";
		String regex="(.*)(\\d+)(.*)";
		
		Pattern p= Pattern.compile(regex);
		Matcher m=p.matcher(str);
		System.out.println(m.matches());
		
	}

}
