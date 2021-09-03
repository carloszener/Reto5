package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Requerimiento3;

public class Requerimiento_3Dao {
   
    public ArrayList<Requerimiento3> requerimiento3() throws SQLException {
        
        //Consulta
        ArrayList<Requerimiento3> respuesta = new ArrayList<Requerimiento3>();
        Connection conexion = JDBCUtilities.getConnection();

    try{        
        
        String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido " 
                        + "FROM Lider " 
                        + "WHERE Primer_Apellido "
                        + "LIKE '%z' ORDER BY Nombre "; 
        
        PreparedStatement estado = conexion.prepareStatement(consulta);
        ResultSet resultado = estado.executeQuery();

        while (resultado.next()){
            Requerimiento3 proceso = new Requerimiento3();
            proceso.setID_Lider(resultado.getInt("ID_Lider"));
            proceso.setNombre(resultado.getString("Nombre"));
            proceso.setPrimer_Apellido(resultado.getString("Primer_Apellido"));            

            respuesta.add(proceso);
        
            }
        
            resultado.close();
            estado.close();
        
        }catch(SQLException e){
            System.err.println("Error consultando el Requerimiento3: "+e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }


        return respuesta;



    }
        
}
