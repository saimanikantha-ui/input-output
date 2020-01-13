package cg1;

import java.io.FileReader;

public class Csv {



	public static void readDataLineByLine(String file) 
	{ 
	  
	    try { 
	  
	        
	        FileReader filereader = new FileReader(file); 
	  
	       
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord; 
	  
	        while ((nextRecord = csvReader.readNext()) != null) { 
	            for (String cell : nextRecord) { 
	                System.out.print(cell + "\t"); 
	            } 
	            System.out.println(); 
	        } 
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	} 

}
