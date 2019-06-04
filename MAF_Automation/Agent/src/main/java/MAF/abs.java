package MAF;

import java.util.Scanner;

class abs{
	
	private static final String RD = null;
	private static final String RA = null;
	private static final String SRD = null;
	private static final String RRD = null;
	private static final String ERD = null;
	private static final String CEO = null;
	private static final String FRC = null;
	private static final String EVC = null;

	public void reporting() {
		
		
		String str0=EVC;
		String str1=FRC;
		String str2=CEO;
		String str3=ERD;
		String str4=RRD;
		String str5=SRD;
		String str6 = RD;
		String str7 =RD;
		String str71 =RA;
		
		
		
		if(str7 == RD) {
			
			System.out.println("Agent7 is reporting to Agent5");
				
		}
		
		else(RD == str7 ) {
			System.out.println("Agent7 is reporting to Agent6");
		}
		
		
		
	}
	
	public static void main(String args[]) {
		
		
		Scanner myObj = new Scanner(System.in);  
//	    
//	    
		System.out.println("Enter Any AgentID");
	   String str7 = myObj.nextLine(); 
	   System.out.println("Enter agent role");
	   String str71 = myObj.nextLine();
	    System.out.println("Enter Any AgentID: " + str7);
	    System.out.println("Enter agent role : " + str71);
	    
	   
	    
	    abs aobj=new abs();
	    aobj.reporting();
		
		
	}
	
	
}