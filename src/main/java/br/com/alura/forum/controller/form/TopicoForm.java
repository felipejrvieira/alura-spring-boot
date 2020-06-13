package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;

public class TopicoForm {

    @NotNull @NotEmpty @Length(min=5)
    private String titulo;
    @NotNull @NotEmpty @Length(min=5)
    private String mensagem;
    @NotNull @NotEmpty
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