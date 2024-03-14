package pojos.PostRedigerePlante.PatchRequest;

import java.io.Serializable;

public class ResearchResultMappingsPojo implements Serializable {
	private String id;
	private String plantId;
	private String summary;
	private String researchResultId;
	private ResearchResultPojo researchResult;

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

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setResearchResultId(String researchResultId){
		this.researchResultId = researchResultId;
	}

	public String getResearchResultId(){
		return researchResultId;
	}

	public void setResearchResult(ResearchResultPojo researchResult){
		this.researchResult = researchResult;
	}

	public ResearchResultPojo getResearchResult(){
		return researchResult;
	}

	@Override
 	public String toString(){
		return 
			"ResearchResultMappingsPojo{" + 
			"id = '" + id + '\'' + 
			",plantId = '" + plantId + '\'' + 
			",summary = '" + summary + '\'' + 
			",researchResultId = '" + researchResultId + '\'' + 
			",researchResult = '" + researchResult + '\'' + 
			"}";
		}
}