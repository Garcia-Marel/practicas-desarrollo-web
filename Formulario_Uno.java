import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Formulario_Uno implements ActionListener
{
	public static void main(String args[])
	{
		JFrame frmUno = new JFrame();
		frmUno.setSize(200, 200);

		JTextField txtNombre = new JTextField();
		txtNombre.locate(20,20);
		txtNombre.setBounds(10,40,150,20);
		frmUno.add(txtNombre);


		JButton btnUno = new JButton();
		btnUno.setBounds(10,70,90,20);
		btnUno.setText("click");
		btnUno.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txtNombre.setText("Diste click");
			}
		});

		JPanel panelUno = new JPanel();
		panelUno.setLayout(null);

		
	    JLabel lblUno = new JLabel();
		lblUno.locate(50,50);
		lblUno.setSize(30,20);
		lblUno.setText("Hola");

		panelUno.add(txtNombre);
		panelUno.add(btnUno);
		panelUno.add(lblUno);
		frmUno.add(panelUno);
	
		frmUno.show();
	}
	public void actionPerformed(ActionEvent e)
	{
				
	}
}