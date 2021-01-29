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
   String n_franq;
   String n_rest;
   String location;
   int cant_empleados;
   char park;
   char area_juegos;
   int cant_mesas;
   int cant_cajeros;
   String nom_gerente;
   String esp_rest;
   String estado_res;

    public Restaurante() {
    }//fin del constructor
   
   public Restaurante(String n_franq, String n_rest, String location, int cant_empleados, char park, char area_juegos, int cant_mesas, int cant_cajeros, String nom_gerente, String esp_rest, String estado_res) {
        this.n_franq = n_franq;
        this.n_rest = n_rest;
        this.location = location;
        this.cant_empleados = cant_empleados;
        this.park = park;
        this.area_juegos = area_juegos;
        this.cant_mesas = cant_mesas;
        this.cant_cajeros = cant_cajeros;
        this.nom_gerente = nom_gerente;
        this.esp_rest = esp_rest;
        this.estado_res = estado_res;
    }//fin del constructor

    public String getN_franq() {
        return n_franq;
    }

    public void setN_franq(String n_franq) {
        this.n_franq = n_franq;
    }

    public String getN_rest() {
        return n_rest;
    }

    public void setN_rest(String n_rest) {
        this.n_rest = n_rest;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCant_empleados() {
        return cant_empleados;
    }

    public void setCant_empleados(int cant_empleados) {
        this.cant_empleados = cant_empleados;
    }

    public char getPark() {
        return park;
    }

    public void setPark(char park) {
        this.park = park;
    }

    public char getArea_juegos() {
        return area_juegos;
    }

    public void setArea_juegos(char area_juegos) {
        this.area_juegos = area_juegos;
    }

    public int getCant_mesas() {
        return cant_mesas;
    }

    public void setCant_mesas(int cant_mesas) {
        this.cant_mesas = cant_mesas;
    }

    public int getCant_cajeros() {
        return cant_cajeros;
    }

    public void setCant_cajeros(int cant_cajeros) {
        this.cant_cajeros = cant_cajeros;
    }

    public String getNom_gerente() {
        return nom_gerente;
    }

    public void setNom_gerente(String nom_gerente) {
        this.nom_gerente = nom_gerente;
    }

    public String getEsp_rest() {
        return esp_rest;
    }

    public void setEsp_rest(String esp_rest) {
        this.esp_rest = esp_rest;
    }

    public String getEstado_res() {
        return estado_res;
    }

    public void setEstado_res(String estado_res) {
        this.estado_res = estado_res;
    }
   
   
   //MA
    public String toString(){
        return "Nombre de la Franquicia: \n"+n_franq 
                +"Nombre del Restuarante: \n"+n_rest
                +"Ubicacion del restuarante: \n"+location
                +"Cantidad de empleados: \n"+cant_empleados
                +"Tiene parqueo[S/N]: \n"+park
                +"Tiene area de juegos[S/N]:  \n"+area_juegos
                +"Cantidad de Mesas: \n"+cant_mesas
                +"Cantidad de empleados: \n"+cant_empleados
                +"Cantidad de cajeros:  \n"+cant_cajeros
                +"Nombre del Gerente: \n"+nom_gerente
                +"Especialidad restuarante: \n"+esp_rest
                +"Estado del restuarante:  \n"+estado_res;
    }// fin del toString
   
   
   
}//fin de la clase restaurante
