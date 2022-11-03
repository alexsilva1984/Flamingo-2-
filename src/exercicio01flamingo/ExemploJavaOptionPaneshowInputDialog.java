package exercicio01flamingo;

import javax.swing.*;  
public class ExemploJavaOptionPaneshowInputDialog {  
JFrame f;  
ExemploJavaOptionPaneshowInputDialog(){  
    f=new JFrame();   
    @SuppressWarnings("unused")
	String name = JOptionPane.showInputDialog(f,"Enter Name");      
}  
public static void main(String[] args) {  
    new ExemploJavaOptionPaneshowInputDialog();  
}  
}  