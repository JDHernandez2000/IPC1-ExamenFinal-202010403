/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 *
 * @author joshe
 */
public class Final {

    /**
     * @param args the command line arguments
     * .addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                
            }
        });
     */
    public static menu men;
    public static Scanner scan = new Scanner(System.in);
   
    public static void main(String[] args) {
        men = new menu();
        men.show();
        men.jButton1.addActionListener(new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent actionEvent)
             {
                int n1, n2;
                System.out.println("Ingrese el primer numero");
                n1 = scan.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = scan.nextInt();
                if(n1 > n2){System.out.println("El numero mayor es " + String.valueOf(n1));}
                else if(n1 < n2){System.out.println("El numero mayor es " + String.valueOf(n2));}
                else{System.out.println("Son iguales");}
                
             }
         });
        men.jButton2.addActionListener(new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent actionEvent)
             {
                int impar;
                boolean bandera = true;
                System.out.println("Ingrese el numero impar de la altura de la piramide");
                impar = scan.nextInt();
                if(impar % 2 == 0)
                {
                    bandera = false;
                    System.out.println("Es un numero par" + String.valueOf(impar));
                }
                if(bandera == true)
                {
                    String str;
                    for(int i = 1; i <= impar; i+=2)
                    {
                        int e = impar - i;
                        String esp1 = "";
                        String esp2 = "";
                        String aste = "";
                        for(int j = 0; j < e/2; j++)
                        {
                            esp1 += " ";
                            esp2 += " ";
                        }
                        for (int h = 0; h < i; h++)
                        {
                            aste += "*";
                        }
                        if(i != 1)
                        {
                            str = "";
                            str += esp1;
                            str += aste;
                            str += esp2;
                            System.out.println(str);
                        }
                        else {
                            str = "";
                            str += esp1;
                            str += "*";
                            str += esp2;
                            System.out.println(str);
                        }
                    }
                }
             }
         });
        men.jButton3.addActionListener(new ActionListener()
         {
             Vacas[] vacas;
             @Override
             public void actionPerformed(ActionEvent actionEvent)
             {
                 System.out.println("Ingrese el numero de vacas a la venta");
                 int n = scan.nextInt();
                 vacas = new Vacas[n];
                 System.out.println("Ingrese los pesos de las vacas por comas");
                 String p = scan.next();
                 String[] pesos = p.split(",");
                 for(int i = 0; i < n; i++)
                 {
                     vacas[i] = new Vacas();
                     vacas[i].peso = Integer.parseInt(pesos[i]);
                 }
                 System.out.println("Ingrese la cantidad de leche que da una"
                         + " vaca al dia separada por comas");
                 String l = scan.next();
                 String[] leches = l.split(",");
                 for(int i = 0; i < n; i++)
                 {
                     vacas[i].leche = Integer.parseInt(leches[i]);
                 }
                System.out.println("Ingrese el numero de kg que soporta el "
                        + "camion redondeado al entero ams cercano");
                int kg = scan.nextInt();
                bubbleSort(vacas);
                System.out.println("");
                int sumaP = 0;
                int sumaL = 0;
                for(int i = 0; i < vacas.length; i++){
                    sumaP += vacas[i].peso;
                    sumaL += vacas[i].leche;
                }
                int i = 0;
                while(sumaP > kg){
                    sumaP = sumaP - vacas[i].peso;
                    sumaL = sumaL - vacas[i].leche;
                    i++;
                }
                System.out.println("La leche maxima a producir es: " + String.valueOf(sumaL));
             }
         });
    
    }
    public static void bubbleSort(Vacas arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].leche > arr[j + 1].leche) {
                    // swap arr[j+1] and arr[j]
                    Vacas temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
