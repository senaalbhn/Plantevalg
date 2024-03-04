package pojos.PostNyPlante.post;

import java.io.Serializable;

public class BotanicalNamespojo implements Serializable {
	private String botanicalNameType;
	private String genus;
	private String epithet;
	private String intergenericHybrid;
	private String interspeciesHybrid;
	private String cultivar;
	private String seedSource;
	private String subSpecies;
	private String variety;
	private String form;
	private String trademark;
	private String isRegisteredTrademark;

	public BotanicalNamespojo() {
	}

	public BotanicalNamespojo(String botanicalNameType, String genus, String epithet, String intergenericHybrid, String interspeciesHybrid, String cultivar, String seedSource, String subSpecies, String variety, String form, String trademark, String isRegisteredTrademark) {
		this.botanicalNameType = botanicalNameType;
		this.genus = genus;
		this.epithet = epithet;
		this.intergenericHybrid = intergenericHybrid;
		this.interspeciesHybrid = interspeciesHybrid;
		this.cultivar = cultivar;
		this.seedSource = seedSource;
		this.subSpecies = subSpecies;
		this.variety = variety;
		this.form = form;
		this.trademark = trademark;
		this.isRegisteredTrademark = isRegisteredTrademark;
	}

	public void setBotanicalNameType(String botanicalNameType){
		this.botanicalNameType = botanicalNameType;
	}

	public String getBotanicalNameType(){
		return botanicalNameType;
	}

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

	public void setIntergenericHybrid(String intergenericHybrid){
		this.intergenericHybrid = intergenericHybrid;
	}

	public String getIntergenericHybrid(){
		return intergenericHybrid;
	}

	public void setInterspeciesHybrid(String interspeciesHybrid){
		this.interspeciesHybrid = interspeciesHybrid;
	}

	public String getInterspeciesHybrid(){
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

	public void setIsRegisteredTrademark(String isRegisteredTrademark){
		this.isRegisteredTrademark = isRegisteredTrademark;
	}

	public String getIsRegisteredTrademark(){
		return isRegisteredTrademark;
	}

	@Override
 	public String toString(){
		return 
			"BotanicalNamespojo{" + 
			"botanicalNameType = '" + botanicalNameType + '\'' + 
			",genus = '" + genus + '\'' + 
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
			"}";
		}
}