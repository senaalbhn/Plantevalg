package pojos.getRequest;

import java.util.List;
import java.io.Serializable;

public class PlantImagesPojo implements Serializable {
	private String id;
	private String imageTypeId;
	private String photographer;
	private String source;
	private String notice;
	private int latitude;
	private int longitude;
	private String location;
	private String postalCode;
	private String city;
	private String binaryReferenceId;
	private String createdDate;
	private boolean deleted;
	private ImageTypePojo imageType;
	private BinaryReferencePojo binaryReference;
	private String imageSizeType;
	private String originalPlantImageId;
	private List<String> derivedImages;
	private boolean published;
	private boolean isMainImageForPlant;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setImageTypeId(String imageTypeId){
		this.imageTypeId = imageTypeId;
	}

	public String getImageTypeId(){
		return imageTypeId;
	}

	public void setPhotographer(String photographer){
		this.photographer = photographer;
	}

	public String getPhotographer(){
		return photographer;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setNotice(String notice){
		this.notice = notice;
	}

	public String getNotice(){
		return notice;
	}

	public void setLatitude(int latitude){
		this.latitude = latitude;
	}

	public int getLatitude(){
		return latitude;
	}

	public void setLongitude(int longitude){
		this.longitude = longitude;
	}

	public int getLongitude(){
		return longitude;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setBinaryReferenceId(String binaryReferenceId){
		this.binaryReferenceId = binaryReferenceId;
	}

	public String getBinaryReferenceId(){
		return binaryReferenceId;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setDeleted(boolean deleted){
		this.deleted = deleted;
	}

	public boolean isDeleted(){
		return deleted;
	}

	public void setImageType(ImageTypePojo imageType){
		this.imageType = imageType;
	}

	public ImageTypePojo getImageType(){
		return imageType;
	}

	public void setBinaryReference(BinaryReferencePojo binaryReference){
		this.binaryReference = binaryReference;
	}

	public BinaryReferencePojo getBinaryReference(){
		return binaryReference;
	}

	public void setImageSizeType(String imageSizeType){
		this.imageSizeType = imageSizeType;
	}

	public String getImageSizeType(){
		return imageSizeType;
	}

	public void setOriginalPlantImageId(String originalPlantImageId){
		this.originalPlantImageId = originalPlantImageId;
	}

	public String getOriginalPlantImageId(){
		return originalPlantImageId;
	}

	public void setDerivedImages(List<String> derivedImages){
		this.derivedImages = derivedImages;
	}

	public List<String> getDerivedImages(){
		return derivedImages;
	}

	public void setPublished(boolean published){
		this.published = published;
	}

	public boolean isPublished(){
		return published;
	}

	public void setIsMainImageForPlant(boolean isMainImageForPlant){
		this.isMainImageForPlant = isMainImageForPlant;
	}

	public boolean isIsMainImageForPlant(){
		return isMainImageForPlant;
	}

	@Override
 	public String toString(){
		return 
			"PlantImagesPojo{" + 
			"id = '" + id + '\'' + 
			",imageTypeId = '" + imageTypeId + '\'' + 
			",photographer = '" + photographer + '\'' + 
			",source = '" + source + '\'' + 
			",notice = '" + notice + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",location = '" + location + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",city = '" + city + '\'' + 
			",binaryReferenceId = '" + binaryReferenceId + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",deleted = '" + deleted + '\'' + 
			",imageType = '" + imageType + '\'' + 
			",binaryReference = '" + binaryReference + '\'' + 
			",imageSizeType = '" + imageSizeType + '\'' + 
			",originalPlantImageId = '" + originalPlantImageId + '\'' + 
			",derivedImages = '" + derivedImages + '\'' + 
			",published = '" + published + '\'' + 
			",isMainImageForPlant = '" + isMainImageForPlant + '\'' + 
			"}";
		}
}