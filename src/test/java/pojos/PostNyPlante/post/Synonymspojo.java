package pojos.PostNyPlante.post;

import java.io.Serializable;

public class Synonymspojo implements Serializable {
	private String plantSynonymLanguageId;
	private String name;
	private String isPrimary;
	private String id;

	public Synonymspojo() {
	}

	public Synonymspojo(String plantSynonymLanguageId, String name, String isPrimary, String id) {
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

	public void setIsPrimary(String isPrimary){
		this.isPrimary = isPrimary;
	}

	public String getIsPrimary(){
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