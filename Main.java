    import java.util.Map;
    import java.util.Scanner;
    import java.util.LinkedHashMap;
    
    public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the minimum range");
    		int minRange = sc.nextInt();
    		System.out.println("Enter the maximum range");
    		int maxRange = sc.nextInt();
       		
    		MobileManagementSystem mms = new MobileManagementSystem();
    		LinkedHashMap<Integer,Integer> map= mms.viewMobileWithInTheRange(minRange,maxRange);
    		
    		if(map.isEmpty())
    		{
    		    System.out.println("No mobiles found for the given range");
    		}
            else
            {
                for(int i : map.keySet())
            		{
            		    System.out.println(i+":"+map.get(i));
            		}		    
            }
    	}
    }
