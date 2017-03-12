package by.epam.course.basic.main;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		
		String testStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n" +
                "         <breakfast-menu> \n" +
                "         		<food id=\"1\"> \n" +
                "					<name>Belgian Waffles</name> \n" +
                "		    	    <price>$5.95</price> \n" +
                "		        	<description> \n" +
                " 						two of our famous Belgian Waffles with plenty of real maple syrup \n" +
                "         			</description> \n" +
                "        			<calories>650</calories> \n" +
                "    			</food> \n" +
                "    			<food id=\"2\"> \n" +
                "        			<name>Strawberry Belgian Waffles</name> \n" +
                "        			<price>$7.95</price> \n" +
                "					<description> \n" +
                " 						light Belgian waffles covered with strawberries and whipped cream \n" +
                "        			</description> \n" +
                "        			<calories>900</calories> \n" +
                "    			</food> \n "+
                " 		  </breakfast-menu> \n";
		
				
		ArrayList<String> result = new ArrayList<>();
		result = ParseXMLRegEx.parse(testStr);
		//System.out.println(testStr);
		for (String tmp : result){
			if (!tmp.trim().contains("?xml")){
				System.out.println(tmp.trim());
			}			
		}		
	}
}
