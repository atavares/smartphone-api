package com.vivo.smartphoneapi.form;

import java.math.BigDecimal;

import com.vivo.smartphoneapi.model.SmartPhone;



public class SmartPhoneForm {
	
	private String marca;
	private String modelo;
	private BigDecimal preco;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public SmartPhone converter(SmartPhoneForm form) {
		SmartPhone sp = new SmartPhone();
		sp.setMarca(form.getMarca());
		sp.setModelo(form.getModelo());
		sp.setPreco(form.getPreco());
		
		return sp;
	}

}
