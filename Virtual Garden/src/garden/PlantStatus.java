package garden;

public enum PlantStatus {

	almacigo(0), joven(1), adulta(2), muerta(3);
	
	private int stage;
	
	PlantStatus(int pStage) {
		
		stage = pStage;
	}
	
	public int getStage() {
		
		return stage;	
	}
	
}
