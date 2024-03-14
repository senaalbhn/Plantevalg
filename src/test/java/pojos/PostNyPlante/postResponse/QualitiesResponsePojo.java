package pojos.PostNyPlante.postResponse;

import java.util.List;
import java.io.Serializable;

public class QualitiesResponsePojo implements Serializable {
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
	private boolean seed;
	private boolean vegetative;
	private List<AllergenicitiesPojo> allergenicities;
	private List<CoveragesPojo> coverages;
	private List<EdibilitiesPojo> edibilities;
	private List<GroupsPojo> groups;
	private List<HabitatHansensPojo> habitatHansens;
	private List<HabitatHansenSubCategoriesPojo> habitatHansenSubCategories;
	private List<LightConditionsPojo> lightConditions;
	private List<MoistureConditionsPojo> moistureConditions;
	private List<NaturalLifespansPojo> naturalLifespans;
	private List<PhConditionsPojo> phConditions;
	private List<PollinatorFriendlinessPojo> pollinatorFriendliness;
	private List<PruningsPojo> prunings;
	private List<ReproductionMethodsPojo> reproductionMethods;
	private List<RestrictionsAndProtectionsPojo> restrictionsAndProtections;
	private List<RootTypesPojo> rootTypes;
	private List<SaltTolerancesPojo> saltTolerances;
	private List<ShapesPojo> shapes;
	private List<SoilsPojo> soils;
	private List<SubGroupsPojo> subGroups;
	private List<UsagesPojo> usages;
	private List<WidthsPojo> widths;
	private List<WindTolerancesPojo> windTolerances;
	private List<FlowerOneOrMoreColorsPojo> flowerOneOrMoreColors;
	private List<FlowerPrimaryColorsPojo> flowerPrimaryColors;
	private List<FlowerOtherColorsPojo> flowerOtherColors;
	private List<FlowerFillsPojo> flowerFills;
	private List<ScentedFlowersPojo> scentedFlowers;
	private List<FruitColorsPojo> fruitColors;
	private List<LeafColorsPojo> leafColors;
	private List<LeafShapesPojo> leafShapes;
	private List<LeafSizesPojo> leafSizes;
	private List<ScentedLeavesPojo> scentedLeaves;
	private List<AutumnColorsPojo> autumnColors;
	private List<WinterCharacteristicsPojo> winterCharacteristics;
	private List<TrunkBarkStructuresPojo> trunkBarkStructures;
	private List<TrunkBarkColorsPojo> trunkBarkColors;
	private List<ShootsBranchColorsPojo> shootsBranchColors;
	private List<ThornsPojo> thorns;
	private List<FruitTimesPojo> fruitTimes;
	private List<FlowerOrnamentalValuesPojo> flowerOrnamentalValues;
	private String plantId;
	private List<PlantImagesPojo> plantImages;
	private List<ResearchResultMappingsPojo> researchResultMappings;

	public QualitiesResponsePojo() {
	}

	public QualitiesResponsePojo(String additionalInfo, String comment, int floweringTimeEnd, int floweringTimeStart, int fruitTimeEnd, int fruitTimeStart, int minimumHeight, int maximumHeight, int minimimGapTreeGroup, int maximumGapTreeGroup, int minimumGapShrubbery, int maximumGapShrubbery, int minimumGapSolitary, int maximumGapSolitary, int minimumGapTrimmedHedge, int maximumGapTrimmedHedge, int minimumGapCenterToCenter, int maximumGapCenterToCenter, int minimumNumberOfPlantsPerSquareMeter, int minimumHardinessCoast, int maximumHardinessCoast, int maximumHardinessInland, int minimumHardinessInland, int maximumNumberOfPlantsPerSquareMeter, boolean originNorwegian, boolean producedInNorway, int refloweringTimeEnd, int refloweringTimeStart, String researchersExperience, boolean seed, boolean vegetative, List<AllergenicitiesPojo> allergenicities, List<CoveragesPojo> coverages, List<EdibilitiesPojo> edibilities, List<GroupsPojo> groups, List<HabitatHansensPojo> habitatHansens, List<HabitatHansenSubCategoriesPojo> habitatHansenSubCategories, List<LightConditionsPojo> lightConditions, List<MoistureConditionsPojo> moistureConditions, List<NaturalLifespansPojo> naturalLifespans, List<PhConditionsPojo> phConditions, List<PollinatorFriendlinessPojo> pollinatorFriendliness, List<PruningsPojo> prunings, List<ReproductionMethodsPojo> reproductionMethods, List<RestrictionsAndProtectionsPojo> restrictionsAndProtections, List<RootTypesPojo> rootTypes, List<SaltTolerancesPojo> saltTolerances, List<ShapesPojo> shapes, List<SoilsPojo> soils, List<SubGroupsPojo> subGroups, List<UsagesPojo> usages, List<WidthsPojo> widths, List<WindTolerancesPojo> windTolerances, List<FlowerOneOrMoreColorsPojo> flowerOneOrMoreColors, List<FlowerPrimaryColorsPojo> flowerPrimaryColors, List<FlowerOtherColorsPojo> flowerOtherColors, List<FlowerFillsPojo> flowerFills, List<ScentedFlowersPojo> scentedFlowers, List<FruitColorsPojo> fruitColors, List<LeafColorsPojo> leafColors, List<LeafShapesPojo> leafShapes, List<LeafSizesPojo> leafSizes, List<ScentedLeavesPojo> scentedLeaves, List<AutumnColorsPojo> autumnColors, List<WinterCharacteristicsPojo> winterCharacteristics, List<TrunkBarkStructuresPojo> trunkBarkStructures, List<TrunkBarkColorsPojo> trunkBarkColors, List<ShootsBranchColorsPojo> shootsBranchColors, List<ThornsPojo> thorns, List<FruitTimesPojo> fruitTimes, List<FlowerOrnamentalValuesPojo> flowerOrnamentalValues, String plantId, List<PlantImagesPojo> plantImages, List<ResearchResultMappingsPojo> researchResultMappings) {
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
		this.seed = seed;
		this.vegetative = vegetative;
		this.allergenicities = allergenicities;
		this.coverages = coverages;
		this.edibilities = edibilities;
		this.groups = groups;
		this.habitatHansens = habitatHansens;
		this.habitatHansenSubCategories = habitatHansenSubCategories;
		this.lightConditions = lightConditions;
		this.moistureConditions = moistureConditions;
		this.naturalLifespans = naturalLifespans;
		this.phConditions = phConditions;
		this.pollinatorFriendliness = pollinatorFriendliness;
		this.prunings = prunings;
		this.reproductionMethods = reproductionMethods;
		this.restrictionsAndProtections = restrictionsAndProtections;
		this.rootTypes = rootTypes;
		this.saltTolerances = saltTolerances;
		this.shapes = shapes;
		this.soils = soils;
		this.subGroups = subGroups;
		this.usages = usages;
		this.widths = widths;
		this.windTolerances = windTolerances;
		this.flowerOneOrMoreColors = flowerOneOrMoreColors;
		this.flowerPrimaryColors = flowerPrimaryColors;
		this.flowerOtherColors = flowerOtherColors;
		this.flowerFills = flowerFills;
		this.scentedFlowers = scentedFlowers;
		this.fruitColors = fruitColors;
		this.leafColors = leafColors;
		this.leafShapes = leafShapes;
		this.leafSizes = leafSizes;
		this.scentedLeaves = scentedLeaves;
		this.autumnColors = autumnColors;
		this.winterCharacteristics = winterCharacteristics;
		this.trunkBarkStructures = trunkBarkStructures;
		this.trunkBarkColors = trunkBarkColors;
		this.shootsBranchColors = shootsBranchColors;
		this.thorns = thorns;
		this.fruitTimes = fruitTimes;
		this.flowerOrnamentalValues = flowerOrnamentalValues;
		this.plantId = plantId;
		this.plantImages = plantImages;
		this.researchResultMappings = researchResultMappings;
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

	public void setSeed(boolean seed){
		this.seed = seed;
	}

	public boolean isSeed(){
		return seed;
	}

	public void setVegetative(boolean vegetative){
		this.vegetative = vegetative;
	}

	public boolean isVegetative(){
		return vegetative;
	}

	public void setAllergenicities(List<AllergenicitiesPojo> allergenicities){
		this.allergenicities = allergenicities;
	}

	public List<AllergenicitiesPojo> getAllergenicities(){
		return allergenicities;
	}

	public void setCoverages(List<CoveragesPojo> coverages){
		this.coverages = coverages;
	}

	public List<CoveragesPojo> getCoverages(){
		return coverages;
	}

	public void setEdibilities(List<EdibilitiesPojo> edibilities){
		this.edibilities = edibilities;
	}

	public List<EdibilitiesPojo> getEdibilities(){
		return edibilities;
	}

	public void setGroups(List<GroupsPojo> groups){
		this.groups = groups;
	}

	public List<GroupsPojo> getGroups(){
		return groups;
	}

	public void setHabitatHansens(List<HabitatHansensPojo> habitatHansens){
		this.habitatHansens = habitatHansens;
	}

	public List<HabitatHansensPojo> getHabitatHansens(){
		return habitatHansens;
	}

	public void setHabitatHansenSubCategories(List<HabitatHansenSubCategoriesPojo> habitatHansenSubCategories){
		this.habitatHansenSubCategories = habitatHansenSubCategories;
	}

	public List<HabitatHansenSubCategoriesPojo> getHabitatHansenSubCategories(){
		return habitatHansenSubCategories;
	}

	public void setLightConditions(List<LightConditionsPojo> lightConditions){
		this.lightConditions = lightConditions;
	}

	public List<LightConditionsPojo> getLightConditions(){
		return lightConditions;
	}

	public void setMoistureConditions(List<MoistureConditionsPojo> moistureConditions){
		this.moistureConditions = moistureConditions;
	}

	public List<MoistureConditionsPojo> getMoistureConditions(){
		return moistureConditions;
	}

	public void setNaturalLifespans(List<NaturalLifespansPojo> naturalLifespans){
		this.naturalLifespans = naturalLifespans;
	}

	public List<NaturalLifespansPojo> getNaturalLifespans(){
		return naturalLifespans;
	}

	public void setPhConditions(List<PhConditionsPojo> phConditions){
		this.phConditions = phConditions;
	}

	public List<PhConditionsPojo> getPhConditions(){
		return phConditions;
	}

	public void setPollinatorFriendliness(List<PollinatorFriendlinessPojo> pollinatorFriendliness){
		this.pollinatorFriendliness = pollinatorFriendliness;
	}

	public List<PollinatorFriendlinessPojo> getPollinatorFriendliness(){
		return pollinatorFriendliness;
	}

	public void setPrunings(List<PruningsPojo> prunings){
		this.prunings = prunings;
	}

	public List<PruningsPojo> getPrunings(){
		return prunings;
	}

	public void setReproductionMethods(List<ReproductionMethodsPojo> reproductionMethods){
		this.reproductionMethods = reproductionMethods;
	}

	public List<ReproductionMethodsPojo> getReproductionMethods(){
		return reproductionMethods;
	}

	public void setRestrictionsAndProtections(List<RestrictionsAndProtectionsPojo> restrictionsAndProtections){
		this.restrictionsAndProtections = restrictionsAndProtections;
	}

	public List<RestrictionsAndProtectionsPojo> getRestrictionsAndProtections(){
		return restrictionsAndProtections;
	}

	public void setRootTypes(List<RootTypesPojo> rootTypes){
		this.rootTypes = rootTypes;
	}

	public List<RootTypesPojo> getRootTypes(){
		return rootTypes;
	}

	public void setSaltTolerances(List<SaltTolerancesPojo> saltTolerances){
		this.saltTolerances = saltTolerances;
	}

	public List<SaltTolerancesPojo> getSaltTolerances(){
		return saltTolerances;
	}

	public void setShapes(List<ShapesPojo> shapes){
		this.shapes = shapes;
	}

	public List<ShapesPojo> getShapes(){
		return shapes;
	}

	public void setSoils(List<SoilsPojo> soils){
		this.soils = soils;
	}

	public List<SoilsPojo> getSoils(){
		return soils;
	}

	public void setSubGroups(List<SubGroupsPojo> subGroups){
		this.subGroups = subGroups;
	}

	public List<SubGroupsPojo> getSubGroups(){
		return subGroups;
	}

	public void setUsages(List<UsagesPojo> usages){
		this.usages = usages;
	}

	public List<UsagesPojo> getUsages(){
		return usages;
	}

	public void setWidths(List<WidthsPojo> widths){
		this.widths = widths;
	}

	public List<WidthsPojo> getWidths(){
		return widths;
	}

	public void setWindTolerances(List<WindTolerancesPojo> windTolerances){
		this.windTolerances = windTolerances;
	}

	public List<WindTolerancesPojo> getWindTolerances(){
		return windTolerances;
	}

	public void setFlowerOneOrMoreColors(List<FlowerOneOrMoreColorsPojo> flowerOneOrMoreColors){
		this.flowerOneOrMoreColors = flowerOneOrMoreColors;
	}

	public List<FlowerOneOrMoreColorsPojo> getFlowerOneOrMoreColors(){
		return flowerOneOrMoreColors;
	}

	public void setFlowerPrimaryColors(List<FlowerPrimaryColorsPojo> flowerPrimaryColors){
		this.flowerPrimaryColors = flowerPrimaryColors;
	}

	public List<FlowerPrimaryColorsPojo> getFlowerPrimaryColors(){
		return flowerPrimaryColors;
	}

	public void setFlowerOtherColors(List<FlowerOtherColorsPojo> flowerOtherColors){
		this.flowerOtherColors = flowerOtherColors;
	}

	public List<FlowerOtherColorsPojo> getFlowerOtherColors(){
		return flowerOtherColors;
	}

	public void setFlowerFills(List<FlowerFillsPojo> flowerFills){
		this.flowerFills = flowerFills;
	}

	public List<FlowerFillsPojo> getFlowerFills(){
		return flowerFills;
	}

	public void setScentedFlowers(List<ScentedFlowersPojo> scentedFlowers){
		this.scentedFlowers = scentedFlowers;
	}

	public List<ScentedFlowersPojo> getScentedFlowers(){
		return scentedFlowers;
	}

	public void setFruitColors(List<FruitColorsPojo> fruitColors){
		this.fruitColors = fruitColors;
	}

	public List<FruitColorsPojo> getFruitColors(){
		return fruitColors;
	}

	public void setLeafColors(List<LeafColorsPojo> leafColors){
		this.leafColors = leafColors;
	}

	public List<LeafColorsPojo> getLeafColors(){
		return leafColors;
	}

	public void setLeafShapes(List<LeafShapesPojo> leafShapes){
		this.leafShapes = leafShapes;
	}

	public List<LeafShapesPojo> getLeafShapes(){
		return leafShapes;
	}

	public void setLeafSizes(List<LeafSizesPojo> leafSizes){
		this.leafSizes = leafSizes;
	}

	public List<LeafSizesPojo> getLeafSizes(){
		return leafSizes;
	}

	public void setScentedLeaves(List<ScentedLeavesPojo> scentedLeaves){
		this.scentedLeaves = scentedLeaves;
	}

	public List<ScentedLeavesPojo> getScentedLeaves(){
		return scentedLeaves;
	}

	public void setAutumnColors(List<AutumnColorsPojo> autumnColors){
		this.autumnColors = autumnColors;
	}

	public List<AutumnColorsPojo> getAutumnColors(){
		return autumnColors;
	}

	public void setWinterCharacteristics(List<WinterCharacteristicsPojo> winterCharacteristics){
		this.winterCharacteristics = winterCharacteristics;
	}

	public List<WinterCharacteristicsPojo> getWinterCharacteristics(){
		return winterCharacteristics;
	}

	public void setTrunkBarkStructures(List<TrunkBarkStructuresPojo> trunkBarkStructures){
		this.trunkBarkStructures = trunkBarkStructures;
	}

	public List<TrunkBarkStructuresPojo> getTrunkBarkStructures(){
		return trunkBarkStructures;
	}

	public void setTrunkBarkColors(List<TrunkBarkColorsPojo> trunkBarkColors){
		this.trunkBarkColors = trunkBarkColors;
	}

	public List<TrunkBarkColorsPojo> getTrunkBarkColors(){
		return trunkBarkColors;
	}

	public void setShootsBranchColors(List<ShootsBranchColorsPojo> shootsBranchColors){
		this.shootsBranchColors = shootsBranchColors;
	}

	public List<ShootsBranchColorsPojo> getShootsBranchColors(){
		return shootsBranchColors;
	}

	public void setThorns(List<ThornsPojo> thorns){
		this.thorns = thorns;
	}

	public List<ThornsPojo> getThorns(){
		return thorns;
	}

	public void setFruitTimes(List<FruitTimesPojo> fruitTimes){
		this.fruitTimes = fruitTimes;
	}

	public List<FruitTimesPojo> getFruitTimes(){
		return fruitTimes;
	}

	public void setFlowerOrnamentalValues(List<FlowerOrnamentalValuesPojo> flowerOrnamentalValues){
		this.flowerOrnamentalValues = flowerOrnamentalValues;
	}

	public List<FlowerOrnamentalValuesPojo> getFlowerOrnamentalValues(){
		return flowerOrnamentalValues;
	}

	public void setPlantId(String plantId){
		this.plantId = plantId;
	}

	public String getPlantId(){
		return plantId;
	}

	public void setPlantImages(List<PlantImagesPojo> plantImages){
		this.plantImages = plantImages;
	}

	public List<PlantImagesPojo> getPlantImages(){
		return plantImages;
	}

	public void setResearchResultMappings(List<ResearchResultMappingsPojo> researchResultMappings){
		this.researchResultMappings = researchResultMappings;
	}

	public List<ResearchResultMappingsPojo> getResearchResultMappings(){
		return researchResultMappings;
	}

	@Override
 	public String toString(){
		return 
			"QualitiesPojo{" + 
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
			",seed = '" + seed + '\'' + 
			",vegetative = '" + vegetative + '\'' + 
			",allergenicities = '" + allergenicities + '\'' + 
			",coverages = '" + coverages + '\'' + 
			",edibilities = '" + edibilities + '\'' + 
			",groups = '" + groups + '\'' + 
			",habitatHansens = '" + habitatHansens + '\'' + 
			",habitatHansenSubCategories = '" + habitatHansenSubCategories + '\'' + 
			",lightConditions = '" + lightConditions + '\'' + 
			",moistureConditions = '" + moistureConditions + '\'' + 
			",naturalLifespans = '" + naturalLifespans + '\'' + 
			",phConditions = '" + phConditions + '\'' + 
			",pollinatorFriendliness = '" + pollinatorFriendliness + '\'' + 
			",prunings = '" + prunings + '\'' + 
			",reproductionMethods = '" + reproductionMethods + '\'' + 
			",restrictionsAndProtections = '" + restrictionsAndProtections + '\'' + 
			",rootTypes = '" + rootTypes + '\'' + 
			",saltTolerances = '" + saltTolerances + '\'' + 
			",shapes = '" + shapes + '\'' + 
			",soils = '" + soils + '\'' + 
			",subGroups = '" + subGroups + '\'' + 
			",usages = '" + usages + '\'' + 
			",widths = '" + widths + '\'' + 
			",windTolerances = '" + windTolerances + '\'' + 
			",flowerOneOrMoreColors = '" + flowerOneOrMoreColors + '\'' + 
			",flowerPrimaryColors = '" + flowerPrimaryColors + '\'' + 
			",flowerOtherColors = '" + flowerOtherColors + '\'' + 
			",flowerFills = '" + flowerFills + '\'' + 
			",scentedFlowers = '" + scentedFlowers + '\'' + 
			",fruitColors = '" + fruitColors + '\'' + 
			",leafColors = '" + leafColors + '\'' + 
			",leafShapes = '" + leafShapes + '\'' + 
			",leafSizes = '" + leafSizes + '\'' + 
			",scentedLeaves = '" + scentedLeaves + '\'' + 
			",autumnColors = '" + autumnColors + '\'' + 
			",winterCharacteristics = '" + winterCharacteristics + '\'' + 
			",trunkBarkStructures = '" + trunkBarkStructures + '\'' + 
			",trunkBarkColors = '" + trunkBarkColors + '\'' + 
			",shootsBranchColors = '" + shootsBranchColors + '\'' + 
			",thorns = '" + thorns + '\'' + 
			",fruitTimes = '" + fruitTimes + '\'' + 
			",flowerOrnamentalValues = '" + flowerOrnamentalValues + '\'' + 
			",plantId = '" + plantId + '\'' + 
			",plantImages = '" + plantImages + '\'' + 
			",researchResultMappings = '" + researchResultMappings + '\'' + 
			"}";
		}
}