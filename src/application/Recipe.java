package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {

    public List<Dish> getDishes() {
        List<Dish> dishes = new ArrayList<>();

        // Italian
        dishes.add(new Dish("Spaghetti Bolognese", "Classic Italian pasta dish with meat sauce", getSpaghettiBologneseSteps(), 30, "path_to_spaghetti_bolognese.jpg", "Italian"));
        dishes.add(new Dish("Margherita Pizza", "Traditional pizza with tomato, mozzarella, and basil", getMargheritaPizzaSteps(), 20, "path_to_margherita_pizza.jpg", "Italian"));
        dishes.add(new Dish("Risotto al Funghi", "Creamy risotto with mushrooms", getRisottoAlFunghiSteps(), 25, "path_to_risotto_al_funghi.jpg", "Italian"));
        dishes.add(new Dish("Osso Buco", "Braised veal shanks with gremolata", getOssoBucoSteps(), 40, "path_to_osso_buco.jpg", "Italian"));
        dishes.add(new Dish("Tiramisu", "Classic Italian dessert with layers of coffee-soaked ladyfingers and mascarpone", getTiramisuSteps(), 15, "path_to_tiramisu.jpg", "Italian"));
        dishes.add(new Dish("Fettuccine Alfredo", "Pasta with creamy Alfredo sauce", getFettuccineAlfredoSteps(), 25, "path_to_fettuccine_alfredo.jpg", "Italian"));
        dishes.add(new Dish("Caprese Salad", "Simple salad with tomatoes, mozzarella, and basil", getCapreseSaladSteps(), 10, "path_to_caprese_salad.jpg", "Italian"));
        dishes.add(new Dish("Gnocchi alla Sorrentina", "Potato dumplings with tomato sauce and mozzarella", getGnocchiAllaSorrentinaSteps(), 30, "path_to_gnocchi_alla_sorrentina.jpg", "Italian"));
        dishes.add(new Dish("Bruschetta", "Toasted bread topped with tomatoes, garlic, and basil", getBruschettaSteps(), 15, "path_to_bruschetta.jpg", "Italian"));
        dishes.add(new Dish("Limoncello Tiramisu", "Tiramisu with a twist, infused with limoncello", getLimoncelloTiramisuSteps(), 20, "path_to_limoncello_tiramisu.jpg", "Italian"));

        // Add more Italian dishes...

        return dishes;
    }

    private List<String> getSpaghettiBologneseSteps() {
        return Arrays.asList(
                "Boil water in a large pot.",
                "Cook spaghetti according to package instructions.",
                "In a separate pan, brown ground beef over medium heat.",
                "Add onions, garlic, and carrots to the pan. Cook until vegetables are soft.",
                "Stir in tomato paste, crushed tomatoes, and seasonings.",
                "Simmer the sauce for 15-20 minutes.",
                "Combine cooked spaghetti with the Bolognese sauce.",
                "Serve hot with grated Parmesan cheese on top."
        );
    }

    private List<String> getMargheritaPizzaSteps() {
        return Arrays.asList(
                "Preheat the oven to its highest temperature.",
                "Roll out pizza dough on a floured surface.",
                "Spread tomato sauce evenly on the dough.",
                "Place fresh mozzarella slices on the sauce.",
                "Add fresh basil leaves.",
                "Drizzle olive oil over the pizza.",
                "Bake in the preheated oven until the crust is golden and the cheese is melted.",
                "Remove from the oven, slice, and serve."
        );
    }

    private List<String> getRisottoAlFunghiSteps() {
        return Arrays.asList(
                "In a saucepan, heat chicken or vegetable broth.",
                "In a separate pan, sauté chopped onions in olive oil until translucent.",
                "Add Arborio rice to the pan and stir to coat the rice with oil.",
                "Pour in white wine and cook until it evaporates.",
                "Add a ladle of warm broth to the rice and stir until absorbed.",
                "Continue adding broth one ladle at a time, stirring constantly, until the rice is creamy and cooked to al dente.",
                "Stir in sliced mushrooms and Parmesan cheese.",
                "Season with salt and pepper to taste.",
                "Serve hot, garnished with chopped parsley."
        );
    }

    private List<String> getOssoBucoSteps() {
        return Arrays.asList(
                "Preheat the oven to 350°F (175°C).",
                "Season veal shanks with salt and pepper.",
                "Dredge shanks in flour, shaking off excess.",
                "In a large ovenproof skillet, heat olive oil over medium-high heat.",
                "Brown veal shanks on all sides.",
                "Remove shanks and set aside.",
                "In the same skillet, sauté onions, carrots, and celery until softened.",
                "Add tomato paste and garlic, cook for 1-2 minutes.",
                "Pour in white wine and scrape up any browned bits from the bottom of the pan.",
                "Return veal shanks to the skillet, add broth, tomatoes, and bay leaves.",
                "Cover and transfer to the preheated oven. Braise for about 2 hours or until the meat is tender.",
                "Serve hot, garnished with gremolata."
        );
    }

    private List<String> getTiramisuSteps() {
        return Arrays.asList(
                "Brew strong coffee and let it cool to room temperature.",
                "In a mixing bowl, combine egg yolks and sugar. Beat until thick and pale.",
                "Add mascarpone cheese to the egg yolk mixture. Mix until smooth.",
                "In a separate bowl, beat egg whites until stiff peaks form.",
                "Gently fold the egg whites into the mascarpone mixture.",
                "Dip ladyfingers into the cooled coffee and layer them in the bottom of a serving dish.",
                "Spread half of the mascarpone mixture over the ladyfingers.",
                "Repeat the layers with another layer of dipped ladyfingers and mascarpone mixture.",
                "Dust the top with cocoa powder.",
                "Chill in the refrigerator for at least 4 hours or overnight.",
                "Serve chilled and enjoy!"
        );
    }

    private List<String> getFettuccineAlfredoSteps() {
        return Arrays.asList(
                "Cook fettuccine pasta according to package instructions.",
                "In a saucepan, melt butter over medium heat.",
                "Add heavy cream and bring to a simmer.",
                "Stir in grated Parmesan cheese until the sauce is smooth and creamy.",
                "Season with salt and white pepper to taste.",
                "Toss the cooked fettuccine in the Alfredo sauce until well coated.",
                "Serve hot, garnished with additional Parmesan and chopped parsley if desired."
        );
    }

    private List<String> getCapreseSaladSteps() {
        return Arrays.asList(
                "Slice fresh tomatoes and mozzarella into 1/4-inch thick slices.",
                "Arrange tomato and mozzarella slices on a serving platter, alternating and overlapping them.",
                "Tuck fresh basil leaves between the tomato and mozzarella slices.",
                "Drizzle extra virgin olive oil over the salad.",
                "Sprinkle with balsamic glaze and season with salt and pepper to taste.",
                "Serve immediately and enjoy!"
        );
    }

    private List<String> getGnocchiAllaSorrentinaSteps() {
        return Arrays.asList(
                "Boil gnocchi in salted water until they float to the surface.",
                "In a skillet, heat olive oil and sauté garlic until fragrant.",
                "Add cherry tomatoes and cook until they burst.",
                "Stir in tomato sauce, salt, and red pepper flakes.",
                "Add cooked gnocchi to the skillet and toss until well coated.",
                "Stir in fresh mozzarella and basil.",
                "Serve hot, garnished with grated Parmesan cheese."
        );
    }

    private List<String> getBruschettaSteps() {
        return Arrays.asList(
                "Preheat the oven broiler.",
                "Slice a baguette into 1/2-inch thick slices.",
                "Place the slices on a baking sheet and brush with olive oil.",
                "Broil in the oven until golden and toasted.",
                "In a bowl, combine diced tomatoes, garlic, basil, and olive oil.",
                "Season with salt and pepper to taste.",
                "Top each toasted baguette slice with the tomato mixture.",
                "Serve immediately and enjoy!"
        );
    }

    private List<String> getLimoncelloTiramisuSteps() {
        return Arrays.asList(
                "Brew strong coffee and let it cool to room temperature.",
                "In a mixing bowl, combine egg yolks and sugar. Beat until thick and pale.",
                "Add mascarpone cheese and limoncello to the egg yolk mixture. Mix until smooth.",
                "In a separate bowl, beat egg whites until stiff peaks form.",
                "Gently fold the egg whites into the mascarpone mixture.",
                "Dip ladyfingers into the cooled coffee and layer them in the bottom of a serving dish.",
                "Spread half of the mascarpone mixture over the ladyfingers.",
                "Repeat the layers with another layer of dipped ladyfingers and mascarpone mixture.",
                "Dust the top with lemon zest.",
                "Chill in the refrigerator for at least 4 hours or overnight.",
                "Serve chilled and enjoy!"
        );
    }