package com.yanpieer.Observer;

import com.yanpieer.Observer.observer.PesoARGObservador;
import com.yanpieer.Observer.observer.PesoMXObservador;
import com.yanpieer.Observer.observer.SolObservador;
import com.yanpieer.Observer.observer.Subject;

public class App {
    public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 dólares obtendrá : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dólares obtendrá : ");
		subject.setEstado(100);
	}
}
