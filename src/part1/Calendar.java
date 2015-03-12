package part1;

import java.io.*;

public class Calendar {

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
			
			
			//CLASSIFICATION
			
			
			//LOCATION
			
			
			//PRIORITY
			
			
			//SUMMARY
			
			
			//DTSTART
			
			
			//DTEND
			
			
			//Time zone identifier
			
			
			
			
			bw.write("END:VCALENDAR");
			bw.close();
			  
		}catch(IOException e){
			System.out.println(e);
		}
		
		
	}
}
