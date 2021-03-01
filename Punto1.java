package taller2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Punto1 {
    String Entrada;
    int Suma;
    String[] Split;
    int Promedio;
    int numMenor;
    int numMayor;
    int[] Numeros;

    public Punto1() {
        this.Entrada = JOptionPane.showInputDialog(null, "Digite los numeros");
        this.Suma = 0;
        this.Split = this.Entrada.split("");
        this.Promedio = 0;
        this.numMenor = 0;
        this.numMayor = 0;
        this.Numeros = new int[this.Split.length];
    }

    public String solucion(){
        String Respuesta = "";
        int Cont = 0;
        for (int i = 0; i < this.Split.length; i++){ 
            this.Numeros[i] = Integer.parseInt(this.Split[i]); 
        }

        for (int i = 0; i < this.Numeros.length; i++){
            this.Suma = this.Suma + this.Numeros[i]; 
        }
        Respuesta += "Suma: " + this.Suma + "\n";

        for (int i = 0; i < this.Numeros.length; i++){
            Cont = Cont + 1; // Promedio
        }
        Respuesta += "Promedio: " + this.Suma/Cont + "\n";

        for (int i = 0; i < this.Numeros.length; i++){
            this.numMayor =  Arrays.stream(this.Numeros).max ().getAsInt(); 
        }
        Respuesta += "Mayor: " + this.numMayor + "\n";

        for (int i = 0; i < this.Numeros.length; i++){
            this.numMenor = Arrays.stream(this.Numeros).min().getAsInt(); 
        }
        Respuesta += "Menor: " + this.numMenor + "\n";

        return Respuesta;
    }
}
/* Andres Felipe Cardona Londoño 
   Juan David Arias Sanchez */
   
    
      
    
       