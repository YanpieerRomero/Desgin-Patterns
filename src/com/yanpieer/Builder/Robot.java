package com.yanpieer.Builder;

import java.util.List;

public interface Robot {
    //Método que pone a trabajar al robot
    public void trabajar();

    /*
    Método que cargará las acciones solicitadas por el builder
    en el tiempo de ejecución
    */
    public void cargarAcciones(List<Integer> accion);
}
