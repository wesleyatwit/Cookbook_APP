package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {

// Italian Recipes
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
    
 // American Recipes
    private List<String> getCheeseburgerSteps() {
        return Arrays.asList(
                "Preheat the grill or stovetop pan to medium-high heat.",
                "Season ground beef with salt and pepper.",
                "Form beef into patties and grill for 3-4 minutes per side, or until cooked to your liking.",
                "Place cheese slices on the patties in the last minute of cooking to melt.",
                "Toast the burger buns on the grill or in a toaster.",
                "Assemble the burgers with lettuce, tomato, onion, and any desired condiments.",
                "Serve hot and enjoy!"
        );
    }
    private List<String> getHotDogSteps() {
        return Arrays.asList(
                "Preheat the grill or stovetop pan to medium heat.",
                "Grill hot dogs for 6-8 minutes, turning occasionally, until they are heated through and have grill marks.",
                "Warm the hot dog buns on the grill or in the oven.",
                "Place grilled hot dogs in the buns.",
                "Top with your favorite condiments, such as ketchup, mustard, relish, onions, and sauerkraut.",
                "Serve immediately and enjoy!"
        );
    }
    private List<String> getMacAndCheeseSteps() {
        return Arrays.asList(
                "Cook macaroni according to package instructions; drain and set aside.",
                "In a saucepan, melt butter over medium heat.",
                "Stir in flour to create a roux; cook for 1-2 minutes.",
                "Gradually whisk in milk until smooth and thickened.",
                "Add shredded cheese and stir until melted and creamy.",
                "Season with salt, pepper, and any desired spices.",
                "Combine the cheese sauce with the cooked macaroni.",
                "Serve hot and enjoy!"
        );
    }
    private List<String> getBarbecueRibsSteps() {
        return Arrays.asList(
                "Preheat the oven to 300°F (150°C).",
                "Season ribs with salt, pepper, and your favorite barbecue rub.",
                "Wrap the ribs in aluminum foil and place them on a baking sheet.",
                "Bake for 2.5 to 3 hours, or until the meat is tender and easily pulls away from the bone.",
                "Preheat a grill or broiler to medium-high heat.",
                "Brush the ribs with barbecue sauce and grill for 5-10 minutes on each side, basting with more sauce.",
                "Serve hot, garnished with chopped green onions or cilantro."
        );
    }
    private List<String> getBuffaloWingsSteps() {
        return Arrays.asList(
                "Preheat the oven to 400°F (200°C).",
                "In a bowl, toss chicken wings with oil, salt, and pepper.",
                "Place wings on a baking sheet in a single layer.",
                "Bake for 45-50 minutes, turning once, until wings are golden and crispy.",
                "In a saucepan, melt butter and whisk in hot sauce.",
                "Toss the baked wings in the sauce until well coated.",
                "Serve hot with celery sticks and blue cheese dressing."
        );
    }
    private List<String> getClamChowderSteps() {
        return Arrays.asList(
                "In a large pot, cook bacon until crispy. Remove bacon and set aside.",
                "Sauté onions, celery, and garlic in the bacon fat until softened.",
                "Add flour to create a roux; cook for 1-2 minutes.",
                "Gradually whisk in chicken broth and half-and-half until smooth and thickened.",
                "Stir in diced potatoes and bring to a simmer until potatoes are tender.",
                "Add clams and bacon to the pot, and season with salt, pepper, and thyme.",
                "Simmer for 10-15 minutes until flavors meld.",
                "Serve hot, garnished with fresh parsley."
        );
    }
    private List<String> getPancakesSteps() {
        return Arrays.asList(
                "In a bowl, whisk together flour, sugar, baking powder, and salt.",
                "In another bowl, whisk together milk, eggs, and melted butter.",
                "Pour the wet ingredients into the dry ingredients and stir until just combined.",
                "Preheat a griddle or non-stick pan over medium heat.",
                "Pour 1/4 cup of batter onto the griddle for each pancake.",
                "Cook until bubbles form on the surface, then flip and cook until golden brown.",
                "Serve hot with maple syrup and your favorite toppings."
        );
    }
    private List<String> getApplePieSteps() {
        return Arrays.asList(
                "Preheat the oven to 425°F (220°C).",
                "In a bowl, toss sliced apples with sugar, cinnamon, and flour.",
                "Roll out pie crust and place it in a pie dish.",
                "Fill the crust with the apple mixture and dot with butter.",
                "Cover with a second pie crust, crimping the edges to seal.",
                "Cut slits in the top crust to allow steam to escape.",
                "Bake for 45-50 minutes, or until the crust is golden brown.",
                "Let it cool before serving. Enjoy with a scoop of vanilla ice cream!"
        );
    }
    private List<String> getChocolateChipCookiesSteps() {
        return Arrays.asList(
                "Preheat the oven to 375°F (190°C).",
                "In a bowl, cream together butter, granulated sugar, and brown sugar.",
                "Beat in eggs, one at a time, then stir in vanilla.",
                "In a separate bowl, combine flour, baking soda, and salt.",
                "Gradually add the dry ingredients to the wet ingredients, mixing well.",
                "Fold in chocolate chips.",
                "Drop rounded tablespoons of dough onto ungreased baking sheets.",
                "Bake for 10-12 minutes, or until edges are golden brown.",
                "Let the cookies cool on the sheets for a few minutes before transferring to wire racks."
        );
    }
    private List<String> getBBQBurgerSteps() {
        return Arrays.asList(
                "Preheat the grill to medium-high heat.",
                "Season ground beef with barbecue seasoning.",
                "Form beef into patties and grill for 3-4 minutes per side, or until cooked to your liking.",
                "Grill pineapple slices for 1-2 minutes on each side.",
                "Toast the burger buns on the grill.",
                "Assemble the burgers with lettuce, barbecue sauce, grilled pineapple, and any desired toppings.",
                "Serve hot and enjoy!"
        );
    }
    
// French Recipes
    private List<String> getCoqAuVinSteps() {
        return Arrays.asList(
                "In a large pot, cook bacon until crispy. Remove bacon and set aside.",
                "Season chicken pieces with salt and pepper.",
                "In the same pot, brown chicken in bacon fat over medium-high heat. Remove chicken and set aside.",
                "Sauté onions, carrots, and garlic in the pot until softened.",
                "Stir in tomato paste and flour to create a roux.",
                "Pour in red wine, chicken broth, and add thyme and bay leaves.",
                "Return chicken and bacon to the pot. Bring to a simmer, cover, and cook for 1.5 to 2 hours.",
                "Add mushrooms and pearl onions. Simmer for an additional 30 minutes.",
                "Serve hot, garnished with fresh parsley."
        );
    }

    private List<String> getRatatouilleSteps() {
        return Arrays.asList(
                "Preheat the oven to 375°F (190°C).",
                "Slice eggplant, zucchini, and bell peppers into thin rounds.",
                "Arrange the sliced vegetables in a spiral pattern in a baking dish.",
                "Mix crushed tomatoes, garlic, and herbs. Pour over the vegetables.",
                "Drizzle olive oil over the top. Cover with foil and bake for 45 minutes.",
                "Remove the foil and bake for an additional 15-20 minutes until vegetables are tender.",
                "Serve hot, garnished with fresh basil."
        );
    }

    private List<String> getBeefBourguignonSteps() {
        return Arrays.asList(
                "Preheat the oven to 325°F (160°C).",
                "In a large Dutch oven, cook bacon until crispy. Remove bacon and set aside.",
                "Season beef chunks with salt and pepper. Brown in bacon fat over medium-high heat. Remove beef and set aside.",
                "Sauté onions, carrots, and garlic until softened.",
                "Stir in tomato paste and flour to create a roux.",
                "Pour in red wine, beef broth, and add thyme and bay leaves.",
                "Return beef and bacon to the pot. Bring to a simmer, cover, and bake for 2.5 to 3 hours.",
                "Add mushrooms and pearl onions. Simmer for an additional 30 minutes.",
                "Serve hot, garnished with fresh parsley."
        );
    }

    private List<String> getCroissantSteps() {
        return Arrays.asList(
                "In a bowl, combine warm milk, sugar, and yeast. Let it sit until frothy.",
                "Mix in flour, salt, and butter to form a dough. Knead until smooth.",
                "Cover and let the dough rise until doubled in size.",
                "Roll out the dough and fold it into thirds. Repeat twice, chilling between folds.",
                "Roll out the dough and cut into triangles. Roll each triangle into a croissant shape.",
                "Place croissants on a baking sheet, cover, and let them rise until puffy.",
                "Preheat the oven to 400°F (200°C). Brush croissants with egg wash.",
                "Bake for 15-20 minutes until golden brown.",
                "Serve warm and enjoy!"
        );
    }

    private List<String> getFrenchOnionSoupSteps() {
        return Arrays.asList(
                "In a large pot, melt butter over medium heat.",
                "Add sliced onions and cook until caramelized.",
                "Stir in flour to create a roux.",
                "Pour in beef broth and add thyme. Simmer for 20-30 minutes.",
                "Preheat the oven broiler.",
                "Toast baguette slices and place them on top of the soup in ovenproof bowls.",
                "Top with grated Gruyère cheese.",
                "Place bowls under the broiler until the cheese is melted and bubbly.",
                "Serve hot and enjoy!"
        );
    }

    private List<String> getCassouletSteps() {
        return Arrays.asList(
                "Preheat the oven to 350°F (175°C).",
                "In a large Dutch oven, cook bacon until crispy. Remove bacon and set aside.",
                "Season pork, sausages, and chicken with salt and pepper. Brown in bacon fat over medium-high heat. Remove and set aside.",
                "Sauté onions, carrots, and garlic until softened.",
                "Stir in tomato paste and flour to create a roux.",
                "Pour in chicken broth, white wine, and add thyme and bay leaves.",
                "Return meats and bacon to the pot. Bring to a simmer, cover, and bake for 1.5 to 2 hours.",
                "Stir in cannellini beans and breadcrumbs. Bake uncovered for an additional 30 minutes.",
                "Serve hot, garnished with fresh parsley."
        );
    }
    
    

}