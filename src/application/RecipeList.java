package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RecipeList {
// Italian Recipes
	static public List<String> getSpaghettiBologneseSteps() {
		return Arrays.asList("Boil water in a large pot.", "Cook spaghetti according to package instructions.",
				"In a separate pan, brown ground beef over medium heat.",
				"Add onions, garlic, and carrots to the pan. Cook until vegetables are soft.",
				"Stir in tomato paste, crushed tomatoes, and seasonings.", "Simmer the sauce for 15-20 minutes.",
				"Combine cooked spaghetti with the Bolognese sauce.", "Serve hot with grated Parmesan cheese on top.");
	}

	static public List<String> getMargheritaPizzaSteps() {
		return Arrays.asList("Preheat the oven to its highest temperature.",
				"Roll out pizza dough on a floured surface.", "Spread tomato sauce evenly on the dough.",
				"Place fresh mozzarella slices on the sauce.", "Add fresh basil leaves.",
				"Drizzle olive oil over the pizza.",
				"Bake in the preheated oven until the crust is golden and the cheese is melted.",
				"Remove from the oven, slice, and serve.");
	}

	static public List<String> getRisottoAlFunghiSteps() {
		return Arrays.asList("In a saucepan, heat chicken or vegetable broth.",
				"In a separate pan, sauté chopped onions in olive oil until translucent.",
				"Add Arborio rice to the pan and stir to coat the rice with oil.",
				"Pour in white wine and cook until it evaporates.",
				"Add a ladle of warm broth to the rice and stir until absorbed.",
				"Continue adding broth one ladle at a time, stirring constantly, until the rice is creamy and cooked to al dente.",
				"Stir in sliced mushrooms and Parmesan cheese.", "Season with salt and pepper to taste.",
				"Serve hot, garnished with chopped parsley.");
	}

	static public List<String> getOssoBucoSteps() {
		return Arrays.asList("Preheat the oven to 350°F (175°C).", "Season veal shanks with salt and pepper.",
				"Dredge shanks in flour, shaking off excess.",
				"In a large ovenproof skillet, heat olive oil over medium-high heat.",
				"Brown veal shanks on all sides.", "Remove shanks and set aside.",
				"In the same skillet, sauté onions, carrots, and celery until softened.",
				"Add tomato paste and garlic, cook for 1-2 minutes.",
				"Pour in white wine and scrape up any browned bits from the bottom of the pan.",
				"Return veal shanks to the skillet, add broth, tomatoes, and bay leaves.",
				"Cover and transfer to the preheated oven. Braise for about 2 hours or until the meat is tender.",
				"Serve hot, garnished with gremolata.");
	}

	static public List<String> getTiramisuSteps() {
		return Arrays.asList("Brew strong coffee and let it cool to room temperature.",
				"In a mixing bowl, combine egg yolks and sugar. Beat until thick and pale.",
				"Add mascarpone cheese to the egg yolk mixture. Mix until smooth.",
				"In a separate bowl, beat egg whites until stiff peaks form.",
				"Gently fold the egg whites into the mascarpone mixture.",
				"Dip ladyfingers into the cooled coffee and layer them in the bottom of a serving dish.",
				"Spread half of the mascarpone mixture over the ladyfingers.",
				"Repeat the layers with another layer of dipped ladyfingers and mascarpone mixture.",
				"Dust the top with cocoa powder.", "Chill in the refrigerator for at least 4 hours or overnight.",
				"Serve chilled and enjoy!");
	}

	static public List<String> getFettuccineAlfredoSteps() {
		return Arrays.asList("Cook fettuccine pasta according to package instructions.",
				"In a saucepan, melt butter over medium heat.", "Add heavy cream and bring to a simmer.",
				"Stir in grated Parmesan cheese until the sauce is smooth and creamy.",
				"Season with salt and white pepper to taste.",
				"Toss the cooked fettuccine in the Alfredo sauce until well coated.",
				"Serve hot, garnished with additional Parmesan and chopped parsley if desired.");
	}

	static public List<String> getCapreseSaladSteps() {
		return Arrays.asList("Slice fresh tomatoes and mozzarella into 1/4-inch thick slices.",
				"Arrange tomato and mozzarella slices on a serving platter, alternating and overlapping them.",
				"Tuck fresh basil leaves between the tomato and mozzarella slices.",
				"Drizzle extra virgin olive oil over the salad.",
				"Sprinkle with balsamic glaze and season with salt and pepper to taste.",
				"Serve immediately and enjoy!");
	}

	static public List<String> getGnocchiAllaSorrentinaSteps() {
		return Arrays.asList("Boil gnocchi in salted water until they float to the surface.",
				"In a skillet, heat olive oil and sauté garlic until fragrant.",
				"Add cherry tomatoes and cook until they burst.", "Stir in tomato sauce, salt, and red pepper flakes.",
				"Add cooked gnocchi to the skillet and toss until well coated.", "Stir in fresh mozzarella and basil.",
				"Serve hot, garnished with grated Parmesan cheese.");
	}

	static public List<String> getBruschettaSteps() {
		return Arrays.asList("Preheat the oven broiler.", "Slice a baguette into 1/2-inch thick slices.",
				"Place the slices on a baking sheet and brush with olive oil.",
				"Broil in the oven until golden and toasted.",
				"In a bowl, combine diced tomatoes, garlic, basil, and olive oil.",
				"Season with salt and pepper to taste.", "Top each toasted baguette slice with the tomato mixture.",
				"Serve immediately and enjoy!");
	}

	static public List<String> getLimoncelloTiramisuSteps() {
		return Arrays.asList("Brew strong coffee and let it cool to room temperature.",
				"In a mixing bowl, combine egg yolks and sugar. Beat until thick and pale.",
				"Add mascarpone cheese and limoncello to the egg yolk mixture. Mix until smooth.",
				"In a separate bowl, beat egg whites until stiff peaks form.",
				"Gently fold the egg whites into the mascarpone mixture.",
				"Dip ladyfingers into the cooled coffee and layer them in the bottom of a serving dish.",
				"Spread half of the mascarpone mixture over the ladyfingers.",
				"Repeat the layers with another layer of dipped ladyfingers and mascarpone mixture.",
				"Dust the top with lemon zest.", "Chill in the refrigerator for at least 4 hours or overnight.",
				"Serve chilled and enjoy!");
	}

	// American Recipes
	static public List<String> getCheeseburgerSteps() {
		return Arrays.asList("Preheat the grill or stovetop pan to medium-high heat.",
				"Season ground beef with salt and pepper.",
				"Form beef into patties and grill for 3-4 minutes per side, or until cooked to your liking.",
				"Place cheese slices on the patties in the last minute of cooking to melt.",
				"Toast the burger buns on the grill or in a toaster.",
				"Assemble the burgers with lettuce, tomato, onion, and any desired condiments.",
				"Serve hot and enjoy!");
	}

	static public List<String> getBurgerSteps() {
		return Arrays.asList("Preheat the grill to medium-high heat.", "Season ground beef with salt and pepper.",
				"Form beef into patties and grill for 3-4 minutes per side, or until cooked to your liking.",
				"Toast the burger buns on the grill.",
				"Assemble the burgers with lettuce, tomato slices, onion, ketchup, and mustard.",
				"Serve hot and enjoy your classic regular burger!");
	}

	static public List<String> getHotDogSteps() {
		return Arrays.asList("Preheat the grill or stovetop pan to medium heat.",
				"Grill hot dogs for 6-8 minutes, turning occasionally, until they are heated through and have grill marks.",
				"Warm the hot dog buns on the grill or in the oven.", "Place grilled hot dogs in the buns.",
				"Top with your favorite condiments, such as ketchup, mustard, relish, onions, and sauerkraut.",
				"Serve immediately and enjoy!");
	}

	static public List<String> getMacAndCheeseSteps() {
		return Arrays.asList("Cook macaroni according to package instructions; drain and set aside.",
				"In a saucepan, melt butter over medium heat.", "Stir in flour to create a roux; cook for 1-2 minutes.",
				"Gradually whisk in milk until smooth and thickened.",
				"Add shredded cheese and stir until melted and creamy.",
				"Season with salt, pepper, and any desired spices.",
				"Combine the cheese sauce with the cooked macaroni.", "Serve hot and enjoy!");
	}

	static public List<String> getBarbecueRibsSteps() {
		return Arrays.asList("Preheat the oven to 300°F (150°C).",
				"Season ribs with salt, pepper, and your favorite barbecue rub.",
				"Wrap the ribs in aluminum foil and place them on a baking sheet.",
				"Bake for 2.5 to 3 hours, or until the meat is tender and easily pulls away from the bone.",
				"Preheat a grill or broiler to medium-high heat.",
				"Brush the ribs with barbecue sauce and grill for 5-10 minutes on each side, basting with more sauce.",
				"Serve hot, garnished with chopped green onions or cilantro.");
	}

	static public List<String> getBuffaloWingsSteps() {
		return Arrays.asList("Preheat the oven to 400°F (200°C).",
				"In a bowl, toss chicken wings with oil, salt, and pepper.",
				"Place wings on a baking sheet in a single layer.",
				"Bake for 45-50 minutes, turning once, until wings are golden and crispy.",
				"In a saucepan, melt butter and whisk in hot sauce.",
				"Toss the baked wings in the sauce until well coated.",
				"Serve hot with celery sticks and blue cheese dressing.");
	}

	static public List<String> getClamChowderSteps() {
		return Arrays.asList("In a large pot, cook bacon until crispy. Remove bacon and set aside.",
				"Sauté onions, celery, and garlic in the bacon fat until softened.",
				"Add flour to create a roux; cook for 1-2 minutes.",
				"Gradually whisk in chicken broth and half-and-half until smooth and thickened.",
				"Stir in diced potatoes and bring to a simmer until potatoes are tender.",
				"Add clams and bacon to the pot, and season with salt, pepper, and thyme.",
				"Simmer for 10-15 minutes until flavors meld.", "Serve hot, garnished with fresh parsley.");
	}

	static public List<String> getPancakesSteps() {
		return Arrays.asList("In a bowl, whisk together flour, sugar, baking powder, and salt.",
				"In another bowl, whisk together milk, eggs, and melted butter.",
				"Pour the wet ingredients into the dry ingredients and stir until just combined.",
				"Preheat a griddle or non-stick pan over medium heat.",
				"Pour 1/4 cup of batter onto the griddle for each pancake.",
				"Cook until bubbles form on the surface, then flip and cook until golden brown.",
				"Serve hot with maple syrup and your favorite toppings.");
	}

	static public List<String> getApplePieSteps() {
		return Arrays.asList("Preheat the oven to 425°F (220°C).",
				"In a bowl, toss sliced apples with sugar, cinnamon, and flour.",
				"Roll out pie crust and place it in a pie dish.",
				"Fill the crust with the apple mixture and dot with butter.",
				"Cover with a second pie crust, crimping the edges to seal.",
				"Cut slits in the top crust to allow steam to escape.",
				"Bake for 45-50 minutes, or until the crust is golden brown.",
				"Let it cool before serving. Enjoy with a scoop of vanilla ice cream!");
	}

	static public List<String> getChocolateChipCookiesSteps() {
		return Arrays.asList("Preheat the oven to 375°F (190°C).",
				"In a bowl, cream together butter, granulated sugar, and brown sugar.",
				"Beat in eggs, one at a time, then stir in vanilla.",
				"In a separate bowl, combine flour, baking soda, and salt.",
				"Gradually add the dry ingredients to the wet ingredients, mixing well.", "Fold in chocolate chips.",
				"Drop rounded tablespoons of dough onto ungreased baking sheets.",
				"Bake for 10-12 minutes, or until edges are golden brown.",
				"Let the cookies cool on the sheets for a few minutes before transferring to wire racks.");
	}

	static public List<String> getChickenPotPieSteps() {
		return Arrays.asList("Preheat the oven to 425°F (220°C).",
				"In a large skillet, melt butter over medium heat. Add diced chicken and cook until browned.",
				"Add diced potatoes, carrots, peas, and diced onions to the skillet. Cook until vegetables are slightly softened.",
				"Sprinkle flour over the mixture and stir to combine, cooking for an additional 2 minutes.",
				"Gradually whisk in chicken broth and milk, ensuring a smooth consistency. Cook until the mixture thickens.",
				"Season with salt, pepper, and any desired herbs or spices.",
				"Pour the chicken and vegetable mixture into a prepared pie crust.",
				"Place the second pie crust on top, sealing the edges and cutting a few slits in the center for ventilation.",
				"Bake in the preheated oven for 30-35 minutes or until the crust is golden brown.",
				"Remove from the oven and let it cool for a few minutes before serving.",
				"Enjoy your delicious homemade Chicken Pot Pie!");
	}

	// French Recipes
	static public List<String> getCoqAuVinSteps() {
		return Arrays.asList("Season chicken with salt and pepper.",
				"In a large pot, brown chicken in olive oil over medium-high heat.",
				"Remove chicken and sauté onions, carrots, and mushrooms until softened.",
				"Add tomato paste and garlic; cook for 1-2 minutes.",
				"Pour in red wine, chicken broth, and add thyme and bay leaves.",
				"Return chicken to the pot and bring to a simmer.",
				"Cover and simmer for 45-50 minutes, or until chicken is cooked through.",
				"Serve hot, garnished with fresh parsley.");
	}

	static public List<String> getRatatouilleSteps() {
		return Arrays.asList("Preheat the oven to 375°F (190°C).",
				"Spread tomato slices in a baking dish and drizzle with olive oil.",
				"Layer zucchini, eggplant, and bell pepper slices on top of tomatoes.",
				"Sprinkle garlic, thyme, and rosemary over the vegetables.",
				"Cover the dish with parchment paper and bake for 30 minutes.",
				"Uncover and bake for an additional 20-25 minutes until vegetables are tender.",
				"Serve warm, garnished with fresh basil.");
	}

	static public List<String> getCroissantSteps() {
		return Arrays.asList("In a bowl, dissolve yeast in warm milk and let it sit for 5 minutes.",
				"In a large mixing bowl, combine flour, sugar, and salt.",
				"Cut in butter until the mixture resembles coarse crumbs.",
				"Stir in the yeast mixture and knead the dough until smooth.",
				"Roll out the dough into a rectangle, then fold it into thirds.",
				"Repeat the rolling and folding process three times.",
				"Chill the dough for at least 2 hours or overnight.",
				"Roll out the chilled dough, cut into triangles, and roll into croissants.",
				"Bake at 400°F (200°C) for 15-20 minutes, until golden brown.");
	}

	static public List<String> getEscargotSteps() {
		return Arrays.asList("Preheat the oven to 400°F (200°C).",
				"Clean and prepare snails according to package instructions.",
				"In a bowl, mix together softened butter, garlic, parsley, salt, and pepper.",
				"Place a small amount of the butter mixture into each snail shell.",
				"Insert a snail into each shell and top with more butter mixture.",
				"Place snails in a baking dish and bake for 10-12 minutes.",
				"Serve hot with crusty bread for dipping.");
	}

	static public List<String> getQuicheLorraineSteps() {
		return Arrays.asList("Preheat the oven to 375°F (190°C).",
				"In a skillet, cook bacon until crispy. Remove and crumble.",
				"Sauté onions in bacon fat until translucent.",
				"In a bowl, whisk together eggs, cream, salt, and pepper.",
				"Spread bacon and onions in a pre-baked pie crust.", "Pour the egg mixture over the bacon and onions.",
				"Bake for 30-35 minutes, or until the quiche is set and golden brown.",
				"Let it cool for a few minutes before slicing.");
	}

	static public List<String> getBouillabaisseSteps() {
		return Arrays.asList("In a large pot, sauté onions, leeks, and garlic in olive oil until softened.",
				"Add tomato paste, tomatoes, fennel, and orange zest. Cook for 5 minutes.",
				"Pour in white wine and fish stock. Bring to a simmer.",
				"Add various Mediterranean fish and shellfish to the pot.",
				"Season with saffron, cayenne pepper, salt, and pepper.",
				"Simmer for 25-30 minutes, or until the seafood is cooked through.",
				"Serve hot, garnished with fresh parsley and a side of rouille.");
	}

	static public List<String> getCrepesSteps() {
		return Arrays.asList("In a blender, combine flour, milk, eggs, sugar, salt, and melted butter.",
				"Blend until smooth and let the batter rest for 30 minutes.",
				"Heat a non-stick skillet over medium heat and brush with butter.",
				"Pour a small amount of batter into the skillet, swirling to coat the bottom evenly.",
				"Cook for 1-2 minutes, then flip and cook for an additional 1-2 minutes.",
				"Repeat with the remaining batter.", "Fill crepes with sweet or savory ingredients of your choice.",
				"Serve warm and enjoy!");
	}

	static public List<String> getCassouletSteps() {
		return Arrays.asList("Preheat the oven to 350°F (175°C).",
				"In a large Dutch oven, cook bacon until crispy. Remove and set aside.",
				"Season pork and sausages with salt and pepper, then brown in bacon fat.",
				"Add onions, carrots, and garlic to the pot; cook until softened.",
				"Stir in tomato paste and cook for 1-2 minutes.",
				"Pour in chicken broth and white wine; bring to a simmer.", "Add white beans, thyme, and bay leaves.",
				"Place the pot in the preheated oven and bake for 1.5 to 2 hours, or until the cassoulet is bubbly and golden.",
				"Serve hot, garnished with chopped parsley.");
	}

	static public List<String> getSaladeNicoiseSteps() {
		return Arrays.asList("Cook and cool green beans, then arrange them on a serving platter.",
				"Arrange tuna, hard-boiled eggs, tomatoes, olives, and anchovies on top of the green beans.",
				"Whisk together olive oil, red wine vinegar, Dijon mustard, salt, and pepper to make the dressing.",
				"Drizzle the dressing over the salad just before serving.", "Serve chilled and enjoy!");
	}

	static public List<String> getTarteTatinSteps() {
		return Arrays.asList("Preheat the oven to 375°F (190°C).", "In a skillet, melt butter over medium heat.",
				"Add sugar and cook until it caramelizes and turns golden brown.",
				"Place apple halves, cut side down, in the caramelized sugar.",
				"Roll out puff pastry and place it over the apples.",
				"Bake for 25-30 minutes, or until the pastry is golden and crisp.",
				"Let it cool for a few minutes, then invert onto a serving platter.",
				"Serve warm, and enjoy with a dollop of whipped cream or vanilla ice cream.");
	}

	// Korean Recipes
	static public List<String> getBibimbapSteps() {
		return Arrays.asList("Cook rice according to package instructions.",
				"In a skillet, sauté julienned vegetables separately until tender-crisp.",
				"Season each type of vegetable with salt and sesame oil.",
				"Marinate thinly sliced beef in a mixture of soy sauce, sugar, sesame oil, and pepper.",
				"Cook the marinated beef in the skillet until done.", "Fry eggs sunny-side-up.",
				"Assemble the bibimbap bowls with rice, vegetables, and beef on top.",
				"Place a fried egg on each bowl.", "Serve hot with gochujang (spicy red pepper paste) on the side.");
	}

	static public List<String> getKimchiJjigaeSteps() {
		return Arrays.asList("In a pot, sauté sliced pork until browned.",
				"Add kimchi, tofu, and sliced vegetables to the pot.", "Pour in water or broth and bring to a simmer.",
				"Season with gochugaru (Korean red pepper flakes), gochujang (red pepper paste), and soy sauce.",
				"Simmer for 20-25 minutes until flavors meld.", "Serve hot, garnished with green onions.");
	}

	static public List<String> getBulgogiSteps() {
		return Arrays.asList(
				"Thinly slice beef and marinate in a mixture of soy sauce, sugar, sesame oil, garlic, and pepper.",
				"Let the beef marinate for at least 30 minutes.", "Heat a skillet or grill over medium-high heat.",
				"Cook the marinated beef slices until browned and cooked through.",
				"Serve hot with rice and side dishes.");
	}

	static public List<String> getJapchaeSteps() {
		return Arrays.asList("Cook glass noodles according to package instructions.",
				"In a skillet, sauté julienned vegetables and beef until tender.",
				"Season with soy sauce, sugar, and sesame oil.",
				"Add the cooked noodles to the skillet and toss to combine.",
				"Garnish with sesame seeds and green onions.", "Serve hot or at room temperature.");
	}

	static public List<String> getSundubuJjigaeSteps() {
		return Arrays.asList("In a pot, sauté minced garlic in sesame oil until fragrant.",
				"Add kimchi, gochugaru (Korean red pepper flakes), and soy sauce; sauté for a few minutes.",
				"Pour in water or broth and bring to a simmer.", "Add soft tofu and simmer until heated through.",
				"Season with salt and pepper.", "Serve hot, garnished with green onions.");
	}

	static public List<String> getSamgyeopsalSteps() {
		return Arrays.asList("Slice pork belly into thin strips.",
				"Grill the pork strips on a barbecue or stovetop grill until browned and cooked through.",
				"Serve hot with dipping sauces and side dishes.");
	}

	static public List<String> getDolsotBibimbapSteps() {
		return Arrays.asList("Prepare rice and vegetables as in regular bibimbap.",
				"In a hot stone pot (dolsot), add a layer of rice and arrange vegetables and beef on top.",
				"Cook the bibimbap in the stone pot until the rice at the bottom becomes crispy.",
				"Top with a fried egg and serve hot with gochujang on the side.");
	}

	static public List<String> getKimchiFriedRiceSteps() {
		return Arrays.asList("In a skillet, sauté chopped kimchi and vegetables in sesame oil until tender.",
				"Add cooked rice to the skillet and stir-fry until well combined.",
				"Season with soy sauce and gochujang to taste.",
				"Push the rice to the side, add a little more oil, and cook a beaten egg.",
				"Stir the cooked egg into the rice and mix well.", "Serve hot, garnished with green onions.");
	}

	static public List<String> getKimbapSteps() {
		return Arrays.asList("Place a sheet of seaweed on a bamboo sushi mat.",
				"Spread a thin layer of rice over the seaweed, leaving a border at the top.",
				"Arrange julienned vegetables, meat, and pickled radish on the rice.",
				"Roll the kimbap tightly using the sushi mat.", "Slice the rolled kimbap into bite-sized pieces.",
				"Serve chilled with soy sauce for dipping.");
	}

	static public List<String> getHaemulPajeonSteps() {
		return Arrays.asList("In a bowl, mix flour, water, and egg to make the pancake batter.",
				"Add chopped seafood, green onions, and vegetables to the batter.",
				"Heat a skillet with oil and pour in the pancake batter.",
				"Cook until the edges are crispy and the pancake is golden brown.",
				"Flip and cook the other side until browned.", "Serve hot, cut into slices, with dipping sauce.");
	}

	// Chinese Recipes
	static public List<String> getSweetAndSourChickenSteps() {
		return Arrays.asList("Cut chicken into bite-sized pieces.",
				"Dip chicken pieces in a batter of flour, cornstarch, and water.",
				"Deep-fry chicken until golden and crispy.",
				"In a wok, stir-fry bell peppers, onions, and pineapple chunks.",
				"Prepare sweet and sour sauce by combining vinegar, sugar, ketchup, and soy sauce.",
				"Add the sauce to the wok and bring to a simmer.",
				"Toss the fried chicken in the sweet and sour sauce until well coated.",
				"Serve hot with steamed rice.");
	}

	static public List<String> getKungPaoChickenSteps() {
		return Arrays.asList("Cut chicken into bite-sized pieces.",
				"Marinate chicken in soy sauce, rice wine, and cornstarch.",
				"In a wok, stir-fry marinated chicken until browned and cooked through.",
				"Add peanuts, diced vegetables, and dried red chilies to the wok.",
				"In a bowl, mix soy sauce, rice vinegar, sugar, and sesame oil to make the sauce.",
				"Pour the sauce over the chicken and vegetables.", "Toss until everything is coated in the sauce.",
				"Serve hot with steamed rice.");
	}

	static public List<String> getDimSumSteps() {
		return Arrays.asList("Prepare various dim sum dishes such as dumplings, buns, and rolls.",
				"Steam the dim sum in bamboo steamer baskets.",
				"Serve the dim sum in the steamer baskets for an authentic presentation.",
				"Offer a variety of dipping sauces for added flavor.");
	}

	static public List<String> getPekingDuckSteps() {
		return Arrays.asList("Rub duck with a mixture of honey, soy sauce, and five-spice powder.",
				"Air-dry the duck for a few hours or overnight.",
				"Roast the duck until the skin is crispy and the meat is cooked.",
				"Serve the duck with thin pancakes, hoisin sauce, and sliced scallions.");
	}

	static public List<String> getMapoTofuSteps() {
		return Arrays.asList("In a wok, brown minced meat with garlic and ginger.",
				"Add tofu cubes and stir gently to avoid breaking the tofu.",
				"Pour in a mixture of soy sauce, fermented black beans, and chili oil.",
				"Simmer until the tofu is heated through and coated in the flavorful sauce.",
				"Serve hot, garnished with green onions.");
	}

	static public List<String> getChowMeinSteps() {
		return Arrays.asList("Cook noodles according to package instructions.",
				"In a wok, stir-fry julienned vegetables and meat until tender.",
				"Add cooked noodles to the wok and toss until well combined.",
				"Season with soy sauce, oyster sauce, and sesame oil.", "Stir-fry until everything is heated through.",
				"Serve hot and enjoy!");
	}

	static public List<String> getHotPotSteps() {
		return Arrays.asList("Prepare a pot of broth and place it at the center of the dining table.",
				"Set out plates of thinly sliced meats, vegetables, and other desired ingredients.",
				"Each diner cooks their own ingredients in the hot pot.",
				"Dip the cooked items in various sauces for added flavor.",
				"Enjoy the interactive and communal dining experience.");
	}

	static public List<String> getSpringRollsSteps() {
		return Arrays.asList("Prepare a filling of julienned vegetables, meat, and sometimes shrimp.",
				"Place a spoonful of the filling on a spring roll wrapper.",
				"Roll the wrapper, folding in the sides, to form a tight cylinder.",
				"Seal the edge with a flour and water paste.",
				"Deep-fry the spring rolls until golden brown and crispy.", "Serve hot with dipping sauce.");
	}

	static public List<String> getGeneralTsosChickenSteps() {
		return Arrays.asList("Cut chicken into bite-sized pieces.",
				"Dip chicken pieces in a batter of flour, cornstarch, and water.",
				"Deep-fry chicken until golden and crispy.",
				"In a wok, stir-fry dried red chilies, garlic, and ginger until aromatic.",
				"Prepare a sauce with soy sauce, sugar, vinegar, and chicken broth.",
				"Add the fried chicken to the wok and toss until well coated.", "Serve hot with steamed rice.");
	}

	static public List<String> getEggFriedRiceSteps() {
		return Arrays.asList("Cook rice and let it cool.",
				"In a wok, heat oil and stir-fry diced vegetables until tender.",
				"Push the vegetables to the side and pour beaten eggs into the wok.",
				"Scramble the eggs until cooked and mix with the vegetables.",
				"Add the cooled rice to the wok and stir-fry until well combined.",
				"Season with soy sauce and salt to taste.", "Serve hot as a delicious side dish or main course.");
	}

	// Creole Recipes
	static public List<String> getGumboSteps() {
		return Arrays.asList("Make a dark roux by stirring flour and oil over medium heat until it turns dark brown.",
				"Add the 'holy trinity' (onions, bell peppers, and celery) to the roux and cook until softened.",
				"Stir in garlic, smoked sausage, and other desired meats.",
				"Pour in chicken or seafood stock and bring to a simmer.",
				"Add okra, tomatoes, and a variety of spices, such as thyme and bay leaves.",
				"Simmer the gumbo for at least 30-45 minutes until flavors meld.", "Serve hot over rice.");
	}

	static public List<String> getJambalayaSteps() {
		return Arrays.asList("In a large pot, sauté diced onions, bell peppers, and celery until softened.",
				"Add diced meat (such as chicken, sausage, and/or shrimp) and cook until browned.",
				"Stir in rice, diced tomatoes, and a variety of spices, such as paprika and cayenne pepper.",
				"Pour in chicken or seafood stock and bring to a simmer.",
				"Cover and cook until rice is tender and has absorbed the flavors of the dish.",
				"Serve hot as a flavorful one-pot meal.");
	}

	static public List<String> getShrimpAndGritsSteps() {
		return Arrays.asList("Prepare creamy grits according to package instructions.",
				"In a skillet, sauté shrimp in butter with garlic and Cajun seasoning until pink and cooked through.",
				"Serve the sautéed shrimp over the creamy grits.",
				"Garnish with chopped green onions and a drizzle of hot sauce if desired.",
				"Enjoy this classic Southern dish!");
	}

	static public List<String> getEtouffeeSteps() {
		return Arrays.asList(
				"In a skillet, make a roux by stirring flour and oil over medium heat until it turns golden brown.",
				"Add diced onions, bell peppers, and celery to the roux and cook until softened.",
				"Stir in diced shellfish, such as crawfish, and cook until browned.",
				"Pour in chicken or seafood stock and bring to a simmer.",
				"Season with spices like cayenne pepper, thyme, and bay leaves.",
				"Simmer until the etouffee is thick and flavorful.", "Serve hot over rice.");
	}

	static public List<String> getRedBeansAndRiceSteps() {
		return Arrays.asList("Soak red beans in water overnight or use canned beans for a quicker preparation.",
				"In a pot, sauté diced onions, bell peppers, and celery until softened.",
				"Add smoked sausage and diced ham to the pot and cook until browned.",
				"Stir in soaked or canned red beans, chicken broth, and a variety of spices.",
				"Simmer until the red beans are tender and the flavors meld.", "Serve hot over rice.");
	}

	static public List<String> getCrawfishBoilSteps() {
		return Arrays.asList(
				"Boil a large pot of water with Cajun spices, such as cayenne pepper, garlic, and onion powder.",
				"Add whole crawfish, potatoes, corn, and any desired extras like sausage.",
				"Boil until the crawfish are bright red and the other ingredients are tender.",
				"Drain and serve the crawfish boil on a large table covered with newspaper for a festive and communal experience.");
	}

	static public List<String> getDirtyRiceSteps() {
		return Arrays.asList("Cook rice according to package instructions.",
				"In a skillet, sauté diced onions, bell peppers, and celery until softened.",
				"Add ground meat (such as pork or beef) and cook until browned.",
				"Stir in spices like paprika and cayenne pepper for flavor.",
				"Mix the cooked rice into the skillet until well combined.",
				"Serve hot as a flavorful side dish or main course.");
	}

	static public List<String> getBananasFosterSteps() {
		return Arrays.asList("In a skillet, melt butter and stir in brown sugar until dissolved.",
				"Add sliced bananas to the skillet and cook until softened.",
				"Carefully add rum to the skillet and ignite with a flame for a dramatic presentation.",
				"Let the flames subside and serve the bananas foster over vanilla ice cream.",
				"Enjoy this decadent and flambeed dessert!");
	}

	static public List<String> getMuffulettaSteps() {
		return Arrays.asList("Slice a round loaf of Italian bread horizontally.",
				"Spread olive salad over the cut sides of the bread.",
				"Layer various deli meats and cheeses on the bottom half of the bread.",
				"Place the other half of the bread on top and press down gently.",
				"Cut into wedges and serve this flavorful sandwich.");
	}

	static public List<String> getKingCakeSteps() {
		return Arrays.asList("Prepare a sweet yeast dough and roll it out into a rectangle.",
				"Sprinkle cinnamon and sugar over the dough.",
				"Roll the dough into a log and shape it into an oval or ring.",
				"Bake until golden brown and let it cool.",
				"Decorate the king cake with colored icing and sugar in traditional Mardi Gras colors.",
				"Hide a small plastic baby in the cake, and whoever finds it is king for the day!");
	}

	// Cajun Recipes
	static public List<String> getCajunShrimpAndGritsSteps() {
		return Arrays.asList("Prepare creamy grits according to package instructions.",
				"In a skillet, sauté shrimp with Cajun seasoning until pink and cooked through.",
				"Serve the spicy shrimp over the creamy grits.",
				"Garnish with chopped green onions and a squeeze of lemon juice.",
				"Enjoy this Cajun twist on a classic dish!");
	}

	static public List<String> getCajunChickenPastaSteps() {
		return Arrays.asList("Cook pasta according to package instructions.",
				"In a skillet, cook Cajun-seasoned chicken until browned and cooked through.",
				"Add bell peppers, onions, and garlic to the skillet and sauté until softened.",
				"Stir in heavy cream, chicken broth, and Cajun spices to create a creamy sauce.",
				"Toss the cooked pasta in the Cajun cream sauce until well coated.",
				"Serve hot, garnished with grated Parmesan and chopped parsley.");
	}

	static public List<String> getBlackenedCatfishSteps() {
		return Arrays.asList("Mix together Cajun spices, such as paprika, cayenne pepper, and thyme.",
				"Coat catfish fillets with the spice mixture, ensuring they are well covered.",
				"Heat a skillet over medium-high heat and pan-sear the catfish until blackened on both sides.",
				"Serve hot with a side of rice or vegetables.", "Enjoy this flavorful and spicy catfish dish!");
	}

	static public List<String> getAndouilleSausageGumboSteps() {
		return Arrays.asList("Make a dark roux by stirring flour and oil over medium heat until it turns dark brown.",
				"Add the 'holy trinity' (onions, bell peppers, and celery) to the roux and cook until softened.",
				"Stir in sliced Andouille sausage, chicken, and seafood.",
				"Pour in chicken or seafood stock and bring to a simmer.",
				"Add okra, tomatoes, and a variety of spices, such as thyme and bay leaves.",
				"Simmer the gumbo for at least 30-45 minutes until flavors meld.", "Serve hot over rice.");
	}

	static public List<String> getCajunDirtyRiceSteps() {
		return Arrays.asList("Cook rice according to package instructions.",
				"In a skillet, sauté diced onions, bell peppers, and celery until softened.",
				"Add ground meat (such as pork or beef) and cook until browned.",
				"Stir in spices like paprika and cayenne pepper for flavor.",
				"Mix the cooked rice into the skillet until well combined.",
				"Serve hot as a flavorful side dish or main course.");
	}

	static public List<String> getCrawfishEtouffeeSteps() {
		return Arrays.asList(
				"In a skillet, make a roux by stirring flour and oil over medium heat until it turns golden brown.",
				"Add diced onions, bell peppers, and celery to the roux and cook until softened.",
				"Stir in peeled crawfish tails and cook until they are pink and cooked through.",
				"Pour in chicken or seafood stock and bring to a simmer.",
				"Season with spices like cayenne pepper, thyme, and bay leaves.",
				"Simmer until the etouffee is thick and flavorful.", "Serve hot over rice.");
	}

	static public List<String> getCajunBoudinSteps() {
		return Arrays.asList("Cook pork and rice separately, then combine them in a large mixing bowl.",
				"Add Cajun spices, such as cayenne pepper, garlic, and onion powder.",
				"Mix well and stuff the boudin mixture into sausage casings.",
				"Steam or boil the boudin sausages until cooked through.", "Serve hot and enjoy this Cajun delicacy!");
	}

	static public List<String> getCajunRedBeansAndRiceSteps() {
		return Arrays.asList("Soak red beans in water overnight or use canned beans for a quicker preparation.",
				"In a pot, sauté diced onions, bell peppers, and celery until softened.",
				"Add sliced Andouille sausage and diced ham to the pot and cook until browned.",
				"Stir in soaked or canned red beans, chicken broth, and a variety of spices.",
				"Simmer until the red beans are tender and the flavors meld.", "Serve hot over rice.");
	}

	static public List<String> getCajunShrimpBoilSteps() {
		return Arrays.asList(
				"Boil a large pot of water with Cajun spices, such as cayenne pepper, garlic, and onion powder.",
				"Add shrimp, corn, potatoes, and sausage to the boiling water.",
				"Boil until the shrimp are pink, and the other ingredients are tender.",
				"Drain the Cajun shrimp boil and serve it on a large table covered with newspaper for a festive and communal experience.");
	}

	static public List<String> getCajunChickenJambalayaSteps() {
		return Arrays.asList("In a large pot, sauté diced onions, bell peppers, and celery until softened.",
				"Add diced chicken and Andouille sausage, cooking until browned.",
				"Stir in rice, diced tomatoes, and a variety of spices, such as paprika and cayenne pepper.",
				"Pour in chicken broth and bring to a simmer.",
				"Cover and cook until rice is tender and has absorbed the flavors of the dish.",
				"Serve hot as a flavorful one-pot meal.");
	}

	// Mexican Recipes
	static public List<String> getTacosAlPastorSteps() {
		return Arrays.asList("Marinate pork with achiote paste, pineapple, and various spices.",
				"Thread marinated pork onto a vertical rotisserie and cook until crispy and flavorful.",
				"Slice the roasted pork thinly and serve in tortillas.",
				"Top with diced onions, cilantro, pineapple, and your favorite salsa.",
				"Enjoy these delicious and flavorful tacos al pastor!");
	}

	static public List<String> getGuacamoleSteps() {
		return Arrays.asList("Mash ripe avocados in a bowl with a fork or potato masher.",
				"Add diced tomatoes, finely chopped onions, minced garlic, and chopped cilantro.",
				"Squeeze fresh lime juice into the mixture and season with salt.",
				"Mix everything together until well combined.",
				"Serve guacamole with tortilla chips or as a topping for tacos.");
	}

	static public List<String> getEnchiladasSteps() {
		return Arrays.asList("Prepare a filling, such as shredded chicken or beef, and set aside.",
				"Warm corn tortillas in a dry skillet or microwave until pliable.",
				"Place a portion of the filling on each tortilla and roll it up.",
				"Arrange the rolled tortillas in a baking dish and cover with chili sauce and cheese.",
				"Bake until the cheese is melted and bubbly.", "Serve hot with sour cream, guacamole, and salsa.");
	}

	static public List<String> getChilesRellenosSteps() {
		return Arrays.asList("Roast or fry poblano peppers until the skins are charred.",
				"Peel the peppers, make a slit, and remove seeds while keeping them whole.",
				"Stuff the peppers with cheese or meat filling.",
				"Dip the stuffed peppers in egg batter and fry until golden brown.",
				"Serve hot with tomato sauce or salsa.", "Enjoy these delicious stuffed peppers!");
	}

	static public List<String> getMolePoblanoSteps() {
		return Arrays.asList("Toast and blend various chili peppers, chocolate, and spices.",
				"In a saucepan, simmer the blended mixture until it thickens into a rich sauce.",
				"Brown chicken or turkey pieces in a separate pan.",
				"Pour the mole sauce over the browned meat and simmer until fully cooked.",
				"Serve hot with rice or tortillas.", "Enjoy this complex and flavorful Mexican dish!");
	}

	static public List<String> getTamalesSteps() {
		return Arrays.asList("Prepare masa dough by mixing masa harina, lard, and broth.",
				"Spread masa on corn husks and add your choice of filling, such as shredded pork or chicken.",
				"Fold the husks and tie them with kitchen twine.",
				"Steam the tamales until the masa is cooked and firm.",
				"Serve hot with salsa or your favorite toppings.", "Enjoy these traditional Mexican steamed parcels!");
	}

	static public List<String> getQuesadillasSteps() {
		return Arrays.asList("Place a tortilla on a griddle or skillet over medium heat.",
				"Sprinkle shredded cheese on one half of the tortilla.",
				"Add other ingredients like cooked chicken, beans, or veggies if desired.",
				"Fold the tortilla in half, pressing down gently with a spatula.",
				"Cook until the cheese is melted and the tortilla is golden brown.",
				"Serve hot with salsa, guacamole, or sour cream.");
	}

	static public List<String> getPozoleSteps() {
		return Arrays.asList("Cook hominy in a large pot until tender.",
				"In a separate pot, simmer meat (pork or chicken) with garlic, onions, and spices.",
				"Combine the cooked hominy and meat in a large pot.",
				"Add chili sauce and continue to simmer until flavors meld.",
				"Serve hot, garnished with radishes, cabbage, and lime wedges.",
				"Enjoy this hearty and flavorful Mexican soup!");
	}

	static public List<String> getCevicheSteps() {
		return Arrays.asList("Dice fresh raw fish into small pieces and place in a bowl.",
				"Add diced tomatoes, onions, cilantro, and jalapeños to the fish.",
				"Squeeze fresh lime and lemon juice over the mixture.",
				"Season with salt and let it marinate in the citrus juices until the fish is opaque.",
				"Serve chilled with tortilla chips or tostadas.", "Enjoy this refreshing and tangy seafood dish!");
	}

	static public List<String> getChurrosSteps() {
		return Arrays.asList("In a saucepan, combine water, butter, and sugar, and bring to a boil.",
				"Remove from heat and stir in flour until a dough forms.",
				"Transfer the dough to a piping bag with a star tip.",
				"Pipe dough into hot oil, cutting it with scissors into desired lengths.",
				"Fry until golden brown and roll in a mixture of sugar and cinnamon.",
				"Serve hot and enjoy these delicious fried dough pastries!");
	}

	// Irish Recipes
	static public List<String> getIrishStewSteps() {
		return Arrays.asList("In a large pot, brown lamb or mutton in oil over medium heat.",
				"Add onions, carrots, and potatoes to the pot.", "Pour in beef or vegetable broth and add seasonings.",
				"Simmer until the meat and vegetables are tender.", "Serve hot and enjoy this hearty Irish stew!");
	}

	static public List<String> getColcannonSteps() {
		return Arrays.asList("Boil potatoes until tender, then mash them.",
				"In a separate pot, cook cabbage or kale until soft.",
				"Mix the mashed potatoes with cooked cabbage or kale.", "Add butter and season with salt and pepper.",
				"Serve hot as a delicious and comforting side dish.");
	}

	static public List<String> getShepherdsPieSteps() {
		return Arrays.asList("Brown ground meat in a skillet over medium heat.",
				"Add diced onions, carrots, and peas to the skillet.",
				"Pour in beef or vegetable broth and add seasonings.", "Transfer the meat mixture to a baking dish.",
				"Top with mashed potatoes and bake until golden brown.",
				"Serve hot, and enjoy this classic Irish comfort food!");
	}

	static public List<String> getBoxtySteps() {
		return Arrays.asList("Grate raw potatoes and mix them with flour, baking soda, and buttermilk.",
				"Drop spoonfuls of the mixture onto a hot griddle.", "Cook until browned on both sides.",
				"Serve hot as a tasty Irish potato pancake.");
	}

	static public List<String> getCoddleSteps() {
		return Arrays.asList("In a pot, layer sausages, bacon, sliced potatoes, and onions.",
				"Pour in chicken or vegetable broth and season with salt and pepper.",
				"Simmer until the sausages are cooked and the flavors meld.",
				"Serve hot and enjoy this comforting Irish stew!");
	}

	static public List<String> getIrishSodaBreadSteps() {
		return Arrays.asList("Preheat the oven and flour a baking sheet.",
				"In a large bowl, mix flour, baking soda, salt, and buttermilk.",
				"Form the dough into a round shape on the floured baking sheet.", "Bake until golden brown and crusty.",
				"Serve slices with butter and enjoy this quick Irish bread!");
	}

	static public List<String> getDublinCoddleSteps() {
		return Arrays.asList("Layer sausages, bacon, sliced potatoes, and onions in a pot.",
				"Pour in chicken or vegetable broth and season with salt and pepper.",
				"Simmer until the sausages are cooked and the flavors meld.",
				"Serve hot and enjoy this classic Dublin comfort dish!");
	}

	static public List<String> getCornedBeefAndCabbageSteps() {
		return Arrays.asList("Place corned beef in a pot and cover with water.", "Simmer until the beef is tender.",
				"Add cabbage, carrots, and potatoes to the pot.", "Simmer until the vegetables are tender.",
				"Serve hot with mustard and enjoy this Irish classic!");
	}

	static public List<String> getIrishCoffeeSteps() {
		return Arrays.asList("Brew a strong cup of coffee.",
				"Add Irish whiskey and sugar to the coffee, stirring until dissolved.", "Top with whipped cream.",
				"Serve hot and enjoy this delightful Irish beverage!");
	}

	static public List<String> getIrishAppleCakeSteps() {
		return Arrays.asList("Preheat the oven and grease a baking pan.",
				"In a bowl, mix flour, sugar, baking powder, and cinnamon.",
				"Add grated apples and beaten eggs to the dry ingredients.",
				"Pour the batter into the prepared pan and sprinkle with sugar and cinnamon.",
				"Bake until golden brown and a toothpick comes out clean.",
				"Let it cool before serving. Enjoy this delicious Irish apple cake!");
	}

	// English Recipes
	static public List<String> getFishAndChipsSteps() {
		return Arrays.asList("Preheat oil in a deep fryer or large pan to 350°F (175°C).",
				"In a bowl, whisk together flour, baking powder, salt, and beer to create the batter.",
				"Dip fish into the batter, allowing excess to drip off, then fry until golden brown.",
				"Fry thick-cut potatoes until crispy and golden.",
				"Serve hot fish and chips with your favorite condiments. Enjoy!");
	}

	static public List<String> getShepherdsPieEnglishSteps() {
		return Arrays.asList("Brown minced meat in a skillet over medium heat.",
				"Add diced onions, carrots, peas, and gravy to the skillet.",
				"Transfer the meat mixture to a baking dish.", "Top with mashed potatoes and bake until golden brown.",
				"Serve hot and enjoy this classic English comfort food!");
	}

	static public List<String> getFullEnglishBreakfastSteps() {
		return Arrays.asList("In a skillet, cook bacon, sausage, black pudding, and tomatoes.",
				"Fry or poach eggs and prepare baked beans.", "Toast bread and brew a cup of tea or coffee.",
				"Serve all components together for a hearty full English breakfast.");
	}

	static public List<String> getBeefWellingtonSteps() {
		return Arrays.asList("Season and sear beef fillet in a hot pan.",
				"Coat the beef with pâté and wrap in puff pastry.", "Bake until the pastry is golden brown.",
				"Let it rest before slicing. Serve and enjoy Beef Wellington!");
	}

	static public List<String> getPloughmansLunchSteps() {
		return Arrays.asList("Arrange cheese, bread, pickles, ham, and apple slices on a platter.",
				"Serve with butter and mustard.", "Enjoy this simple and delightful Ploughman's Lunch.");
	}

	static public List<String> getBangersAndMashSteps() {
		return Arrays.asList("Grill or fry sausages until cooked through.", "Prepare mashed potatoes.",
				"Make onion gravy by sautéing onions and adding broth.",
				"Serve sausages on a bed of mashed potatoes with onion gravy.");
	}

	static public List<String> getCornishPastySteps() {
		return Arrays.asList("Preheat the oven and prepare a baking sheet.",
				"Mix diced meat, potatoes, onions, and seasonings.",
				"Place the filling on a pastry circle, fold, and crimp the edges.",
				"Bake until golden brown. Enjoy this savory Cornish pasty!");
	}

	static public List<String> getSteakAndKidneyPieSteps() {
		return Arrays.asList("Brown diced beef and kidney in a pan.",
				"Add onions, flour, and beef stock to create a thick filling.", "Transfer the filling to a pie dish.",
				"Top with puff pastry and bake until golden brown.", "Serve hot and enjoy this classic English pie!");
	}

	static public List<String> getEtonMessSteps() {
		return Arrays.asList("In a bowl, mix strawberries, crushed meringue, and whipped cream.",
				"Serve immediately, enjoying the delightful chaos of Eton Mess!");
	}

	static public List<String> getTeaAndSconesSteps() {
		return Arrays.asList("Brew a pot of your favorite tea.",
				"Serve with freshly baked scones, clotted cream, and jam.",
				"Enjoy this traditional afternoon tea treat!");
	}
}