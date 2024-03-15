package pojos.PostRedigerePlante.PatchRequest;

import java.util.List;
import java.io.Serializable;

public class PatchPojo implements Serializable {
	private boolean isEPlant;
	private String ePlantName;
	private List<SynonymsPojo> synonyms;
	private List<BotanicalNamesPojo> botanicalNames;
	private QualitiesPojo qualities;
	private String id;
	private boolean excludeFromSearchResults;

	public PatchPojo() {
	}

	public PatchPojo(boolean isEPlant, String ePlantName, List<SynonymsPojo> synonyms, List<BotanicalNamesPojo> botanicalNames, QualitiesPojo qualities, String id, boolean excludeFromSearchResults) {
		this.isEPlant = isEPlant;
		this.ePlantName = ePlantName;
		this.synonyms = synonyms;
		this.botanicalNames = botanicalNames;
		this.qualities = qualities;
		this.id = id;
		this.excludeFromSearchResults = excludeFromSearchResults;
	}

	public void setIsEPlant(boolean isEPlant){
		this.isEPlant = isEPlant;
	}

	public boolean isIsEPlant(){
		return isEPlant;
	}

	public void setEPlantName(String ePlantName){
		this.ePlantName = ePlantName;
	}

	public String getEPlantName(){
		return ePlantName;
	}

	public void setSynonyms(List<SynonymsPojo> synonyms){
		this.synonyms = synonyms;
	}

	public List<SynonymsPojo> getSynonyms(){
		return synonyms;
	}

	public void setBotanicalNames(List<BotanicalNamesPojo> botanicalNames){
		this.botanicalNames = botanicalNames;
	}

	public List<BotanicalNamesPojo> getBotanicalNames(){
		return botanicalNames;
	}

	public void setQualities(QualitiesPojo qualities){
		this.qualities = qualities;
	}

	public QualitiesPojo getQualities(){
		return qualities;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setExcludeFromSearchResults(boolean excludeFromSearchResults){
		this.excludeFromSearchResults = excludeFromSearchResults;
	}

	public boolean isExcludeFromSearchResults(){
		return excludeFromSearchResults;
	}

	@Override
 	public String toString(){
		return 
			"PatchPojo{" + 
			"isEPlant = '" + isEPlant + '\'' + 
			",ePlantName = '" + ePlantName + '\'' + 
			",synonyms = '" + synonyms + '\'' + 
			",botanicalNames = '" + botanicalNames + '\'' + 
			",qualities = '" + qualities + '\'' + 
			",id = '" + id + '\'' + 
			",excludeFromSearchResults = '" + excludeFromSearchResults + '\'' + 
			"}";
		}
}