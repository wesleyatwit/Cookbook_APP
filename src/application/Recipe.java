package application;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> recipes;

    public Recipe() {
        this.recipes = new ArrayList<>();
        initializeRecipes();
    }

    private void initializeRecipes() {
        recipes.add("Recipe 1");
    }

    public String getRecipe(int index) {
        if (index >= 0 && index < recipes.size()) {
            return recipes.get(index);
        } else {
            return "Recipe not found";
        }
    }
}
