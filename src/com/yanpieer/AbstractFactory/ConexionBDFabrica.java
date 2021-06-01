package com.yanpieer.AbstractFactory;

import com.yanpieer.AbstractFactory.inter.FabricaAbstracta;
import com.yanpieer.AbstractFactory.inter.IConexionBD;
import com.yanpieer.AbstractFactory.inter.IConexionREST;
import com.yanpieer.AbstractFactory.inter.impl.ConexionMySQL;
import com.yanpieer.AbstractFactory.inter.impl.ConexionOracle;
import com.yanpieer.AbstractFactory.inter.impl.ConexionPostgreSQL;
import com.yanpieer.AbstractFactory.inter.impl.ConexionSQLServer;
import com.yanpieer.AbstractFactory.inter.impl.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta{

    @Override
    public IConexionBD getBD(String motor) {
        if(motor == null)
            return new ConexionVacia();
        if(motor.equalsIgnoreCase("MYSQL"))
            return new ConexionMySQL();
        else if(motor.equalsIgnoreCase("ORACLE"))
            return new ConexionOracle();
        else if(motor.equalsIgnoreCase("POSTGRE"))
            return new ConexionPostgreSQL();
        else if(motor.equalsIgnoreCase("SQL"))
            return new ConexionSQLServer();
        
        return new ConexionVacia();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }
}
