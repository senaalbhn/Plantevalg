package pojos.PostNyPlante.post;

import java.util.List;
import java.io.Serializable;

public class PostPlantepojo implements Serializable {
	private String isEPlant;
	private String ePlantName;
	private List<Synonymspojo> synonyms;
	private List<BotanicalNamespojo> botanicalNames;
	private Qualitiespojo qualities;

	public PostPlantepojo() {
	}

	public PostPlantepojo(String isEPlant, String ePlantName, List<BotanicalNamespojo> botanicalNames, Qualitiespojo qualities) {
		this.isEPlant = isEPlant;
		this.ePlantName = ePlantName;
		this.botanicalNames = botanicalNames;
		this.qualities = qualities;
	}

	public void setIsEPlant(String isEPlant){
		this.isEPlant = isEPlant;
	}

	public String getIsEPlant(){
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
			"PostPlantepojo{" + 
			"isEPlant = '" + isEPlant + '\'' + 
			",ePlantName = '" + ePlantName + '\'' + 
			",synonyms = '" + synonyms + '\'' + 
			",botanicalNames = '" + botanicalNames + '\'' + 
			",qualities = '" + qualities + '\'' + 
			"}";
		}
}