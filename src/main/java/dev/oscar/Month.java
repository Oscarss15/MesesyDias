package dev.oscar;

public class Month {

    int numberMonth;
    String nameOfMOnth;
    int daysOfMonth;

    
    

    public static String resultMonth(int numberMonth){
        String nameOfMOnth;
        int daysOfMonth;
        switch (numberMonth) {
            case 1:
            nameOfMOnth= "January";
            daysOfMonth=31;
           
                break;
            case 2:
            nameOfMOnth= "February";
            daysOfMonth=28;
            
                break;
            case 3:
            nameOfMOnth= "March";
            daysOfMonth=31;
            
                break;    
            case 4:
            nameOfMOnth= "April";
            daysOfMonth=30;
            
                break; 
            case 5:
            nameOfMOnth= "May";
            daysOfMonth=31;
           
                break; 
            case 6:
            nameOfMOnth= "June";
            daysOfMonth=30;
            
                break; 
            case 7:
            nameOfMOnth= "July";
            daysOfMonth=31;
           
                break; 
            case 8:
            nameOfMOnth= "August";
            daysOfMonth=31;
           
                break;    
            case 9:
            nameOfMOnth= "September";
            daysOfMonth=30;
           
                break;   
            case 10:
            nameOfMOnth= "October";
            daysOfMonth=31;
            
                break;   
            case 11:
            nameOfMOnth= "November";
            daysOfMonth=30;
            
            break; 
            case 12:
            nameOfMOnth= "December";
            daysOfMonth=31;
          
            break; 
            default:
            nameOfMOnth = "Invalid month";
            daysOfMonth = 0;
            break;
        }
      return "The month is "+nameOfMOnth+" and the month have "+daysOfMonth+" days.";
    }
    
    public static void main(String[] args) {
        System.out.println(resultMonth(5)); 
    }
    
}
