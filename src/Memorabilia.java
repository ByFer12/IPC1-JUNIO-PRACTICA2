package src;

import java.util.Scanner;

public class Memorabilia {
    Scanner ent = new Scanner(System.in);
    int[] idPeli = new int[20];
    String[] namePeli = new String[20];
    int[] año = new int[20];
    String[] categoria = new String[20];
    int[] telefono = new int[20];
    boolean[] disponible = new boolean[20];
    boolean[] prestado = new boolean[20];
    int aux1 = 0, aux2;
    int[] idClient = new int[20];
    String[] nombreCilient = new String[20];
    String [] dispo=new String[20];

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
                    prestamoPeliculas();
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
                    insertarClientes();
                    break;

                case 7:
                    mostrarClientes();
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
        int aux=11;
        int desicion;
        for (int i =aux; i <aux+1; i++) {
            Scanner net = new Scanner(System.in);
            if ((namePeli[i] == null) && (idPeli[i] == 0) && (categoria[i] == null) && (año[i] == 0)) {
                System.out.print((i + 1) + " \033[32mIngrese al nombre de la pelicula:");
                namePeli[i] = net.nextLine();
                ent.nextLine();
                System.out.print((i + 1) + " \033[32mIngrese el ID: ");
                idPeli[i] = net.nextInt();
                ent.nextLine();
                System.out.print((i + 1) + " \033[32mIngrese la categoría de la pelicula: ");
                categoria[i] = net.nextLine();
                ent.nextLine();
                System.out.println((i + 1) + " \033[32mIngrese el año de estreno");
                año[i] = net.nextInt();
                ent.nextLine();
                
                disponible[i]=true;
                if (disponible[i]) {
                    dispo[i]="\033[33mDisponible";
                } else {
                    dispo[i]="\033[31mNo disponible";
                }
                System.out.println("");
            } else {
                System.out.println("No puede ingresar mas peliculas: ");
            }
            System.out.println("¿Quieres ingresar mas peliculas? \n1=Si\n2=No");
            desicion=net.nextInt();
            if(desicion==1){
                aux++;
            }else{
                aux=3;
            }
          
        }

    }

    public void mostrarPelicula() {
        System.out.println("PELICULAS DISPONIBLES...");
        for (int i = 0; i < 20; i++) {
            System.out.println("\033[32mPELICULA " + (i + 1));
            System.out.println("\033[32mNombre: " + namePeli[i]);
            System.out.println("\033[32mID: " + idPeli[i]);
            System.out.println("\033[32mCategoría: " + categoria[i]);
            System.out.println(dispo[i]);
           
            System.out.println("");

        }

    }

    public void insertarClientes() {
        System.out.println("INGRESAR CLIENTES...");
        for (int i = 3; i < 4; i++) {
            Scanner net = new Scanner(System.in);
            if ((nombreCilient[i] == null)&&(idClient[i]==0)&&(telefono[i]==0)) {
                System.out.println((i + 1) + " \033[32mIngrese el nombre del cielte:");
                nombreCilient[i] = net.nextLine();

                System.out.print((i + 1) + " \033[32mIngrese su ID: ");
                idClient[i] = net.nextInt();

                if (idClient[i] != aux1) {
                    aux1 = idClient[i];
                } else {

                    System.out.println("No pueden tener el mismo id, ingrese otro");
                    System.out.print((i + 1) + " \033[32mIngrese su ID: ");
                    idClient[i] = net.nextInt();
                }
                System.out.print((i + 1) + " \033[32mIngres el telefono: ");
                telefono[i] = net.nextInt();
                System.out.println("");
            }

        }
    }

    public void mostrarClientes() {
        System.out.println("CLIENTES...");
        for (int i = 0;i < 20; i++) {

            System.out.println("\033[32mCLIENTE " + (i + 1));
            System.out.print("Nombre: " + nombreCilient[i]);
            System.out.println("\033[32mID: " + idClient[i]);
            System.out.println("\033[32mNo. Tel: " + telefono[i]);

            if (prestado[i]) {
                System.out.println("\033[33mNo teiene prestado ningun libro");
            } else {
                System.out.println("\033[31mTiene prestado un libro");
            }
            System.out.println("");

        }

    }

    public void prestamoPeliculas() {
        int id, tiempo;
        String nombre, cat;
        
        namePeli[0] = "El señor de los anillos \n\t\tLa comarca del anillo ";
        idPeli[0] = 10;
        año[0] = 2000;
        categoria[0] = "Guerra";
        disponible[0] = true;
        if (disponible[0]) {
            dispo[0]="\033[33mDisponible";
        } else {
            dispo[0]="\033[31No disponible";
        }


        namePeli[1] = "El señor de los anillos \n\t\tLas dos torres";
        idPeli[1] = 11;
        año[1] = 2001;
        categoria[1] = "Guerra";
        disponible[1] = true;
        if (disponible[1]) {
            dispo[1]="\033[33mDisponible";
        } else {
            dispo[1]="\033[31No disponible";
        }


        namePeli[2] = "El señor de los anillos \n\t\tEl retorno del rey";
        idPeli[2] = 12;
        año[2] = 2003;
        categoria[2] = "Guerra";
        disponible[2] = true;
        if (disponible[2]) {
            dispo[2]="\033[33mDisponible";
        } else {
            dispo[2]="\033[31No disponible";
        }
        

        namePeli[3] = "Karate kid";
        idPeli[3] = 13;
        año[3] = 1987;
        categoria[3] = "Guerra";
        disponible[3] = true;
        if (disponible[3]) {
            dispo[3]="\033[33mDisponible";
        } else {
            dispo[3]="\033[31No disponible";
        }

        namePeli[4] = "Interestelar";
        idPeli[4] = 14;
        año[4] = 2014;
        categoria[4] = "Ficcion";
        disponible[4] = true;
        if (disponible[4]) {
            dispo[4]="\033[33mDisponible";
        } else {
            dispo[4]="\033[31No disponible";
        }


        namePeli[5] = "Lucy";
        idPeli[5] = 15;
        año[5] = 2014;
        categoria[5] = "Ficcion";
        disponible[5] = true;
        if (disponible[5]) {
            dispo[5]="\033[33mDisponible";
        } else {
            dispo[5]="\033[31No disponible";
        }


        namePeli[6] = "Inception";
        idPeli[6] = 16;
        año[6] = 2010;
        categoria[6] = "Ficcion";
        disponible[6] = true;
        if (disponible[6]) {
            dispo[6]="\033[33mDisponible";
        } else {
            dispo[6]="\033[31No disponible";
        }

        namePeli[7] = "Vida inteligente";
        idPeli[7] = 17;
        año[7] = 2017;
        categoria[7] = "Ficcion";
        disponible[7] = true;
        if (disponible[7]) {
            dispo[7]="\033[33mDisponible";
        } else {
            dispo[7]="\033[31No disponible";
        }


        namePeli[8] = "BAck to the future 1";
        idPeli[8] = 18;
        año[8] = 1985;
        categoria[8] = "Ficcion";
        disponible[8] = true;
        if (disponible[8]) {
            dispo[8]="\033[33mDisponible";
        } else {
            dispo[8]="\033[31No disponible";
        }


        namePeli[9] = "Back to the future 2";
        idPeli[9] = 19;
        año[9] = 1985;
        categoria[9] = "Ficcion";
        disponible[9] = true;
        if (disponible[9]) {
            dispo[9]="\033[33mDisponible";
        } else {
            dispo[9]="\033[31No disponible";
        }


        namePeli[10] = "Back to the future 3";
        idPeli[10] = 20;
        año[10] = 1985;
        categoria[10] = "Ficcion";
        disponible[10] = true;
        if (disponible[10]) {
            dispo[10]="\033[33mDisponible";
        } else {
            dispo[10]="\033[31No disponible";
        }
        mostrarPelicula();

    }




}
