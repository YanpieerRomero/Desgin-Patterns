package com.yanpieer.AbstractFactory.inter.impl;

import com.yanpieer.AbstractFactory.inter.IConexionBD;

public class ConexionPostgreSQL implements IConexionBD {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
    public ConexionPostgreSQL() {
        this.host = "localhost";
        this.puerto = "5433";
        this.usuario = "postgres";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a PostgreSQL");
    
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó a PostgreSQL");
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
