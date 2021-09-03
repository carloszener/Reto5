package model.vo;

public class Requerimiento3 {
    
    //Atributos
    
    private Integer ID_Lider;
    private String Nombre;
    private String Primer_Apellido;

    //Setters

    public void setID_Lider(Integer iD_Lider) {
        ID_Lider = iD_Lider;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }

    //Getters

    public Integer getID_Lider() {
        return ID_Lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

}
