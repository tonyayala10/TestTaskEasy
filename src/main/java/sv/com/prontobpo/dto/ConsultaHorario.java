/**
 * 
 */
package sv.com.prontobpo.dto;

import java.util.Date;

/**
 * @author tony
 *
 */
public class ConsultaHorario {
	
	private String hora;
	private String tiempo;
	private Date fecha;
	
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
