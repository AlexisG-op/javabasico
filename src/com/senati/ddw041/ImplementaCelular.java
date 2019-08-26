package com.senati.ddw041;

public class ImplementaCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto Celular1 de la clase Celular
		//Clase objeto = new Clase(1,"Huawei",900)
		//Clase objeto = new Clase();
		//objeto.id = 1;
		//obejto.marca = "Huawei";
		//obejto.precio=900f;
		
		celular Cel1 = new celular();
		Cel1.id = 1;
		Cel1.modelo = "Venus";
		Cel1.precio = 900f;
		
		System.out.println("Datos registrados");
		System.out.println(Cel1.toString());
		
		
		//Crea un obejto Cel2 y agrega sus características
		celular Cel2 = new celular();
		Cel2.id = 2;
		Cel2.modelo = "Huawei";
		Cel2.precio = 1500f;
		
		System.out.println("");
		System.out.println("Datos registrados");
		System.out.println(Cel2.toString());
		
		celular Cel3 = new celular(3,"Xiaomi",500);
		System.out.println("");
		System.out.println("Datos registrados");
		System.out.println(Cel3.toString());
	}

}
