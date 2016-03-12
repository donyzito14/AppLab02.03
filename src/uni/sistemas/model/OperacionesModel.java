package uni.sistemas.model;

import uni.sistemas.entity.Operaciones;

public class OperacionesModel {

    // creando constructor
    public OperacionesModel() {
    }

    //creando metodos para operaciones
    public void cSuma(Operaciones o) {
        o.setS(o.getX() + o.getY());
    }

    public void cResta(Operaciones o) {
        o.setR(o.getX() - o.getY());
    }

    public void cDivision(Operaciones o) {
        o.setD(o.getX() / o.getY());
    }

    public void cMultiplicacion(Operaciones o) {
        o.setM(o.getX() * o.getY());
    }

}
