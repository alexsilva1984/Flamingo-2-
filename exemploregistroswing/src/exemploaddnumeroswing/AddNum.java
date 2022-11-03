package exemploaddnumeroswing;

import java.awt.FlowLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.TableColumn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings({ "serial", "unused" })
public class AddNum extends JFrame implements ActionListener {

	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;
	
	public AddNum() {
		super("Adicione Numeros");
		
		l1 = new JLabel (  "Digite o primeiro valor");
		
		l2 = new JLabel (  "Digite o segundo valor");
		
		l3 = new JLabel (  "Resultado");
		
		
		t1 = new JTextField (10);
	
		t2 = new JTextField (10);
		
		t3 = new JTextField (10);
		
		b1 = new JButton ( "Add" );
		setLayout(new FlowLayout(FlowLayout.LEFT ));
		
		
		add (l1);
		add (t1);
		add (l2);
		add (t2);
		add (l3);
		add (t3);
		
		add (b1);
		
		b1.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		int soma = x+y;
		t3.setText(String.valueOf(soma));
			
	}
	
	public static void main ( String[] args ) {
		new AddNum();
		
	}

	}

