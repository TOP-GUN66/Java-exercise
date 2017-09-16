package jishiben;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Notepad extends JFrame implements ActionListener {
	JTextArea jta = null;
     JMenuBar jmb =null;
     JMenu jm1 = null;
     JMenuItem jmi1 = null; 
     JMenuItem jmi2 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Notepad np = new Notepad();
	}
	public Notepad(){
		jta = new JTextArea();
		jmb  =new JMenuBar();
		jm1 = new JMenu("File");
		jm1.setMnemonic('F');
		jmi1=new JMenuItem("Open",new ImageIcon("bomb_1.gif"));
		jmi1.addActionListener(this);
		jmi1.setActionCommand("open");
		jmi2 = new JMenuItem("Save");
		jmi2.addActionListener(this);
		jmi2.setActionCommand("save");
		
		
		this.setJMenuBar(jmb);
		jmb.add(jm1);
		jm1.add(jmi1);
		jm1.add(jmi2);
		this.add(jta);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("open")){
			//System.out.println("OPEN");
			JFileChooser jfc1 = new JFileChooser();
			jfc1.setDialogTitle("请选择文件");
			jfc1.showOpenDialog(null);
			jfc1.setVisible(true);
			
			String filename = jfc1.getSelectedFile().getAbsolutePath();
			//System.out.println(filename);
			FileReader fr = null;
			BufferedReader br = null;
			
			
			try {
				fr = new FileReader(filename);
				br = new BufferedReader(fr);
				
				String s ="";
				String allCon = "";
				while((s=br.readLine())!=null){
					allCon+=s+"\r\n";
				}
				jta.setText(allCon);
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				try {
					br.close();
					fr.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
			
		}
		else if(arg0.getActionCommand().equals("save")){
			
			JFileChooser jfc = new JFileChooser();
			jfc.setDialogTitle("另存为");
			jfc.showSaveDialog(null);
			jfc.setVisible(true);
			
			String file = jfc.getSelectedFile().getAbsolutePath();
			FileWriter fw =null;
			BufferedWriter bw=null;
			try {
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				
				bw.write(this.jta.getText());
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				try {
					bw.close();
					fw.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
		}
	}

}
