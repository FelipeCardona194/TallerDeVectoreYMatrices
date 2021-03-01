package taller2;

import javax.swing.JOptionPane;
public class Punto3 {
    
    public void cruz(){
        String Texto="", Texto1="", Texto2="";
        int tamañoVector=3;
        
        int primerVector[] = new int [tamañoVector + 1];
        
        for(int i = 1; i < tamañoVector + 1; i++){
            primerVector[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite los numeros del primer vector"));
        }
        for(int i = 1; i < tamañoVector + 1; i++){
            Texto+="La posicion del numero es: ("+ i +"):"+primerVector[i]+":";
        }
        JOptionPane.showMessageDialog(null, "Vector N°1 :"+":"+Texto);
        
        
        int segundoVector[] = new int [tamañoVector + 1];
        
        for(int i = 1; i < tamañoVector + 1; i++){
            segundoVector[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite los numeros del segundo vector"));
        }
        for(int i = 1; i < tamañoVector + 1; i++){
            Texto1+="La posicion del numero es: ("+ i +"):"+segundoVector[i]+":";
        }
        JOptionPane.showMessageDialog(null, "Vector N°2 :"+":"+Texto1);
        
      
        
        int vectorResultado[] = new int [tamañoVector + 1];
        for(int i = 1; i < tamañoVector + 1; i++){
            
            vectorResultado[1]= (primerVector[2] * segundoVector[3]) - (primerVector[3] * segundoVector[2]);
            vectorResultado[2]= - ((primerVector[1] * segundoVector[3]) - (primerVector[3] * segundoVector[1]));
            vectorResultado[3]= (primerVector[1] * segundoVector[2]) - (primerVector[2] * segundoVector[1]);   
            
            Texto2+= "\n La posicion del numero es: ("+ i +"): "+ vectorResultado[i]+":";
            
            JOptionPane.showMessageDialog(null, "La entrega de los 3 vectores es: "+Texto2);        
    }
        
    }

    String obtenerSolucion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }

/*
Andres Felipe Cardona Londoño 
Juan David Arias Sanchez
*/
