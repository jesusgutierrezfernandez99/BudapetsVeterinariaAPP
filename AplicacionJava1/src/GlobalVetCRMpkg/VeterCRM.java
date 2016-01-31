package GlobalVetCRMpkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class VeterCRM {

	private JFrame frameAppIni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VeterCRM window = new VeterCRM();
					window.frameAppIni.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VeterCRM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAppIni = new JFrame();
		frameAppIni.setTitle("VeterCRM");
		frameAppIni.setBounds(100, 100, 703, 467);
		frameAppIni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAppIni.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 212, 21);
		frameAppIni.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Buscar");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Clientes");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String resultado ="Ni clase ni na";
				execQuery pruebaConexion = new execQuery();
				try {
					resultado=pruebaConexion.muestraConexion();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(resultado);
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				String resultado ="Ni clase ni na";
				execQuery pruebaConexion = new execQuery();
				try {
					resultado=pruebaConexion.muestraConexion();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(resultado);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Acciones");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Facturar");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Catalogo");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Farmacos");
		mnNewMenu_2.add(mntmNewMenuItem_1);
	}
}
