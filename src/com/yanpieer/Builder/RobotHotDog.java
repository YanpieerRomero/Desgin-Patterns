package com.yanpieer.Builder;

import java.util.List;

public class RobotHotDog implements Robot{

    //Lista de acciones a realizar
    List<Integer> acciones;

    //Constructor vacio
    public RobotHotDog(){}

    //Inicia el proceso
    private void start(){
        System.out.println("Iniciando la HotDog");
    }

    //Busca los ingredientes
    private void getParts(){
        System.out.println("Buscando: Pan, Salchicha, Salsas");
    }

    //Arma la hamburguesa
    private void build(){
        System.out.println("Armando el HotDog");
    }

    //Revisa el proceso
    private void check(){
        System.out.println("Revisando el proceso");
    }

    //Termina el proceso
    private void finish(){
        System.out.println("Proceso terminado");
    }

    /*
    Método sobreescrito encargado de cargar las acciones solicitadas
    por el builder en tiempo de ejecución    
    */
    @Override
    public void cargarAcciones(List<Integer> accion) {
      this.acciones = accion;  
    }

    /*
    Método sobreescrito que procesa las acciones solicitadas
    por el builder en tiempo de ejecución    
    */
    @Override
    public void trabajar() {
        start();
        for (Integer i : acciones) {
            switch (i) {
                case 1:
                    getParts();
                    break;
                case 2:
                    build();
                    break;
                case 3:
                    check();
                    break;
                default:
                    System.out.println("Esa accion no la puedo hacer");
            }
        }
        finish();
    }

}
