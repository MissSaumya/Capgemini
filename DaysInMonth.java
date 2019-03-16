import java.util.*;
class DaysInMonth
{
	public static void main(String args[])
	{
    int n,year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		n= sc.nextInt();
		System.out.println("Enter the year you want to check");
		year = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("January has 31days");
			break;
		case 2:
			System.out.println("February has either 28days or 29 days");
			if(year%4 == 0)
    			{
        		if( year%100 == 0)
        		{
            		 if ( year%400 == 0)
            			System.out.println("yearis a leap year."+ year);
            		else
                		System.out.println("Year is not a leap year."+year);
        		}
        		else
            		System.out.println("Year is a leap year."+ year );
    			}
    			else
        		System.out.println("Year is not a leap year."+ year);
			break;
		case 3:
			System.out.println("March has 31days");
			break;
		case 4:
			System.out.println("April has 30days");
			break;
		case 5:
			System.out.println("may has 31days");
			break;
		case 6:
			System.out.println("June has 30days");
			break;
		case 7:
			System.out.println("July has 31days");
			break;
		case 8:
			System.out.println("August has 31days");
			break;
		case 9:
			System.out.println("September has 30days");
			break;
		case 10:
			System.out.println("October has 31days");
			break;
		case 11:
			System.out.println("November has 30days");
			break;
		case 12:
			System.out.println("December has 31days");
			break;
		default:
			System.out.println("Unfavourable choice");
		}
		
		
	}
}