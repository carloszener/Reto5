package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)

import model.dao.Requerimiento_1Dao;
import model.dao.Requerimiento_2Dao;
import model.dao.Requerimiento_3Dao;
import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;


//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto5 {       
    
    //Atributos
    private final Requerimiento_1Dao DAO1;
    private final Requerimiento_2Dao DAO2;
    private final Requerimiento_3Dao DAO3; 
    
    //Constructor
    public ControladorRequerimientosReto5(){
        
        this.DAO1 = new Requerimiento_1Dao();
        this.DAO2 = new Requerimiento_2Dao();
        this.DAO3 = new Requerimiento_3Dao(); 
    }

    //Metodos
    public ArrayList<Requerimiento1> consultarRequerimiento_1() throws SQLException {

        return this.DAO1.requerimiento1(); 

    }
    
    public ArrayList<Requerimiento2> consultarRequerimiento_2() throws SQLException {
        
        return this.DAO2.requerimiento2(); 

    }

    public ArrayList<Requerimiento3> consultarRequerimiento_3() throws SQLException {
        
        return this.DAO3.requerimiento3();

    }

}
