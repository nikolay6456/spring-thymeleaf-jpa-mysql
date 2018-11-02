package br.com.tt.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "tbl_cliente") //Define o nome da tabela que será criada no banco de dados
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY) //Definevo Auto Incremento
	private Long id;
	
	@Column(nullable = false, length = 150) //Define propriedades da coluna
	@NotBlank(message = "Nome é uma informação obrigatória.") //Define qual mensagem será exibida caso a validação da coluna falhar
	private String nome;
	
	@Column(nullable = false, length = 11)
	@NotBlank(message = "CPF é uma informação obrigatória.")
	private String cpf;
	
	@Column(nullable = false)
	@Lob
	@NotBlank(message = "Texto é uma informação obrigatória.")
	private String texto;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Data é uma informação obrigatória.")
	private Date data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
