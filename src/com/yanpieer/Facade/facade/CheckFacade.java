package com.yanpieer.Facade.facade;

import com.yanpieer.Facade.api.AvionAPI;
import com.yanpieer.Facade.api.HotelAPI;

public class CheckFacade {
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFacade() {
        avionAPI = new AvionAPI();
        hotelAPI = new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHotel(fechaIda, fechaVuelta, origen, destino);
    }

}
