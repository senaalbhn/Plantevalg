package pojos.getRequest;

import java.util.List;
import java.io.Serializable;

public class FlowerOneOrMoreColorsPojo implements Serializable {
	private String id;
	private boolean deleted;
	private int sortIndex;
	private String tag;
	private List<String> enabledForTags;
	private List<String> disabledForTags;
	private String createdDate;
	private List<NamePojo> name;
	private List<ImagesPojo> images;

	public FlowerOneOrMoreColorsPojo() {
	}

	public FlowerOneOrMoreColorsPojo(List<NamePojo> name) {
		this.name = name;
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

	public void setSortIndex(int sortIndex){
		this.sortIndex = sortIndex;
	}

	public int getSortIndex(){
		return sortIndex;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return tag;
	}

	public void setEnabledForTags(List<String> enabledForTags){
		this.enabledForTags = enabledForTags;
	}

	public List<String> getEnabledForTags(){
		return enabledForTags;
	}

	public void setDisabledForTags(List<String> disabledForTags){
		this.disabledForTags = disabledForTags;
	}

	public List<String> getDisabledForTags(){
		return disabledForTags;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setName(List<NamePojo> name){
		this.name = name;
	}

	public List<NamePojo> getName(){
		return name;
	}

	public void setImages(List<ImagesPojo> images){
		this.images = images;
	}

	public List<ImagesPojo> getImages(){
		return images;
	}

	@Override
 	public String toString(){
		return 
			"FlowerOneOrMoreColorsPojo{" + 
			"id = '" + id + '\'' + 
			",deleted = '" + deleted + '\'' + 
			",sortIndex = '" + sortIndex + '\'' + 
			",tag = '" + tag + '\'' + 
			",enabledForTags = '" + enabledForTags + '\'' + 
			",disabledForTags = '" + disabledForTags + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",name = '" + name + '\'' + 
			",images = '" + images + '\'' + 
			"}";
		}
}