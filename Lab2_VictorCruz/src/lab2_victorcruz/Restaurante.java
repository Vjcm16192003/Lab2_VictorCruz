/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Restaurante {

    String Nom_Franquicia;
    String Nom_restaurante;
    String Location;
    int Cant_empleados;
    String Es_premium;
    int Cant_Cajeros;
    String Esta_Restaurante;
    int Cant_mesas;
    String Nom_Gerente;
    String Espec_Restaurante;

    public Restaurante(String Nom_Franquicia, String Nom_restaurante, String Location, int Cant_empleados, String Es_premium, int Cant_Cajeros, String Esta_Restaurante, int Cant_mesas, String Nom_Gerente, String Espec_Restaurante) {
        this.Nom_Franquicia = Nom_Franquicia;
        this.Nom_restaurante = Nom_restaurante;
        this.Location = Location;
        this.Cant_empleados = Cant_empleados;
        this.Es_premium = Es_premium;
        this.Cant_Cajeros = Cant_Cajeros;
        this.Esta_Restaurante = Esta_Restaurante;
        this.Cant_mesas = Cant_mesas;
        this.Nom_Gerente = Nom_Gerente;
        this.Espec_Restaurante = Espec_Restaurante;
    }

    public String getNom_Franquicia() {
        return Nom_Franquicia;
    }

    public void setNom_Franquicia(String Nom_Franquicia) {
        this.Nom_Franquicia = Nom_Franquicia;
    }

    public String getNom_restaurante() {
        return Nom_restaurante;
    }

    public void setNom_restaurante(String Nom_restaurante) {
        this.Nom_restaurante = Nom_restaurante;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getCant_empleados() {
        return Cant_empleados;
    }

    public void setCant_empleados(int Cant_empleados) {
        this.Cant_empleados = Cant_empleados;
    }

    public String getEs_premium() {
        return Es_premium;
    }

    public void setEs_premium(String Es_premium) {
        this.Es_premium = Es_premium;
    }

    public int getCant_Cajeros() {
        return Cant_Cajeros;
    }

    public void setCant_Cajeros(int Cant_Cajeros) {
        this.Cant_Cajeros = Cant_Cajeros;
    }

    public String getEsta_Restaurante() {
        return Esta_Restaurante;
    }

    public void setEsta_Restaurante(String Esta_Restaurante) {
        this.Esta_Restaurante = Esta_Restaurante;
    }

    public int getCant_mesas() {
        return Cant_mesas;
    }

    public void setCant_mesas(int Cant_mesas) {
        this.Cant_mesas = Cant_mesas;
    }

    public String getNom_Gerente() {
        return Nom_Gerente;
    }

    public void setNom_Gerente(String Nom_Gerente) {
        this.Nom_Gerente = Nom_Gerente;
    }

    public String getEspec_Restaurante() {
        return Espec_Restaurante;
    }

    public void setEspec_Restaurante(String Espec_Restaurante) {
        this.Espec_Restaurante = Espec_Restaurante;
    }

    
    
    @Override
     public String toString() {
        return "restaurante" 
                + "Nombre de la Franquicia = \n" + Nom_Franquicia
                + ", Nombre_restaurante = \n" + Nom_restaurante 
                + ", Ubicacion = \n" + Location 
                + ", Cantidad_empleados = \n" + Cant_empleados 
                + ", Premium[s/n]= \n" + Es_premium
                + ", Cantidad_De_Cajeros=\n" + Cant_Cajeros 
                + ", Estado_Del_Restaurante = \n" + Esta_Restaurante 
                + ", Cantidad_mesas = \n" + Cant_mesas
                + ", Nombre_De_Gerente = \n" + Nom_Gerente 
                + ", Especialidad_del_Restaurante = \n" + Espec_Restaurante;  
}

}//fin de la clase restaurante
