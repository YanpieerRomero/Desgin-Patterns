package com.yanpieer.Factory.inter.impl;

import com.yanpieer.Factory.inter.IConexion;

public class ConexionVacia implements IConexion{

    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICĂ“ PROVEEDOR");        
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICĂ“ PROVEEDOR");        
    }
    
}
