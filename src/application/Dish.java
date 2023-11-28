package application;

public class Dish {
    private String name;
    private String description;
    private String recipe;
    private int cookTime; // Assuming cook time is in minutes
    private String imagePath;

    // Constructors, getters, and setters

    // Example constructor
    public Dish(String name, String description, String recipe, int cookTime, String imagePath, String cuisine_type) {
        this.name = name;
        this.description = description;
        this.recipe = recipe;
        this.cookTime = cookTime;
        this.imagePath = imagePath;
    }

    // Getters and setters for all properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Repeat for other properties
}
