//Java class ForLoops.java
/**
 * Skeleton code for the loops practice day.
 * 
 * @author Roy Chancellor
 * @version 2/26/2019
 */
public class ForLoops
{
   public static void main ( String args[] ) {
       //variable declarartions

       //int for loop to perform the task
       int i, cubeInt;
       for (i = 1; i <= 10; i++) {
           cubeInt = i*i*i;
           System.out.println(i + "\t" + cubeInt);
       int y, decInt;
       for (y = 99; y >= 1; y = y - 2) {
           decInt = y - 2;
           System.out.println(decInt);
        }
        String sentence = "The quick brown fox jumped over the lazy dog";
        int f = sentence.length();               //f is 36
        char c = sentence.charAt (36);           //c is "g"
        String t = sentence.substring(34, 35);   //t is "do"
        String p = sentence.toLowerCase();       //p is "DOG"
        
        //use equals (), not == to copare Strings
        boolean b = p.equals ("DOG");            //b is true
        boolean n = "Cat".equals (sentence);     //n is fals
        
     
            
        
       
    }  
}   
}//end ForLoops class 