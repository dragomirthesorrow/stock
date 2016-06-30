package stock;

//import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
 
 
public class filelist {
	 private File path;
	    private File[] files;
    	 public static void main(String args[]) {
             String list[] = new File("I:\\").list();
             for(int i = 0; i < list.length; i++)
                 System.out.println(list[i]);
         }
   
}
εσσσσ
