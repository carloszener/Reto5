package model.vo;

public class Requerimiento1 {
    
    //Atributos

    private Integer ID_Lider;
    private String Primer_Apellido;
    private String Nombre;
    private Integer Salario;

    //Setters
    
    public void setID_Lider(Integer iD_Lider) {
        ID_Lider = iD_Lider;
    }    

    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    public void setSalario(Integer salario) {
        Salario = salario;
    }

    //Getters

    public Integer getID_Lider() {
        return ID_Lider;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public Integer getSalario() {
        return Salario;
    }

}
