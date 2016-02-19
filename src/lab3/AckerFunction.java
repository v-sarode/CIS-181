package lab3;
/***********************************************************
* Lab #3 (CIS 181)                             *
* Submitted By: Your name here !!!                        *
* SID: Your new SID starting with "00"                    *
* Date: Your submission date                              *
***********************************************************/
public class AckerFunction{
	
	
	private int spaces = 0;
	private int numberOfInvocations = 0;


	
	// getter for data field "numberOfInvocations"
	public int countOfInvocations(){
		return numberOfInvocations;
	}

	
	
	public int acker(int m, int n){
		int result = 0;
		
		this.numberOfInvocations++;
		spaces++;printSpaces();System.out.println("Entering method acker: m = "+m+", n = "+n);
		if(m == 0){
			spaces--;printSpaces();System.out.println("Leaving method acker: m = "+m+", n = "+n);
			result = n+1;	
		}else if (n == 0){
			spaces--;printSpaces();System.out.println("Leaving method acker: m = "+m+", n = "+n);
			result =  acker(m-1 , 1);
		}else{
		//	spaces++;printSpaces();System.out.println("Entering method acker: m = "+m+", n = "+n);
		//	spaces++;printSpaces();System.out.println("Entering method acker: m = "+m+", n = "+n);
			result = acker(m-1,acker(m,n-1));
		}
	//		TODO: implement the Ackermann's function to trace the method invocation
	//		history and count the totoal number of invocations.

		
		
		
		return result;	
	}
	
	
	// Indent the trace messages according to how "deep" the current recursive call is.
	// To be called by method acker only.
	private void printSpaces(){
		for (int i = 0; i < spaces; i++)
			System.out.print("    ");
	}
		
}