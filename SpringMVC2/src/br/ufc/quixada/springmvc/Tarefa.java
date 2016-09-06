package br.ufc.quixada.springmvc;

import java.util.Calendar;

import javax.validation.constraints.NotNull;





public class Tarefa {
//sdasadsa
	//dsadsadas
	//Nova b	
	
	private Long id;
		
		@NotNull
		private String descricao;
		private boolean finalizado;
		private Calendar dataFinalizacao;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public boolean isFinalizado() {
			return finalizado;
		}
		public void setFinalizado(boolean finalizado) {
			this.finalizado = finalizado;
		}
		public Calendar getDataFinalizacao() {
			return dataFinalizacao;
		}
		public void setDataFinalizacao(Calendar dataFinalizacao) {
			this.dataFinalizacao = dataFinalizacao;
		}
		
		
}
