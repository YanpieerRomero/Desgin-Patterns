package com.yanpieer.AbstractFactory;

import com.yanpieer.AbstractFactory.inter.FabricaAbstracta;
import com.yanpieer.AbstractFactory.inter.IConexionBD;
import com.yanpieer.AbstractFactory.inter.IConexionREST;

public class App {
    public static void main(String[] args) {
        FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");

        IConexionBD cx1 = fabricaBD.getBD("MySQL");
        cx1.conectar();
        
        FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");

        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");
        
        cxRS1.leerURL("https://www.yanpieer.com");

    }
}
