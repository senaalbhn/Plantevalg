package pojos.PostNyPlante.postRequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Postpojo implements Serializable {
	private boolean isEPlant;
	private String ePlantName;
	private List<Synonymspojo> synonyms;
	private List<BotanicalNamespojo> botanicalNames;
	private Qualitiespojo qualities;

	public Postpojo() {
	}

	public Postpojo(boolean isEPlant, String ePlantName,List<Synonymspojo> synonyms,List<BotanicalNamespojo> botanicalNames, Qualitiespojo qualities) {
		this.isEPlant = isEPlant;
		this.ePlantName = ePlantName;
		this.synonyms= synonyms;
		this.botanicalNames = botanicalNames;
		this.qualities = qualities;
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

	public void setSynonyms(List<Synonymspojo> synonyms){
		this.synonyms = synonyms;
	}

	public List<Synonymspojo> getSynonyms(){
		return synonyms;
	}

	public void setBotanicalNames(List<BotanicalNamespojo> botanicalNames){
		this.botanicalNames = botanicalNames;
	}

	public List<BotanicalNamespojo> getBotanicalNames(){
		return botanicalNames;
	}

	public void setQualities(Qualitiespojo qualities){
		this.qualities = qualities;
	}

	public Qualitiespojo getQualities(){
		return qualities;
	}

	@Override
 	public String toString(){
		return 
			"Postpojo{" + 
			"isEPlant = '" + isEPlant + '\'' + 
			",ePlantName = '" + ePlantName + '\'' + 
			",synonyms = '" + synonyms + '\'' + 
			",botanicalNames = '" + botanicalNames + '\'' + 
			",qualities = '" + qualities + '\'' + 
			"}";
		}
}