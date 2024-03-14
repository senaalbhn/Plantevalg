package pojos.PostNyPlante.postRequest;

import java.io.Serializable;

public class Synonymspojo implements Serializable {
	private String plantSynonymLanguageId;
	private String name;
	private boolean isPrimary;
	private String id;

	public Synonymspojo() {
	}

	public Synonymspojo(String plantSynonymLanguageId, String name, boolean isPrimary, String id) {
		this.plantSynonymLanguageId = plantSynonymLanguageId;
		this.name = name;
		this.isPrimary = isPrimary;
		this.id = id;
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

	@Override
 	public String toString(){
		return 
			"Synonymspojo{" + 
			"plantSynonymLanguageId = '" + plantSynonymLanguageId + '\'' + 
			",name = '" + name + '\'' + 
			",isPrimary = '" + isPrimary + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}