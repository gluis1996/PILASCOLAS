package EJERCICIO1;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
        int option = 0, elemento, tamanio;
        try{
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¿Cual es el tamaño de la Pila?", "Solicita el tamaño",
                    JOptionPane.INFORMATION_MESSAGE));
            PilaEstatica pila2 = new PilaEstatica(tamanio);
            do{
                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Push un elemento en la PILA\n"
                        + "2. Pop un elemento de la PILA\n"
                        + "3. ¿Esta vacia la PILA?\n"
                        + "4. ¿Esta llena la PILA?\n"
                        + "5. ¿Elemento que esta en al CIMA?\n"
                        + "6. Tamaño de la PILA\n"
                        + "7. SALIR\n"
                        + "Que deseas HACER?", "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (option){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento Push", "Apilando datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        if (!pila2.estaLlena()){
                            pila2.empujar(elemento);
                        }else{
                            JOptionPane.showMessageDialog(null, "PILA esta LLENA", 
                                    "Pila Llena", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 2:
                        if(!pila2.estaVacia()){
                            JOptionPane.showMessageDialog(null, "Elemento Obtenido es..."
                                    + pila2.sacar(), "Obteniendo datos de la PILA",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "PILA esta VACIA",
                                    "PILA vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (pila2.estaVacia()){
                            JOptionPane.showMessageDialog(null, "PILA esta vacia",
                                    "PILA vacia", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "PILA No esta Vacia",
                                    "PILA contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (pila2.estaLlena()){
                            JOptionPane.showMessageDialog(null, "PILA esta llena",
                                    "PILA llena", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "PILA No esta llena",
                                    "PILA contiene espacio", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!pila2.estaVacia()){
                            JOptionPane.showMessageDialog(null, "Elemento que se encuentra en la cima es..."
                            + pila2.cimaPila(), "Cima de la PILA", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "PILA esta vacia",
                                    "PILA vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Tamaño de la PILA es..." + pila2.tamanioPila(),
                                "Tamaño de la PILA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:   
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
                                "FIN", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INCORRECTA!!",
                                "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            }while (option != 7);
        }catch (NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
        }
    }  
}
