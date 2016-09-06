package br.ufc.quixada.springmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TarefaDAO {
	
	public void adiciona(Tarefa tarefa){
		System.out.println(tarefa.getDescricao());
		
		
	}
	
	 public Connection getConnection() {
	     try {
	         return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	 

}
