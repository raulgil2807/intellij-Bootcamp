package com.company.project1;

public class Main {

        public static void main(String[] args) {
            int resultado;
            resultado = suma(4, 8, 10);
            System.out.println(resultado);


            Coche miCoche = new Coche();
            miCoche.AñadirPuertas();
            miCoche.AñadirPuertas();
            System.out.println(miCoche.puertas);
        }
        public static int suma(int a, int b, int c) {
            return a + b + c;
        }
}

class  Coche {
    public int puertas = 3;

    public void AñadirPuertas() {
        this.puertas++;
    }
}