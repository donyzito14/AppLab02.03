/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.controller;

import uni.sistemas.entity.Operaciones;
import uni.sistemas.model.OperacionesModel;

public class OperacionesController {

    //Crecion del constructor
    public OperacionesController() {
    }
    //Llamar al modelo
    OperacionesModel om = new OperacionesModel();

    public void procesarR(Operaciones o) {
        om.cSuma(o);
        om.cDivision(o);
        om.cMultiplicacion(o);
        om.cResta(o);

    }

    public String generarR(Operaciones o) {
        String resultado= "Suma: " + o.getS()
                + "\nResta : " + o.getR()
                + "\nDivision : " + o.getD()
                + "\nMultiplicacion : " + o.getM();
        return resultado;

    }

}
