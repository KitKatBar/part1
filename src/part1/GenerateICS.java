package part1;

import java.io.*;
import java.util.*;

public class GenerateICS {

	public static void main(String[] args) {
		
		try{
			
			//create blank ics file
			File file = new File("studyfinal.ics");
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.print("");
			bw.write("BEGIN:VCALENDAR");
			bw.newLine();

			//VERSION
			bw.write("VERSION:2.0");
			bw.newLine();
			
			//create new event
			bw.write("BEGIN:VEVENT");
			bw.newLine();		
			
			//CLASSIFICATION
			
			bw.write("CLASSIFICATION:");			
			bw.newLine();
			
			//LOCATION
	
			bw.write("LOCATION:");			
			bw.newLine();
			
			//PRIORITY
			
			
			//SUMMARY
			
			
			//DTSTART
			
			
			//DTEND
			
			
			bw.write("END:VEVENT");
			bw.newLine();		
			
			//Time zone identifier
			bw.write("BEGIN:VTIMEZONE");
			bw.newLine();					
			
			Calendar calendar = Calendar.getInstance();
			TimeZone timeZone = calendar.getTimeZone();
			
			
			
			bw.write("END:VTIMEZONE");
			bw.newLine();	
			
			
			
			bw.write("END:VCALENDAR");
			bw.close();
			  
		}catch(IOException e){
			System.out.println(e);
		}
		
		
	}
}
