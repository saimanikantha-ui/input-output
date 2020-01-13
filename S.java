package cg1;

import java.io.File; 
import java.io.IOException;

public class S {
  public static void main(String[] args) {
    try {
     File myObj =new File("filename.txt");
     if (myObj.createNewFile()) {
System.out.println("sjhc");
}
    else{
    	System.out.println("shf");
    	
    }
    }
  catch (IOException e)
  {
	  System.out.println("jshd");
	  e.printStackTrace();
  }
}
  }
  