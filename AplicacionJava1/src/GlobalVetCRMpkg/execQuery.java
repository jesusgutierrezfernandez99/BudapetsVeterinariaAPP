package GlobalVetCRMpkg;
import java.sql.*;

import javax.swing.JOptionPane;
public class execQuery {

	public execQuery() {
		// TODO Auto-generated constructor stub 
        
    
	}
	public String muestraConexion() throws SQLException
	{
		Connection miConexion;
        miConexion=dbMySQLAccess.GetConnection();
        String cadena="Prueba de cadena al menos";
      
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");            
          //Ejecucion de query
            // assume that conn is an already created JDBC connection
               Statement stmt = null;
               ResultSet rs = null;
               try {
       	        stmt = miConexion.createStatement();
       	        rs = stmt.executeQuery("select name from accounts;");       	        //or rs = stmt.execute("update loquesea"); execute para cuando no es una select
       	     
	       	     while (rs.next()) {
	                 String coffeeName = rs.getString("name");
	                 JOptionPane.showMessageDialog(null, coffeeName );
	             }
       	        
               // Now do something with the ResultSet ....
               }
               finally {
       	        // it is a good idea to release
       	        // resources in a finally{} block
       	        // in reverse-order of their creation
       	        // if they are no-longer needed
       	        if (rs != null) {
       		        try {
       		        rs.close();
       		        }
       		        catch (SQLException sqlEx) { // ignore }
       		        	rs = null;
       		        }
       	        }
       	        if (stmt != null) {
       		        try {
       		        	stmt.close();
       		        } 
       		        catch (SQLException sqlEx) { // ignore }
       		        	stmt = null;
       		        }
       	        }
               }
               // fin ejecutar query
            dbMySQLAccess.cerrarConexion();
            return cadena;                        
        }
        
        
       
        
        return cadena;
	}
        

}
