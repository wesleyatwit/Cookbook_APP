package application;

import java.util.List;

public class Dish {
	// Fields to store information about a dish
	private String name;
	private String description;
	private List<String> recipe;
	private int cookTime;
	private String imagePath;
	private String cuisineType;

	// Constructor to initialize a Dish object with provided values
	public Dish(String dishName, String dishDescription, List<String> dishRecipe, int dishCookTime,
			String dishImagePath, String dishCuisineType) {
		this.name = dishName;
		this.description = dishDescription;
		this.recipe = dishRecipe;
		this.cookTime = dishCookTime;
		this.imagePath = dishImagePath;
		this.cuisineType = dishCuisineType;
	}

	// Getter method for retrieving the name of the dish
	public String getName() {
		return name;
	}

	// Setter method for updating the name of the dish
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for retrieving the description of the dish
	public String getDescription() {
		return description;
	}

	// Setter method for updating the description of the dish
	public void setDescription(String description) {
		this.description = description;
	}

	// Getter method for retrieving the recipe of the dish
	public List<String> getRecipe() {
		return recipe;
	}

	// Setter method for updating the recipe of the dish
	public void setRecipe(List<String> recipe) {
		this.recipe = recipe;
	}

	// Getter method for retrieving the cook time of the dish
	public int getCookTime() {
		return cookTime;
	}

	// Setter method for updating the cook time of the dish
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	// Getter method for retrieving the image path of the dish
	public String getImagePath() {
		return imagePath;
	}

	// Setter method for updating the image path of the dish
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	// Getter method for retrieving the cuisine type of the dish
	public String getCuisineType() {
		return cuisineType;
	}

	// Setter method for updating the cuisine type of the dish
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
}
