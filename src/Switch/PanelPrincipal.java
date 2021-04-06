package Switch;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Point;

public class PanelPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPrimerApellido;
	private JTextField txtDdmmaaaa;
	private JTextField txtDdmmaaaa_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtSegundoApellido;
	private JTextField txtLocalizacion;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	
	private JCheckBox chckbxNewCheckBox = new JCheckBox("Nombre");
	private JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Primer Apellido");
	private JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Segundo Apellido");
	private JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Localizaci\u00F3n");
	private JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Fecha Alta / Creaci\u00F3n");
	private JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Fecha Baja / Disoluci\u00F3n ");
	
	private JRadioButton rdbtnNewRadioButton;	
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_1_1;
	private JRadioButton rdbtnNewRadioButton_2_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelPrincipal frame = new PanelPrincipal();
					frame.setTitle("GitHub Selecter: Principal");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PanelPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PanelPrincipal.class.getResource("/Resources/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1201, 702);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setDoubleBuffered(false);
		panel.setFocusable(false);
		panel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.setBackground(SystemColor.menu);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon imgThisImg = new ImageIcon(PanelPrincipal.class.getResource("/Resources/GitHubSelecter.png"));

		lblNewLabel.setIcon(imgThisImg);
		
		JButton btnNewButton = new JButton("\r\n");
		JButton btnNewButton_1 = new JButton("");
		JButton btnNewButton_2 = new JButton("");
		JButton btnNewButton_3 = new JButton("");
		JButton btnNewButton_5 = new JButton("");
		
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_2.setEnabled(false);
		chckbxNewCheckBox_5.setEnabled(false);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/OrganizacionOscuro.png")));
				btnNewButton_1.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/InvestigadorClaro.png")));
				btnNewButton_2.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/TematicaClaro.png")));
				btnNewButton_3.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/EquipoClaro.png")));
				btnNewButton_5.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/ProyectoClaro.png")));
				chckbxNewCheckBox.setEnabled(true);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(true);
				chckbxNewCheckBox_4.setEnabled(true);
				chckbxNewCheckBox_5.setEnabled(false);
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setForeground(SystemColor.menu);
		btnNewButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/OrganizacionOscuro.png")));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBackground(SystemColor.menu);
		
		JScrollPane scrollPane = new JScrollPane();
		
		btnNewButton_1.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/InvestigadorClaro.png")));
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setForeground(SystemColor.menu);
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/OrganizacionClaro.png")));
				btnNewButton_1.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/InvestigadorOscuro.png")));
				btnNewButton_2.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/TematicaClaro.png")));
				btnNewButton_3.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/EquipoClaro.png")));
				btnNewButton_5.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/ProyectoClaro.png")));
				
				deshabilitar();
				
				chckbxNewCheckBox.setEnabled(true);
				chckbxNewCheckBox_1.setEnabled(true);
				chckbxNewCheckBox_2.setEnabled(true);
				chckbxNewCheckBox_3.setEnabled(true);
				chckbxNewCheckBox_4.setEnabled(true);
				chckbxNewCheckBox_5.setEnabled(true);
			}
		});
		
		btnNewButton_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2.setBackground(SystemColor.menu);
		btnNewButton_2.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/TematicaClaro.png")));
		btnNewButton_2.setForeground(SystemColor.menu);
		btnNewButton_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/OrganizacionClaro.png")));
				btnNewButton_1.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/InvestigadorClaro.png")));
				btnNewButton_2.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/TematicaOscuro.png")));
				btnNewButton_3.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/EquipoClaro.png")));
				btnNewButton_5.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/ProyectoClaro.png")));

				deshabilitar();
				
				chckbxNewCheckBox.setEnabled(true);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
				chckbxNewCheckBox_4.setEnabled(false);
				chckbxNewCheckBox_5.setEnabled(false);
			}
		});
		
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setForeground(SystemColor.menu);
		btnNewButton_3.setFocusTraversalKeysEnabled(false);
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_3.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/EquipoClaro.png")));
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBackground(SystemColor.menu);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/OrganizacionClaro.png")));
				btnNewButton_1.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/InvestigadorClaro.png")));
				btnNewButton_2.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/TematicaClaro.png")));
				btnNewButton_3.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/EquipoOscuro.png")));
				btnNewButton_5.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/ProyectoClaro.png")));

				deshabilitar();
				
				chckbxNewCheckBox.setEnabled(true);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(true);
				chckbxNewCheckBox_4.setEnabled(true);
				chckbxNewCheckBox_5.setEnabled(true);
			}
		});
		
		btnNewButton_5.setBackground(SystemColor.menu);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_5.setForeground(SystemColor.menu);
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setFocusTraversalKeysEnabled(false);
		btnNewButton_5.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/ProyectoClaro.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/OrganizacionClaro.png")));
				btnNewButton_1.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/InvestigadorClaro.png")));
				btnNewButton_2.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/TematicaClaro.png")));
				btnNewButton_3.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/EquipoClaro.png")));
				btnNewButton_5.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/ProyectoOscuro.png")));

				deshabilitar();
				
				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
				chckbxNewCheckBox_4.setEnabled(true);
				chckbxNewCheckBox_5.setEnabled(true);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("DD/MM/AAAA");
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null, "La descarga de datos se ha efectuado correctamente en la base de datos.");
	    
			}
		});
		btnNewButton_4.setDefaultCapable(false);
		btnNewButton_4.setFocusTraversalKeysEnabled(false);
		btnNewButton_4.setSize(new Dimension(80, 80));
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setLocation(new Point(40, 40));
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_4.setRolloverIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/download.png")));
		btnNewButton_4.setPressedIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/download.png")));
		btnNewButton_4.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/downloadPeque\u00F1o.png")));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/deusto-logo.png")));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(772)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(64)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1010, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(459)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(49))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1)
								.addComponent(btnNewButton)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_3)
								.addComponent(btnNewButton_5))))
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
		);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNombre.isEnabled() == false) {
					txtNombre.setEnabled(true);
				}else {
					txtNombre.setEnabled(false);
				}
				
			}
		});
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		sl_panel_1.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 22, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 46, SpringLayout.WEST, panel_1);
		panel_1.add(chckbxNewCheckBox);
		
		txtNombre = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, txtNombre, 62, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtNombre, 338, SpringLayout.WEST, panel_1);
				
		txtNombre.setEnabled(false);
		txtNombre.setForeground(Color.LIGHT_GRAY);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtNombre, 50, SpringLayout.SOUTH, chckbxNewCheckBox);
		txtNombre.setText("Nombre");
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtNombre.setForeground(Color.BLACK);
				txtNombre.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNombre.getText().equals("")) {
					txtNombre.setForeground(Color.LIGHT_GRAY);
					txtNombre.setText("Nombre");
				}
			}
		});
	
		
		
		sl_panel_1.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_1, 0, SpringLayout.NORTH, chckbxNewCheckBox);
		sl_panel_1.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_1, 6, SpringLayout.EAST, chckbxNewCheckBox);
		panel_1.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPrimerApellido.isEnabled() == false) {
					txtPrimerApellido.setEnabled(true);
				}else {
					txtPrimerApellido.setEnabled(false);
				}
				
			}
		});
		
		sl_panel_1.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_2, 6, SpringLayout.EAST, chckbxNewCheckBox_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, chckbxNewCheckBox_2, 0, SpringLayout.SOUTH, chckbxNewCheckBox);
		panel_1.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtSegundoApellido.isEnabled() == false) {
					txtSegundoApellido.setEnabled(true);
				}else {
					txtSegundoApellido.setEnabled(false);
				}
				
			}
		});
		
		sl_panel_1.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_3, 6, SpringLayout.EAST, chckbxNewCheckBox_2);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, chckbxNewCheckBox_3, 0, SpringLayout.SOUTH, chckbxNewCheckBox);
		panel_1.add(chckbxNewCheckBox_3);
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtLocalizacion.isEnabled() == false) {
					txtLocalizacion.setEnabled(true);
				}else {
					txtLocalizacion.setEnabled(false);
				}
				
			}
		});
		
		rdbtnNewRadioButton = new JRadioButton("Antes de ...");
		sl_panel_1.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 49, SpringLayout.SOUTH, chckbxNewCheckBox_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 41, SpringLayout.EAST, txtNombre);
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton_1 = new JRadioButton("Despu\u00E9s de ...");
		sl_panel_1.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1, 5, SpringLayout.SOUTH, rdbtnNewRadioButton);
		sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_2 = new JRadioButton("Entre ...");
		sl_panel_1.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_2, 6, SpringLayout.SOUTH, rdbtnNewRadioButton_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_2, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		rdbtnNewRadioButton_2.setEnabled(false);
		
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isEnabled()==false) {
					rdbtnNewRadioButton.setEnabled(true);
					rdbtnNewRadioButton.setSelected(true);
					rdbtnNewRadioButton_1.setEnabled(true);
					rdbtnNewRadioButton_2.setEnabled(true);
					txtDdmmaaaa.setEnabled(true);
				}else {
					rdbtnNewRadioButton.setEnabled(false);
					rdbtnNewRadioButton_1.setEnabled(false);
					rdbtnNewRadioButton_2.setEnabled(false);
					
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					
					txtDdmmaaaa.setEnabled(false);
					txtDdmmaaaa_1.setEnabled(false);
					textField_2.setEnabled(false);
					textField_3.setEnabled(false);
				}
				
			}
		});
		sl_panel_1.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_4, 6, SpringLayout.EAST, chckbxNewCheckBox_3);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, chckbxNewCheckBox_4, 0, SpringLayout.SOUTH, chckbxNewCheckBox);
		panel_1.add(chckbxNewCheckBox_4);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Antes de ...");
		sl_panel_1.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_3, 94, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_3, -224, SpringLayout.EAST, panel_1);
		rdbtnNewRadioButton_3.setEnabled(false);
		panel_1.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_1_1 = new JRadioButton("Despu\u00E9s de ...");
		sl_panel_1.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1_1, 7, SpringLayout.SOUTH, rdbtnNewRadioButton_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1_1, 0, SpringLayout.WEST, rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_1_1.setEnabled(false);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		rdbtnNewRadioButton_2_1 = new JRadioButton("Entre ...");
		sl_panel_1.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_2_1, 0, SpringLayout.NORTH, rdbtnNewRadioButton_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_2_1, 0, SpringLayout.WEST, rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_2_1.setEnabled(false);
		panel_1.add(rdbtnNewRadioButton_2_1);
		
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_3.setSelected(true);
				rdbtnNewRadioButton_1_1.setSelected(false);
				rdbtnNewRadioButton_2_1.setSelected(false);
				textField.setEnabled(true);
				textField_1.setEnabled(false);
				textField_4.setEnabled(false);
				textField_5.setEnabled(false);
				
			}
		});
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_3.setSelected(false);
				rdbtnNewRadioButton_1_1.setSelected(true);
				rdbtnNewRadioButton_2_1.setSelected(false);
				textField.setEnabled(false);
				textField_1.setEnabled(true);
				textField_4.setEnabled(false);
				textField_5.setEnabled(false);
				
			}
		});
		rdbtnNewRadioButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_3.setSelected(false);
				rdbtnNewRadioButton_1_1.setSelected(false);
				rdbtnNewRadioButton_2_1.setSelected(true);
				textField.setEnabled(false);
				textField_1.setEnabled(false);
				textField_4.setEnabled(true);
				textField_5.setEnabled(true);
				
			}
		});
		
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isEnabled()==false) {
					rdbtnNewRadioButton_3.setEnabled(true);
					rdbtnNewRadioButton_3.setSelected(true);
					rdbtnNewRadioButton_1_1.setEnabled(true);
					rdbtnNewRadioButton_2_1.setEnabled(true);
					textField.setEnabled(true);
				}else {
					rdbtnNewRadioButton_3.setEnabled(false);
					rdbtnNewRadioButton_1_1.setEnabled(false);
					rdbtnNewRadioButton_2_1.setEnabled(false);
					
					rdbtnNewRadioButton_3.setSelected(false);
					rdbtnNewRadioButton_1_1.setSelected(false);
					rdbtnNewRadioButton_2_1.setSelected(false);
					
					textField.setEnabled(false);
					textField_1.setEnabled(false);
					textField_4.setEnabled(false);
					textField_5.setEnabled(false);
				}
			}
		});
		sl_panel_1.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_5, 0, SpringLayout.NORTH, chckbxNewCheckBox);
		sl_panel_1.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_5, 6, SpringLayout.EAST, chckbxNewCheckBox_4);
		panel_1.add(chckbxNewCheckBox_5);
		
		txtPrimerApellido = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtPrimerApellido, 10, SpringLayout.SOUTH, txtNombre);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtPrimerApellido, 62, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtPrimerApellido, 338, SpringLayout.WEST, panel_1);
		txtPrimerApellido.setEnabled(false);
		txtPrimerApellido.setText("Primer Apellido");
		txtPrimerApellido.setForeground(Color.LIGHT_GRAY);
		panel_1.add(txtPrimerApellido);
		txtPrimerApellido.setColumns(10);
		txtPrimerApellido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtPrimerApellido.setForeground(Color.BLACK);
				txtPrimerApellido.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPrimerApellido.getText().equals("")) {
					txtPrimerApellido.setForeground(Color.LIGHT_GRAY);
					txtPrimerApellido.setText("Primer Apellido");
				}
			}
		});
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setSelected(true);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				txtDdmmaaaa.setEnabled(true);
				txtDdmmaaaa_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				
			}
		});
		panel_1.add(rdbtnNewRadioButton);
		panel_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(true);
				rdbtnNewRadioButton_2.setSelected(false);
				txtDdmmaaaa.setEnabled(false);
				txtDdmmaaaa_1.setEnabled(true);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				
			}
		});
		panel_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(true);
				txtDdmmaaaa.setEnabled(false);
				txtDdmmaaaa_1.setEnabled(false);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				
			}
		});
		
		txtDdmmaaaa = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtDdmmaaaa, 50, SpringLayout.SOUTH, chckbxNewCheckBox_4);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtDdmmaaaa, 106, SpringLayout.EAST, rdbtnNewRadioButton);
		txtDdmmaaaa.setForeground(Color.LIGHT_GRAY);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtDdmmaaaa, 24, SpringLayout.EAST, rdbtnNewRadioButton);
		txtDdmmaaaa.setEnabled(false);
		txtDdmmaaaa.setText("DD/MM/AAAA");
		txtDdmmaaaa.setColumns(10);
		panel_1.add(txtDdmmaaaa);
		txtDdmmaaaa.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtDdmmaaaa.setForeground(Color.BLACK);
				txtDdmmaaaa.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtDdmmaaaa.getText().equals("")) {
					txtDdmmaaaa.setForeground(Color.LIGHT_GRAY);
					txtDdmmaaaa.setText("DD/MM/AAAA");
				}
			}
		});
		
		txtDdmmaaaa_1 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtDdmmaaaa_1, 8, SpringLayout.SOUTH, txtDdmmaaaa);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtDdmmaaaa_1, 92, SpringLayout.EAST, rdbtnNewRadioButton_1);
		txtDdmmaaaa_1.setForeground(Color.LIGHT_GRAY);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtDdmmaaaa_1, 7, SpringLayout.EAST, rdbtnNewRadioButton_1);
		txtDdmmaaaa_1.setEnabled(false);
		txtDdmmaaaa_1.setText("DD/MM/AAAA");
		txtDdmmaaaa_1.setColumns(10);
		panel_1.add(txtDdmmaaaa_1);
		txtDdmmaaaa_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtDdmmaaaa_1.setForeground(Color.BLACK);
				txtDdmmaaaa_1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtDdmmaaaa_1.getText().equals("")) {
					txtDdmmaaaa_1.setForeground(Color.LIGHT_GRAY);
					txtDdmmaaaa_1.setText("DD/MM/AAAA");
				}
			}
		});
		
		textField_2 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_2, 121, SpringLayout.EAST, rdbtnNewRadioButton_2);
		textField_2.setForeground(Color.LIGHT_GRAY);
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_2, 1, SpringLayout.NORTH, rdbtnNewRadioButton_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_2, 44, SpringLayout.EAST, rdbtnNewRadioButton_2);
		textField_2.setEnabled(false);
		textField_2.setText("DD/MM/AAAA");
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textField_2.setForeground(Color.BLACK);
				textField_2.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_2.getText().equals("")) {
					textField_2.setForeground(Color.LIGHT_GRAY);
					textField_2.setText("DD/MM/AAAA");
				}
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("y");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, rdbtnNewRadioButton_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 6, SpringLayout.EAST, textField_2);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, rdbtnNewRadioButton_2);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1, -423, SpringLayout.EAST, panel_1);
		panel_1.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_3, 587, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_3, 668, SpringLayout.WEST, panel_1);
		textField_3.setForeground(Color.LIGHT_GRAY);
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_3, 1, SpringLayout.NORTH, rdbtnNewRadioButton_2);
		textField_3.setEnabled(false);
		textField_3.setText("DD/MM/AAAA");
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		textField_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textField_3.setForeground(Color.BLACK);
				textField_3.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_3.getText().equals("")) {
					textField_3.setForeground(Color.LIGHT_GRAY);
					textField_3.setText("DD/MM/AAAA");
				}
			}
		});
		
		txtSegundoApellido = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtSegundoApellido, 6, SpringLayout.SOUTH, txtPrimerApellido);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtSegundoApellido, 62, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtSegundoApellido, -41, SpringLayout.WEST, rdbtnNewRadioButton_2);
		txtSegundoApellido.setEnabled(false);
		txtSegundoApellido.setForeground(Color.LIGHT_GRAY);
		txtSegundoApellido.setText("Segundo Apellido");
		panel_1.add(txtSegundoApellido);
		txtSegundoApellido.setColumns(10);
		txtSegundoApellido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtSegundoApellido.setForeground(Color.BLACK);
				txtSegundoApellido.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSegundoApellido.getText().equals("")) {
					txtSegundoApellido.setForeground(Color.LIGHT_GRAY);
					txtSegundoApellido.setText("Segundo Apellido");
				}
			}
		});
		
		txtLocalizacion = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, txtLocalizacion, 62, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtLocalizacion, -672, SpringLayout.EAST, panel_1);
		txtLocalizacion.setEnabled(false);
		txtLocalizacion.setForeground(Color.LIGHT_GRAY);
		txtLocalizacion.setText("Localizaci\u00F3n");
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtLocalizacion, 6, SpringLayout.SOUTH, txtSegundoApellido);
		panel_1.add(txtLocalizacion);
		txtLocalizacion.setColumns(10);
		txtLocalizacion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtLocalizacion.setForeground(Color.BLACK);
				txtLocalizacion.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtLocalizacion.getText().equals("")) {
					txtLocalizacion.setForeground(Color.LIGHT_GRAY);
					txtLocalizacion.setText("Segundo Apellido");
				}
			}
		});
		
		
		textField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField, 95, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField, 18, SpringLayout.EAST, rdbtnNewRadioButton_3);
		textField.setText("DD/MM/AAAA");
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setEnabled(false);
		textField.setColumns(10);
		panel_1.add(textField);
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textField.setForeground(Color.BLACK);
				textField.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField.getText().equals("")) {
					textField.setForeground(Color.LIGHT_GRAY);
					textField.setText("DD/MM/AAAA");
				}
			}
		});
		
		textField_1 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_1, 10, SpringLayout.SOUTH, textField);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_1, 6, SpringLayout.EAST, rdbtnNewRadioButton_1_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_1, 83, SpringLayout.EAST, rdbtnNewRadioButton_1_1);
		textField_1.setText("DD/MM/AAAA");
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textField_1.setForeground(Color.BLACK);
				textField_1.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_1.getText().equals("")) {
					textField_1.setForeground(Color.LIGHT_GRAY);
					textField_1.setText("DD/MM/AAAA");
				}
			}
		});
		
		textField_4 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_4, 1, SpringLayout.NORTH, rdbtnNewRadioButton_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_4, 34, SpringLayout.EAST, rdbtnNewRadioButton_2_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_4, -125, SpringLayout.EAST, panel_1);
		textField_4.setText("DD/MM/AAAA");
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		panel_1.add(textField_4);
		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textField_4.setForeground(Color.BLACK);
				textField_4.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_4.getText().equals("")) {
					textField_4.setForeground(Color.LIGHT_GRAY);
					textField_4.setText("DD/MM/AAAA");
				}
			}
		});
		
		JLabel lblNewLabel_1_1 = new JLabel("y");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 0, SpringLayout.NORTH, rdbtnNewRadioButton_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 6, SpringLayout.EAST, textField_4);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_1_1, 0, SpringLayout.SOUTH, rdbtnNewRadioButton_2);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, -113, SpringLayout.EAST, panel_1);
		panel_1.add(lblNewLabel_1_1);
		
		textField_5 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_5, 1, SpringLayout.NORTH, rdbtnNewRadioButton_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_5, 6, SpringLayout.EAST, lblNewLabel_1_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_5, -28, SpringLayout.EAST, panel_1);
		textField_5.setText("DD/MM/AAAA");
		textField_5.setForeground(Color.LIGHT_GRAY);
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		panel_1.add(textField_5);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Puedes elegir tantos criterios como te facilite el sistema para realizar el filtrado de datos. \n No hay un único criterio de busquerda.");
			}
		});
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setForeground(SystemColor.menu);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setIcon(new ImageIcon(PanelPrincipal.class.getResource("/Resources/pregunta.png")));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_7, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_7, -10, SpringLayout.EAST, panel_1);
		panel_1.add(btnNewButton_7);
		textField_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textField_5.setForeground(Color.BLACK);
				textField_5.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_5.getText().equals("")) {
					textField_5.setForeground(Color.LIGHT_GRAY);
					textField_5.setText("DD/MM/AAAA");
				}
			}
		});
		
		panel.setLayout(gl_panel);
	}
	
	
	public void deshabilitar() {
		chckbxNewCheckBox.setSelected(false);
		chckbxNewCheckBox_1.setSelected(false);
		chckbxNewCheckBox_2.setSelected(false);
		chckbxNewCheckBox_3.setSelected(false);
		chckbxNewCheckBox_4.setSelected(false);
		chckbxNewCheckBox_5.setSelected(false);
		
		txtNombre.setEnabled(false);
		txtPrimerApellido.setEnabled(false);
		txtDdmmaaaa.setEnabled(false);
		txtDdmmaaaa_1.setEnabled(false);
		textField_2.setEnabled(false);
		textField_3.setEnabled(false);
		txtSegundoApellido.setEnabled(false);
		txtLocalizacion.setEnabled(false);
		textField.setEnabled(false);
		textField_1.setEnabled(false);
		textField_4.setEnabled(false);
		textField_5.setEnabled(false);
		
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_3.setEnabled(false);
		rdbtnNewRadioButton_1_1.setEnabled(false);
		rdbtnNewRadioButton_2_1.setEnabled(false);
	}
}
