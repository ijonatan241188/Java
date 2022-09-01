

import javax.swing.*;



public class Ventana3 extends JFrame{
    
    JPanel panel1;
    JTextField areatexto;


    public Ventana3(){

        panel1 = new JPanel();

        this.add(panel1);
        panel1.add(areatexto);
        
        areatexto = new JTextField();

        areatexto.setText("            ");

    }

}
