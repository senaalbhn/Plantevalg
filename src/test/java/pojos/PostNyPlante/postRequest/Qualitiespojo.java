package pojos.PostNyPlante.postRequest;

import java.io.Serializable;

public class Qualitiespojo implements Serializable {
	private String additionalInfo;
	private String comment;
	private int floweringTimeEnd;
	private int floweringTimeStart;
	private int fruitTimeEnd;
	private int fruitTimeStart;
	private int minimumHeight;
	private int maximumHeight;
	private int minimimGapTreeGroup;
	private int maximumGapTreeGroup;
	private int minimumGapShrubbery;
	private int maximumGapShrubbery;
	private int minimumGapSolitary;
	private int maximumGapSolitary;
	private int minimumGapTrimmedHedge;
	private int maximumGapTrimmedHedge;
	private int minimumGapCenterToCenter;
	private int maximumGapCenterToCenter;
	private int minimumNumberOfPlantsPerSquareMeter;
	private int minimumHardinessCoast;
	private int maximumHardinessCoast;
	private int maximumHardinessInland;
	private int minimumHardinessInland;
	private int maximumNumberOfPlantsPerSquareMeter;
	private boolean originNorwegian;
	private boolean producedInNorway;
	private int refloweringTimeEnd;
	private int refloweringTimeStart;
	private String researchersExperience;

	public Qualitiespojo() {
	}

	public Qualitiespojo(String additionalInfo, String comment, int floweringTimeEnd, int floweringTimeStart, int fruitTimeEnd, int fruitTimeStart, int minimumHeight, int maximumHeight, int minimimGapTreeGroup, int maximumGapTreeGroup, int minimumGapShrubbery, int maximumGapShrubbery, int minimumGapSolitary, int maximumGapSolitary, int minimumGapTrimmedHedge, int maximumGapTrimmedHedge, int minimumGapCenterToCenter, int maximumGapCenterToCenter, int minimumNumberOfPlantsPerSquareMeter, int minimumHardinessCoast, int maximumHardinessCoast, int maximumHardinessInland, int minimumHardinessInland, int maximumNumberOfPlantsPerSquareMeter, boolean originNorwegian, boolean producedInNorway, int refloweringTimeEnd, int refloweringTimeStart, String researchersExperience) {
		this.additionalInfo = additionalInfo;
		this.comment = comment;
		this.floweringTimeEnd = floweringTimeEnd;
		this.floweringTimeStart = floweringTimeStart;
		this.fruitTimeEnd = fruitTimeEnd;
		this.fruitTimeStart = fruitTimeStart;
		this.minimumHeight = minimumHeight;
		this.maximumHeight = maximumHeight;
		this.minimimGapTreeGroup = minimimGapTreeGroup;
		this.maximumGapTreeGroup = maximumGapTreeGroup;
		this.minimumGapShrubbery = minimumGapShrubbery;
		this.maximumGapShrubbery = maximumGapShrubbery;
		this.minimumGapSolitary = minimumGapSolitary;
		this.maximumGapSolitary = maximumGapSolitary;
		this.minimumGapTrimmedHedge = minimumGapTrimmedHedge;
		this.maximumGapTrimmedHedge = maximumGapTrimmedHedge;
		this.minimumGapCenterToCenter = minimumGapCenterToCenter;
		this.maximumGapCenterToCenter = maximumGapCenterToCenter;
		this.minimumNumberOfPlantsPerSquareMeter = minimumNumberOfPlantsPerSquareMeter;
		this.minimumHardinessCoast = minimumHardinessCoast;
		this.maximumHardinessCoast = maximumHardinessCoast;
		this.maximumHardinessInland = maximumHardinessInland;
		this.minimumHardinessInland = minimumHardinessInland;
		this.maximumNumberOfPlantsPerSquareMeter = maximumNumberOfPlantsPerSquareMeter;
		this.originNorwegian = originNorwegian;
		this.producedInNorway = producedInNorway;
		this.refloweringTimeEnd = refloweringTimeEnd;
		this.refloweringTimeStart = refloweringTimeStart;
		this.researchersExperience = researchersExperience;
	}



	public void setAdditionalInfo(String additionalInfo){
		this.additionalInfo = additionalInfo;
	}

	public String getAdditionalInfo(){
		return additionalInfo;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}

	public void setFloweringTimeEnd(int floweringTimeEnd){
		this.floweringTimeEnd = floweringTimeEnd;
	}

	public int getFloweringTimeEnd(){
		return floweringTimeEnd;
	}

	public void setFloweringTimeStart(int floweringTimeStart){
		this.floweringTimeStart = floweringTimeStart;
	}

	public int getFloweringTimeStart(){
		return floweringTimeStart;
	}

	public void setFruitTimeEnd(int fruitTimeEnd){
		this.fruitTimeEnd = fruitTimeEnd;
	}

	public int getFruitTimeEnd(){
		return fruitTimeEnd;
	}

	public void setFruitTimeStart(int fruitTimeStart){
		this.fruitTimeStart = fruitTimeStart;
	}

	public int getFruitTimeStart(){
		return fruitTimeStart;
	}

	public void setMinimumHeight(int minimumHeight){
		this.minimumHeight = minimumHeight;
	}

	public int getMinimumHeight(){
		return minimumHeight;
	}

	public void setMaximumHeight(int maximumHeight){
		this.maximumHeight = maximumHeight;
	}

	public int getMaximumHeight(){
		return maximumHeight;
	}

	public void setMinimimGapTreeGroup(int minimimGapTreeGroup){
		this.minimimGapTreeGroup = minimimGapTreeGroup;
	}

	public int getMinimimGapTreeGroup(){
		return minimimGapTreeGroup;
	}

	public void setMaximumGapTreeGroup(int maximumGapTreeGroup){
		this.maximumGapTreeGroup = maximumGapTreeGroup;
	}

	public int getMaximumGapTreeGroup(){
		return maximumGapTreeGroup;
	}

	public void setMinimumGapShrubbery(int minimumGapShrubbery){
		this.minimumGapShrubbery = minimumGapShrubbery;
	}

	public int getMinimumGapShrubbery(){
		return minimumGapShrubbery;
	}

	public void setMaximumGapShrubbery(int maximumGapShrubbery){
		this.maximumGapShrubbery = maximumGapShrubbery;
	}

	public int getMaximumGapShrubbery(){
		return maximumGapShrubbery;
	}

	public void setMinimumGapSolitary(int minimumGapSolitary){
		this.minimumGapSolitary = minimumGapSolitary;
	}

	public int getMinimumGapSolitary(){
		return minimumGapSolitary;
	}

	public void setMaximumGapSolitary(int maximumGapSolitary){
		this.maximumGapSolitary = maximumGapSolitary;
	}

	public int getMaximumGapSolitary(){
		return maximumGapSolitary;
	}

	public void setMinimumGapTrimmedHedge(int minimumGapTrimmedHedge){
		this.minimumGapTrimmedHedge = minimumGapTrimmedHedge;
	}

	public int getMinimumGapTrimmedHedge(){
		return minimumGapTrimmedHedge;
	}

	public void setMaximumGapTrimmedHedge(int maximumGapTrimmedHedge){
		this.maximumGapTrimmedHedge = maximumGapTrimmedHedge;
	}

	public int getMaximumGapTrimmedHedge(){
		return maximumGapTrimmedHedge;
	}

	public void setMinimumGapCenterToCenter(int minimumGapCenterToCenter){
		this.minimumGapCenterToCenter = minimumGapCenterToCenter;
	}

	public int getMinimumGapCenterToCenter(){
		return minimumGapCenterToCenter;
	}

	public void setMaximumGapCenterToCenter(int maximumGapCenterToCenter){
		this.maximumGapCenterToCenter = maximumGapCenterToCenter;
	}

	public int getMaximumGapCenterToCenter(){
		return maximumGapCenterToCenter;
	}

	public void setMinimumNumberOfPlantsPerSquareMeter(int minimumNumberOfPlantsPerSquareMeter){
		this.minimumNumberOfPlantsPerSquareMeter = minimumNumberOfPlantsPerSquareMeter;
	}

	public int getMinimumNumberOfPlantsPerSquareMeter(){
		return minimumNumberOfPlantsPerSquareMeter;
	}

	public void setMinimumHardinessCoast(int minimumHardinessCoast){
		this.minimumHardinessCoast = minimumHardinessCoast;
	}

	public int getMinimumHardinessCoast(){
		return minimumHardinessCoast;
	}

	public void setMaximumHardinessCoast(int maximumHardinessCoast){
		this.maximumHardinessCoast = maximumHardinessCoast;
	}

	public int getMaximumHardinessCoast(){
		return maximumHardinessCoast;
	}

	public void setMaximumHardinessInland(int maximumHardinessInland){
		this.maximumHardinessInland = maximumHardinessInland;
	}

	public int getMaximumHardinessInland(){
		return maximumHardinessInland;
	}

	public void setMinimumHardinessInland(int minimumHardinessInland){
		this.minimumHardinessInland = minimumHardinessInland;
	}

	public int getMinimumHardinessInland(){
		return minimumHardinessInland;
	}

	public void setMaximumNumberOfPlantsPerSquareMeter(int maximumNumberOfPlantsPerSquareMeter){
		this.maximumNumberOfPlantsPerSquareMeter = maximumNumberOfPlantsPerSquareMeter;
	}

	public int getMaximumNumberOfPlantsPerSquareMeter(){
		return maximumNumberOfPlantsPerSquareMeter;
	}

	public void setOriginNorwegian(boolean originNorwegian){
		this.originNorwegian = originNorwegian;
	}

	public boolean isOriginNorwegian(){
		return originNorwegian;
	}

	public void setProducedInNorway(boolean producedInNorway){
		this.producedInNorway = producedInNorway;
	}

	public boolean isProducedInNorway(){
		return producedInNorway;
	}

	public void setRefloweringTimeEnd(int refloweringTimeEnd){
		this.refloweringTimeEnd = refloweringTimeEnd;
	}

	public int getRefloweringTimeEnd(){
		return refloweringTimeEnd;
	}

	public void setRefloweringTimeStart(int refloweringTimeStart){
		this.refloweringTimeStart = refloweringTimeStart;
	}

	public int getRefloweringTimeStart(){
		return refloweringTimeStart;
	}

	public void setResearchersExperience(String researchersExperience){
		this.researchersExperience = researchersExperience;
	}

	public String getResearchersExperience(){
		return researchersExperience;
	}

	@Override
 	public String toString(){
		return 
			"Qualitiespojo{" + 
			"additionalInfo = '" + additionalInfo + '\'' + 
			",comment = '" + comment + '\'' + 
			",floweringTimeEnd = '" + floweringTimeEnd + '\'' + 
			",floweringTimeStart = '" + floweringTimeStart + '\'' + 
			",fruitTimeEnd = '" + fruitTimeEnd + '\'' + 
			",fruitTimeStart = '" + fruitTimeStart + '\'' + 
			",minimumHeight = '" + minimumHeight + '\'' + 
			",maximumHeight = '" + maximumHeight + '\'' + 
			",minimimGapTreeGroup = '" + minimimGapTreeGroup + '\'' + 
			",maximumGapTreeGroup = '" + maximumGapTreeGroup + '\'' + 
			",minimumGapShrubbery = '" + minimumGapShrubbery + '\'' + 
			",maximumGapShrubbery = '" + maximumGapShrubbery + '\'' + 
			",minimumGapSolitary = '" + minimumGapSolitary + '\'' + 
			",maximumGapSolitary = '" + maximumGapSolitary + '\'' + 
			",minimumGapTrimmedHedge = '" + minimumGapTrimmedHedge + '\'' + 
			",maximumGapTrimmedHedge = '" + maximumGapTrimmedHedge + '\'' + 
			",minimumGapCenterToCenter = '" + minimumGapCenterToCenter + '\'' + 
			",maximumGapCenterToCenter = '" + maximumGapCenterToCenter + '\'' + 
			",minimumNumberOfPlantsPerSquareMeter = '" + minimumNumberOfPlantsPerSquareMeter + '\'' + 
			",minimumHardinessCoast = '" + minimumHardinessCoast + '\'' + 
			",maximumHardinessCoast = '" + maximumHardinessCoast + '\'' + 
			",maximumHardinessInland = '" + maximumHardinessInland + '\'' + 
			",minimumHardinessInland = '" + minimumHardinessInland + '\'' + 
			",maximumNumberOfPlantsPerSquareMeter = '" + maximumNumberOfPlantsPerSquareMeter + '\'' + 
			",originNorwegian = '" + originNorwegian + '\'' + 
			",producedInNorway = '" + producedInNorway + '\'' + 
			",refloweringTimeEnd = '" + refloweringTimeEnd + '\'' + 
			",refloweringTimeStart = '" + refloweringTimeStart + '\'' + 
			",researchersExperience = '" + researchersExperience + '\'' + 
			"}";
		}
}