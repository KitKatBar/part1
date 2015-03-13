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
			
			//begin calendar
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
			bw.write("PRIORITY:"+getPriority());
			bw.newLine();
			
			//DTSTART
			
			
			//DTEND
			
			
			bw.write("END:VEVENT");
			bw.newLine();		
			
			//Time zone identifier
			bw.write("BEGIN:VTIMEZONE");
			bw.newLine();					
			
			bw.write("TZID:"+TimeZone.getDefault().getID());
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
	
	public static int getPriority() {
		int priority = 0;
		String yesno;
		
		while(true){
			System.out.print("Is there priority for this event?(y/n): ");
			yesno = in.nextLine();
			
			if(yesno.equals("n")){ //no priority
				return priority;
			}
			else if(yesno.equals("y")){ //there is priority
				
				while(true){
					System.out.print("Please enter priority for this event (1 for highest, 9 for lowest): ");
					
					priority = in.nextInt();
					
					
					if(priority > 0 && priority < 10){ //if it is between 1-9, return
						return priority;
					}
					else{
						System.out.println("Please enter a number from 1 to 9.");
					}
				}
				
			}
			else{ //if user inputs something other than y/n
				System.out.println("Please enter \"y\" or \"n\".");
			}
		}

	}
	
}
