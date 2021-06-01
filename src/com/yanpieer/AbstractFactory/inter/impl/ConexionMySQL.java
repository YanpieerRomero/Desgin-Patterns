package com.yanpieer.AbstractFactory.inter.impl;

import com.yanpieer.AbstractFactory.inter.IConexionBD;

public class ConexionMySQL implements IConexionBD {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
    public ConexionMySQL() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a MySQL");
    
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó a MySQL");
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}