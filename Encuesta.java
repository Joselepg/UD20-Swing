

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Encuesta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public Encuesta() {
		
		//Ventana
		setTitle("Encuesta");
		setBounds(600,500,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Etiqueta pregunta 1
		JLabel pregunta1=new JLabel("Elije un sistema operativo.");
		pregunta1.setBounds(25,25,250,100);
		contentPane.add(pregunta1);
		
		//Opciones pregunta 1
		JRadioButton Opcion=new JRadioButton("Windows",false);
				Opcion.setBounds(43, 100, 109, 23);
				contentPane.add(Opcion);
				
				JRadioButton Opcion_1 = new JRadioButton("Linux",false);
				Opcion_1.setBounds(43,120, 109,23);
				contentPane.add(Opcion_1);
				
				JRadioButton Opcion_2 =new JRadioButton("Mac",false);
				Opcion_2.setBounds(43,140,109,23);
				contentPane.add(Opcion_2);
				
				ButtonGroup grupo =new ButtonGroup();
				grupo.add(Opcion);
				grupo.add(Opcion_1);
				grupo.add(Opcion_2);
				
		//Etiqueta pregunta 2
		JLabel pregunta2=new JLabel("Elije un sistema operativo.");
		pregunta2.setBounds(250,25,250,100);
		contentPane.add(pregunta2);
		
		//Opciones pregunta 2
		JCheckBox OpcionP2 =new JCheckBox("Programación",false);
		OpcionP2.setBounds(250,90,120,23);
		contentPane.add(OpcionP2);
		
		JCheckBox OpcionP2_2 =new JCheckBox("Diseño gráfico",false);
		OpcionP2_2.setBounds(250,110,120,23);
		contentPane.add(OpcionP2_2);
		
		JCheckBox OpcionP2_3 = new JCheckBox("Administración",false);
		OpcionP2_3.setBounds(250,130,120,23);
		contentPane.add(OpcionP2_3);
		
		//Etiquetas Horas
		JLabel horas=new JLabel("Cuantas horas dedicas al ordenador?");
		horas.setBounds(100,150,250,100);
		contentPane.add(horas);
		
		
		//Slider horas
		JSlider Slider =new JSlider(1,10,1);
		Slider.setBounds(100, 230, 120, 30);
		contentPane.add(Slider);
		
		//Respuesta
		JButton btnRespuesta = new JButton("Finzalizar");
		btnRespuesta.setBounds(150, 250, 89, 23);
		contentPane.add(btnRespuesta);
		btnRespuesta.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String respuesta="";
				if(Opcion.isSelected()) {
					respuesta = "Sistema operativo Windows.";
				} else if(Opcion_1.isSelected()) {
					respuesta="Sistema operativo Linux.";
				} else if(Opcion_2.isSelected()) {
					respuesta="Sistema operativo Mac.";
				} else {
					respuesta="Sin sistema operativo definido.";
				}
				
				if(OpcionP2.isSelected()) {
					respuesta+="\nEspecialidad: Programación.";
				}
				if(OpcionP2_2.isSelected()) {
					respuesta+="\nEspecialidad: Programación.";
				}
				if(OpcionP2_3.isSelected()) {
					respuesta+="\nEspecialidad: Programación.";
				}
				
				respuesta += "\nHoras dedicadas: "+Slider.getValue();
				
				JOptionPane.showMessageDialog(null,respuesta );
			}
		});
	}

}
