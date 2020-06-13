package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;

public class TopicoForm {
    private String titulo;
    private String mensagem;
    private String nomeCurso;

    public String getMensagem() {
        return mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

	public Topico converter(CursoRepository repository) {
        return new Topico(titulo, mensagem, repository.findByNome(nomeCurso) );
	}
    
}