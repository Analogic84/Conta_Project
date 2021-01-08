package conta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class databaseMyConta {

	/* DATOS PARA LA CONEXION */
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/databaseMyConta";
	private static final String USUARIO = "root";
	private static final String CLAVE = "********her****2015*";
	private Connection conn = null;
	
	static {
		try {
		    Class.forName( CONTROLADOR );
	   }catch (ClassNotFoundException  e) {
		   System.out.println("Error al cargar el controlador");
		   e.printStackTrace();
	    }
	}
	
	public Connection conectar() {
		  Connection conexion = null;
		  
		  try {
				conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
				
				System.out.println("conexion OK");
				
          }catch(SQLException e) {
        	  JOptionPane.showMessageDialog(null, e);
			
			}
		  
		  return conexion;   
		
	}
	
	/* METODO PARA INSERTAR UN REGISTRO EN LA BASE DE DATOS
	 * INPUT:
		table = Nombre de la tabla
		fields = String con los nombres de los campos donde insertar Ej.: campo1,campo2campo_n
		values = String con los datos de los campos a insertar Ej.: valor1, valor2, valor_n
	*/
	 public boolean insert(String table, String fields, String values)
	    {
	        boolean res=false;
	        //Se arma la consulta
	        String q=" INSERT INTO " + table + " ( " + fields + " ) VALUES ( " + values + " ) ";
	        //se ejecuta la consulta
	        try {
	            PreparedStatement pstm = conn.prepareStatement(q);
	            pstm.execute();
	            pstm.close();
	            res=true;
	         }catch(SQLException e){
	         System.out.println(e);
	      }
	      return res;
	    }
	 public void desconectar(){
	      conn = null;
	      System.out.println("La conexion a la  base de datos "+URL+" a terminado. PROBLEM?");
	   }



}
