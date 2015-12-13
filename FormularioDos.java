import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioDos
    implements ActionListener
{
    static JFrame frmDos;
    
    public static void main(String args [])
    {
        JFrame frmDos = new JFrame();
        frmDos.setSize(400,400);
        
       
        JLabel lblNumero = new JLabel();
        lblNumero.setBounds(10,10,150,20);
        lblNumero.setText("Numero 1:");
        
        JLabel lblNumero2 = new JLabel();
        lblNumero2.setBounds(10,40,150,20);
        lblNumero2.setText("Numero 2:");

        JLabel lblResultado = new JLabel();
        lblResultado.setBounds(10,70,150,20);
        lblResultado.setText("Resultado:");

         JTextField txtTexto3 = new JTextField();
        txtTexto3.locate(20,50);
        txtTexto3.setBounds(80,70, 150,20);
        

        JTextField txtTexto1 = new JTextField();
        txtTexto1.locate(20,50);
        txtTexto1.setBounds(80,10, 150,20);
        
        JTextField txtTexto2 = new JTextField();
        txtTexto2.locate(40,50);
        txtTexto2.setBounds(80,40, 150,20); 
        
        JButton btnMultiplicacion = new JButton();
        btnMultiplicacion.setBounds(10,350,150,20);
        btnMultiplicacion.setText("Multiplicacion");
        btnMultiplicacion.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {
                float a,b;
                a = Integer.parseInt(txtTexto1.getText());
                b = Integer.parseInt(txtTexto2.getText());

                JOptionPane.showMessageDialog(null,"la Multiplicacion de" + a + " * " + b + " es =" + (a*b));
                
            }
        });
        
        JButton btnMenos = new JButton();
        btnMenos.setBounds(180,300,150,20);
        btnMenos.setText("Resta");
        btnMenos.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {
                 float a,b;
                a = Integer.parseInt(txtTexto1.getText());
                b = Integer.parseInt(txtTexto2.getText());

                JOptionPane.showMessageDialog(null,"la resta de" + a + " - " + b + " es =" + (a-b));
            }
        });

        JButton btnDivision = new JButton();
        btnDivision.setBounds(180,350,150,20);
        btnDivision.setText("Division");
        btnDivision.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e)
            {
                 float a,b;
                a = Integer.parseInt(txtTexto1.getText());
                b = Integer.parseInt(txtTexto2.getText());

                JOptionPane.showMessageDialog(null,"la Division de" + a + " / " + b + " es =" + (a/b));
            }
        });
        
        JButton btnSuma = new JButton();
        btnSuma.setBounds(10,300,150,20);
        btnSuma.setText("Suma");
        btnSuma.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                float a,b;
                a = Integer.parseInt(txtTexto1.getText());
                b = Integer.parseInt(txtTexto2.getText());

                JOptionPane.showMessageDialog(null,"la suma de " + a + " + " + b + " es = " + (a+b));
           }
        });
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        
        panel1.add(btnMenos);
        panel1.add(btnMultiplicacion);
        panel1.add(btnDivision);
        panel1.add(txtTexto2);
        panel1.add(lblNumero2);
        panel1.add(lblResultado);
        panel1.add(txtTexto1);
        panel1.add(txtTexto3);
        panel1.add(lblNumero);
        panel1.add(btnSuma);
        frmDos.add(panel1);
        
        frmDos.show();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
}