package pojos.getRequest;

import java.io.Serializable;

public class SynonymsPojo implements Serializable {
	private String plantSynonymLanguageId;
	private String name;
	private boolean isPrimary;
	private String id;
	private String plantId;

	public SynonymsPojo() {
	}

	public SynonymsPojo(String name, boolean isPrimary, String plantId) {
		this.name = name;
		this.isPrimary = isPrimary;
		this.plantId = plantId;
	}

	public void setPlantSynonymLanguageId(String plantSynonymLanguageId){
		this.plantSynonymLanguageId = plantSynonymLanguageId;
	}

	public String getPlantSynonymLanguageId(){
		return plantSynonymLanguageId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIsPrimary(boolean isPrimary){
		this.isPrimary = isPrimary;
	}

	public boolean isIsPrimary(){
		return isPrimary;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPlantId(String plantId){
		this.plantId = plantId;
	}

	public String getPlantId(){
		return plantId;
	}

	@Override
 	public String toString(){
		return 
			"SynonymsPojo{" + 
			"plantSynonymLanguageId = '" + plantSynonymLanguageId + '\'' + 
			",name = '" + name + '\'' + 
			",isPrimary = '" + isPrimary + '\'' + 
			",id = '" + id + '\'' + 
			",plantId = '" + plantId + '\'' + 
			"}";
		}
}