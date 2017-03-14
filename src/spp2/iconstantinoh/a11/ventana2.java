/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a11;
import java.awt.*;
/**
 *
 * @author ivana
 */
public class ventana2 extends Frame  {
    //Atributos: 3 botones.
    private final Button btnNorte, btnSur, btnOeste, btnEste, btnCentro;
    
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana2 (){
        super("Esta es una ventana de prueba");
        setLayout(new BorderLayout());
        
        btnNorte = new Button("boton Norte");
        add (btnNorte,BorderLayout.NORTH ); 
        
        btnSur = new Button ("boton Sur");
        add (btnSur,BorderLayout.SOUTH);
        
        btnOeste = new Button ("boton oeste");
        add (btnOeste, BorderLayout.WEST );
        
         btnEste = new Button ("boton este");
        add (btnEste, BorderLayout.EAST );
        
         btnCentro = new Button ("boton central");
        add (btnCentro, BorderLayout.CENTER );
        setSize(800,600);
        setVisible(true);
    
    }
}
    
