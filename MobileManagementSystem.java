    import java.util.HashMap;
    import java.util.Map;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.sql.PreparedStatement;
    import java.sql.*;
    import java.util.LinkedHashMap;
    
    public class MobileManagementSystem {
   	
        public LinkedHashMap <Integer, Integer> viewMobileWithInTheRange(int minRange,int maxRange)
        {
            LinkedHashMap <Integer,Integer> hmap = new LinkedHashMap<Integer,Integer>();
            try{
                DB db = new DB();
                Connection con = db.getConnection();
                PreparedStatement pst = con.prepareStatement("SELECT productId, price FROM mobile WHERE price BETWEEN ? AND ? ORDER BY productId;");
                pst.setInt(1,minRange);
                pst.setInt(2,maxRange);
               
                ResultSet rst = pst.executeQuery();
                
                while(rst.next())
                {
                    //rst.next();
                    hmap.put(rst.getInt(1),rst.getInt(2));
                }
                con.close();
            }catch(Exception e)
            {
                System.out.println(e);
            }
   
    		return hmap;
    		
    	}
    
   }
