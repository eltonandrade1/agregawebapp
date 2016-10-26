package br.com.sysagrega.model.imp;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import br.com.sysagrega.model.IDadosBancarios;
import br.com.sysagrega.model.IEndereco;
import br.com.sysagrega.model.IFornecedor;

@Entity
@Table(name = "TB_FORNECEDOR")
public class Fornecedor implements IFornecedor{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeFantasia;
	
	private String cnpj;
	
	private String razaoSocial;
	
	private String ramoAtividade;
	
	private String pessoaContato;
	
	private String email;
	
	private String celular;
	
	private String telefone;
	
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	private String iscricaoEstadual;
	
	private String iscricaoMunicipal;
	
	@OneToOne(targetEntity = Endereco.class, cascade = CascadeType.ALL)
	private IEndereco endereco;
	
	@OneToOne(targetEntity = DadosBancarios.class, cascade = CascadeType.ALL)
	private IDadosBancarios dadosBancarios;
	
	@Transient
	@Override
	public boolean isNovo() {
		return getId() == null;
	}
	
	@Transient
	@Override
	public boolean isExistente() {
		return !isNovo();
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;		
	}

	@Override
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	@Override
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@Override
	public String getRazaoSocial() {
		return razaoSocial;
	}

	@Override
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public String getRamoAtividade() {
		return ramoAtividade;
	}

	@Override
	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	@Override
	public String getPessoaContato() {
		return pessoaContato;
	}

	@Override
	public void setPessoaContato(String pessoaContato) {
		this.pessoaContato = pessoaContato;
	}
	
	@Override
	public String getEmail() {
		return email;
	}
	
	@Override
	public void setEmail(String email) {
		this.email = email;
		
	}

	@Override
	public String getCelular() {
		return celular;
	}
	
	@Override
	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String getTelefone() {
		return telefone;
	}
	
	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	@Override
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String getIscricaoEstadual() {
		return iscricaoEstadual;
	}
	
	@Override
	public void setIscricaoEstadual(String iscricaoEstadual) {
		this.iscricaoEstadual = iscricaoEstadual;
	}

	@Override
	public String getIscricaoMunicipal() {
		return iscricaoMunicipal;
	}
	
	@Override
	public void setIscricaoMunicipal(String iscricaoMunicipal) {
		this.iscricaoMunicipal = iscricaoMunicipal;
	}

	@Override
	public String getCnpj() {
		return cnpj;
		
	}
	
	@Override
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public IEndereco getEndereco() {
		return endereco;
	}

	@Override
	public void setEndereco(IEndereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public IDadosBancarios getDadosBancarios() {
		return dadosBancarios;
	}
	
	@Override
	public void setDadosBancarios(IDadosBancarios dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		result = prime * result + ((ramoAtividade == null) ? 0 : ramoAtividade.hashCode());
		result = prime * result + ((pessoaContato == null) ? 0 : pessoaContato.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((iscricaoEstadual == null) ? 0 : iscricaoEstadual.hashCode());
		result = prime * result + ((iscricaoMunicipal == null) ? 0 : iscricaoMunicipal.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((dadosBancarios == null) ? 0 : dadosBancarios.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Fornecedor))
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (ramoAtividade == null) {
			if (other.ramoAtividade != null)
				return false;
		} else if (!ramoAtividade.equals(other.ramoAtividade))
			return false;
		if (pessoaContato == null) {
			if (other.pessoaContato != null)
				return false;
		} else if (!pessoaContato.equals(other.pessoaContato))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (iscricaoEstadual == null) {
			if (other.iscricaoEstadual != null)
				return false;
		} else if (!iscricaoEstadual.equals(other.iscricaoEstadual))
			return false;
		if (iscricaoMunicipal == null) {
			if (other.iscricaoMunicipal != null)
				return false;
		} else if (!iscricaoMunicipal.equals(other.iscricaoMunicipal))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (dadosBancarios == null) {
			if (other.dadosBancarios != null)
				return false;
		} else if (!dadosBancarios.equals(other.dadosBancarios))
			return false;
		return true;
	}
	

}
