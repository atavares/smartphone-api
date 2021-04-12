package com.vivo.smartphoneapi.dto;

import java.math.BigDecimal;

import com.vivo.smartphoneapi.model.SmartPhone;

public class SmartPhoneDto {
	
	private String marca;
	private String modelo;
	private BigDecimal preco;
	
	public SmartPhoneDto(SmartPhone smartPhone) {
		this.marca = smartPhone.getMarca();
		this.modelo = smartPhone.getModelo();
		this.preco = smartPhone.getPreco();
	}
	
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
	
	
}
