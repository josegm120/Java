package com.politecnicomalaga.clinicadentista;

import java.text.Format;

public class Tratamiento {
	public enum AtributosTratamiento {CODIGO,DESCRIPCION,FECHA,PRECIO,COBRADO};
	
	protected String sCodigo;
	protected String sDescripcion;
	protected String sFecha;
	protected float fPrecio;
	protected boolean bCobrado;
	
	//Constructor
	public Tratamiento(String sCodigo, String sDescripcion, String sFecha, float fPrecio) {
		this.sCodigo = sCodigo;
		this.sDescripcion = sDescripcion;
		this.sFecha = sFecha;
		this.fPrecio = fPrecio;
		
		bCobrado = (fPrecio==0f);
	}

	//Getters y Setters
	public String getsCodigo() {
		return sCodigo;
	}

	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}

	public String getsDescripcion() {
		return sDescripcion;
	}

	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}

	public String getsFecha() {
		return sFecha;
	}

	public void setsFecha(String sFecha) {
		this.sFecha = sFecha;
	}

	public float getfPrecio() {
		return fPrecio;
	}

	public void setfPrecio(float fPrecio) {
		this.fPrecio = fPrecio;
	}
	
	public float cobrar() {
		this.bCobrado = true;
		return fPrecio;
	}
	
	public boolean estaCobrado() {
		return bCobrado;
	}
	
	public boolean compara(String campo, AtributosTratamiento at) {
		char comparador;
		String dato;
		switch (at) {
		case CODIGO: return this.sCodigo.contains(campo);
		case DESCRIPCION: return this.sDescripcion.contains(campo);
		case FECHA: return this.sFecha.contains(campo);
		case COBRADO: if (campo.equals("true")) return bCobrado;
					  else return !bCobrado; 
		case PRECIO: comparador = campo.charAt(0);
		      if (comparador == '>') {
		    	  dato = campo.substring(1);
		    	  return Double.parseDouble(dato)<fPrecio;
		      } else if (comparador == '<'){
		    	  dato = campo.substring(1);
		    	  return Double.parseDouble(dato)>fPrecio;
		      } else {
		    	  return Double.parseDouble(campo)==fPrecio;
		      }
			
		}
		
	    return false;
	}
	
	@Override
	public String toString() {
		return String.format("%6s#%30s#%10s#%4.2f# Cobrado: %b", sCodigo, sDescripcion, sFecha, fPrecio, bCobrado);
	}
	
}
