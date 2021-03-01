package taller2;

class Punto2 {
    int[][] Numeros = {{1,2,3,4},{5,6,7,8}};

    public String obtenerSolucion(int op){
    String Resultado = "";
    int Numero1 = Numeros[0][0];
    int Numero2 = Numeros[1][0];
    int Numero3 = Numeros[0][1];
    int Numero4 = Numeros[1][1];
    int Numero5 = Numeros[0][2];
    int Numero6 = Numeros[1][2];
    int Numero7 = Numeros[0][3];
    int Numero8 = Numeros[1][3];
    switch(op){
        case 1:{
            Resultado += Numero1 + "."+ Numero2 +" + "+ Numero3 + "."+ Numero4 +" = "+ ((Numero1 * Numero2) + (Numero3 * Numero4)) + "\n";
            break;
        }
        case 2:{
            Resultado += Numero1 + "."+ Numero2 +" + "+ Numero3 + "."+ Numero4 +" + "+ Numero5 +"."+ Numero6 +" = "+ ((Numero1 * Numero2) + 
                    (Numero3 * Numero4) + (Numero5 * Numero6)) + "\n";
            break;
        }
        case 3:{
            Resultado += Numero1 + "."+ Numero2 +" + "+ Numero3 + "."+ Numero4 +" + "+ Numero5 +"."+ Numero6 +" + "+ Numero7 +"."+ Numero8 +" = "+ 
                    ((Numero1 * Numero2) + (Numero3 * Numero4) + (Numero5 * Numero6) + (Numero7 * Numero8)) + "\n";
            break;
        }
    }
    return Resultado;
    }
} 

/* Andres Felipe Cardona Londoño
   Juan David Arias Sanchez */
