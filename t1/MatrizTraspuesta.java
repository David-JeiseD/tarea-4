package t1;
import java.lang.Math;
import java.util.Scanner;
public class MatrizTraspuesta {
    double mat[][];
    int fil;
    int col;
    //constructor
    public MatrizTraspuesta() {
    }
    //get and set
    public void setMat(double[][] matr) {
        mat = matr;
    }
    public void setFil(int fila) {
        fil = fila;
    }
    public void setCol(int colum) {
        col = colum;
    }
    public double[][] getMat() {
        return mat;
    }
    public int getFil() {
        return fil;
    }
    public int getCol() {
        return col;
    }
    public void tamMatriz(){
        System.out.print("      ejercicio numero 1\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese cuantas filas tendra la matriz");
        fil=(int)scanner.nextDouble();
        System.out.println("ingrese cuantas columnas tendra la matriz");
        col=(int)scanner.nextDouble();
        mat= new double [getFil()][getCol()];
    }
    public void ingresarMa(){
        System.out.print("ingrese datos de la matriz\n");
        for (int i=0;i<getMat().length;i++){
            for(int j=0;j<getMat()[i].length;j++){
                Scanner scanner = new Scanner(System.in);
                System.out.print("MATRIZ["+i+"]"+"["+j+"] = ");
                double valores;
                valores= scanner.nextDouble();
                mat[i][j]=valores;
            }
        }
    }
    public void mostrarMa(){
        System.out.println("\nla matriz ingresada es:");
        for (int i=0;i<getMat().length;i++){
            for(int j=0;j<getMat()[i].length;j++){
                Scanner scanner = new Scanner(System.in);
                
                System.out.print("["+Math.round(mat[i][j])+"]  ");
            }
            System.out.println();
        }
    }
    public void mostrarTras(){
      
        //muestra
        System.out.println("\nla matriz traspuesta de la matriz ingresada es:");
        for(int j=0;j<getMat()[0].length;j++){
            for (int i=0;i<getMat().length;i++){
                System.out.print("["+Math.round(mat[i][j])+"]  ");
            }
            System.out.println();
        }
    }
}
