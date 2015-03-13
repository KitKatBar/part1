package part1;


import java.io.*;
import java.util.*;

public class GenerateICS {
	
	static Scanner in = new Scanner(System.in);

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
			
			//SUMMARY
			bw.write("SUMMARY:"+getSummary());
			bw.newLine();	
			
			//CLASSIFICATION	
			bw.write("CLASSIFICATION:");			
			bw.newLine();
			
			//LOCATION
			bw.write("LOCATION:"+getLocation());
			bw.newLine();
	
			//PRIORITY
						

			
			//DTSTART
			
			
			//DTEND
			
			
			bw.write("END:VEVENT");
			bw.newLine();		
			
			//Time zone identifier
			bw.write("BEGIN:VTIMEZONE");
			bw.newLine();					
			
			bw.write("TZID:");
			bw.write(TimeZone.getDefault().getID());
			bw.newLine();
			
			bw.write("END:VTIMEZONE");
			bw.newLine();	
			
			
			bw.write("END:VCALENDAR");
			bw.close();
			  
		}catch(IOException e){
			System.out.println(e);
		}
		
		
	}
	
	public static String getSummary() {
		String summary;
		   
		System.out.print("Please enter the summary for this event: ");
		summary = in.nextLine();
		return summary;
	}
	
	public static String getLocation() {
		   String location;

		   System.out.print("Please enter the location for this event: ");
		   location = in.nextLine();
		   return location;
		}
}
