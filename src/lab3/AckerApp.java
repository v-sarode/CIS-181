package lab3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AckerApp {

	public static void main(String[] args) {

		int m = 0, n = 0;
		AckerFunction ackerObject = new AckerFunction(); 
		String nextLine = "";
		BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
		
		while(true){

			System.out.print("Input two intergers separated by a space character (enter \"q\" to quit):");

            try {
                nextLine = stdin.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (nextLine.length() > 0 &&
                    (nextLine.charAt(0) == 'q' || nextLine.charAt(0) == 'Q')) {
                System.out.println("Done!");
                System.exit(0);
            }
            
            
            

            StringTokenizer input = new StringTokenizer(nextLine," ");
            try {
                m = Integer.parseInt(input.nextToken());
                n = Integer.parseInt(input.nextToken());
                int result = ackerObject.acker(m, n);
                System.out.println("Total number of invocations = "+ackerObject.countOfInvocations()+", result = "+result);
            } catch (Exception e) {
                System.out.println("Invalid input! Please try again!");
                continue;
            }

            
            
		}
	}

}
