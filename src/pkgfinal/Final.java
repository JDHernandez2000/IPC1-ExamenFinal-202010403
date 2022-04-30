/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public static Problema1 p1 = new Problema1();
    public static Problema2 p2 = new Problema2();
    public static Problema3 p3 = new Problema3();
    public static void main(String[] args) {
        men = new menu();
        men.show();
        men.jButton1.addActionListener(new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent actionEvent)
             {
                 men.show(false);
                 p1.show();
             }
         });
        men.jButton2.addActionListener(new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent actionEvent)
             {
                 men.show(false);
                 p2.show();
             }
         });
        men.jButton3.addActionListener(new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent actionEvent)
             {
                 men.show(false);
                 p3.show();
             }
         });
        p1.jButton1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                p1.show(false);
                men.show();
            }
        });
        p2.jButton1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                p2.show(false);
                men.show();
            }
        });
        p3.jButton1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                p3.show(false);
                men.show();
            }
        });
    }
}
