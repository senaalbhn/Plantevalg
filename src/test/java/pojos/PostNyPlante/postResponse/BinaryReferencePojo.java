package pojos.PostNyPlante.postResponse;

import java.io.Serializable;

public class BinaryReferencePojo implements Serializable {
	private String id;
	private boolean deleted;
	private String createdDate;
	private String mimeType;
	private String blobStorage;
	private String blobName;
	private String originalFileName;
	private String originalBinaryReferenceId;
	private String shortId;
	private String referenceType;

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

	public void setMimeType(String mimeType){
		this.mimeType = mimeType;
	}

	public String getMimeType(){
		return mimeType;
	}

	public void setBlobStorage(String blobStorage){
		this.blobStorage = blobStorage;
	}

	public String getBlobStorage(){
		return blobStorage;
	}

	public void setBlobName(String blobName){
		this.blobName = blobName;
	}

	public String getBlobName(){
		return blobName;
	}

	public void setOriginalFileName(String originalFileName){
		this.originalFileName = originalFileName;
	}

	public String getOriginalFileName(){
		return originalFileName;
	}

	public void setOriginalBinaryReferenceId(String originalBinaryReferenceId){
		this.originalBinaryReferenceId = originalBinaryReferenceId;
	}

	public String getOriginalBinaryReferenceId(){
		return originalBinaryReferenceId;
	}

	public void setShortId(String shortId){
		this.shortId = shortId;
	}

	public String getShortId(){
		return shortId;
	}

	public void setReferenceType(String referenceType){
		this.referenceType = referenceType;
	}

	public String getReferenceType(){
		return referenceType;
	}

	@Override
 	public String toString(){
		return 
			"BinaryReferencePojo{" + 
			"id = '" + id + '\'' + 
			",deleted = '" + deleted + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",mimeType = '" + mimeType + '\'' + 
			",blobStorage = '" + blobStorage + '\'' + 
			",blobName = '" + blobName + '\'' + 
			",originalFileName = '" + originalFileName + '\'' + 
			",originalBinaryReferenceId = '" + originalBinaryReferenceId + '\'' + 
			",shortId = '" + shortId + '\'' + 
			",referenceType = '" + referenceType + '\'' + 
			"}";
		}
}