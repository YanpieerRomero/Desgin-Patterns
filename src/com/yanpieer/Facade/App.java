package com.yanpieer.Facade;

import com.yanpieer.Facade.facade.CheckFacade;

public class App {
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("31/05/2021", "06/06/2021", "Lima", "Cancún");
        
        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("31/05/2021", "06/06/2021", "Lima", "Quito");
    }
}
