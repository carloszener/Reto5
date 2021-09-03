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
import model.vo.Requerimiento2;

public class Requerimiento_2Dao {
   
    public ArrayList<Requerimiento2> requerimiento2() throws SQLException {
        
        //Consulta
        ArrayList<Requerimiento2> respuesta = new ArrayList<Requerimiento2>();
        Connection conexion = JDBCUtilities.getConnection();

    try{        
        
        String consulta = "SELECT ID_Proyecto, Constructora, Ciudad, Estrato " 
                        + "FROM Proyecto " 
                        + "NATURAL JOIN Tipo "
                        + "WHERE Ciudad = 'Cartagena' " 
                        + "ORDER BY Estrato ";
        
        PreparedStatement estado = conexion.prepareStatement(consulta);
        ResultSet resultado = estado.executeQuery();

        while (resultado.next()){
            Requerimiento2 proceso = new Requerimiento2();
            proceso.setID_Proyecto(resultado.getInt("ID_Proyecto"));
            proceso.setConstructora(resultado.getString("Constructora"));
            proceso.setCiudad(resultado.getString("Ciudad"));
            proceso.setEstrato(resultado.getInt("Estrato"));

            respuesta.add(proceso);
        
            }
        
            resultado.close();
            estado.close();
        
        }catch(SQLException e){
            System.err.println("Error consultando el Requerimiento2: "+e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }

        return respuesta;



    }
        
}
