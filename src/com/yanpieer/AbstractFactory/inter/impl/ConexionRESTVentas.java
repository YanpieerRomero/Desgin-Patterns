package com.yanpieer.AbstractFactory.inter.impl;

import com.yanpieer.AbstractFactory.inter.IConexionREST;

public class ConexionRESTVentas implements IConexionREST{
    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose a " + url);        
    }
    
}
