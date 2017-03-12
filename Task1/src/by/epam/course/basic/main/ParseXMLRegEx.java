package by.epam.course.basic.main;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseXMLRegEx {
	
		private final static String REGEX = "([<>]?)([^></]*)[/]?[<>]?"; 
	
		public static ArrayList<String> parse(String str){
			ArrayList<String> list = new ArrayList<>();
			Pattern pattern = Pattern.compile(REGEX,Pattern.DOTALL);
			Matcher matcher = pattern.matcher(str);
			
			while (matcher.find()){			
				if (matcher.group(2).trim().length()!=0 ){		
					
					list.add(matcher.group(2).trim());
					
				}		
			}			
			return list;
		}
		
}
