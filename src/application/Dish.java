package application;

public class Dish {
    private String name;
    private String description;
    private String recipe;
    private int cookTime;
    private String imagePath;
    private String cuisineType;

    public Dish(String dishName, String dishDescription, String recipeNum, int dishCookTime, String dishImagePath, String dishCuisineType) {
		this.name = dishName;
		this.description = dishDescription;
		this.recipe = recipeNum;
		this.cookTime = dishCookTime;
		this.imagePath = dishImagePath;
		this.cuisineType = dishCuisineType;
	}

	public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    } public void setDescription(String description) {
        this.description = description;
    }

    public String getRecipe() {
        return recipe;
    } public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
    
    public int getCookTime() {
        return cookTime;
    } public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public String getImagePath() {
        return imagePath;
    } public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public String getCuisineType() {
        return cuisineType;
    } public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }
}
