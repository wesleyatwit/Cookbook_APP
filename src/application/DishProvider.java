package application;

import java.util.ArrayList;
import java.util.List;

public class DishProvider {

	public List<Dish> getDishes() {
		List<Dish> dishes = new ArrayList<>();

		// Italian
		dishes.add(new Dish("Spaghetti Bolognese", "Classic Italian pasta dish with meat sauce",
				RecipeList.getSpaghettiBologneseSteps(), 30, "File:src/application/Italian_Flag.png", "Italian"));
		dishes.add(new Dish("Margherita Pizza", "Traditional pizza with tomato, mozzarella, and basil",
				RecipeList.getMargheritaPizzaSteps(), 20, "File:src/application/Italian_Flag.png", "Italian"));
		dishes.add(new Dish("Risotto al Funghi", "Creamy risotto with mushrooms", RecipeList.getRisottoAlFunghiSteps(),
				25, "File:src/application/Italian_Flag.png", "Italian"));
		dishes.add(new Dish("Osso Buco", "Braised veal shanks with gremolata", RecipeList.getOssoBucoSteps(), 40,
				"File:src/application/Italian_Flag.png", "Italian"));
		dishes.add(
				new Dish("Tiramisu", "Classic Italian dessert with layers of coffee-soaked ladyfingers and mascarpone",
						RecipeList.getTiramisuSteps(), 15, "path_to_tiramisu.jpg", "Italian"));
		dishes.add(new Dish("Fettuccine Alfredo", "Pasta with creamy Alfredo sauce",
				RecipeList.getFettuccineAlfredoSteps(), 25, "File:src/application/Italian_Flag.png", "Italian"));
		dishes.add(new Dish("Caprese Salad", "Simple salad with tomatoes, mozzarella, and basil",
				RecipeList.getCapreseSaladSteps(), 10, "File:src/application/Italian_Flag.png", "Italian"));
		dishes.add(new Dish("Gnocchi alla Sorrentina", "Potato dumplings with tomato sauce and mozzarella",
				RecipeList.getGnocchiAllaSorrentinaSteps(), 30, "File:src/application/Italian_Flag.png", "Italian"));
		dishes.add(new Dish("Bruschetta", "Toasted bread topped with tomatoes, garlic, and basil",
				RecipeList.getBruschettaSteps(), 15, "File:src/application/Italian_Flag.png", "Italian"));
		dishes.add(new Dish("Limoncello Tiramisu", "Tiramisu with a twist, infused with limoncello",
				RecipeList.getLimoncelloTiramisuSteps(), 20, "File:src/application/Italian_Flag.png", "Italian"));

		// American
		dishes.add(new Dish("Hamburger", "Classic American burger with a beef patty, lettuce, and tomato",
				RecipeList.getBurgerSteps(), 20, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Hot Dog", "Traditional American hot dog with mustard and sauerkraut",
				RecipeList.getHotDogSteps(), 15, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Macaroni and Cheese", "Creamy macaroni pasta with melted cheese",
				RecipeList.getMacAndCheeseSteps(), 25, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Chicken Pot Pie", "Savory pie filled with chicken, vegetables, and gravy",
				RecipeList.getChickenPotPieSteps(), 45, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Buffalo Wings", "Spicy chicken wings with buffalo sauce",
				RecipeList.getBuffaloWingsSteps(), 30, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Clam Chowder", "Creamy soup with clams, potatoes, and bacon",
				RecipeList.getClamChowderSteps(), 35, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Barbecue Ribs", "Slow-cooked ribs with barbecue sauce", RecipeList.getBarbecueRibsSteps(),
				60, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Pancakes", "Fluffy pancakes served with syrup and butter", RecipeList.getPancakesSteps(),
				15, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Cheeseburger", "Burger with cheese, lettuce, and tomato",
				RecipeList.getCheeseburgerSteps(), 25, "File:src/application/American_Flag.png", "American"));
		dishes.add(new Dish("Apple Pie", "Classic American pie with apple filling", RecipeList.getApplePieSteps(), 50,
				"File:src/application/American_Flag.png", "American"));

		// French
		dishes.add(new Dish("Coq au Vin", "Classic French dish of chicken braised with wine, mushrooms, and onions",
				RecipeList.getCoqAuVinSteps(), 60, "File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Ratatouille", "Vegetable stew with eggplant, zucchini, and bell peppers",
				RecipeList.getRatatouilleSteps(), 40, "File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Croissant", "Flaky and buttery French pastry", RecipeList.getCroissantSteps(), 30,
				"File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Escargot", "Snails cooked in garlic, parsley, and butter", RecipeList.getEscargotSteps(),
				20, "File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Quiche Lorraine", "Savory tart with bacon and cheese filling",
				RecipeList.getQuicheLorraineSteps(), 35, "File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Bouillabaisse", "Fish stew with various Mediterranean fish, shellfish, and herbs",
				RecipeList.getBouillabaisseSteps(), 50, "File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Crêpes", "Thin pancakes filled with sweet or savory ingredients",
				RecipeList.getCrepesSteps(), 25, "File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Cassoulet", "Slow-cooked casserole with meat and white beans",
				RecipeList.getCassouletSteps(), 75, "File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Salade Niçoise", "Salad with tuna, olives, and anchovies",
				RecipeList.getSaladeNicoiseSteps(), 20, "File:src/application/French_Flag.png", "French"));
		dishes.add(new Dish("Tarte Tatin", "Upside-down caramelized apple tart", RecipeList.getTarteTatinSteps(), 40,
				"File:src/application/French_Flag.png", "French"));

		// Korean
		dishes.add(new Dish("Bibimbap", "Mixed rice bowl with vegetables, meat, and a spicy sauce",
				RecipeList.getBibimbapSteps(), 30, "File:src/application/Korean_Flag.png", "Korean"));
		dishes.add(new Dish("Kimchi Jjigae", "Kimchi stew with tofu, vegetables, and pork",
				RecipeList.getKimchiJjigaeSteps(), 40, "File:src/application/Korean_Flag.png", "Korean"));
		dishes.add(new Dish("Bulgogi", "Marinated and grilled beef slices", RecipeList.getBulgogiSteps(), 25,
				"File:src/application/Korean_Flag.png", "Korean"));
		dishes.add(new Dish("Japchae", "Stir-fried glass noodles with vegetables and beef",
				RecipeList.getJapchaeSteps(), 35, "File:src/application/Korean_Flag.png", "Korean"));
		dishes.add(new Dish("Sundubu Jjigae", "Soft tofu stew with vegetables and sometimes meat",
				RecipeList.getSundubuJjigaeSteps(), 30, "File:src/application/Italian_Flag.png", "Korean"));
		dishes.add(new Dish("Samgyeopsal", "Grilled pork belly served with dipping sauces",
				RecipeList.getSamgyeopsalSteps(), 20, "File:src/application/Korean_Flag.png", "Korean"));
		dishes.add(new Dish("Dolsot Bibimbap", "Bibimbap served in a hot stone pot",
				RecipeList.getDolsotBibimbapSteps(), 35, "File:src/application/Korean_Flag.png", "Korean"));
		dishes.add(new Dish("Kimchi Fried Rice", "Fried rice with kimchi and other ingredients",
				RecipeList.getKimchiFriedRiceSteps(), 25, "File:src/application/Korean_Flag.png", "Korean"));
		dishes.add(new Dish("Kimbap", "Seaweed rice rolls with vegetables and sometimes meat",
				RecipeList.getKimbapSteps(), 30, "File:src/application/Korean_Flag.png", "Korean"));
		dishes.add(new Dish("Haemul Pajeon", "Seafood and green onion pancake", RecipeList.getHaemulPajeonSteps(), 40,
				"File:src/application/Korean_Flag.png", "Korean"));

		// Chinese
		dishes.add(new Dish("Sweet and Sour Chicken", "Crispy chicken with sweet and sour sauce",
				RecipeList.getSweetAndSourChickenSteps(), 30, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("Kung Pao Chicken", "Spicy chicken stir-fry with peanuts and vegetables",
				RecipeList.getKungPaoChickenSteps(), 25, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("Dim Sum", "Assortment of bite-sized dishes, often served in steamer baskets",
				RecipeList.getDimSumSteps(), 40, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("Peking Duck", "Roasted duck served with thin pancakes and hoisin sauce",
				RecipeList.getPekingDuckSteps(), 60, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("Mapo Tofu", "Spicy tofu dish with minced meat and fermented black beans",
				RecipeList.getMapoTofuSteps(), 30, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("Chow Mein", "Stir-fried noodles with vegetables and sometimes meat",
				RecipeList.getChowMeinSteps(), 35, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("Hot Pot", "Cooking pot at the dining table with broth, meats, and vegetables",
				RecipeList.getHotPotSteps(), 45, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("Spring Rolls", "Crispy rolls filled with vegetables, meat, and sometimes shrimp",
				RecipeList.getSpringRollsSteps(), 30, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("General Tso's Chicken", "Crispy chicken in a sweet and spicy sauce",
				RecipeList.getGeneralTsosChickenSteps(), 25, "File:src/application/Chinese_Flag.png", "Chinese"));
		dishes.add(new Dish("Egg Fried Rice", "Fried rice with scrambled eggs and vegetables",
				RecipeList.getEggFriedRiceSteps(), 20, "File:src/application/Chinese_Flag.png", "Chinese"));

		// Creole
		dishes.add(new Dish("Gumbo", "Stew with a strong-flavored stock, meat or shellfish, and vegetables",
				RecipeList.getGumboSteps(), 45, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("Jambalaya", "One-pot rice dish with meat, vegetables, and spices",
				RecipeList.getJambalayaSteps(), 35, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("Shrimp and Grits", "Sauteed shrimp served over creamy grits",
				RecipeList.getShrimpAndGritsSteps(), 30, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("Étouffée", "Stew made with shellfish like crawfish, served over rice",
				RecipeList.getEtouffeeSteps(), 40, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("Red Beans and Rice", "Stewed red beans served with rice",
				RecipeList.getRedBeansAndRiceSteps(), 40, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("Crawfish Boil", "Boiled crawfish with potatoes, corn, and spices",
				RecipeList.getCrawfishBoilSteps(), 50, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("Dirty Rice", "Rice dish with meat, vegetables, and spices", RecipeList.getDirtyRiceSteps(),
				30, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("Bananas Foster", "Dessert made with bananas, brown sugar, and rum",
				RecipeList.getBananasFosterSteps(), 20, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("Muffuletta", "Sandwich with a variety of meats and olive salad",
				RecipeList.getMuffulettaSteps(), 15, "File:src/application/Creole_Flag.png", "Creole"));
		dishes.add(new Dish("King Cake", "Traditional cake associated with Mardi Gras", RecipeList.getKingCakeSteps(),
				40, "File:src/application/Creole_Flag.png", "Creole"));

		// Cajun
		dishes.add(new Dish("Cajun Shrimp and Grits", "Spicy shrimp served over creamy grits",
				RecipeList.getCajunShrimpAndGritsSteps(), 30, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Cajun Chicken Pasta", "Chicken and pasta dish with a Cajun cream sauce",
				RecipeList.getCajunChickenPastaSteps(), 35, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Blackened Catfish", "Catfish fillets coated in spices and pan-seared",
				RecipeList.getBlackenedCatfishSteps(), 25, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Andouille Sausage Gumbo", "Gumbo made with Andouille sausage, chicken, and seafood",
				RecipeList.getAndouilleSausageGumboSteps(), 45, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Cajun Dirty Rice", "Rice dish with ground meat, vegetables, and spices",
				RecipeList.getCajunDirtyRiceSteps(), 30, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Crawfish Étouffée", "Crawfish in a rich, flavorful roux-based sauce, served over rice",
				RecipeList.getCrawfishEtouffeeSteps(), 40, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Cajun Boudin", "Sausage made with pork, rice, and Cajun spices",
				RecipeList.getCajunBoudinSteps(), 20, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Cajun Red Beans and Rice", "Red beans slow-cooked with Cajun spices, served over rice",
				RecipeList.getCajunRedBeansAndRiceSteps(), 40, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Cajun Shrimp Boil", "Shrimp, corn, potatoes, and sausage boiled in Cajun seasoning",
				RecipeList.getCajunShrimpBoilSteps(), 50, "File:src/application/Cajun_Flag.png", "Cajun"));
		dishes.add(new Dish("Cajun Chicken Jambalaya", "Spicy one-pot rice dish with chicken and sausage",
				RecipeList.getCajunChickenJambalayaSteps(), 35, "File:src/application/Cajun_Flag.png", "Cajun"));

		// Mexican
		dishes.add(new Dish("Tacos al Pastor", "Tacos with marinated and spit-roasted pork",
				RecipeList.getTacosAlPastorSteps(), 25, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Guacamole", "Avocado-based dip with tomatoes, onions, and cilantro",
				RecipeList.getGuacamoleSteps(), 15, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Enchiladas", "Tortillas rolled around a filling, topped with chili sauce and cheese",
				RecipeList.getEnchiladasSteps(), 30, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Chiles Rellenos", "Stuffed peppers, usually with cheese or meat, and fried",
				RecipeList.getChilesRellenosSteps(), 40, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Mole Poblano", "Rich sauce with chocolate, chili peppers, and other spices",
				RecipeList.getMolePoblanoSteps(), 50, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Tamales", "Steamed parcels of masa dough with various fillings",
				RecipeList.getTamalesSteps(), 45, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Quesadillas", "Tortillas filled with cheese and other ingredients, folded and grilled",
				RecipeList.getQuesadillasSteps(), 20, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Pozole",
				"Soup made with hominy, meat, and chili, typically garnished with radishes and cabbage",
				RecipeList.getPozoleSteps(), 60, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Ceviche", "Seafood dish typically made from fresh raw fish cured in citrus juices",
				RecipeList.getCevicheSteps(), 15, "File:src/application/Mexican_Flag.png", "Mexican"));
		dishes.add(new Dish("Churros", "Fried dough pastries, often dusted with sugar and cinnamon",
				RecipeList.getChurrosSteps(), 25, "File:src/application/Mexican_Flag.png", "Mexican"));

		// Irish
		dishes.add(new Dish("Irish Stew", "Stew made with lamb or mutton, potatoes, carrots, and onions",
				RecipeList.getIrishStewSteps(), 60, "File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Colcannon", "Mashed potatoes with cabbage or kale and butter",
				RecipeList.getColcannonSteps(), 30, "File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Shepherd's Pie", "Ground meat topped with mashed potatoes and baked",
				RecipeList.getShepherdsPieSteps(), 45, "File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Boxty", "Irish potato pancake made with grated potatoes and flour",
				RecipeList.getBoxtySteps(), 25, "File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Coddle", "Stew made with sausages, bacon, and vegetables", RecipeList.getCoddleSteps(), 35,
				"File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Irish Soda Bread", "Quick bread made with baking soda, buttermilk, and flour",
				RecipeList.getIrishSodaBreadSteps(), 20, "File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Dublin Coddle", "Traditional Irish dish with sausages, bacon, and potatoes",
				RecipeList.getDublinCoddleSteps(), 40, "File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Corned Beef and Cabbage", "Beef brisket with cabbage, carrots, and potatoes",
				RecipeList.getIrishCoffeeSteps(), 50, "File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Irish Coffee", "Coffee with Irish whiskey and cream", RecipeList.getIrishCoffeeSteps(), 10,
				"File:src/application/Irish_Flag.png", "Irish"));
		dishes.add(new Dish("Irish Apple Cake", "Apple cake with cinnamon and sugar topping",
				RecipeList.getIrishAppleCakeSteps(), 45, "File:src/application/Irish_Flag.png", "Irish"));

		// English
		dishes.add(new Dish("Fish and Chips", "Battered and fried fish served with thick-cut fries",
				RecipeList.getFishAndChipsSteps(), 30, "File:src/application/English_Flag.png", "English"));
		dishes.add(new Dish("Shepherd's Pie", "Minced meat topped with mashed potatoes and baked",
				RecipeList.getShepherdsPieSteps(), 45, "path_to_shepherds_pie_english.jpg", "English"));
		dishes.add(new Dish("Full English Breakfast", "Classic breakfast with eggs, bacon, sausage, beans, and more",
				RecipeList.getFullEnglishBreakfastSteps(), 25, "File:src/application/Irish_Flag.png", "English"));
		dishes.add(new Dish("Beef Wellington", "Beef fillet coated with pâté and wrapped in puff pastry",
				RecipeList.getBeefWellingtonSteps(), 60, "File:src/application/Irish_Flag.png", "English"));
		dishes.add(new Dish("Ploughman's Lunch", "Cold meal with cheese, bread, pickles, and more",
				RecipeList.getPloughmansLunchSteps(), 15, "File:src/application/Irish_Flag.png", "English"));
		dishes.add(new Dish("Bangers and Mash", "Sausages served with mashed potatoes and onion gravy",
				RecipeList.getBangersAndMashSteps(), 35, "File:src/application/Irish_Flag.png", "English"));
		dishes.add(new Dish("Cornish Pasty", "Pastry filled with meat, potatoes, and vegetables",
				RecipeList.getCornishPastySteps(), 40, "File:src/application/Irish_Flag.png", "English"));
		dishes.add(new Dish("Steak and Kidney Pie", "Pie filled with diced beef, kidney, and gravy",
				RecipeList.getSteakAndKidneyPieSteps(), 50, "File:src/application/Irish_Flag.png", "English"));
		dishes.add(new Dish("Eton Mess", "Dessert with strawberries, meringue, and whipped cream",
				RecipeList.getEtonMessSteps(), 20, "File:src/application/Irish_Flag.png", "English"));
		dishes.add(new Dish("Tea and Scones", "Traditional afternoon tea with scones and clotted cream",
				RecipeList.getTeaAndSconesSteps(), 15, "File:src/application/Irish_Flag.png", "English"));

		return dishes;
	}
}
