package view;

import javax.swing.JOptionPane;

import controller.ControllerInverte;


public class Principal {

	public static void main(String[] args) {
		ControllerInverte si = new ControllerInverte();
		String string = JOptionPane.showInputDialog(null, "Insira uma String");
		
		String resultado = si.inverter(string, string.length());
		System.out.println(resultado);
	}
	
}