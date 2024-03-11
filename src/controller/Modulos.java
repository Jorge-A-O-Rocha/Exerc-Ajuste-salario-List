package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidade.Funcionario;

public class Modulos {
	List<Funcionario> list = new ArrayList<>();
	
	public void cadastrarFuncionario(int x){
		
		for(int i= 0;i< x;i++) {
			
			Funcionario func = new Funcionario();
						
			int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do funcionário"));
			func.setId(id);
			
			while (conferirId(id) != true ) {
				id = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do funcionário"));
				func.setId(id);
			}
			
			String nome = JOptionPane.showInputDialog("Insira o nome do funcioário");
			func.setNome(nome);
			
			float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário do funcionário"));
			func.setSalario(salario);	
			
			list.add(func);
		}
		
	}
		
	public void aumentarSalario(int cod, float aumento) {
		
		Funcionario fun = list.stream().filter(x -> x.getId() == cod).findFirst().orElse(null);
		
		if(fun == null) {
			JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
		}else {
			fun.setSalario(fun.getSalario() + (fun.getSalario()*aumento)/100 );
		}
	
	}
	
	private boolean conferirId(int index) {
		
		Funcionario fun = list.stream().filter(x -> x.getId() == index).findFirst().orElse(null);
		
		if (fun == null) {
		return true;
		}else {
			return false;
		}	
	}
	
	public void listar() {
		for(Funcionario li : list) {
			System.out.println(li);
		}
	}

}
