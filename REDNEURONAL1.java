/*1.-desplegar el nombre de tu paper.
 *2.-que es una red neuronal.
 *3.-Cuales son los elemntos que comforma una red neuronal
 *4.-Como utilizaron la red neuronal en su proyecto seleccionado.
 *5.-Como utilizaria usted la red neuronal como mejoramiento al proyect propuesto
 *6.-En que consistio el entrenamiento utilizado la red neuronal, indique el algoritmo utilizado
 */
package red.neuronal1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class REDNEURONAL1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objetivo=new Scanner(System.in);
        System.out.println("          Universidad de las Fuerzas Armadas ESPE");
        System.out.println("Desarrollo de un sistema experto para el diagnostico"
        + " de fallas automotrices  ");
        
        System.out.println("1.-Que es una red neuronal");
        String pregunta1=objetivo.nextLine();
        /*Las redes neuronales artificiales (RNA) son modelos de la inteligencia
         *artificial que se inspiran en el comportamiento de las neuronas y 
         *las conexiones cerebrales para resolver problemas.
        */
        System.out.println("2.-Cuales son los elemntos de una red neuronal");
        String pregunta2=objetivo.nextLine();
        /*una red neuronal se compone por una capa de enrtada, capa oculta y una 
         *capa de salida.
        */
        System.out.println("3.-Como utilizaron la red neuronal en el proyecto"
                + "selecionado");
        String pregunta3=objetivo.nextLine();
        /* se desarrolló el sistema experto DIMv3, el cual es un sistema basado
         *en conocimiento que permite identificar fallas, realizar inferencias
         *y emitir sugerencias de reparación que reduzcan los tiempos de
         *estancia en el taller mecánico así como evitar al máximo de margen de
         *error humano.
        */
        System.out.println("4.-Como utiliza usted la red neuronal como mejoramiento "
                + "al proyecto propuesto");
        String pregunta4=objetivo.nextLine();
        /*implementar preavisos para la detencion rapido de fallas
         *
        */
        
        System.out.println("5.-En que consistio el entrenamiento utilizando una "
                + "red neuronal,indique el algoritmo utilizado");
        String pregunta5=objetivo.nextLine();
        
        /*DIM consta de la siguiente arquitectura: base de conocimientos en la 
         *cual se encuentran las fallas y sus diagnósticos, motor de inferencia,
         *mecanismos de control e interfaz de usuario y un modulo de explicación.
         *La base de conocimientos funciona como un objeto pasivo que almacena 
         *reglas a partir de las cuales se determina las causas de un mal funcionamiento
         *de un vehículo. La representación de la base de conocimientos se da 
         *mediante el motor de inferencia que interactúa a partir de reglas 
         *causa–efecto con la base de datos y la base de conocimiento.
         *El funcionamiento se basa en la creacion de patrones de logaritmo los
         *cuales si se cumplen va adetectar fallas y si no no 
        */
        
        
        
        
       
        
        
        
        
    }
    
}
