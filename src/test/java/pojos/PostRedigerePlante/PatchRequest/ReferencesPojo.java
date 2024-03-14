package pojos.PostRedigerePlante.PatchRequest;

import java.io.Serializable;

public class ReferencesPojo implements Serializable {
	private String id;
	private boolean mainReference;
	private String lastNameAndInitials;
	private String title;
	private int year;
	private int fromPage;
	private int toPage;
	private String isbn;
	private String publisherOrCompany;
	private String publicUrl;
	private String referencedDate;
	private String researchResultId;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setMainReference(boolean mainReference){
		this.mainReference = mainReference;
	}

	public boolean isMainReference(){
		return mainReference;
	}

	public void setLastNameAndInitials(String lastNameAndInitials){
		this.lastNameAndInitials = lastNameAndInitials;
	}

	public String getLastNameAndInitials(){
		return lastNameAndInitials;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setFromPage(int fromPage){
		this.fromPage = fromPage;
	}

	public int getFromPage(){
		return fromPage;
	}

	public void setToPage(int toPage){
		this.toPage = toPage;
	}

	public int getToPage(){
		return toPage;
	}

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	public String getIsbn(){
		return isbn;
	}

	public void setPublisherOrCompany(String publisherOrCompany){
		this.publisherOrCompany = publisherOrCompany;
	}

	public String getPublisherOrCompany(){
		return publisherOrCompany;
	}

	public void setPublicUrl(String publicUrl){
		this.publicUrl = publicUrl;
	}

	public String getPublicUrl(){
		return publicUrl;
	}

	public void setReferencedDate(String referencedDate){
		this.referencedDate = referencedDate;
	}

	public String getReferencedDate(){
		return referencedDate;
	}

	public void setResearchResultId(String researchResultId){
		this.researchResultId = researchResultId;
	}

	public String getResearchResultId(){
		return researchResultId;
	}

	@Override
 	public String toString(){
		return 
			"ReferencesPojo{" + 
			"id = '" + id + '\'' + 
			",mainReference = '" + mainReference + '\'' + 
			",lastNameAndInitials = '" + lastNameAndInitials + '\'' + 
			",title = '" + title + '\'' + 
			",year = '" + year + '\'' + 
			",fromPage = '" + fromPage + '\'' + 
			",toPage = '" + toPage + '\'' + 
			",isbn = '" + isbn + '\'' + 
			",publisherOrCompany = '" + publisherOrCompany + '\'' + 
			",publicUrl = '" + publicUrl + '\'' + 
			",referencedDate = '" + referencedDate + '\'' + 
			",researchResultId = '" + researchResultId + '\'' + 
			"}";
		}
}