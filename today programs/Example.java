import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Example{
   public static boolean validateJavaDate(String strDate)
   {
	
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	/* Date is not 'null' */
	else
	{
	    
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	   
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid ");
	    }
	   
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid");
	        return false;
	    }
	   
	    return true;
	}
   }
   public static void main(String args[]){
	validateJavaDate("12/29/2016");
	validateJavaDate("12-29-2016");
	validateJavaDate("12,29,2016");
   }
}