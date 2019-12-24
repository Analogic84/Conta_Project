package conta.model;

import java.io.Serializable;

/**
 * @author anita
 *
 */
public class Cuenta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	//definicion atributos
	 private int idMyConta;
	 private String descripcion;
	 private float saldo;
	 
	 //Constructor
	 public Cuenta(int numero, String descripcion,double saldo) {
		 this.idMyConta = numero;
		 this.descripcion = descripcion;
		 this.saldo = (float) saldo;
	 }
	public int getNumero() {
		return idMyConta;
	}
	public void setNumero(int numero) {
		this.idMyConta = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cuenta() {
		
	}
	
	
	
	
}
