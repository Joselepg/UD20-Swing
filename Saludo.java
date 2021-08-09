import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Saludo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public Saludo() {
		
		//Ventana
		setTitle("Saludador");
		setBounds(400,200,250,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Etiqueta
		JLabel escribe=new JLabel("Escribe un nombre.");
		escribe.setBounds(25,25,250,100);
		contentPane.add(escribe);
		
		//Campo de texto
		textField = new JTextField();
		textField.setBounds(50, 100, 86, 26);
		contentPane.add(textField);
		
		//Boton
		JButton btnSaludo = new JButton("¡Saludo!");
		btnSaludo.setBounds(50, 150, 89, 23);
		contentPane.add(btnSaludo);
		btnSaludo.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola "+ textField.getText()+"!");
			}
		});
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

}
