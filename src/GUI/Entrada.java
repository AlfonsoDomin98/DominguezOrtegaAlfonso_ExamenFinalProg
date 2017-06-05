package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Constant.Constantes;
import Container.Container;

import Models.ListaVehiculos;
import Models.Vehiculo;


public class Entrada {
	/**
	 * Constantes de las tarifas
	 */
	private final float Hasta_30 = 0.6f;
	private final float Hasta_60 = 0.1f;
	private final float Hasta_720 = 0.03f;

	/*
	 * Atributos
	 */
	private JFrame frame;
	private JTextField txtMatricula;
	private JTextField txtImporteEntregado;
	private JTextField textFieldHE;
	private JTextField textHS;
	private JButton btnEntradaVehiculo;
	private JButton btnPago;
	private JButton btnCajaDia;
	private JLabel lblMatricula;
	private JButton btnRegistrar;
	private JLabel lblTotalAPagar;
	private JButton btnPagar;
	private JLabel lblHoraEntrada;
	private JLabel lblHoraSalida;
	private JLabel lblImporteEntregado;
	private Date HoraE;
	private Date HoraS;
	private ArrayList<Float>Pagos;
	private JTextField textPago;
	
	
	
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrada window = new Entrada();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Entrada() {
		initialize();
		setComponentProperties();
		setComponentAdapters();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Pantalla Principal");
		
		btnEntradaVehiculo = new JButton("Entrada Vehiculo");
		
		
		btnPago = new JButton("Pago y Salida Vehiculo");
		
		
		btnCajaDia = new JButton("Caja del Dia");
	
		
		lblMatricula = new JLabel("Matricula:");
		
		
		txtMatricula = new JTextField();
		
		btnRegistrar = new JButton("Registrar");
		
		
		lblTotalAPagar = new JLabel("Total a pagar");
		
		
		txtImporteEntregado = new JTextField();
		
		
		btnPagar = new JButton("Pagar y salir del parking");
		
		
		lblHoraEntrada = new JLabel("Hora Entrada:");
		
		
		textFieldHE = new JTextField();
		
		
		lblHoraSalida = new JLabel("Hora Salida:");
		
		
		textHS = new JTextField();
		
		lblImporteEntregado = new JLabel("Importe Entregado:");
		
		textPago = new JTextField();
	}
	
	/**
	 * Propiedades de los componentes
	 */
	private void setComponentProperties(){
		btnEntradaVehiculo.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		btnEntradaVehiculo.setBounds(18, 24, 175, 70);
		frame.getContentPane().add(btnEntradaVehiculo);
		btnEntradaVehiculo.setEnabled(false);
		
		btnPago.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		btnPago.setBounds(205, 24, 238, 70);
		frame.getContentPane().add(btnPago);
		
		btnCajaDia.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		btnCajaDia.setBounds(469, 27, 175, 70);
		frame.getContentPane().add(btnCajaDia);
		
		lblMatricula.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblMatricula.setBounds(34, 135, 118, 44);
		frame.getContentPane().add(lblMatricula);
		
		txtMatricula.setBounds(164, 119, 238, 60);
		frame.getContentPane().add(txtMatricula);
		txtMatricula.setColumns(10);
		
		
		btnRegistrar.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		btnRegistrar.setBounds(164, 225, 259, 92);
		frame.getContentPane().add(btnRegistrar);
		
		lblTotalAPagar.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblTotalAPagar.setBounds(521, 128, 165, 59);
		frame.getContentPane().add(lblTotalAPagar);
		lblTotalAPagar.setVisible(false);
		txtImporteEntregado.setBounds(521, 280, 175, 60);
		frame.getContentPane().add(txtImporteEntregado);
		txtImporteEntregado.setColumns(10);
		txtImporteEntregado.setVisible(false);
		
		btnPagar.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		btnPagar.setBounds(164, 361, 259, 96);
		frame.getContentPane().add(btnPagar);
		btnPagar.setVisible(false);
		
		lblHoraEntrada.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblHoraEntrada.setBounds(34, 212, 127, 30);
		frame.getContentPane().add(lblHoraEntrada);
		lblHoraEntrada.setVisible(false);
		
		textFieldHE.setColumns(10);
		textFieldHE.setBounds(164, 201, 238, 60);
		frame.getContentPane().add(textFieldHE);
		textFieldHE.setVisible(false);
		
		lblHoraSalida.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblHoraSalida.setBounds(34, 287, 127, 30);
		frame.getContentPane().add(lblHoraSalida);
		lblHoraSalida.setVisible(false);
		
		textHS.setColumns(10);
		textHS.setBounds(164, 274, 238, 60);
		frame.getContentPane().add(textHS);
		textHS.setVisible(false);
		
		
		lblImporteEntregado.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblImporteEntregado.setBounds(469, 232, 189, 36);
		frame.getContentPane().add(lblImporteEntregado);
		lblImporteEntregado.setVisible(false);
		
		textPago.setBounds(521, 181, 165, 49);
		frame.getContentPane().add(textPago);
		textPago.setColumns(10);
		textPago.setVisible(false);
		
		
	}
	
	/*
	 * Los Adaptadores de los componentes
	 */
	private void setComponentAdapters(){
		btnRegistrar.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				HoraE = new Date();
				textFieldHE.setText(HoraE.toString());
				// recoger la matricula de la pantalla y pasarla a mayusculas
				String s = txtMatricula.getText().toUpperCase();
				// Comprobar que la matricula cumple los requisitos de una
				// matricula
				if (Constantes.REGEX_MATRICULA.matcher(s).matches()) {
					Vehiculo vehiculoAux = new Vehiculo(txtMatricula.getText());
					JOptionPane.showMessageDialog(null, "Añadido Correctamente");
					btnRegistrar.setVisible(false);
					textHS.setVisible(true);
					lblHoraSalida.setVisible(true);
					textFieldHE.setVisible(true);
					lblHoraEntrada.setVisible(true);
					btnPagar.setVisible(true);
					textPago.setVisible(true);
					txtImporteEntregado.setVisible(true);
					lblImporteEntregado.setVisible(true);
					lblTotalAPagar.setVisible(true);
					btnEntradaVehiculo.setEnabled(true);
					btnPago.setEnabled(false);

					 }
				
				else{
					JOptionPane.showMessageDialog(null, "El formato no es el correcto");
				}
				txtMatricula.setEditable(false);
			}
		});
		
		btnPagar.addMouseListener(new MouseAdapter(){
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e){
			HoraS = new Date();
			textHS.setText(HoraS.toString());
			
			float total = 0.00f;
			if(HoraS.getMinutes() - HoraE.getMinutes() <= 30){
				 total = (HoraS.getMinutes() - HoraE.getMinutes()) * Hasta_30;
			}
			else if(HoraS.getMinutes() - HoraE.getMinutes() > 30 && HoraS.getMinutes() - HoraE.getMinutes() < 60){
				total=  (HoraS.getMinutes() - HoraE.getMinutes()) * Hasta_60;
			}
			else if(HoraS.getMinutes() - HoraE.getMinutes() > 60 && HoraS.getMinutes() - HoraE.getMinutes() < 720){
				total = (HoraS.getMinutes() - HoraE.getMinutes()) * Hasta_720;
			}
			
			textPago.setEditable(false);
			textPago.setText(Float.toString(total)+"Eur");
			
			/**
			 * Lanza un mensaje con la cantidad a devolver
			 */
			if(total <= Float.valueOf(txtImporteEntregado.getText())){
				float Cantidad = Float.parseFloat(txtImporteEntregado.getText()) - total;
				JOptionPane.showMessageDialog(null, "La cantidad a devolver es de: "+ Cantidad+"Eur");
			}
			Pagos.add(total);
			}
			
		});
		
		btnCajaDia.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				
			}
		});
		
		/**
		 * Vuelve al inicio
		 */
		btnEntradaVehiculo.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				btnRegistrar.setVisible(true);
				textHS.setVisible(false);
				lblHoraSalida.setVisible(false);
				textFieldHE.setVisible(false);
				lblHoraEntrada.setVisible(false);
				btnPagar.setVisible(false);
				textPago.setVisible(false);
				txtImporteEntregado.setVisible(false);
				lblTotalAPagar.setVisible(false);
				btnEntradaVehiculo.setEnabled(false);
				btnPago.setEnabled(true);
				
				
				textHS.setText("");
				textFieldHE.setText("");
				textPago.setText("");
				txtImporteEntregado.setText("");
				txtMatricula.setText("");

				
				}
			
		});
	}
	
	
	
}
	


