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
             @Override
             public void actionPerformed(ActionEvent actionEvent)
             {
             }
         });
      
    }
}
