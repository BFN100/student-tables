package les_estudiants;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Toolkit;
import java.awt.ComponentOrientation;
import java.awt.Cursor;

public class Table_students {

	private JFrame frame;
	private JTextField id;
	private JTextField prenom;
	private JTextField nom;
	private JTextField session;
	private JTextField projet;
	private JTextField examen;
	private JTextField moyenne;
	private JTextField status;
	private JScrollPane scrollPane;
	private JTable table;
	DefaultTableModel model;
	private Object[] row;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_students window = new Table_students();
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
	public Table_students() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//C'est juste le titre
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(70, 130, 180));
		frame.setBounds(100, 100, 1070, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Ce sont les titres de ces emplacements de texte afin que l'utilisateur sache quoi y taper
		
		Label labelId = new Label("Id:");
		labelId.setForeground(Color.WHITE);
		labelId.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		labelId.setBounds(33, 76, 59, 21);
		frame.getContentPane().add(labelId);
		
		Label labelPrenom = new Label("Pr\u00E9nom:");
		labelPrenom.setForeground(Color.WHITE);
		labelPrenom.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		labelPrenom.setBounds(33, 129, 94, 21);
		frame.getContentPane().add(labelPrenom);
		
		Label labelNoteSession = new Label("Note Session:");
		labelNoteSession.setForeground(Color.WHITE);
		labelNoteSession.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		labelNoteSession.setBounds(33, 239, 121, 21);
		frame.getContentPane().add(labelNoteSession);
		
		Label labelName_1_2 = new Label("Note Projet:");
		labelName_1_2.setForeground(Color.WHITE);
		labelName_1_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		labelName_1_2.setBounds(33, 293, 121, 21);
		frame.getContentPane().add(labelName_1_2);
		
		Label labelName_1_2_1 = new Label("Note Examen:");
		labelName_1_2_1.setForeground(Color.WHITE);
		labelName_1_2_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		labelName_1_2_1.setBounds(33, 348, 121, 21);
		frame.getContentPane().add(labelName_1_2_1);
		
		Label labelName_1_2_1_1 = new Label("Moyenne:");
		labelName_1_2_1_1.setForeground(Color.WHITE);
		labelName_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		labelName_1_2_1_1.setBounds(33, 396, 121, 21);
		frame.getContentPane().add(labelName_1_2_1_1);
		
		Label labelName_1_2_1_2 = new Label("Status:");
		labelName_1_2_1_2.setForeground(Color.WHITE);
		labelName_1_2_1_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		labelName_1_2_1_2.setBounds(33, 449, 121, 21);
		frame.getContentPane().add(labelName_1_2_1_2);
		
		Label labelName_1_2_1_2_1 = new Label("Nom:");
		labelName_1_2_1_2_1.setForeground(Color.WHITE);
		labelName_1_2_1_2_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		labelName_1_2_1_2_1.setBounds(33, 183, 84, 21);
		frame.getContentPane().add(labelName_1_2_1_2_1);
		
		// Ce sont les champs de texte permettant à l'utilisateur de saisir les informations
		
		id = new JTextField();
		id.setBounds(179, 76, 180, 27);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		prenom = new JTextField();
		prenom.setColumns(10);
		prenom.setBounds(179, 133, 180, 27);
		frame.getContentPane().add(prenom);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(179, 183, 180, 27);
		frame.getContentPane().add(nom);
		
		session = new JTextField();
		session.setColumns(10);
		session.setBounds(179, 233, 180, 27);
		frame.getContentPane().add(session);
		
		projet = new JTextField();
		projet.setColumns(10);
		projet.setBounds(179, 287, 180, 27);
		frame.getContentPane().add(projet);
		
		examen = new JTextField();
		examen.setColumns(10);
		examen.setBounds(179, 342, 180, 27);
		frame.getContentPane().add(examen);
		
		moyenne = new JTextField();
		moyenne.setColumns(10);
		moyenne.setBounds(179, 396, 180, 27);
		frame.getContentPane().add(moyenne);
		
		status = new JTextField();
		status.setColumns(10);
		status.setBounds(179, 449, 180, 27);
		frame.getContentPane().add(status);
		
		// J'ai mis un panneau de défilement pour que le tableau soit plus grand que je ne l'ai fait dans la fenêtre
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(64, 64, 64), 1, true));
		scrollPane.setOpaque(false);
		scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 1, true));
		scrollPane.setFocusable(false);
		scrollPane.setFocusTraversalKeysEnabled(false);
		scrollPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		scrollPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPane.setBounds(413, 76, 596, 404);
		frame.getContentPane().add(scrollPane);
		
		//La table
		
		table = new JTable();
		table.setOpaque(false);
		table.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		table.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		table.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		table.setSurrendersFocusOnKeystroke(true);
		table.setFont(new Font("Segoe UI", Font.BOLD, 14));
		table.setForeground(Color.BLACK);
		table.setBackground(new Color(255, 255, 255));
		model= new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {       
				return false;
			}

		};
		Object[] column = {"Id", "Prénom", "Nom", "Session", "Projet", "Examen", "Moyenne", "Status"};
		final Object[] row = new Object[8];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		//Bar où se trouve le menu principal
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Color.DARK_GRAY);
		menuBar.setBounds(0, 0, 1056, 50);
		frame.getContentPane().add(menuBar);
		
		//Menu principal : Fichier - c'est juste le titre
		
		JMenuItem mnNewMenu = new JMenu("Fichier");
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		//Point de menu : Nouveau
		// apagar a tabela
		// se existe uma lista, vai apagar 
		// usar string current file para a nova
		// pela aula dele
		
		JMenuItem mnNewMenu_4 = new JMenuItem("Nouveau");
		mnNewMenu_4.setForeground(Color.DARK_GRAY);
		mnNewMenu_4.setBackground(Color.WHITE);
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mnNewMenu_4);
		
		//Élément de menu : Ouvrir
		
		JMenuItem mnNewMenu_5 = new JMenuItem("Ouvrir");
		mnNewMenu_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedReader reader = null;
				try {
					reader = new BufferedReader (new FileReader("student.txt"));
					String x;
					x = reader.readLine();
					while(x!=null) {
						//System.out.println(x);
						String[] split= x.split("  "); //separei a string em 8 pedaços por causa da tabela tem 8 colunas
						row[0]=split[0];
						row[1]=split[1];
						row[2]=split[2];
						row[3]=split[3];
						row[4]=split[4];
						row[5]=split[5];
						row[6]=split[6];
						row[7]=split[7];
						model.addRow(row);
						x = reader.readLine();
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnNewMenu_5.setBackground(Color.WHITE);
		mnNewMenu_5.setForeground(Color.DARK_GRAY);
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mnNewMenu_5);
		
		//Élément de menu : Enregistrer
		
		JMenuItem mnNewMenu_6 = new JMenuItem("Enregistrer");
		mnNewMenu_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				model.setValueAt(id.getText(), i, 0);
				model.setValueAt(prenom.getText(), i, 1);
				model.setValueAt(nom.getText(), i, 2);
				model.setValueAt(session.getText(), i, 3);
				model.setValueAt(projet.getText(), i, 4);
				model.setValueAt(examen.getText(), i, 5);
				model.setValueAt(moyenne.getText(), i, 6);
				model.setValueAt(status.getText(), i, 7);
				JOptionPane.showMessageDialog(null, "Enregistré avec succès ! Pensez maintenant à cliquer sur \"sauvegarder sous\" lorsque vous souhaitez sauvegarder toutes les données de votre dossier...");
			}
		});
		mnNewMenu_6.setForeground(Color.DARK_GRAY);
		mnNewMenu_6.setBackground(Color.WHITE);
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mnNewMenu_6);
		
		//Élément de menu : Enregistrer sous
		
		JMenuItem mnNewMenu_7 = new JMenuItem("Enregistrer sous");
		mnNewMenu_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrintWriter pw;
				int row = 0;
				int column = 0;
				Object x = model.getValueAt(row, column);
				for(row = 0; row!=0; row++) {
				row = model.getRowCount();
				column = model.getColumnCount();
				try {
					pw = new PrintWriter (new BufferedWriter(new FileWriter("student.txt", true)));
					//recriar a string, porque ela foi quebrada, e acrescentar espaços
					if(x!=null) {
					for(int i=0; i<=7; i++) {
						String phrase = ((String) x).concat("  ");
						pw.println();
						}
					}else {
						JOptionPane.showMessageDialog(null, "Il n'y a pas de données à sauvegarder pour le moment...");
					}
					pw.close();
				} catch (IOException e1) {					
					e1.printStackTrace();
					}
				}
			}
		});
		mnNewMenu_7.setForeground(Color.DARK_GRAY);
		mnNewMenu_7.setBackground(Color.WHITE);
		mnNewMenu_7.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mnNewMenu_7);
		
		//Élément de menu : Fermer
		
		JMenuItem mnNewMenu_8 = new JMenuItem("Fermer");
		mnNewMenu_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showOptionDialog(mnNewMenu_8, e, null, 0, 0, null, row, e);
				System.exit(0);
			}
		});
		mnNewMenu_8.setForeground(Color.DARK_GRAY);
		mnNewMenu_8.setBackground(Color.WHITE);
		mnNewMenu_8.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mnNewMenu_8);
		
		//Menu principal : Édition - C'est juste le titre
		
		JMenu mnNewMenu_1 = new JMenu("\u00C9dition");
		mnNewMenu_1.setForeground(Color.WHITE);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		//Élément de menu : Ajouter
		
		JMenuItem mnNewMenu_9 = new JMenuItem("Ajouter");
		mnNewMenu_9.setForeground(Color.DARK_GRAY);
		mnNewMenu_9.setBackground(Color.WHITE);
		mnNewMenu_9.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("") || prenom.getText().equals("") || nom.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null, "Veuillez remplir correctement toutes les informations");
				}else
				row[0]=id.getText();
				row[1]=prenom.getText();
				row[2]=nom.getText();
				row[3]=session.getText();
				row[4]=projet.getText();
				row[5]=examen.getText();
				row[6]=moyenne.getText();
				row[7]=status.getText();
				model.addRow(row);
				
				id.setText("");
				prenom.setText("");
				nom.setText("");
				session.setText("");
				projet.setText("");
				examen.setText("");
				moyenne.setText("");
				status.setText("");
				JOptionPane.showMessageDialog(null, "Insertion réussie !");
			}
		});
		mnNewMenu_1.add(mnNewMenu_9);
		
		JMenuItem mnNewMenu_10 = new JMenuItem("Modifier");
		mnNewMenu_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int i=table.getSelectedRow();
						if(i>=0) {
						id.setText(model.getValueAt(i, 0).toString());
						prenom.setText(model.getValueAt(i, 1).toString());
						nom.setText(model.getValueAt(i, 2).toString());
						session.setText(model.getValueAt(i, 3).toString());
						projet.setText(model.getValueAt(i, 4).toString());
						examen.setText(model.getValueAt(i, 5).toString());
						moyenne.setText(model.getValueAt(i, 6).toString());
						status.setText(model.getValueAt(i, 7).toString());						
						JOptionPane.showMessageDialog(null, "Vous pouvez maintenant y modifier ces informations dans les champs puis cliquer sur \"enregistrer\" dans le menu, ce qui changera le tableau !");
						}else {
							JOptionPane.showMessageDialog(null, "Veuillez d'abord sélectionner la ligne...");
						}
					}
				});
			}
		});
		/**/
		mnNewMenu_10.setForeground(Color.DARK_GRAY);
		mnNewMenu_10.setBackground(Color.WHITE);
		mnNewMenu_10.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_1.add(mnNewMenu_10);
		
		//Élément de menu : Supprimer
		
		JMenuItem mnNewMenu_11 = new JMenuItem("Supprimer");
		mnNewMenu_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0) {
				model.removeRow(i);
				JOptionPane.showMessageDialog(null, "La ligne sélectionnée a été supprimée correctement !");
			}else{
				JOptionPane.showMessageDialog(null, "Veuillez sélectionner la ligne que vous souhaitez supprimer...");
				}
			}
		});
		mnNewMenu_11.setForeground(Color.DARK_GRAY);
		mnNewMenu_11.setBackground(Color.WHITE);
		mnNewMenu_11.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_1.add(mnNewMenu_11);
		
		//Item do menu: Supprimer tout
		
		JMenuItem mnNewMenu_12 = new JMenuItem("Supprimer tout");
		mnNewMenu_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int aux = model.getRowCount() - 1; aux >= 0; aux--) {
					model.removeRow(aux);
				} 
				JOptionPane.showMessageDialog(null, "Les lignes ont été supprimées avec succès !");
				/*if(i>=0) {
				table.removeRowSelectionInterval(0, i-1);
				JOptionPane.showMessageDialog(null, "Les lignes ont été supprimées avec succès !");
				}else{
				JOptionPane.showMessageDialog(null, "Il n'y a aucune ligne à supprimer...");
				}*/
			//ainda nao funciona
			}
		});
		mnNewMenu_12.setBackground(Color.WHITE);
		mnNewMenu_12.setForeground(Color.DARK_GRAY);
		mnNewMenu_12.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_1.add(mnNewMenu_12);
		
		//Menu principal : Outils - C'est juste le titre
		
		JMenu mnNewMenu_2 = new JMenu("Outils");
		mnNewMenu_2.setBackground(Color.WHITE);
		mnNewMenu_2.setForeground(Color.WHITE);
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_2);
		
		//Élément de menu : Rechercher
		
		JMenuItem mnNewMenu_14 = new JMenuItem("Rechercher");
		mnNewMenu_14.setForeground(Color.DARK_GRAY);
		mnNewMenu_14.setBackground(Color.WHITE);
		mnNewMenu_14.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_2.add(mnNewMenu_14);
		
		//Élément de menu : Lister tout
		
		JMenuItem mnNewMenu_15 = new JMenuItem("Lister tout");
		mnNewMenu_15.setForeground(Color.DARK_GRAY);
		mnNewMenu_15.setBackground(Color.WHITE);
		mnNewMenu_15.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_2.add(mnNewMenu_15);
		
		//Item de menu qui a été placé en tant que Jmenu car ce n'est pas celui qui aura la fonction : Ordonner
		
		JMenu mnNewMenu_16 = new JMenu("Ordonner");
		mnNewMenu_16.setBackground(Color.WHITE);
		mnNewMenu_16.setForeground(Color.DARK_GRAY);
		mnNewMenu_16.setFont(new Font("Segoe UI", Font.ITALIC, 14));
		mnNewMenu_2.add(mnNewMenu_16);
		
		//Sous-rubrique de menu : Par id
		
		JMenuItem mnNewMenu_17 = new JMenuItem("Par id");
		mnNewMenu_17.setForeground(Color.DARK_GRAY);
		mnNewMenu_17.setBackground(Color.WHITE);
		mnNewMenu_17.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_16.add(mnNewMenu_17);
		
		//Sous-rubrique de menu : Par nom
		
		JMenuItem mnNewMenu_18 = new JMenuItem("Par nom");
		mnNewMenu_18.setForeground(Color.DARK_GRAY);
		mnNewMenu_18.setBackground(Color.WHITE);
		mnNewMenu_18.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_16.add(mnNewMenu_18);
		
		//Menu principal : Aide - C'est juste le titre
		
		JMenu mnNewMenu_3 = new JMenu("Aide");
		mnNewMenu_3.setBackground(Color.WHITE);
		mnNewMenu_3.setForeground(Color.WHITE);
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_3);
		
		//Élément de menu : À propos
		
		JMenuItem mnNewMenu_13 = new JMenuItem("\u00C0 Propos");
		mnNewMenu_13.setForeground(Color.DARK_GRAY);
		mnNewMenu_13.setBackground(Color.WHITE);
		mnNewMenu_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ce projet a été réalisé par Bianca Fernandes Nascimento");
			}
		});
		mnNewMenu_13.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_3.add(mnNewMenu_13);
	}

	protected AbstractButton FileReader(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	//Ce sont des paramètres nécessaires pour que le panneau de défilement fonctionne comme je le souhaite
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	
}
