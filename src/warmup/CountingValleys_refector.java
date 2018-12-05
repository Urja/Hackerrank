package warmup;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys_refector {
	static int countingValleys(int n, String s) {
		int valley = 0;
		
		int cStep =0;
		int pStep =0;
		
		char[] steps =s.toCharArray();
		
		for(char c : steps) {
			pStep =cStep;
			
			if(c =='U') {
				cStep = cStep +1;
			}else {
				cStep = cStep-1;
			}
			if(pStep ==0 && cStep== -1)
				valley =valley+1;
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
