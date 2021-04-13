package entities;

public class Sorvete {

	private Integer id;
	private String sabor;
	private String tipo;
	private Double valor;

	public Sorvete(Integer id, String sabor, String tipo, Double valor) {
		super();
		this.id = id;
		this.sabor = sabor;
		this.tipo = tipo;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", SABOR: " + sabor.toUpperCase() + ", TIPO: " 
	+ tipo.toUpperCase() + ", VALOR: " + valor + "]";
	}

	

}