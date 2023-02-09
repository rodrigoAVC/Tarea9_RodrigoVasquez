package tarea9_rodrigovasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea9_RodrigoVasquez {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Traje traje = new Traje();
        Scanner menu = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---------------------------------");
            System.out.println("     < B I E N V E N I D O >");
            System.out.println("---------------------------------");
            System.out.print("""
                                [1] Medidor De Daño
                                [2] Medidor De Carga
                                [3] Medidor De Óxido
                                [4] Medidor De Fuerza
                                [5] Beam
                                [6] Missile Launcher
                                [7] Add-Ons
                                [8] Salir
                               """);
            System.out.println("---------------------------------");
            System.out.print("Ingrese que accion ejecutar: ");
            opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    beam(traje);
                    break;
                case 6:
                    missileLauncher(traje);
                    break;
                case 7:
                    addOn(traje);
                    break;
                case 8:
                    break;
            }
        } while (opcion != 8);
    }

    public static Traje beam(Traje traje) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int peso;
        int potencia;
        do {
            System.out.print("Ingrese el peso: ");
            peso = sc.nextInt();
            System.out.print("Ingrese la potencia: ");
            potencia = sc.nextInt();
        } while (peso < 0 || potencia < 0);
        String tipoCarga = "";
        int tankSize;
        int tempCarga;
        int numDisparos;
        int indexFotones;
        int velocidadDisparo;
        int municion;
        do {
            System.out.print("""
                           [1] Plasma Beam
                           [2] Light Beam
                           [3] Dark Beam
                           """);
            System.out.print("Ingrese que beam utilizar: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    tipoCarga = "Plasma Beam";
                    do {
                        System.out.print("Ingrese el tamaño del tanque: ");
                        tankSize = sc.nextInt();
                        System.out.print("Ingrese el tiempo de carga: ");
                        tempCarga = sc.nextInt();
                        System.out.print("Ingrese el numero de disparas antes de que se caliente: ");
                        numDisparos = sc.nextInt();
                    } while (tankSize < 0 || tempCarga < 0 || numDisparos < 0);
                    PlasmaBeam plasma = new PlasmaBeam(tankSize, tempCarga, numDisparos, tipoCarga, peso, potencia);
                    traje.setBeam(plasma);
                    break;
                case 2:
                    tipoCarga = "Light Beam";
                    do {
                        do {
                            System.out.print("Ingrese el indice de fotones [1~10]: ");
                            indexFotones = sc.nextInt();
                        } while (indexFotones > 10 || indexFotones < 1);
                        System.out.print("Ingrese la velocidad de disparo: ");
                        velocidadDisparo = sc.nextInt();
                        System.out.print("Ingrese la municion: ");
                        municion = sc.nextInt();
                    } while (indexFotones < 0 || velocidadDisparo < 0 || municion < 0);
                    LightBeam light = new LightBeam(indexFotones, velocidadDisparo, municion, tipoCarga, peso, potencia);
                    traje.setBeam(light);
                    break;
                case 3:
                    tipoCarga = "Dark Beam";
                    do {
                        System.out.print("Ingrese la velocidad de disparo: ");
                        velocidadDisparo = sc.nextInt();
                        System.out.print("Ingrese la municion: ");
                        municion = sc.nextInt();
                    } while (velocidadDisparo < 0 || municion < 0);
                    DarkBeam dark = new DarkBeam(velocidadDisparo, municion, tipoCarga, peso, potencia);
                    traje.setBeam(dark);
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3);
        return traje;
    }

    public static Traje missileLauncher(Traje traje) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese capacidad de misiles: ");
        int capMisiles = sc.nextInt();
        boolean regularMissile = true;
        boolean superMissile = true;
        int velocidadDesplazamient;
        int poderExplosivo;
        if (capMisiles > traje.getMissileLauncher().getMisilesCargados().size() - 1) {
            int opcion;
            do {
                do {
                    System.out.print("Ingrese la velocidad de desplazamiento: ");
                    velocidadDesplazamient = sc.nextInt();
                    System.out.print("Ingrese el poder explosivo: ");
                    poderExplosivo = sc.nextInt();
                } while (velocidadDesplazamient < 0 || poderExplosivo < 0);
                System.out.print("""
                                [1] Regular Missile
                                [2] Super Missile
                               """);
                System.out.print("Ingrese que misil quiere agregar: ");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    int size;
                    do {
                        System.out.print("Ingrese el tamaño: ");
                        size = sc.nextInt();
                    } while (size < 0);
                    traje.getMissileLauncher().getMisilesCargados().add(new RegularMissile(size, velocidadDesplazamient, poderExplosivo));
                } else if (opcion == 2) {
                    System.out.println("Ingrese el material del que esta hecho: ");
                    String material = sc.nextLine(); 
                    traje.getMissileLauncher().getMisilesCargados().add(new SuperMissile(material, velocidadDesplazamient, poderExplosivo));
                } else {
                    System.out.println("Opcion Invalida");
                }
            } while (opcion != 1 && opcion != 2);
        }
        return traje;
    }

    public static Traje addOn(Traje traje) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del Add-On: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su funcion: ");
        String funcion = sc.nextLine();
        System.out.print("Ingrese parte del cuerpo donde se ubicara: ");
        String parteCuerpo = sc.next();
        traje.getAddOns().add(new AddOn(nombre, funcion, parteCuerpo));
        return traje;
    }
}
