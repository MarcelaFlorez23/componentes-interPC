/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentesinternospc;

/**
 *
 * @author Marcela Florez
 */
public class Computadora {
    private String  tarjetaSonido, sistemaOperativo, nombre, procesador;
    
    private int memoria;
    public Computadora(){};
    public Computadora(String tarjetaSonido){};
    public Computadora(String tarjetaSonido, String sistemaOperativo){};
    public Computadora(String tarjetaSonido, String sistemaOperativo, String procesador){};
    public Computadora(String tarjetaSonido, String sistemaOperativo, String procesador, String nombre){};
    public Computadora(String tarjetaSonido, String sistemaOperativo, String procesador, String nombre, int memoria){};
     
    // Setters & Getters
    public void setTarjetaSonido(String tarjetaSonido){
        this.tarjetaSonido=tarjetaSonido;
    }
    public String getTarjetaSonido(){
        return tarjetaSonido;
    }
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo=sistemaOperativo;
    }
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    public void setProcesador(String procesador){
        this.procesador=procesador;
    }
    public String getProcesador(){
        return procesador;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setMemoria(int memoria){
        this.memoria=memoria;
    }
    public int getMemoria(){
        return memoria;
    }

 
}
