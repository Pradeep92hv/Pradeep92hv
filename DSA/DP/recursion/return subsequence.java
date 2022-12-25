https://www.codingninjas.com/codestudio/problems/return-subsequences-of-string_624464?leftPanelTab=1



import java.util.*;
public class solution {

	// Return the subsequences saved in a string array
	public static String[] subsequence(String input){
		// Write your code here
        
        
        if(input.length()==0)
        {
            String output[]=new String[1];
            output[0]="";
            return output;
        }
        
        String smalloutput[]=subsequence(input.substring(1));
        String output[]=new String[2*smalloutput.length];
        for(int i=0;i<smalloutput.length;i++)
        {
            output[i]=smalloutput[i];
        }
        for(int i=0;i<smalloutput.length;i++)
        {
            output[smalloutput.length+i]=input.charAt(0)+smalloutput[i];
         }
        return output;

	}
}
