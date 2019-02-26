/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

 import java.awt.Color;
    import java.awt.Graphics;
    import javax.swing.JFrame;
public class Exercicio extends JFrame{

   
    public static void main(String[] args) {
        new Exercicio();
    }
    
    public Exercicio(){
        setSize(900,650);
        setVisible(true);
    }
    
    public void paint (Graphics g){
        
        g.drawRect(50,50,190,290);
        
        g.setColor(new Color(25,25,255));
        g.drawOval(290,70,50,70);
        
        g.setColor(Color.BLUE);
        g.fillRect(50,200,100,25);
        
        g.setColor(Color.green);
        g.drawString("My string", 200,200);
    }
}
