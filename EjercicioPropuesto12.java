
package ejerciciopropuesto12;

import java.util.Scanner;
public class EjercicioPropuesto12 {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        double horas_trabajadas, precio_hora, porcentaje_retencion;
        double salario_bruto, retencion, salario_neto;
        System.out.println("Ingrese cantidad de horas trabajadas por el empleado: ");
        horas_trabajadas=entrada.nextDouble(); //Se ingresa las horas trabajadas 
        System.out.println("Ingrese el precio a pagar por hora de trabajo: ");
        precio_hora=entrada.nextDouble(); //Se ingresa el precio por hora
        System.out.println("Ingrese el porcentaje de retencion en la fuente (0-100): ");
        porcentaje_retencion=entrada.nextDouble(); //Se ingresa el porcentaje de retencion
        salario_bruto=horas_trabajadas*precio_hora;
        retencion=salario_bruto*(porcentaje_retencion/100);
        salario_neto=salario_bruto-retencion;
        System.out.println("El salario bruto es: "+salario_bruto);
        System.out.println("La retencion calcuculada sobre el salario es: "+retencion);
        System.out.println("El salario neto es: "+salario_neto);
        
    }
    
}
