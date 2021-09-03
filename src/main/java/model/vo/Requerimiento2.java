package model.vo;

public class Requerimiento2 {
    
    //Atributos

    private Integer ID_Proyecto;
    private String Constructora;
    private String Ciudad;
    private Integer Estrato;

    //Setters

    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
    
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public void setEstrato(Integer estrato) {
        Estrato = estrato;
    }

    //Getters

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public String getConstructora() {
        return Constructora;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public Integer getEstrato() {
        return Estrato;
    }
    
}
