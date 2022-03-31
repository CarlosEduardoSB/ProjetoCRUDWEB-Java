package bean;

import javax.faces.bean.ManagedBean;

import entidade.Sobremesa;

@ManagedBean
public class SobremesaBean {
	private Sobremesa sobremesa = new Sobremesa();

	public String salvar() {
		System.out.println(sobremesa.getNome());
		System.out.println(sobremesa.getIngredientes());
		System.out.println(sobremesa.getModoDePreparo());
		System.out.println(sobremesa.getServeQtsPessoas());
		System.out.println(sobremesa.getTipo());
		System.out.println(sobremesa.getDataCadastro());
		return null;
	}

	public Sobremesa getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(Sobremesa sobremesa) {
		this.sobremesa = sobremesa;
	}

}
