package br.ufc.quixada.springmvc;





import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TarefasController {
	
	@RequestMapping("novaTarefa")
	public String form() {
		return "tarefas/formulario";
	}
	
	@RequestMapping("adicionaTarefa")
	public String adiciona(@Valid Tarefa tarefa, BindingResult result) {
	
		if(result.hasFieldErrors("descricao")) {
			System.out.println("a");
			return "tarefas/formulario";
		}
			
		TarefaDAO dao = new TarefaDAO();
		dao.adiciona(tarefa);
		return "tarefas/adicionada";
	}
	

}
