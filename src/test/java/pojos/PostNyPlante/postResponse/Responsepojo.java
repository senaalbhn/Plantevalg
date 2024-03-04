package pojos.PostNyPlante.postResponse;

import java.util.List;
import java.io.Serializable;

public class Responsepojo implements Serializable {
	private Object lastEditedDate;
	private QualitiesResponsepojo qualities;
	private List<Object> synonyms;
	private List<BotanicalNamesResponsepojo> botanicalNames;
	private boolean isEPlant;
	private Object ePlantName;
	private String primaryBotanicalName;
	private String id;
	private boolean deleted;
	private String createdDate;

	public Responsepojo() {
	}

	public Responsepojo(Object lastEditedDate, QualitiesResponsepojo qualities, List<Object> synonyms, List<BotanicalNamesResponsepojo> botanicalNames, boolean isEPlant, Object ePlantName, String primaryBotanicalName, String id, boolean deleted, String createdDate) {
		this.lastEditedDate = lastEditedDate;
		this.qualities = qualities;
		this.synonyms = synonyms;
		this.botanicalNames = botanicalNames;
		this.isEPlant = isEPlant;
		this.ePlantName = ePlantName;
		this.primaryBotanicalName = primaryBotanicalName;
		this.id = id;
		this.deleted = deleted;
		this.createdDate = createdDate;
	}

	public void setLastEditedDate(Object lastEditedDate){
		this.lastEditedDate = lastEditedDate;
	}

	public Object getLastEditedDate(){
		return lastEditedDate;
	}

	public void setQualities(QualitiesResponsepojo qualities){
		this.qualities = qualities;
	}

	public QualitiesResponsepojo getQualities(){
		return qualities;
	}

	public void setSynonyms(List<Object> synonyms){
		this.synonyms = synonyms;
	}

	public List<Object> getSynonyms(){
		return synonyms;
	}

	public void setBotanicalNames(List<BotanicalNamesResponsepojo> botanicalNames){
		this.botanicalNames = botanicalNames;
	}

	public List<BotanicalNamesResponsepojo> getBotanicalNames(){
		return botanicalNames;
	}

	public void setIsEPlant(boolean isEPlant){
		this.isEPlant = isEPlant;
	}

	public boolean isIsEPlant(){
		return isEPlant;
	}

	public void setEPlantName(Object ePlantName){
		this.ePlantName = ePlantName;
	}

	public Object getEPlantName(){
		return ePlantName;
	}

	public void setPrimaryBotanicalName(String primaryBotanicalName){
		this.primaryBotanicalName = primaryBotanicalName;
	}

	public String getPrimaryBotanicalName(){
		return primaryBotanicalName;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setDeleted(boolean deleted){
		this.deleted = deleted;
	}

	public boolean isDeleted(){
		return deleted;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	@Override
 	public String toString(){
		return 
			"Responsepojo{" + 
			"lastEditedDate = '" + lastEditedDate + '\'' + 
			",qualities = '" + qualities + '\'' + 
			",synonyms = '" + synonyms + '\'' + 
			",botanicalNames = '" + botanicalNames + '\'' + 
			",isEPlant = '" + isEPlant + '\'' + 
			",ePlantName = '" + ePlantName + '\'' + 
			",primaryBotanicalName = '" + primaryBotanicalName + '\'' + 
			",id = '" + id + '\'' + 
			",deleted = '" + deleted + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			"}";
		}
}