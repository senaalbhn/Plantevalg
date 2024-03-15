package pojos.getRequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)

public class NamePojo implements Serializable {
	private String metaDataEntityId;
	private String languageCode;
	private String text;

	public NamePojo() {
	}

	public NamePojo(String text) {
		this.text = text;
	}

	public void setMetaDataEntityId(String metaDataEntityId){
		this.metaDataEntityId = metaDataEntityId;
	}

	public String getMetaDataEntityId(){
		return metaDataEntityId;
	}

	public void setLanguageCode(String languageCode){
		this.languageCode = languageCode;
	}

	public String getLanguageCode(){
		return languageCode;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"NamePojo{" + 
			"metaDataEntityId = '" + metaDataEntityId + '\'' + 
			",languageCode = '" + languageCode + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}