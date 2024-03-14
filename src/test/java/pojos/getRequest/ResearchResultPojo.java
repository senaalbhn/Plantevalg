package pojos.getRequest;

import java.util.List;
import java.io.Serializable;

public class ResearchResultPojo implements Serializable {
	private String id;
	private String summary;
	private String locations;
	private boolean deleted;
	private String createdDate;
	private List<ReferencesPojo> references;

	public ResearchResultPojo() {
	}

	public ResearchResultPojo(List<ReferencesPojo> references) {
		this.references = references;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setLocations(String locations){
		this.locations = locations;
	}

	public String getLocations(){
		return locations;
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

	public void setReferences(List<ReferencesPojo> references){
		this.references = references;
	}

	public List<ReferencesPojo> getReferences(){
		return references;
	}

	@Override
 	public String toString(){
		return 
			"ResearchResultPojo{" + 
			"id = '" + id + '\'' + 
			",summary = '" + summary + '\'' + 
			",locations = '" + locations + '\'' + 
			",deleted = '" + deleted + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",references = '" + references + '\'' + 
			"}";
		}
}