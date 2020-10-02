//Solorzano Trejo Brandon Uriel
//3S11 //
//Metodo principal

import java.util.Scanner;
public class Mujeres {
public static void main(String[]args){
        
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de estudiantes");
        n=leer.nextInt();
        String nombres[]=new String[n];
        String genero[]=new String[n];
        String estado[]=new String[n];
        double nota1[]=new  double[n];
        double nota2[]=new  double[n];
        double nota3[]=new  double[n];
        double promedio[]=new  double[n];
    
        for(int i=0; i<nombres.length;i++)
        {
        System.out.println("Ingrese nombre del estudiante: ");
        nombres[i]=leer.next();
        System.out.println("Ingrese el genero del estudiante: ");
        genero[i]=leer.next().toLowerCase();
        System.out.println("Ingresa la calificacion numero 1 del estudiante: ");
        nota1[i]=leer.nextDouble();
        System.out.println("Ingresa la calificacion numero 2 del estudiante: ");
        nota2[i]=leer.nextDouble();
        System.out.println("Ingresa la calificacion numero 3 del estudiante: ");
        nota3[i]=leer.nextDouble();    
        }
        
       promedio = calcularPromedio(nota1, nota2, nota3, n);
       estado = alumnosAR(promedio, n);
       for(int i=0; i<promedio.length; i++)
       {
          System.out.println("El nombre del estudiante es: "+nombres[i]); 
          System.out.println("El alumno tiene un promedio de: "+promedio[i]); 
          System.out.println("El alumno esta: "+estado[i]); 
       }
         numeroMujeres(genero);     
       }
    //Funcion de tipo double
        public static double[] calcularPromedio(double nota1[], double nota2[], double nota3[],int n)
        { 
            double promedio[]=new double[n];
             for(int i=0; i<nota1.length;i++)
    {
        promedio[i]=(nota1[i]+nota2[i]+nota3[i])/3;
    }
             return promedio;
        }
        
        
        //Metodo devolvera la cantidad de mujeres que hay en el grupo
        public static void numeroMujeres(String genero[])
        {
            int contadorMujeres=0;
             for(int i=0; i<genero.length;i++)
             {
         if(genero[i].equals("mujer"))
         {
           contadorMujeres++; 
         }
             }
System.out.println("La cantidad de mujeres que hay es: "+contadorMujeres);
}   
     
  //Funcion que da el estado de cada estudiante
     public static String[]alumnosAR(double promedio[],int n)
     {
String estado[]=new String[n];
for(int i=0; i<promedio.length;i++)
{
    if(promedio[i]>=7.0 && promedio[i]<=10)
    {
        estado[i]="Aprobado";
    }
    else
    {
        estado[i]="Reprobado";
    }
}
return estado;
     }
    
        }

       
    

    
    
    

