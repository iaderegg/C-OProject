/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocyo;

/**
 *
 * @author iaderegg
 */
public class Parcela {

    private int[] utilidad_por_periodo;
    private int tiempo_duracion;

    // Constructor
    public Parcela(int[] utilidad_por_periodo, int tiempo_duracion) {
        this.utilidad_por_periodo = utilidad_por_periodo;
        this.tiempo_duracion = tiempo_duracion;
    }

    // Getters and setters
    public int[] getUtilidad_por_periodo() {
        return utilidad_por_periodo;
    }

    public void setUtilidad_por_periodo(int[] utilidad_por_periodo) {
        this.utilidad_por_periodo = utilidad_por_periodo;
    }

    public int getTiempo_duracion() {
        return tiempo_duracion;
    }

    public void setTiempo_duracion(int tiempo_duracion) {
        this.tiempo_duracion = tiempo_duracion;
    }    
    
}
