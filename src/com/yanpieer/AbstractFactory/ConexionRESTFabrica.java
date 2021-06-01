package com.yanpieer.AbstractFactory;

import com.yanpieer.AbstractFactory.inter.FabricaAbstracta;
import com.yanpieer.AbstractFactory.inter.IConexionBD;
import com.yanpieer.AbstractFactory.inter.IConexionREST;
import com.yanpieer.AbstractFactory.inter.impl.ConexionRESTCompras;
import com.yanpieer.AbstractFactory.inter.impl.ConexionRESTNoArea;
import com.yanpieer.AbstractFactory.inter.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

    @Override
    public IConexionBD getBD(String motor) {
        return null;
    }

    @Override
    public IConexionREST getREST(String area) {
        if(area == null)
            return new ConexionRESTNoArea();
        if(area.equalsIgnoreCase("COMPRAS"))
            return new ConexionRESTCompras();
        else if(area.equalsIgnoreCase("VENTAS"))
            return new ConexionRESTVentas();
        
        return new ConexionRESTNoArea();
    }
    
}
