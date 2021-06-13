package src;

import java.util.Scanner;

public class Memorabilia {
    Scanner ent = new Scanner(System.in);
    int[] idPeli = new int[30];
    String[] namePeli = new String[30];
    int[] año = new int[30];
    String[] categoria = new String[30];
    boolean[]disponible=new boolean[30];
    public static void main(String[] args) {
        Memorabilia tienda = new Memorabilia();

    }

    public Memorabilia() {
        int opciones, salir = 0;
        do {

            System.out.println("\033[32m******************************************************************");
            System.out.println("\033[32mBIENVENIDO/A A MEMORABILIA                                       *");
            System.out.println("\033[32m1)---Préstamo de películas                                       *");
            System.out.println("\033[32m2)---Devolución de películas                                     *");
            System.out.println("\033[32m3)---Mostrar las películas                                       *");
            System.out.println("\033[32m4)---Ingreso de Películas                                        *");
            System.out.println("\033[32m5)---Ordenar las películas de forma ascendente respecto al nombre*");
            System.out.println("\033[32m6)---Ingresar clientes nuevos:                                   *");
            System.out.println("\033[32m7)---Mostrar clientes                                            *");
            System.out.println("\033[32m8)---Reportes                                                    *");
            System.out.println("\033[32m9)---Salir                                                       *");
            System.out.println("\033[33mElija una de las opciones anteriores                             *");
            System.out.println("\033[32m******************************************************************");
            opciones = ent.nextInt();
            switch (opciones) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:
                    mostrarPelicula();
                    break;

                case 4:
                    insertarPelicula();
                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:
                    salir = 1;
                    break;

                default:
                    System.out.println("La opcion ingresada no pertenece al catálogo del menú: ");
                    break;

            }

        } while (salir != 1);

    }

    public void insertarPelicula() {
        System.out.println("INGRESAR PELICULAS...");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+" \033[32mIngrese al nombre de la pelicula:");
            namePeli[i]=ent.nextLine();
            ent.nextLine();
            System.out.print((i+1)+" \033[32mIngrese el ID: ");
            idPeli[i]=ent.nextInt();
            ent.nextLine();
            System.out.print((i+1)+" \033[32mIngrese la categoría de la pelicula: ");
            categoria[i]=ent.nextLine();
            System.out.print((i+1)+" \033[32mIngrese el año de la pelicula: ");
            año[i]=ent.nextInt();
            ent.nextLine();
            System.out.println("");
        }

    
    }


    public void mostrarPelicula(){
        System.out.println("PELICULAS DISPONIBLES...");
        for (int i = 0; i < 3; i++) {
            System.out.println("\033[32mPELICULA "+(i+1));
            System.out.println("\033[32mNombre: "+namePeli[i]);
            System.out.println("\033[32mID: "+idPeli[i]);
            System.out.println("\033[32mCategoría: "+categoria[i]);
            disponible[i]=true;
            if(disponible[i]){
              System.out.println("\033[33mDisponible");
            }else{
                System.out.println("\033[31mNo disponible");
            }
            System.out.println("");

            
            
        }

    }

    


}
