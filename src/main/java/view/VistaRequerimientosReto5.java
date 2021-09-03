package view;

//Importación del Controlador
import controller.ControladorRequerimientosReto5;

//Importación de los Requerimientos
import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;

//Importación de Liberías para Interfaz Grafica
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

//Importación de librerias para Errores y Listas 
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto5 extends JFrame{
    
    public static final ControladorRequerimientosReto5 controlador = new ControladorRequerimientosReto5();

    private JPanel contentPane;
    private static JTextArea areaDeTexto;

    //Creación de ventana
    public VistaRequerimientosReto5(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450,200,850,650);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        //Creación de los titulos de encabezado
        JLabel etiqueta1 = new JLabel("MISION MINTIC 2022 GRUPO59 UTP");
        etiqueta1.setBounds(28,0,300,50);
        contentPane.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("CARLOS ENRIQUE RAMIREZ SANCHEZ");
        etiqueta2.setBounds(28,20,300,50);
        contentPane.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("SOLUCION RETO 5");
        etiqueta3.setBounds(28,40,300,50);
        contentPane.add(etiqueta3);

        //Creación de la barra de desplazamiento
        JScrollPane barra = new JScrollPane();
        barra.setBounds(20,80,790,480);
        contentPane.add(barra);

        //Creación del area de texto
        areaDeTexto = new JTextArea ();
        barra.setViewportView(areaDeTexto);

        //Creación del boton Consulta 1
        JButton btnConsulta1 = new JButton("Consulta 1");
        btnConsulta1.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e){
            requerimiento1();

            }
        });

        btnConsulta1.setBounds(28,570,120,30);
        contentPane.add(btnConsulta1);

        //Creación del boton Consulta 2
        JButton btnConsulta2 = new JButton("Consulta 2");
        btnConsulta2.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e){
            requerimiento2();

            }
        });

        btnConsulta2.setBounds(160,570,120,30);
        contentPane.add(btnConsulta2);

        //Creación del boton Consulta 3
        JButton btnConsulta3 = new JButton("Consulta 3");
        btnConsulta3.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e){
            requerimiento3();

            }
        });

        btnConsulta3.setBounds(292,570,120,30);
        contentPane.add(btnConsulta3);

        //Creación del boton Limpiar
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e){
        areaDeTexto.setText("");

                }
        });

        btnLimpiar.setBounds(680,570,120,30);
        contentPane.add(btnLimpiar);


    }

    //Consulta 1
    public static void requerimiento1(){

        try{
            
            ArrayList<Requerimiento1> solicitud1 = controlador.consultarRequerimiento_1();

            String salida1 = "*** Lideres por Salario ***\n\nNombre\tPrimer Apellido\tID del Lider\tSalario\n\n";

            for(Requerimiento1 consulta1: solicitud1){

                salida1 += consulta1.getNombre();
                salida1 += "\t";
                salida1 += consulta1.getPrimer_Apellido();
                salida1 += "\t";
                salida1 += consulta1.getID_Lider();
                salida1 += "\t";
                salida1 += consulta1.getSalario();
                salida1 += "\n";
            }

            areaDeTexto.setText(salida1);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    //Consulta 2
    public static void requerimiento2(){     

        try{
        
            ArrayList<Requerimiento2> solicitud2 = controlador.consultarRequerimiento_2();

            String salida2 = "*** Proyectos por Tipo ***\n\nID_Proyecto\tConstructora\t\tCiudad\tEstrato\n\n";

            for(Requerimiento2 consulta2: solicitud2){
                
                salida2 += consulta2.getID_Proyecto();
                salida2 += "\t";
                if(consulta2.getConstructora().equals("Pegaso")){
                    salida2 += consulta2.getConstructora();
                    salida2 += "\t\t";
                }else{
                    salida2 += consulta2.getConstructora();
                    salida2 += "\t";
                }
                salida2 += consulta2.getCiudad();
                salida2 += "\t";
                salida2 += consulta2.getEstrato();
                salida2 += "\n";
                
                

            }

            areaDeTexto.setText(salida2);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    //Consulta 3
    public static void requerimiento3(){

        try{
            
            ArrayList<Requerimiento3> solicitud3 = controlador.consultarRequerimiento_3();

            String salida3 = "*** Lideres por Nombre ***\n\nID_Lider\tNombre\tPrimer_Aoellido\n\n";

            for(Requerimiento3 consulta3: solicitud3){
                salida3 += consulta3.getID_Lider();
                salida3 += "\t";
                salida3 += consulta3.getNombre();
                salida3 += "\t";
                salida3 += consulta3.getPrimer_Apellido();
                salida3 += "\n";

            }
        
            areaDeTexto.setText(salida3);    

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

}
