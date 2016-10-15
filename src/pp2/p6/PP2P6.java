/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p6;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double h, s, p;
        h = pedirHoras();
        s = pedirSalario();
        p = Salario(h,s);
        Mostrar(h,s,p);
    }
    public static double pedirHoras(){
        double h;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba las horas que trabajo en total esta semana ");
        h = entrada.nextInt();
        return h;
    }
    public static double pedirSalario(){
        double s;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba a cuanto se le paga cada hora de trabajo ");
        s = entrada.nextDouble();
        return s;
    }
    public static double Salario(double h, double s){
        double p=0;
        if(h<=48){
            p=h*s;
        }if(h>48 && h<=56){
            p =((h-48)*(2*s))+(48*s);
        }if(h>56){
            p = (h-56)*(3*s)+(8*(2*s))+(48*s);
        }
        return p;
    }
    public static void Mostrar(double h, double s, double p){
        System.out.println("Si esta semana trabajo " +h +" horas y se le paga " +s +" por hora, esta semana su paga es  " +p);
    }
}
