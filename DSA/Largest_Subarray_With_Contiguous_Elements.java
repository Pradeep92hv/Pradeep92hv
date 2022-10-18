
                          https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/hashmap-and-heaps/largest-subarray-with-contiguous-elements-official/ojquestion


import java.util.*;

public class Main {

	public static int solution(int[] arr) {
	  int n = arr.length;
        int max_len = 1;
        for (int i=0; i<n; i++)
        {
           
            HashSet<Integer> set = new HashSet<>();
            set.add(arr[i]);
 
           
            int mn = arr[i], mx = arr[i];
 
         
            for (int j=i+1; j<n; j++)
            {
               
                if (set.contains(arr[j]))
                    break;
 
             
                set.add(arr[j]);
                mn = Math.min(mn, arr[j]);
                mx = Math.max(mx, arr[j]);
 
       
                if (mx-mn == j-i)
                    max_len = Math.max(max_len, mx-mn+1);
            }
        }
        return max_len;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}
