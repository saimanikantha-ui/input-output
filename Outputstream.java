package cg1;

import java.io.FileOutputStream;

public class Outputstream {

	
	public static void main(String[] args) {
try{
	FileOutputStream  obj=new FileOutputStream ("D:\\manikantha.txt");
	
	obj.write(65);
	obj.close();
	System.out.println("sucess");
	
}

	catch(Exception e)
{
		System.out.println("e");
}

}}