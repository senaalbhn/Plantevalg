package pojos.PostNyPlante.postResponse;

import java.io.Serializable;

public class BotanicalNamesPojo implements Serializable {
	private String genus;
	private String epithet;
	private boolean intergenericHybrid;
	private boolean interspeciesHybrid;
	private String cultivar;
	private String seedSource;
	private String subSpecies;
	private String variety;
	private String form;
	private String trademark;
	private boolean isRegisteredTrademark;
	private String botanicalNameType;
	private String id;


	public void setGenus(String genus){
		this.genus = genus;
	}

	public String getGenus(){
		return genus;
	}

	public void setEpithet(String epithet){
		this.epithet = epithet;
	}

	public String getEpithet(){
		return epithet;
	}

	public void setIntergenericHybrid(boolean intergenericHybrid){
		this.intergenericHybrid = intergenericHybrid;
	}

	public boolean isIntergenericHybrid(){
		return intergenericHybrid;
	}

	public void setInterspeciesHybrid(boolean interspeciesHybrid){
		this.interspeciesHybrid = interspeciesHybrid;
	}

	public boolean isInterspeciesHybrid(){
		return interspeciesHybrid;
	}

	public void setCultivar(String cultivar){
		this.cultivar = cultivar;
	}

	public String getCultivar(){
		return cultivar;
	}

	public void setSeedSource(String seedSource){
		this.seedSource = seedSource;
	}

	public String getSeedSource(){
		return seedSource;
	}

	public void setSubSpecies(String subSpecies){
		this.subSpecies = subSpecies;
	}

	public String getSubSpecies(){
		return subSpecies;
	}

	public void setVariety(String variety){
		this.variety = variety;
	}

	public String getVariety(){
		return variety;
	}

	public void setForm(String form){
		this.form = form;
	}

	public String getForm(){
		return form;
	}

	public void setTrademark(String trademark){
		this.trademark = trademark;
	}

	public String getTrademark(){
		return trademark;
	}

	public void setIsRegisteredTrademark(boolean isRegisteredTrademark){
		this.isRegisteredTrademark = isRegisteredTrademark;
	}

	public boolean isIsRegisteredTrademark(){
		return isRegisteredTrademark;
	}

	public void setBotanicalNameType(String botanicalNameType){
		this.botanicalNameType = botanicalNameType;
	}

	public String getBotanicalNameType(){
		return botanicalNameType;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"BotanicalNamesPojo{" + 
			"genus = '" + genus + '\'' + 
			",epithet = '" + epithet + '\'' + 
			",intergenericHybrid = '" + intergenericHybrid + '\'' + 
			",interspeciesHybrid = '" + interspeciesHybrid + '\'' + 
			",cultivar = '" + cultivar + '\'' + 
			",seedSource = '" + seedSource + '\'' + 
			",subSpecies = '" + subSpecies + '\'' + 
			",variety = '" + variety + '\'' + 
			",form = '" + form + '\'' + 
			",trademark = '" + trademark + '\'' + 
			",isRegisteredTrademark = '" + isRegisteredTrademark + '\'' + 
			",botanicalNameType = '" + botanicalNameType + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}