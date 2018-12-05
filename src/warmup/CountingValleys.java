package warmup;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingValleys {
	
	  	static int countingValleys(int n, String s) {
	  		char up = "U".charAt(0);
	  		char down = "D".charAt(0);
	  		
	  		char[] path = s.toCharArray();
	  		
	  		Map<Character , Integer> counts = new HashMap<Character, Integer>();
	  		counts.put(up, 0);
	  		counts.put(down, 0);
	  		int valley =0;
	  		int lastDown =0;
	  		boolean inValley=false;
	  		for(char ch : path) {
	  			if(ch == up) {
	  				counts.put(up, counts.get(up)+1);
	  				counts.put(down, counts.get(down)-1);
	  				
	  				if(Math.abs(counts.get(up)) == counts.get(down) && (counts.get(down) < lastDown) && !inValley){
	  					valley = valley+1;
	  					inValley =true;
	  				}
	  			}else {
	  				counts.put(down, counts.get(down)+1);
	  				counts.put(up, counts.get(up)-1);
	  			
	  			}
	  			if(!inValley) {
	  				lastDown=counts.get(down);
	  			}
	  			if(counts.get(down) ==0) {
	  				inValley=false;
	  			}
	  			if(counts.get(up) ==0 && counts.get(down) <0) {
	  				inValley = true;
	  			}
	  		}
	  		
	  		return valley;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s = scanner.nextLine();

	        int result = countingValleys(n, s);
	        System.out.println(result);

	        scanner.close();
	    }
}
/**
 * 10
DUDDDUUDUU
2

8
UDDDUDUU
1
**/
