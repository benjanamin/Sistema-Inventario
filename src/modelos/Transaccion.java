package modelos;

import java.util.Date;

public class Transaccion {
	private int id;
	private Date fecha;
	private Producto producto;
	
	public Transaccion(int id, Date fecha, Producto producto) {
		this.id = id;
		this.fecha = fecha;
		this.producto = producto;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
