/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocyo;

import lpsolve.*;

/**
 *
 * @author iaderegg
 */
public class Model {
    
    private int num_parcelas;
    private int num_periodos;
    private Parcela[] parcelas;
    private int suma_tiempos_parcelas;
    private LpSolve solver;

    public Model(int num_parcelas, int num_periodos, Parcela[] parcelas) {
        this.num_parcelas = num_parcelas;
        this.num_periodos = num_periodos;
        this.parcelas = parcelas;
    }
    
    
    
}
