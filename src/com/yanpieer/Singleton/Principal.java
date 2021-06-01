package com.yanpieer.Singleton;

public class Principal {
    public static void main(String[] args) {
        //Instanciación por constructor prohibido por ser "private"
        //Conexion c = new Conexion();
        Conexion c = Conexion.getInstancia();

        c.conectar();
        c.desconectar();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
        
        Conexion c2 = Conexion.getInstancia();

        c2.conectar();
        c2.desconectar();

        boolean rpta2 = c2 instanceof Conexion;
        System.out.println(rpta2);
    }
}
