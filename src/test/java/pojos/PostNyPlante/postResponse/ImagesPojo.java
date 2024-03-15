package pojos.PostNyPlante.postResponse;

import java.io.Serializable;

public class ImagesPojo implements Serializable {
	private String binaryReferenceId;
	private String metaDataEntityId;
	private String imageSizeType;

	public void setBinaryReferenceId(String binaryReferenceId){
		this.binaryReferenceId = binaryReferenceId;
	}

	public String getBinaryReferenceId(){
		return binaryReferenceId;
	}

	public void setMetaDataEntityId(String metaDataEntityId){
		this.metaDataEntityId = metaDataEntityId;
	}

	public String getMetaDataEntityId(){
		return metaDataEntityId;
	}

	public void setImageSizeType(String imageSizeType){
		this.imageSizeType = imageSizeType;
	}

	public String getImageSizeType(){
		return imageSizeType;
	}

	@Override
 	public String toString(){
		return 
			"ImagesPojo{" + 
			"binaryReferenceId = '" + binaryReferenceId + '\'' + 
			",metaDataEntityId = '" + metaDataEntityId + '\'' + 
			",imageSizeType = '" + imageSizeType + '\'' + 
			"}";
		}
}