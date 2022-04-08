package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Sobremesa {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(name = "nome_sobremesa" , nullable = false)
	private String nome;
	@Column(name = "ingredientes" , nullable = false)
	private String ingredientes;
	@Column(name = "modopreparo_sobremesa" , nullable = false)
	private String modoDePreparo;
	@Column(name = "serveqts_pessoas" , nullable = false)
	private Integer serveQtsPessoas;
	@Column(name = "tipo_sobremesa" , nullable = false)
	private String tipo;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro" , nullable = false)
	private Date dataCadastro;
	
	@Override
	public String toString() {
		return "Sobremesa - id=" + id + ", nome=" + nome + ", ingredientes=" + ingredientes + ", modoDePreparo="
				+ modoDePreparo + ", serveQtsPessoas=" + serveQtsPessoas + ", tipo=" + tipo + ", dataCadastro="
				+ dataCadastro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getModoDePreparo() {
		return modoDePreparo;
	}

	public void setModoDePreparo(String modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}

	public Integer getServeQtsPessoas() {
		return serveQtsPessoas;
	}

	public void setServeQtsPessoas(Integer serveQtsPessoas) {
		this.serveQtsPessoas = serveQtsPessoas;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
