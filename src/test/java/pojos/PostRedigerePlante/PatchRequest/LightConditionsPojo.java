package pojos.PostRedigerePlante.PatchRequest;

import java.io.Serializable;

public class LightConditionsPojo implements Serializable {
	private String id;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"LightConditionsPojo{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}