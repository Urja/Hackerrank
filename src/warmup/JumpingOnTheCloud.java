package warmup;

import java.io.IOException;
import java.util.Scanner;


public class JumpingOnTheCloud {
    static int jumpingOnClouds(int[] c) {
    	int jumps = 0;
    	int currentCloud =0;
    	 
    	while(currentCloud  != c.length-1) {
    		if(currentCloud+2 != c.length) {
	    		if(c[currentCloud+2] ==1) {
	    			currentCloud= currentCloud+1;
	    		}
	    		else {
	    			currentCloud = currentCloud+2;
	    		}
    		}
    		else {
    			currentCloud= currentCloud+1;
    		}
	    		jumps= jumps +1;
    	}
    	
    	return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
    //    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);

    }
}
