package com.yanpieer.AbstractFactory.inter.impl;

import com.yanpieer.AbstractFactory.inter.IConexionBD;

public class ConexionOracle implements IConexionBD{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
    public ConexionOracle() {
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a Oracle");
    
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó a Oracle");
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
