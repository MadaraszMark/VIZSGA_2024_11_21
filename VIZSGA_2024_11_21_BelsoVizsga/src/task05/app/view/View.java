package task05.app.view;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import task05.app.dao.MotorCycleDao;
import task05.app.entity.MotorCycle;
import java.awt.Font;

public class View extends JFrame {

	private JPanel contentPane;
	private JTable tableMotorcycles;
	private JScrollPane scrollPane;

	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                View frame = new View();
	                
	                // Adatbázisból motoros adatok betöltése
	                MotorCycleDao motorCycleDao = new MotorCycleDao();
	                List<MotorCycle> motorCycles = motorCycleDao.getAll();
	                
	                // Adatok megjelenítése a JTable-ban
	                frame.setMotorCyclesTableData(motorCycles);
	                
	                frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}

	public View() {
		setTitle("Motorkerékpárok");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1396, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(88, 63, 1190, 337);
		contentPane.add(scrollPane);
		
		tableMotorcycles = new JTable();
		tableMotorcycles.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(tableMotorcycles);
	}
	
	public void setTableCellCenter() {
	    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
	    renderer.setHorizontalAlignment(JLabel.CENTER);
	    
	    for (int i = 0; i < tableMotorcycles.getColumnCount(); i++) {
	        tableMotorcycles.getColumnModel().getColumn(i).setCellRenderer(renderer);
	    }
	}

	public void setMotorCyclesTableData(List<MotorCycle> motorCycles) {
	    DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("ID");
	    model.addColumn("Gyártó");
	    model.addColumn("Modell");
	    model.addColumn("Kategória");
	    model.addColumn("Állapot");

	    for (MotorCycle motorCycle : motorCycles) {
	        model.addRow(new Object[] {
	            motorCycle.getId(),
	            motorCycle.getManufacturer(),
	            motorCycle.getModel(),
	            motorCycle.getCategory().getName(),
	            motorCycle.getStatus() ? "Aktív" : "Inaktív"
	        });
	    }
	    
	    tableMotorcycles.setModel(model);
	    tableMotorcycles.setRowHeight(30);
	    setTableCellCenter();
	}

}
