package connection;
import java.sql.*;

public class getConnection {
    //cargamos los datos de conexion
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/clientes";
    String user = "root";
    String password = "";
    Connection newConnection = null;

    public getConnection(){
   
        try {
            Class.forName(driver);
            newConnection = DriverManager.getConnection(url,user,password);
            System.out.println("conexion con exito");
        }   catch (ClassNotFoundException | SQLException ex) {
            System.out.println("conexion sin exito");
            System.out.println("conexion sin exito a SQL" + ex);        

        }
    
    }
    
    public static void main (String [] args ){
    getConnection jordy = new getConnection();
            
    }
}
