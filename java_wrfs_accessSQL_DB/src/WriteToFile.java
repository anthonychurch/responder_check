import java.io.*;
class WriteToFile 
{
 public static void main(String args[])
  {
	 try{
		 // Create file 
		 String fileName = "c://out.txt";
		 File file=new File(fileName);
		 boolean exists = file.exists();
		 FileWriter fstream;
		 if(!exists){
			 //CREATE A NEW TEXT FILE
			 System.out.println("CREATE A NEW TEXT FILE: ");
			 fstream = new FileWriter(file);
		 }else{
			 //ALREADY EXISTS
			 System.out.println("ALREADY EXISTS: ");
			 fstream = new FileWriter(fileName,true);
		 }
		 BufferedWriter out = new BufferedWriter(fstream);
		 out.newLine();
		 out.write("Hello Java");
		 out.newLine();
		 out.write("Booooo");
		 //Close the output stream
		 out.close();
  	}catch (Exception e){//Catch exception if any
	  System.err.println("Error: " + e.getMessage());
 	}
  }
}