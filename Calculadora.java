
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textoN1;
	private JTextField textoN2;
	private String calculo="";
	
	public Calculadora() {
		//Ventana
		setTitle("Calculadora");
		setBounds(600,500,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane=new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//Texto
		JLabel txtN1=new JLabel("Numero 1");
		txtN1.setBounds(33,27,250,100);
		contentPane.add(txtN1);

		textoN1 = new JTextField();
		textoN1.setBounds(33, 94, 86, 26);
		contentPane.add(textoN1);
		
		JLabel txtN2=new JLabel("Numero 2");
		txtN2.setBounds(33,138,250,100);
		contentPane.add(txtN2);
		
		textoN2 = new JTextField();
		textoN2.setBounds(33, 205, 86, 26);
		contentPane.add(textoN2);
		//Botones
		JButton btnSuma = new JButton("+");
		btnSuma.setBounds(195, 130, 119, 81);
		contentPane.add(btnSuma);
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
					calculo="+";
			}
		});
		JButton btnResta = new JButton("-");
		btnResta.setBounds(195, 222, 119, 81);
		contentPane.add(btnResta);
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
					calculo="-";
			}
		});
		JButton btnMulti = new JButton("x");
		btnMulti.setBounds(324, 130, 119, 81);
		contentPane.add(btnMulti);
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
					calculo="x";
			}
		});
		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(324, 222, 119, 81);
		contentPane.add(btnDivision);
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
					calculo="/";
			}
		});
		JButton btnResultado = new JButton("=");
		btnResultado.setBounds(195, 314, 119, 81);
		contentPane.add(btnResultado);
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String N1=textoN1.getText();
				String N2=textoN2.getText();
				if(calculo=="+") {
					JOptionPane.showMessageDialog(null,Integer.parseInt(N1)+Integer.parseInt(N2));
				}else if(calculo=="-") {
					JOptionPane.showMessageDialog(null,Integer.parseInt(N1)-Integer.parseInt(N2));
				}else if(calculo=="x") {
					JOptionPane.showMessageDialog(null,Integer.parseInt(N1)*Integer.parseInt(N2));
				}else if(calculo=="/") {
					JOptionPane.showMessageDialog(null,Integer.parseInt(N1)/Integer.parseInt(N2));
				}else {
					JOptionPane.showMessageDialog(null,"Metodo de calculo no definido");
				}
			}
		});
	}

}
