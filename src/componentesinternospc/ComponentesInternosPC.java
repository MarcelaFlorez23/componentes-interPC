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
public class ComponentesInternosPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora cm = new Computadora();
        cm.setMemoria(4);
        cm.setNombre("Del Studio 1555");
        cm.setSistemaOperativo("Microsoft, Windows Vista, Home Premium");
        cm.setTarjetaSonido("HD audio");
        cm.setProcesador("intel Cone 2 Duo");
        System.out.println();
        System.out.println("LOS COMPONENTES DE LA COMPUTADORA "+ cm.getNombre()+" son:");
        System.out.println("Memoria: " + cm.getMemoria());
        System.out.println("Sistema Operativo: " + cm.getSistemaOperativo());
        System.out.println("Tarjeta de sonido: " + cm.getTarjetaSonido());
        System.out.println("Procesador: " + cm.getProcesador());
        
    }
    
}
