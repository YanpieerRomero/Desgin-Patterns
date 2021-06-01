package com.yanpieer.Factory;

import com.yanpieer.Factory.inter.IConexion;
import com.yanpieer.Factory.inter.impl.ConexionMySQL;
import com.yanpieer.Factory.inter.impl.ConexionOracle;
import com.yanpieer.Factory.inter.impl.ConexionPostgreSQL;
import com.yanpieer.Factory.inter.impl.ConexionSQLServer;
import com.yanpieer.Factory.inter.impl.ConexionVacia;

public class ConexionFabrica {
    public IConexion getConexion(String motor) {
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
}
