package bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.SobremesaDAO;
import entidade.Sobremesa;

@ManagedBean
public class SobremesaBean {
	private Sobremesa sobremesa = new Sobremesa();
	private List<Sobremesa> listaSobremesas;

	public void salvar() {
		SobremesaDAO.salvar(sobremesa);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Solicitação Bem-Sucedido", "Sobremesa Registrada com Sucesso!"));
	}

	public void excluir() {
		try {
			SobremesaDAO.excluir(sobremesa);
			listaSobremesas.remove(sobremesa);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, 
				"Solicitação Bem-Sucedido", "Sobremesa Excluída com Sucesso!"));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Solicitação Mal-Sucedida", "Erro em Excluir Sobremesa!"));
		}
	}	

	public void editar() {
		SobremesaDAO.editar(sobremesa);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, 
				"Solicitação Bem-Sucedido","Sobremesa Editada com Sucesso"));
	}
	

	public void contar() {
		Long contador = SobremesaDAO.contar();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Solicitação Bem-Sucedido", "Existem " + contador + " Sobremesas Registradas!"));
	}

	public Sobremesa getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(Sobremesa sobremesa) {
		this.sobremesa = sobremesa;
	}
	
	public List<Sobremesa> getlistaSobremesas() {

		if (listaSobremesas == null) {
			listaSobremesas = SobremesaDAO.listar();
		}

		return listaSobremesas;
	}

	public void setlistaSobremesas(List<Sobremesa> listaSobremesas) {
		this.listaSobremesas = listaSobremesas;
	}

}
