package garden;

import garden.ReadPlant;

public class Status {

	private String nombre;
	private PlantStatus status;
	private String StatusPicture;
	
	public Status() {
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PlantStatus getStatus() {
		return status;
	}

	public void setStatus(PlantStatus status) {
		this.status = status;
	}

	public String getStatusPicture() {
		return StatusPicture;
	}

	public void setStatusPicture(String statusPicture) {
		StatusPicture = statusPicture;
	}
	
	
	
}
