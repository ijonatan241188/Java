import javax.swing.*;
import javax.swing.colorchooser.ColorSelectionModel;


public class Ventana2 extends JFrame {
    JPanel panel;
    JLabel texto;
    JButton boton;
    JTextField areatexto;

public Ventana2(){

    panel = new JPanel();
    texto = new JLabel();
    boton = new JButton();
    areatexto = new JTextField(20);


this.add(panel);
panel.add(texto);
panel.add(boton);
panel.add(areatexto);



texto.setText("Nombre");
areatexto.setText("");
boton.setText("Confirmar");


    }

}
