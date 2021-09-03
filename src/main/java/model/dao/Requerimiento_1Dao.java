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
import model.vo.Requerimiento1;

public class Requerimiento_1Dao {
    
    public ArrayList<Requerimiento1> requerimiento1() throws SQLException {

        // Consulta
        ArrayList<Requerimiento1> respuesta = new ArrayList<Requerimiento1>();
        Connection conexion = JDBCUtilities.getConnection();

    try{        
        
        String consulta = "SELECT Nombre, Primer_Apellido, ID_Lider, Salario " 
                        + "FROM Lider " 
                        + "WHERE Salario <= 500000 "
                        + "ORDER BY Salario "; 
        
        PreparedStatement estado = conexion.prepareStatement(consulta);
        ResultSet resultado = estado.executeQuery();

        while (resultado.next()){
            Requerimiento1 proceso = new Requerimiento1();
            proceso.setID_Lider(resultado.getInt("ID_Lider"));
            proceso.setPrimer_Apellido(resultado.getString("Primer_Apellido"));
            proceso.setNombre(resultado.getString("Nombre"));
            proceso.setSalario(resultado.getInt("Salario"));

            respuesta.add(proceso);
        
            }
        
            resultado.close();
            estado.close();
        
        }catch(SQLException e){
            System.err.println("Error consultando el Requerimiento1: "+e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }

        return respuesta;
    
    }

}
