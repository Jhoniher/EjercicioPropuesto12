
package ejerciciopropuesto12;

import java.util.Scanner;
public class EjercicioPropuesto12 {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        double horas_trabajadas, precio_hora, porcentaje_retencion;
        System.out.println("Ingrese cantidad de horas trabajadas por el empleado: ");
        horas_trabajadas=entrada.nextDouble();
        System.out.println("Ingrese el precio a pagar por hora de trabajo: ");
        precio_hora=entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de retencion en la fuente: ");
        porcentaje_retencion=entrada.nextDouble();
        
    }
    
}
