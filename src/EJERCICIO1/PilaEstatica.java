package EJERCICIO1;
public class PilaEstatica {
    
    int vectorPila[];
    int cima;
    
    //Metodo constructor
    public PilaEstatica(int tamanio){
        vectorPila = new int[tamanio];
        cima = -1;//Cuando no hay elementos
    }
    
    //Metodo Push(empujar)
    public void empujar(int dato){
        cima++;//Insertar la posicion 0
        System.out.println();
        vectorPila[cima] = dato;
        System.out.print(dato);
    }
    
    //Metodo Pop(sacar)
    public int sacar(){
        int fuera = vectorPila[cima];
        cima--;
        return fuera;
    }
    
    //Metodo pila vacia
    public boolean estaVacia(){
        //Cuando la cima esta en -1
        return cima == -1;
    }
    
    //Metodo pila llena
    public boolean estaLlena(){
        //tamaño del vector es igual a la cima
        return vectorPila.length - 1 == cima;
    }
    
    //Metodo buscar elemento en CIMA
    public int cimaPila(){
        return vectorPila[cima];
    }
    
    //Metodo tamaño de la PILA
    public int tamanioPila(){
        return vectorPila.length;
    }
}
