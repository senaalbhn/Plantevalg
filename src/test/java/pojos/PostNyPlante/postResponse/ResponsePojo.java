package pojos.PostNyPlante.postResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePojo implements Serializable {
	private String id;
	private boolean deleted;
	private String createdDate;
	private String lastEditedDate;
	private QualitiesResponsePojo qualities;
	private List<SynonymsPojo> synonyms;
	private List<BotanicalNamesPojo> botanicalNames;
	private boolean isEPlant;
	private String ePlantName;
	private String primaryBotanicalName;

	public ResponsePojo() {
	}

	public ResponsePojo(String id, boolean deleted, String createdDate, String lastEditedDate, QualitiesResponsePojo qualities, List<SynonymsPojo> synonyms, List<BotanicalNamesPojo> botanicalNames, boolean isEPlant, String ePlantName, String primaryBotanicalName) {
		this.id = id;
		this.deleted = deleted;
		this.createdDate = createdDate;
		this.lastEditedDate = lastEditedDate;
		this.qualities = qualities;
		this.synonyms = synonyms;
		this.botanicalNames = botanicalNames;
		this.isEPlant = isEPlant;
		this.ePlantName = ePlantName;
		this.primaryBotanicalName = primaryBotanicalName;
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

	public void setLastEditedDate(String lastEditedDate){
		this.lastEditedDate = lastEditedDate;
	}

	public String getLastEditedDate(){
		return lastEditedDate;
	}

	public void setQualities(QualitiesResponsePojo qualities){
		this.qualities = qualities;
	}

	public QualitiesResponsePojo getQualities(){
		return qualities;
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

	public void setPrimaryBotanicalName(String primaryBotanicalName){
		this.primaryBotanicalName = primaryBotanicalName;
	}

	public String getPrimaryBotanicalName(){
		return primaryBotanicalName;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"id = '" + id + '\'' + 
			",deleted = '" + deleted + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",lastEditedDate = '" + lastEditedDate + '\'' + 
			",qualities = '" + qualities + '\'' + 
			",synonyms = '" + synonyms + '\'' + 
			",botanicalNames = '" + botanicalNames + '\'' + 
			",isEPlant = '" + isEPlant + '\'' + 
			",ePlantName = '" + ePlantName + '\'' + 
			",primaryBotanicalName = '" + primaryBotanicalName + '\'' + 
			"}";
		}
}