import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class ReadFile{
	int index;
	String[] array = new String[100];
	
	 private static String path;
	 
	 public ReadFile(String file_path) {
	   
	     path = file_path;
	 }


	 public String[] OpenFile() throws IOException{
 	 
 	 FileReader fr = new FileReader(path);
 	 BufferedReader textreader = new BufferedReader(fr);
 	 
      int numberoflines = 4;
      String[] textData = new String[numberoflines];
      
      int b, c;
      
      for(b=0; b < numberoflines; b++){
     	 textData[b] = textreader.readLine();
     	 //StringTokenizer st = new StringTokenizer(textData[b]);
     	 //System.out.println("tokens count : " + st.countTokens());
     	 //c = st.countTokens();
     	 //for(c=st.countTokens(); c > 0; c--){
     		 
			//array[index] = st.nextElement().toString();
     		// System.out.println("arry = " + array[index]);
     		 //index++;
     		// }
	     	 
      }
      
	 	/*System.out.println("Number of Balls : " + array[1]);
	   	System.out.println("Period of ball appearance(in sec) : " + array[3]);
	   	System.out.println("Initial X Position : " + array[4]);
	   	System.out.println("Initial Y Position : " + array[5]);
 	 	System.out.println("Number of Balls : " + array[1]);
     	System.out.println("Period of ball appearance(in sec) : " + array[3]);
     	System.out.println("Initial X Position : " + array[4]);
     	System.out.println("First line coordinates X1, Y1, X2 , Y2 : " + array[6] + " , " + array[7] + " , " + array[8] + " , " + array[9]);
     	System.out.println("Second line coordinates X1, Y1, X2 , Y2 : " + array[11] + " , " + array[12] + " , " + array[13] + " , " + array[14]);
     	*/
      
      textreader.close();
      return textData;
  }
  
  int readLines() throws IOException{
	   
	   FileReader file_to_read = new FileReader(path);
	   BufferedReader bf = new BufferedReader(file_to_read);
	   
	   String aLine;
	   int numberoflines = 0;
	   
	   while((aLine = bf.readLine()) != null){
		   numberoflines++;
	   }
	   
	   bf.close();
	   return numberoflines;
	   
  }

  
} 
