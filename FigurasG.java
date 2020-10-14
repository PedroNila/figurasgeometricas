
package Figurasalv;
    
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

   
    public class FigurasG extends JPanel {
    // ventana
     private JFrame ventana;
        // contenedor
        private Container contenedor;

     FigurasG() {

        // inicializar la ventana
                ventana = new JFrame("Dibujando icono");
                // definir tamaño a ventana
                ventana.setSize(800, 600);
                ventana.setVisible(true);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setResizable(false);

                contenedor = ventana.getContentPane();
                contenedor.setSize(800, 600);
                // agregar la ventana en el contenedor
                contenedor.add(this, BorderLayout.CENTER);
    }
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

    //Trazos de la Figura Casa
            g.setColor(Color.red);
            g.drawLine(100, 50, 200, 50);
            g.drawLine(200, 50, 200, 100);
            g.drawLine(100, 50, 100, 100);
            g.drawLine(100, 100, 200, 100);

            g.setColor(Color.red);
            g.drawLine(130, 100, 130, 70);
            g.drawLine(130, 70, 160, 70);
            g.drawLine(160, 100, 160, 70);

            g.setColor(Color.BLACK);
            g.drawLine(130, 100, 80, 140);
            g.drawLine(160, 100, 100, 155);


            g.setColor(Color.DARK_GRAY);
            g.drawLine(100, 50, 150, 20);
            g.drawLine(200, 50, 150, 20);

//Dibujando rectangulos
        g.setColor(Color.blue);
        g.drawRect(280, 40, 20, 70);
          
        g.setColor(Color.red);
        g.drawRect(250, 50, 20, 60);
   
        g.setColor(Color.black);
        g.drawRect(310, 30, 20, 80);
       
        g.setColor(Color.blue);
        g.drawRect(340, 20, 20, 90);
      
       
        g.setColor(Color.red);
        g.drawRect(370, 10, 20, 100);
      



        //trazo de circulos
        g.setColor(Color.yellow);
        g.drawOval(130, 200, 20, 80);
         g.setColor(Color.blue);
            g.drawOval(120, 215, 40, 25);
          g.setColor(Color.red);
            g.drawOval(100, 230, 80, 30);
     
        //Dibujando Carita
            g.setColor(Color.blue);
            g.drawOval(390, 300, 120, 120);
            
            g.setColor(Color.red);
            g.drawOval(460, 320, 30, 30);
            
            g.setColor(Color.black);
            g.drawOval(410, 320, 30, 30);
                  
            g.setColor(Color.pink);
            g.fillOval(470, 330, 10, 10);
              
            g.setColor(Color.yellow);
            g.fillOval(420, 330, 10, 10);
           
            g.setColor(Color.cyan);
            g.drawOval(430, 365, 40, 40);
            
            
            //Dibujando triangulos
            g.setColor(Color.red);
            g.drawLine(450, 300, 550, 300);
            g.setColor(Color.pink);
            g.drawLine(450, 300, 500, 250);
            g.setColor(Color.green);
            g.drawLine(550, 300, 500, 250);
            g.setColor(Color.black);
            g.drawLine(500, 250, 500, 230);
            g.setColor(Color.red);
            g.drawLine(500, 250, 550, 250);
            g.drawLine(500, 230, 550, 250);
            g.drawLine(400, 250, 400, 200);
            g.drawLine(400, 250, 450, 250);
            g.drawLine(400, 200, 450, 250);

    }


} 

