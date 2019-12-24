package conta.model;

import java.sql.Date;

/**
 * @author anita
 *
 */
public class Movimientos {
	public Movimientos(int numero,  Date fecha, int codigoCuenta, String concepto, float importe  ) {
		
	}
	protected int numero;
	protected Date fecha;
	protected int codigoCuenta;
	protected String concepto;
	protected float importe;
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCodigoCuenta() {
		return codigoCuenta;
	}

	public void setCodigoCuenta(int codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public void Ingreso(double cantidad) {
		this.importe = (float) (this.importe + cantidad);
	}
	
	public void Retiro(double cantidad ) {
		this.importe = (float) (this.importe - cantidad);
	}
}
