
package pklsfinal;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
    
    //function to connect with mysql database
    public static Connection getConnection(){
        
        Connection con = null;
        
        try{
            
            Class.forName("com.myql.jdbc.Driver.");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_register", "root","");
            
        } catch (Exception ex){
            System.out.println(ex.getMessage());                      
        }
        
        return con;
    }

    static Connection mycon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
