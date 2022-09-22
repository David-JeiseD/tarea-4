package t2;

import java.util.Scanner;

public class Arreglo {
    int arreglo[];
    int elemento;
    int num;
    //constructor
    public Arreglo() {
    }
    //get and set
    public void setArreglo(int[] arreglos) {
        arreglo = arreglos;
    }
    public void setElemento(int elementos) {
        elemento = elementos;
    }
    public void setNum(int nume) {
        num = nume;
    }
    public int[] getArreglo() {
        return arreglo;
    }
    public int getElemento() {
        return elemento;
    }
    public int getNum() {
        return num;
    }
    //metodos
    public void tamArreglo(){
        int n;
        int cont=0;
        Scanner scanner= new Scanner(System.in);      
        System.out.print("      ejercicio numero 2\n");
        System.out.print("ingresar tamaño del arreglo:\n");
        n = scanner.nextInt();
        arreglo = new int [n];
        num=cont+n;
    }
    public void ingresoElementos(){
        System.out.println("Ingresar elementos del Arreglo:");
        for(int i=0; i<num; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("E["+ i +"] : ");
            elemento= scanner.nextInt();
            getArreglo()[i]=getElemento();
        }
    }
    public void buscarElemento(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("ingrese el elemento a modificar:\n");
        int modi;
        modi = scanner.nextInt();
        int bandera = 0;
        int captura;
        for(int i=0; i<num; i++){
            if(getArreglo()[i]==modi){
                captura=i;
                bandera = bandera + 1;
                if(bandera==1){
                    System.out.println("elemento seleccionado");
                    System.out.print("ingrese valor a Remplazar:\n");
                    int nuevo;
                    nuevo = scanner.nextInt();
                    getArreglo()[captura]= nuevo;
                } 
                else{
                    System.out.println("Dato NO Existe");
                }
            }    
        }
    } 
   
    public void eliminarElemento(){
        int cont=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("ingrese el dato a Eliminar:\n");
        int  eliminar;
        eliminar = scanner.nextInt();
        int bandera = 0;
        int captura;
        for(int i=0; i<num; i++){
            if(eliminar==getArreglo()[i]){
                captura=i;
                bandera=1;
                if(bandera==1){
                    if( captura == (num-1)){
                        
                        num=num-1;
                        cont=num;
                    }
                    else{
                        for(i=captura;i<num-1;i++){
                            getArreglo()[i]=getArreglo()[i+1];
                        }
				        num=num-1;
                        cont=num;
                    }
                }
                else{
                    System.out.println("Dato no Encontrado");
                }  
            }
        }   
    }
    public void mostrarArreglo(){
        for(int i=0; i<num; i++){
            System.out.println("E["+ i +"] : " +getArreglo()[i]);
        }
    }  
}
