
package primerosgit;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimerosGit {

    //Author: Diego Mendez
    //Abstract: This is an example code made to remember the language
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elija el ejercicio que se desea ver:");
        menu(tryInteger(scanner), scanner);
        scanner.close();
    }
    
    
    public static int tryInteger(Scanner scanner){
    //next lee el siguiente texto hasta donde haya un espacio y nextLine lee hasta donde haya un enter.
    
        while (true){
            try{
                int numero = scanner.nextInt();
                scanner.nextLine();
                return numero;
            } catch (Exception e){
                System.out.println("Entrada no valida, ingrese un número");
                scanner.nextLine();
            }
        }    
    }
    public static double tryDouble(Scanner scanner){
        while (true){
            try{
                double numero = scanner.nextDouble();
                scanner.nextLine();
                return numero;
            } catch (Exception e){
                System.out.println("Entrada no valida, ingrese un número");
                scanner.nextLine();
            }
        }    
    }
    
    
    public static void menu(int index, Scanner scanner){
        double valor1, valor2, valor3;
        
        switch (index) {
            case 1:
                System.out.println("Ya se imprimir frases");
                break;
            case 2:
                System.out.println(273);
                System.out.println(597);
                break;
            case 3:
                System.out.println(5.3);
                System.out.println(5.7);
                break;
            case 4:
                System.out.println(1234+532);
                break;
            case 5:
                System.out.println(1234-532);
                break;
            case 6:
                System.out.println(1234*532);
                break;
            case 7:
                valor1=1234;
                valor2=532;
                valor3=valor1/valor2;
                System.out.println(valor3);
                break;
            case 8:
                numeros(1, 3, 1);
                break;
            case 9:
                numeros(1, 9, 1);
                break;
            case 10:
                numeros(1, 10000, 1);
                break;
            case 11:
                numeros(5, 10, 1);
                break;
            case 12:
                numeros(5, 15, 1);
                break;
            case 13:
                numeros(5, 15000, 1);
                break;
            case 14:
                ejercicio14();
                break;    
            case 15:
                numeros(1, 30, 2);
                break; 
            case 16:
                ejercicio16();
                break; 
            case 17:
                sumaNumeros(1,100,2);
                break; 
            case 18:
                System.out.println("Ingresar numero");
                int valor = tryInteger(scanner);
                sumaNumeros(valor+1,valor+100,1);
                break; 
            case 19:
                System.out.println("Conversión euros a dolares:");
                System.out.println("Ingrese valor en euros(para ingresar decimales usar coma)");
                System.out.println(tryDouble(scanner)*1.10);
                break;
            case 20:
                System.out.println("Ingrese el largo del rectangulo");
                double largo = tryDouble(scanner);
                System.out.println("Ingrese la altura del rectangulo");
                double altura = tryDouble(scanner);
                System.out.println("El area del rectangulo es: "+(largo*altura));
                break;
            case 21:
                System.out.println("Ingrese el primer numero:");
                valor1 = tryDouble(scanner);
                System.out.println("Ingrese el segundo numero");
                valor2 = tryDouble(scanner);
                ejercicio21(valor1, valor2);
                break;
            case 22:
                System.out.println("Ingrese un número entero");
                ejercicio22(tryInteger(scanner));
                break;
            case 23:
                System.out.println("Ingrese el primer número entero:");
                valor1 = tryInteger(scanner);
                System.out.println("Ingrese el segundo número entero");
                valor2 = tryInteger(scanner);
                System.out.println("El mcd es: "+mcd((int)valor1, (int)valor2));
                break;
            case 24:
                ejercicio24(1, 2, 3);
                break;
            case 26:
                System.out.println("Ingrese el primer entero");
                valor1 = tryInteger(scanner);
                System.out.println("Ingrese el segundo entero");
                valor2 = tryInteger(scanner);
                System.out.println("Ingrese el tercer entero");
                valor3 = tryInteger(scanner);
                ejercicio26((int)valor1, (int)valor2, (int)valor3);
                break;
            default:
                break;
        }
    } 
    
    public static void numeros(int valorI, int valorF, int exponente){
        
        String linea = "";
        for (int i = valorI; i <= valorF; i++) {
            int potencia =  ((int)Math.pow(i, exponente)); 
            if(i!=valorF){
                linea = linea+potencia+", ";
            } else{       
                linea = linea+potencia;
            }
        }
        System.out.println(linea);
    }
    public static void ejercicio14(){
        String linea = "";
        for (int i = 1; i <= 200; i++) {
            if(i!=200){
                linea = linea+"hola, ";
            } else{
                linea = linea+"hola";
            }
        }
    }
    public static void ejercicio16(){
        long valor=1;
        for (int i = 1; i <= 20; i++) {
            valor=valor*i;
        }
        System.out.println(valor);
    }
    
    public static void sumaNumeros(int valorI, int valorF, int exponente){
        
        long valor=0;
        for (int i = valorI; i <= valorF; i++) {
            int potencia =  ((int)Math.pow(i, exponente)); 
            valor = valor+potencia;
        }
        System.out.println(valor);
    }
    
    public static double mayor(double valor1, double valor2){
        if(valor1>=valor2){
            return valor1;
        }else{
            return valor2;
        }
    }
    public static double menor(double valor1, double valor2){
        if(valor1>=valor2){
            return valor2;
        }else{
            return valor1;
        }
    }
    
    public static void ejercicio21(double valor1, double valor2){
        if (valor1==valor2) {
            System.out.println("Ambos valores son iguales");
        } else{
            System.out.println("El valor mayor es: "+mayor(valor1, valor2));
            System.out.println("El valor menor es: "+menor(valor1, valor2));
        }
    }
        
    public static void ejercicio22(int valor){
        String linea = "";
        for (int i = 1; i <= valor; i++) {
            if((i%2)!=0){
                if (i!=valor) {
                    linea = linea+i+", ";
                } else{
                    linea = linea+i;
                }   
            }            
        }
        System.out.println(linea);
    }
    
    public static int mcd(int valor1, int valor2){
        boolean check=true;
        int valorTemporal;
        int cociente = (int)mayor(valor1, valor2);
        int residuo = (int)menor(valor1, valor2);
        while(check){
            if(residuo==0){
                return cociente;
            }
            valorTemporal=residuo;
            residuo= cociente%residuo;
            cociente= valorTemporal;
        }
        return cociente;
    }
    
    public static void ejercicio24(double a, double b, double c){
        System.out.println(a+"(x^2) + "+b+"(x) + "+c);
    }
    public static void ejercicio26(int valor1, int valor2, int valor3){
        int valorTemp;
        boolean check = true;
        while (check){
            if(valor1<=valor2){
                if(valor2 <= valor3){
                    System.out.println("El valor minimo es: "+valor1);
                    System.out.println("El valor maximo es: "+valor3);
                    check=false;
                }else{
                    valorTemp=valor3;
                    valor3=valor2;
                    valor2=valorTemp;
                }
            }else{
                valorTemp=valor2;
                valor2=valor1;
                valor1=valorTemp;
            }
        }
    }
    
}


