package com.yanpieer.AbstractFactory.inter.impl;

import com.yanpieer.AbstractFactory.inter.IConexionBD;

public class ConexionSQLServer implements IConexionBD{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
    public ConexionSQLServer() {
        this.host = "localhost";
        this.puerto = "1433";
        this.usuario = "sqlserver";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        // Aqui puede ir código JDBC
        System.out.println("Se conectó a SQLServer");
    
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó a SQLServer");
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
