package fronteira;

import javax.swing.JOptionPane;

import controller.Modulos;



public class Main {

	public static void main(String[] args) {
		
		Modulos mod = new Modulos();
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Funcionários a ser inserido"));
		
		mod.cadastrarFuncionario(x);
		
		mod.listar();
		
		int y = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do funcionário a receber o aumento"));
		float z = Float.parseFloat(JOptionPane.showInputDialog("Insira a porcentagem que deve ser acrecentada no salário \n"));
		
		mod.aumentarSalario(y, z);
		
		mod.listar();
	
	}

}
