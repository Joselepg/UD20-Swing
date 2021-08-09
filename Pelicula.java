import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pelicula extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	public Pelicula() {
		
		//Ventana
		setTitle("Pelicula");
		setBounds(600,500,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Etiqueta
		JLabel escribe=new JLabel("Escribe un titulo de una pelicula.");
		escribe.setBounds(25,25,250,100);
		contentPane.add(escribe);
		
		JLabel peli=new JLabel("Peliculas.");
		peli.setBounds(300,25,250,100);
		contentPane.add(peli);
		
		//Campo de texto
		textField = new JTextField();
		textField.setBounds(25, 110, 200, 26);
		contentPane.add(textField);
		
		//Peliculas
		JComboBox lista = new JComboBox<>();
		lista.setBounds(300,100,141,22);
		contentPane.add(lista);
		
		//Boton
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(50, 150, 89, 23);
		contentPane.add(btnAñadir);
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				lista.addItem(textField.getText());
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
