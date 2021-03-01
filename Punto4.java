package taller2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Punto4 {

    public static void main(String[] args) {

        double n, m;
        double matriz[][];
        Scanner sc = new Scanner(System.in);

        n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero en la matriz N"));

        m = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero en la matriz M"));

        matriz = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Digite el dato de la matriz en: " + i + "," + j);
                matriz[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Datos Guardados de la matriz");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }

    void solucion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    }

/*
Andres Felipe Cardona Londoño
Juan David Arias Sanchez
*/