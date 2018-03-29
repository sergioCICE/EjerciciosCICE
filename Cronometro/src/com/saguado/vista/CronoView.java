package com.saguado.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.saguado.controlador.CronoThread;

/**
 * Vista grafica del programa. Realizada con Netbean, generando codigo de forma autom�tica.	
 * Clase que controla el aspecto grafico de la aplicacon, asi como los eventos en los botones.
 */
public class CronoView extends javax.swing.JFrame {

	// Variables declaration - do not modify
	private javax.swing.JButton btnIniciar;
	private javax.swing.JButton btnReiniciar;
	private javax.swing.JButton btnParar;
	private javax.swing.JButton btnSalir;
	private javax.swing.JLabel ImagenLabel;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField campoTiempo;
	// End of variables declaration

	/**
	 * Creates new form CronoVista
	 */
	public CronoView() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		CronoThread crono = new CronoThread(this);
		ImagenLabel = new javax.swing.JLabel();
		campoTiempo = new javax.swing.JTextField();
		btnIniciar = new javax.swing.JButton();
		btnReiniciar = new javax.swing.JButton();
		btnParar = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		btnSalir = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		ImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/relojImg.png"))); // NOI18N
		ImagenLabel.setText("");

		campoTiempo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
		campoTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		campoTiempo.setText("00:00:00:00");
		campoTiempo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

		/**
		 *  Boton que comprueba siel hilo est� activo e inicia el contador del crono. En caso de estar pausado previamente,
		 *  lo reinicia , continuando.
		 */
		btnIniciar.setText("INICIAR");
		btnIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (crono.isAlive()) {
					crono.setActivo(true);
				} else {
					crono.start();
				}

			}
		});

		/**
		 * Boton que pausa el tiempo. Posteriormente se puede reiniciar pulsando en INICIAR
		 */
		btnReiniciar.setText("PAUSAR");
		btnReiniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crono.setActivo(false);
			}
		});

		/**
		 * Boton que realiza dos funciones. Pausa el tiempo en caso de que no se haya PAUSADO antes y vuelve
		 * la cuenta a cero si se vuelve a pausar.
		 */
		btnParar.setText("DETENER");
		btnParar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				campoTiempo.setText("00:00:00:00");
				crono.setActivo(false);
			}
		});

		btnSalir.setText("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(btnSalir,
								javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addComponent(btnSalir).addGap(0, 17, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addContainerGap().addComponent(ImagenLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(campoTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup().addComponent(btnIniciar)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnReiniciar)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnParar))))
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(campoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnIniciar).addComponent(btnReiniciar).addComponent(btnParar)))
						.addComponent(ImagenLabel))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(0, 0, 0)));

		pack();
	}// </editor-fold>

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CronoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CronoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CronoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CronoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CronoView().setVisible(true);
			}
		});
	}

	public synchronized void setTiempo(String tiempo) {
		campoTiempo.setText(tiempo);
	}

}