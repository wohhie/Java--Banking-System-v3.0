
import java.sql.*;
import javax.swing.*;


public class OracleCon{
    Connection con = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//load drive
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            Statement stmt=con.createStatement();
			//JOptionPane.showMessageDialog(null, "Connected to Database");
            ResultSet rs=stmt.executeQuery("select * from emp");
			while(rs.next())
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			return con;
			//con.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return null;
    }
    
    
}
