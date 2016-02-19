/***********************************************************
 * Lab #1 (CIS 181, Fall 2008)                             *
 * Submitted By: Your name here !!!                        *
 * SID: Your new SID starting with "00"                    *
 * Date: Your submission date                              *
 ***********************************************************/

/*
 * Created on September 16, 2006
 * @author Haiping Xu
 */


package lab2;
public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {
        month = 01;
        day = 01;
        year = 2016;
    }

    /**
     * DESC : PARAMETERRIZED CONSTRUCTOR
     * @param m MONTH INTEGER
     * @param d DAY INTEGER
     * @param y YEAR INTEGER
     */
    public Date (int m, int d, int y){
        month = m;
        day = d;
        year =y;
    }

    /**
     * DESC : GETTER FOR THE MONTH
     * @return MONTH INTEGER
     */
    public int getMonth() {
		return month;
	}

    /**
     * DESC : SETTER FOR THE MONTH 
     * @param month
     */
	public void setMonth(int month) {
		this.month = month;
	}


	/**
	 * DESC : GETTER FOR THE DAY 
	 * @return DAY INTEGER
	 */
	public int getDay() {
		return day;
	}

	/**
	 * DESC: SETTER FOR THE DAY 
	 * @param day INTEGER
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * DESC: GETTER FOR THE YEAR 
	 * @return INTEGER
	 */
	public int getYear() {
		return year;
	}

	/**
	 * DESC : SETTER FOR THE YEAR
	 * @param year INTEGER
	 */
	public void setYear(int year) {
		this.year = year;
	}

	
	/**
	 * DESC: CHECK FOR THE LEGITIMACY OF THE DATE ENTERED 
	 * @param mon INTEGER VAR FOR THE MONTH
	 * @param day INTEGER VAR FOR THE DAY
	 * @param year INTEGER VAR FOR THE YEAR
	 * @return
	 */
	// -----------------------------------------------------------------------------
    // Check if a date is valid.
    // Preconditon: mon, day and year are integers.
    // Postcondtion: If the combination of mon, day and year represents a valid date,
    //       a true value is returned; othereise, a false value is returned.
    // -----------------------------------------------------------------------------
    public static boolean isLegitimate(int mon, int day, int year){

        // February has 29 days in any year evenly divisible by four,
        // EXCEPT for centurial years which are not also divisible by 400.

    	
        // TODO 1: Check if a date is valid.

    	/**
    	 * BOOLEAN VARIBALES TO 
    	 */
    	boolean validDate = false;
    	boolean validDay= false;
    	boolean isLeapYear = false;
    	
    	
    	 if((year % 400 == 0) || ((year % 4 == 0) && (year %100 !=0)))
         {
             isLeapYear = true;
         }    	
    	
    	
    	
    	switch(mon){
    	
    	case 1:
    		validDay = (day > 0 && day <= 31) ? true:false ;
    		validDate = true;    		
    		break;
    		
    		
    	case 2:
    		if(isLeapYear){
    			validDay = (day > 0 && day <= 29) ? true:false ;
    			validDate = true;
    		}else{
    			validDay = (day > 0 && day <= 28) ? true:false ;
    			validDate = true;
    		}
    		break;

    	case 3:
    		validDay = (day > 0 && day <= 31) ? true:false ;
    		validDate = true;    		
    		break;

    	case 4:
    		validDay = (day > 0 && day <= 30) ? true:false ;
    		validDate = true;    		
    		break;
    		
    	case 5:
    		validDay = (day > 0 && day <= 31) ? true:false ;
    		validDate = true;    		
    		break;

    	case 6:
    		validDay = (day > 0 && day <= 30) ? true:false ;
    		validDate = true;    		
    		break;

    	case 7:
    		validDay = (day > 0 && day <= 31) ? true:false ;
    		validDate = true;    		
    		break;
    		
    	case 8:
    		validDay = (day > 0 && day <= 31) ? true:false ;
    		validDate = true;    		
    		break;

    	case 9:
    		validDay = (day > 0 && day <= 30) ? true:false ;
    		validDate = true;    		
    		break;

    	case 10:
    		validDay = (day > 0 && day <= 31) ? true:false ;
    		validDate = true;    		
    		break;
    		
    	case 11:
    		validDay = (day > 0 && day <= 30) ? true:false ;
    		validDate = true;    		
    		break;

    	case 12:
    		validDay = (day > 0 && day <= 31) ? true:false ;
    		validDate = true; 

    		break;
    		
    	default:
    		validDay = false;
    		validDate = false; 
    	}
    	
        return (validDate && validDay) ? true: false;
    }

    // -----------------------------------------------------------------------------
    // Advance a given date by one day
    // Preconditon: aDate is a valid date
    // Postcondtion: aDate is a new valid date that is increased by one day
    // -----------------------------------------------------------------------------
    /**
     * DSC: ADVANCE THE DATE BY ONE DAY  
     * @param aDate
     */
    public static void advanceDate(Date aDate) {
    	int day = aDate.getDay();
    	int month = aDate.getMonth();
    	int year = aDate.getYear();

        // TODO 2: Implement this method to advance aDate by one day.

    	if(Date.isLegitimate(month, day, year)){
    		

    		if(month < 7 && month % 2 == 0){
					if(month == 2 && day == 29){
						aDate.setDay(1);
						aDate.setMonth(month + 1);
					}else if(day == 30){
						aDate.setDay(1);
						aDate.setMonth(month + 1);
					}else if(day > 0 && day < 30){
						aDate.setDay(day + 1);	
					}
    			
    		}else if (month > 7 && month % 2 == 0){
		    	if(month == 12 && day == 31){
					aDate.setDay(1);
					aDate.setMonth(1);
					aDate.setYear(year + 1);	
		    		
		    	}else if(day == 31){
						aDate.setDay(1);
						aDate.setMonth(month + 1);
					}else if(day > 0 && day < 30){
						aDate.setDay(day + 1);	
					}
    			
    		}else if (month < 8 && month % 2 != 0 ){
	    		if(day == 31){
					aDate.setDay(1);
					aDate.setMonth(month + 1);
				}else if(day > 0 && day < 30){
					aDate.setDay(day + 1);	
				}
    			
    		}else if (month > 8 && month != 0 ){
    			if(day == 30){
					aDate.setDay(1);
					aDate.setMonth(month + 1);
				}else if(day > 0 && day < 30){
					aDate.setDay(day + 1);	
				}
    		}
    		
    	}else{
    		System.out.println("ERROR: ENTERED DATE IS NOT VALID...");
    	}
    }

    
    
    public static void addDay(int day){
    	
    }
    
    /**
     * DESC : DISPLAY THE DATE 
     * @param s
     */
    public void display(String s){
        System.out.println(s + month + "/" + day + "/" + year);
    }
}
