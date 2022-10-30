package examenfinal.pkg202111134;
import java.util.Scanner;

public class ExamenFinal202111134 {

    
    
    
    public static void main(String[] args) {
        int inicio = 0;
        String space = null;
        Scanner leer = new Scanner(System.in);
        
        while (inicio!=4){
            inicio = 0;
            //Menu
            System.out.println("************************"
                           + "\n*         MENÚ         *"
                           + "\n* 1. Problema 1        *"
                           + "\n* 2. Problema 2        *"
                           + "\n* 3. Problema 3        *"
                           + "\n* 4. Salir             *"
                           + "\n************************");
            System.out.println("\n-> Ingrese una opción:");
            inicio = leer.nextInt();
            leer.nextLine();
            
            switch (inicio){
                //Problema 1
                case 1:
                    double a, b;
                    System.out.println("\n-> Ingrese un número:");
                    a = leer.nextDouble();
                    leer.nextLine();
                    
                    System.out.println("\n-> Ingrese otro número:");
                    b = leer.nextDouble();
                    leer.nextLine();
                    
                    if (a < b){
                        System.out.println("\n-> El número más grande es: " + b);
                    }else if (a > b){
                        System.out.println("\n-> El número más grande es: " + a);
                    }else if (a == b){
                        System.out.println("\n-> Los números ingresados son iguales.");
                    }
                    space = new Scanner(System.in).nextLine();
                break;
                
                //Problema 2
                case 2:
                    int ancho;
                    System.out.println("Ingrese un número: ");
                    ancho = leer.nextInt();
                    leer.nextLine();
                    
                    if (ancho % 2 == 0){
                        System.out.println("A ingresado un numero par");
                    }else{
                        double num;
                        num = (ancho / 2) + 1;
                        
                        int numFilas;
                        int ival = (int) num;
                        numFilas = ival;
                        System.out.println();
                        for(int altura = 1; altura<=numFilas; altura++){
                            //Espacios en blanco
                            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                                System.out.print(" ");
                            }
                            
                            //Asteriscos
                            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    space = new Scanner(System.in).nextLine();
                        
                break;
                
                //Problema 3
                case 3:
                    int n;
                    double peso;
                    System.out.println("\n-> Ingrese la cantidad de vacas a la venta: ");
                            n = leer.nextInt();
                            leer.nextLine();
                            
                            double numa [][] = new double [3][n];
                            
                            for(int i = 0; i<n; i++){
                                numa[i][0] = i+1;
                            }
                            
                            System.out.println("\n-> Ingrese el peso limite del camion en kg: ");
                            peso = leer.nextDouble();
                            leer.nextLine();
                            
                            String cadena;
                            System.out.println("\n-> Ingrese los pesos de cada vaca: ");
                            cadena = leer.next();
                            leer.nextLine();
                            
                            String[] parts = cadena.split(",");
                            for(int i = 0; i<n; i++){
                                numa[i][1] = Double.parseDouble(parts[i]);
                            }
                            
                            String cadena2;
                            System.out.println("\n-> Ingrese la producción de leche por vaca: ");
                            cadena2 = leer.next();
                            leer.nextLine();
                            
                            String[] parts2 = cadena2.split(",");
                            for(int i = 0; i<n; i++){
                                numa[i][2] = Double.parseDouble(parts2[i]);
                            }
                            
                            double calc [] = new double [100];
                            double calcs [] = new double [100];
                            
                            if (n == 8){
                                calc [0] = numa[0][2]+numa[1][2]+numa[2][2]+numa[3][2];
                                
                            }
                break;
                
                //Salir
                case 4:
                    System.out.println("...Has salido...");
                    System.exit(0);
                break;
                    
                //X
                default:
                    System.out.println("La opción que ha seleccionado es invalida.\nPor favor Ingrese una opción valida.");
                break;
            }
            
        }
        
    }
    
}
