package application;

import java.util.ArrayList;
import java.util.List;

public class DishProvider {

    public List<Dish> getDishes() {
    	List<Dish> dishes = new ArrayList<>();

        // Italian
        dishes.add(new Dish("Spaghetti Bolognese", "Classic Italian pasta dish with meat sauce", Recipe.getSpaghettiBologneseSteps(), 30, "path_to_spaghetti_bolognese.jpg", "Italian"));
        dishes.add(new Dish("Margherita Pizza", "Traditional pizza with tomato, mozzarella, and basil", Recipe.getMargheritaPizzaSteps(), 20, "path_to_margherita_pizza.jpg", "Italian"));
        dishes.add(new Dish("Risotto al Funghi", "Creamy risotto with mushrooms", Recipe.getRisottoAlFunghiSteps(), 25, "path_to_risotto_al_funghi.jpg", "Italian"));
        dishes.add(new Dish("Osso Buco", "Braised veal shanks with gremolata", Recipe.getOssoBucoSteps(), 40, "path_to_osso_buco.jpg", "Italian"));
        dishes.add(new Dish("Tiramisu", "Classic Italian dessert with layers of coffee-soaked ladyfingers and mascarpone", Recipe.getTiramisuSteps(), 15, "path_to_tiramisu.jpg", "Italian"));
        dishes.add(new Dish("Fettuccine Alfredo", "Pasta with creamy Alfredo sauce", Recipe.getFettuccineAlfredoSteps(), 25, "path_to_fettuccine_alfredo.jpg", "Italian"));
        dishes.add(new Dish("Caprese Salad", "Simple salad with tomatoes, mozzarella, and basil", Recipe.getCapreseSaladSteps(), 10, "path_to_caprese_salad.jpg", "Italian"));
        dishes.add(new Dish("Gnocchi alla Sorrentina", "Potato dumplings with tomato sauce and mozzarella", Recipe.getGnocchiAllaSorrentinaSteps(), 30, "path_to_gnocchi_alla_sorrentina.jpg", "Italian"));
        dishes.add(new Dish("Bruschetta", "Toasted bread topped with tomatoes, garlic, and basil", Recipe.getBruschettaSteps(), 15, "path_to_bruschetta.jpg", "Italian"));
        dishes.add(new Dish("Limoncello Tiramisu", "Tiramisu with a twist, infused with limoncello", Recipe.getLimoncelloTiramisuSteps(), 20, "path_to_limoncello_tiramisu.jpg", "Italian"));
        
        // American
        dishes.add(new Dish("Hamburger", "Classic American burger with a beef patty, lettuce, and tomato", Recipe.getBurgerSteps(), 20, "path_to_hamburger.jpg", "American"));
        dishes.add(new Dish("Hot Dog", "Traditional American hot dog with mustard and sauerkraut", Recipe.getHotDogSteps(), 15, "path_to_hot_dog.jpg", "American"));
        dishes.add(new Dish("Macaroni and Cheese", "Creamy macaroni pasta with melted cheese", Recipe.getMacAndCheeseSteps(), 25, "path_to_macaroni_and_cheese.jpg", "American"));
        dishes.add(new Dish("Chicken Pot Pie", "Savory pie filled with chicken, vegetables, and gravy", Recipe.getChickenPotPieSteps(), 45, "path_to_chicken_pot_pie.jpg", "American"));
        dishes.add(new Dish("Buffalo Wings", "Spicy chicken wings with buffalo sauce", Recipe.getBuffaloWingsSteps(), 30, "path_to_buffalo_wings.jpg", "American"));
        dishes.add(new Dish("Clam Chowder", "Creamy soup with clams, potatoes, and bacon", Recipe.getClamChowderSteps(), 35, "path_to_clam_chowder.jpg", "American"));
        dishes.add(new Dish("Barbecue Ribs", "Slow-cooked ribs with barbecue sauce", Recipe.getBarbecueRibsSteps(), 60, "path_to_barbecue_ribs.jpg", "American"));
        dishes.add(new Dish("Pancakes", "Fluffy pancakes served with syrup and butter", Recipe.getPancakesSteps(), 15, "path_to_pancakes.jpg", "American"));
        dishes.add(new Dish("Cheeseburger", "Burger with cheese, lettuce, and tomato", Recipe.getCheeseburgerSteps(), 25, "path_to_cheeseburger.jpg", "American"));
        dishes.add(new Dish("Apple Pie", "Classic American pie with apple filling", Recipe.getApplePieSteps(), 50, "path_to_apple_pie.jpg", "American"));
        
        // French
        dishes.add(new Dish("Coq au Vin", "Classic French dish of chicken braised with wine, mushrooms, and onions", Recipe.getCoqAuVinSteps(), 60, "path_to_coq_au_vin.jpg", "French"));
        dishes.add(new Dish("Ratatouille", "Vegetable stew with eggplant, zucchini, and bell peppers", Recipe.getRatatouilleSteps(), 40, "path_to_ratatouille.jpg", "French"));
        dishes.add(new Dish("Croissant", "Flaky and buttery French pastry", Recipe.getCroissantSteps(), 30, "path_to_croissant.jpg", "French"));
        dishes.add(new Dish("Escargot", "Snails cooked in garlic, parsley, and butter", Recipe.getEscargotSteps(), 20, "path_to_escargot.jpg", "French"));
        dishes.add(new Dish("Quiche Lorraine", "Savory tart with bacon and cheese filling", Recipe.getQuicheLorraineSteps(), 35, "path_to_quiche_lorraine.jpg", "French"));
        dishes.add(new Dish("Bouillabaisse", "Fish stew with various Mediterranean fish, shellfish, and herbs", Recipe.getBouillabaisseSteps(), 50, "path_to_bouillabaisse.jpg", "French"));
        dishes.add(new Dish("Crêpes", "Thin pancakes filled with sweet or savory ingredients", Recipe.getCrepesSteps(), 25, "path_to_crepes.jpg", "French"));
        dishes.add(new Dish("Cassoulet", "Slow-cooked casserole with meat and white beans", Recipe.getCassouletSteps(), 75, "path_to_cassoulet.jpg", "French"));
        dishes.add(new Dish("Salade Niçoise", "Salad with tuna, olives, and anchovies", Recipe.getSaladeNicoiseSteps(), 20, "path_to_salade_nicoise.jpg", "French"));
        dishes.add(new Dish("Tarte Tatin", "Upside-down caramelized apple tart", Recipe.getTarteTatinSteps(), 40, "path_to_tarte_tatin.jpg", "French"));
        
        // Korean
        dishes.add(new Dish("Bibimbap", "Mixed rice bowl with vegetables, meat, and a spicy sauce", "Recipe 31", 30, "path_to_bibimbap.jpg", "Korean"));
        dishes.add(new Dish("Kimchi Jjigae", "Kimchi stew with tofu, vegetables, and pork", "Recipe 32", 40, "path_to_kimchi_jjigae.jpg", "Korean"));
        dishes.add(new Dish("Bulgogi", "Marinated and grilled beef slices", "Recipe 33", 25, "path_to_bulgogi.jpg", "Korean"));
        dishes.add(new Dish("Japchae", "Stir-fried glass noodles with vegetables and beef", "Recipe 34", 35, "path_to_japchae.jpg", "Korean"));
        dishes.add(new Dish("Sundubu Jjigae", "Soft tofu stew with vegetables and sometimes meat", "Recipe 35", 30, "path_to_sundubu_jjigae.jpg", "Korean"));
        dishes.add(new Dish("Samgyeopsal", "Grilled pork belly served with dipping sauces", "Recipe 36", 20, "path_to_samgyeopsal.jpg", "Korean"));
        dishes.add(new Dish("Dolsot Bibimbap", "Bibimbap served in a hot stone pot", "Recipe 37", 35, "path_to_dolsot_bibimbap.jpg", "Korean"));
        dishes.add(new Dish("Kimchi Fried Rice", "Fried rice with kimchi and other ingredients", "Recipe 38", 25, "path_to_kimchi_fried_rice.jpg", "Korean"));
        dishes.add(new Dish("Kimbap", "Seaweed rice rolls with vegetables and sometimes meat", "Recipe 39", 30, "path_to_kimbap.jpg", "Korean"));
        dishes.add(new Dish("Haemul Pajeon", "Seafood and green onion pancake", "Recipe 40", 40, "path_to_haemul_pajeon.jpg", "Korean"));
        
        // Chinese
        dishes.add(new Dish("Sweet and Sour Chicken", "Crispy chicken with sweet and sour sauce", "Recipe 41", 30, "path_to_sweet_and_sour_chicken.jpg", "Chinese"));
        dishes.add(new Dish("Kung Pao Chicken", "Spicy chicken stir-fry with peanuts and vegetables", "Recipe 42", 25, "path_to_kung_pao_chicken.jpg", "Chinese"));
        dishes.add(new Dish("Dim Sum", "Assortment of bite-sized dishes, often served in steamer baskets", "Recipe 43", 40, "path_to_dim_sum.jpg", "Chinese"));
        dishes.add(new Dish("Peking Duck", "Roasted duck served with thin pancakes and hoisin sauce", "Recipe 44", 60, "path_to_peking_duck.jpg", "Chinese"));
        dishes.add(new Dish("Mapo Tofu", "Spicy tofu dish with minced meat and fermented black beans", "Recipe 45", 30, "path_to_mapo_tofu.jpg", "Chinese"));
        dishes.add(new Dish("Chow Mein", "Stir-fried noodles with vegetables and sometimes meat", "Recipe 46", 35, "path_to_chow_mein.jpg", "Chinese"));
        dishes.add(new Dish("Hot Pot", "Cooking pot at the dining table with broth, meats, and vegetables", "Recipe 47", 45, "path_to_hot_pot.jpg", "Chinese"));
        dishes.add(new Dish("Spring Rolls", "Crispy rolls filled with vegetables, meat, and sometimes shrimp", "Recipe 48", 30, "path_to_spring_rolls.jpg", "Chinese"));
        dishes.add(new Dish("General Tso's Chicken", "Crispy chicken in a sweet and spicy sauce", "Recipe 49", 25, "path_to_general_tsos_chicken.jpg", "Chinese"));
        dishes.add(new Dish("Egg Fried Rice", "Fried rice with scrambled eggs and vegetables", "Recipe 50", 20, "path_to_egg_fried_rice.jpg", "Chinese"));
        
        // Creole
        dishes.add(new Dish("Gumbo", "Stew with a strong-flavored stock, meat or shellfish, and vegetables", "Recipe 51", 45, "path_to_gumbo.jpg", "Creole"));
        dishes.add(new Dish("Jambalaya", "One-pot rice dish with meat, vegetables, and spices", "Recipe 52", 35, "path_to_jambalaya.jpg", "Creole"));
        dishes.add(new Dish("Shrimp and Grits", "Sauteed shrimp served over creamy grits", "Recipe 53", 30, "path_to_shrimp_and_grits.jpg", "Creole"));
        dishes.add(new Dish("Étouffée", "Stew made with shellfish like crawfish, served over rice", "Recipe 54", 40, "path_to_etouffee.jpg", "Creole"));
        dishes.add(new Dish("Red Beans and Rice", "Stewed red beans served with rice", "Recipe 55", 40, "path_to_red_beans_and_rice.jpg", "Creole"));
        dishes.add(new Dish("Crawfish Boil", "Boiled crawfish with potatoes, corn, and spices", "Recipe 56", 50, "path_to_crawfish_boil.jpg", "Creole"));
        dishes.add(new Dish("Dirty Rice", "Rice dish with meat, vegetables, and spices", "Recipe 57", 30, "path_to_dirty_rice.jpg", "Creole"));
        dishes.add(new Dish("Bananas Foster", "Dessert made with bananas, brown sugar, and rum", "Recipe 58", 20, "path_to_bananas_foster.jpg", "Creole"));
        dishes.add(new Dish("Muffuletta", "Sandwich with a variety of meats and olive salad", "Recipe 59", 15, "path_to_muffuletta.jpg", "Creole"));
        dishes.add(new Dish("King Cake", "Traditional cake associated with Mardi Gras", "Recipe 60", 40, "path_to_king_cake.jpg", "Creole"));
        
        // Cajun
        dishes.add(new Dish("Cajun Shrimp and Grits", "Spicy shrimp served over creamy grits", "Recipe 61", 30, "path_to_cajun_shrimp_and_grits.jpg", "Cajun"));
        dishes.add(new Dish("Cajun Chicken Pasta", "Chicken and pasta dish with a Cajun cream sauce", "Recipe 62", 35, "path_to_cajun_chicken_pasta.jpg", "Cajun"));
        dishes.add(new Dish("Blackened Catfish", "Catfish fillets coated in spices and pan-seared", "Recipe 63", 25, "path_to_blackened_catfish.jpg", "Cajun"));
        dishes.add(new Dish("Andouille Sausage Gumbo", "Gumbo made with Andouille sausage, chicken, and seafood", "Recipe 64", 45, "path_to_andouille_sausage_gumbo.jpg", "Cajun"));
        dishes.add(new Dish("Cajun Dirty Rice", "Rice dish with ground meat, vegetables, and spices", "Recipe 65", 30, "path_to_cajun_dirty_rice.jpg", "Cajun"));
        dishes.add(new Dish("Crawfish Étouffée", "Crawfish in a rich, flavorful roux-based sauce, served over rice", "Recipe 66", 40, "path_to_crawfish_etouffee.jpg", "Cajun"));
        dishes.add(new Dish("Cajun Boudin", "Sausage made with pork, rice, and Cajun spices", "Recipe 67", 20, "path_to_cajun_boudin.jpg", "Cajun"));
        dishes.add(new Dish("Cajun Red Beans and Rice", "Red beans slow-cooked with Cajun spices, served over rice", "Recipe 68", 40, "path_to_cajun_red_beans_and_rice.jpg", "Cajun"));
        dishes.add(new Dish("Cajun Shrimp Boil", "Shrimp, corn, potatoes, and sausage boiled in Cajun seasoning", "Recipe 69", 50, "path_to_cajun_shrimp_boil.jpg", "Cajun"));
        dishes.add(new Dish("Cajun Chicken Jambalaya", "Spicy one-pot rice dish with chicken and sausage", "Recipe 70", 35, "path_to_cajun_chicken_jambalaya.jpg", "Cajun"));
        
        // Mexican
        dishes.add(new Dish("Tacos al Pastor", "Tacos with marinated and spit-roasted pork", Recipe.getTacosAlPastorSteps(), 25, "path_to_tacos_al_pastor.jpg", "Mexican"));
        dishes.add(new Dish("Guacamole", "Avocado-based dip with tomatoes, onions, and cilantro", Recipe.getGuacamoleSteps(), 15, "path_to_guacamole.jpg", "Mexican"));
        dishes.add(new Dish("Enchiladas", "Tortillas rolled around a filling, topped with chili sauce and cheese", Recipe.getEnchiladasSteps(), 30, "path_to_enchiladas.jpg", "Mexican"));
        dishes.add(new Dish("Chiles Rellenos", "Stuffed peppers, usually with cheese or meat, and fried", Recipe.getChilesRellenosSteps(), 40, "path_to_chiles_rellenos.jpg", "Mexican"));
        dishes.add(new Dish("Mole Poblano", "Rich sauce with chocolate, chili peppers, and other spices", Recipe.getMolePoblanoSteps(), 50, "path_to_mole_poblano.jpg", "Mexican"));
        dishes.add(new Dish("Tamales", "Steamed parcels of masa dough with various fillings", Recipe.getTamalesSteps(), 45, "path_to_tamales.jpg", "Mexican"));
        dishes.add(new Dish("Quesadillas", "Tortillas filled with cheese and other ingredients, folded and grilled", Recipe.getQuesadillasSteps(), 20, "path_to_quesadillas.jpg", "Mexican"));
        dishes.add(new Dish("Pozole", "Soup made with hominy, meat, and chili, typically garnished with radishes and cabbage", Recipe.getPozoleSteps(), 60, "path_to_pozole.jpg", "Mexican"));
        dishes.add(new Dish("Ceviche", "Seafood dish typically made from fresh raw fish cured in citrus juices",Recipe.getCevicheSteps(), 15, "path_to_ceviche.jpg", "Mexican"));
        dishes.add(new Dish("Churros", "Fried dough pastries, often dusted with sugar and cinnamon", Recipe.getChurrosSteps(), 25, "path_to_churros.jpg", "Mexican"));
        
        // Irish
        dishes.add(new Dish("Irish Stew", "Stew made with lamb or mutton, potatoes, carrots, and onions", Recipe.getIrishStewSteps(), 60, "path_to_irish_stew.jpg", "Irish"));
        dishes.add(new Dish("Colcannon", "Mashed potatoes with cabbage or kale and butter", Recipe.getColcannonSteps(), 30, "path_to_colcannon.jpg", "Irish"));
        dishes.add(new Dish("Shepherd's Pie", "Ground meat topped with mashed potatoes and baked", Recipe.getShepherdsPieSteps(), 45, "path_to_shepherds_pie.jpg", "Irish"));
        dishes.add(new Dish("Boxty", "Irish potato pancake made with grated potatoes and flour", Recipe.getBoxtySteps(), 25, "path_to_boxty.jpg", "Irish"));
        dishes.add(new Dish("Coddle", "Stew made with sausages, bacon, and vegetables", Recipe.getCoddleSteps(), 35, "path_to_coddle.jpg", "Irish"));
        dishes.add(new Dish("Irish Soda Bread", "Quick bread made with baking soda, buttermilk, and flour", Recipe.getIrishSodaBreadSteps(), 20, "path_to_irish_soda_bread.jpg", "Irish"));
        dishes.add(new Dish("Dublin Coddle", "Traditional Irish dish with sausages, bacon, and potatoes", Recipe.getDublinCoddleSteps(), 40, "path_to_dublin_coddle.jpg", "Irish"));
        dishes.add(new Dish("Corned Beef and Cabbage", "Beef brisket with cabbage, carrots, and potatoes", Recipe.getIrishCoffeeSteps(), 50, "path_to_corned_beef_and_cabbage.jpg", "Irish"));
        dishes.add(new Dish("Irish Coffee", "Coffee with Irish whiskey and cream", Recipe.getIrishCoffeeSteps(), 10, "path_to_irish_coffee.jpg", "Irish"));
        dishes.add(new Dish("Irish Apple Cake", "Apple cake with cinnamon and sugar topping",Recipe.getIrishAppleCakeSteps(), 45, "path_to_irish_apple_cake.jpg", "Irish"));
        
        // English
        dishes.add(new Dish("Fish and Chips", "Battered and fried fish served with thick-cut fries", Recipe.getFishAndChipsSteps(), 30, "path_to_fish_and_chips.jpg", "English"));
        dishes.add(new Dish("Shepherd's Pie", "Minced meat topped with mashed potatoes and baked", Recipe.getShepherdsPieSteps(), 45, "path_to_shepherds_pie_english.jpg", "English"));
        dishes.add(new Dish("Full English Breakfast", "Classic breakfast with eggs, bacon, sausage, beans, and more", Recipe.getFullEnglishBreakfastSteps(), 25, "path_to_full_english_breakfast.jpg", "English"));
        dishes.add(new Dish("Beef Wellington", "Beef fillet coated with pâté and wrapped in puff pastry", Recipe.getBeefWellingtonSteps(), 60, "path_to_beef_wellington.jpg", "English"));
        dishes.add(new Dish("Ploughman's Lunch", "Cold meal with cheese, bread, pickles, and more", Recipe.getPloughmansLunchSteps(), 15, "path_to_ploughmans_lunch.jpg", "English"));
        dishes.add(new Dish("Bangers and Mash", "Sausages served with mashed potatoes and onion gravy", Recipe.getBangersAndMashSteps(), 35, "path_to_bangers_and_mash.jpg", "English"));
        dishes.add(new Dish("Cornish Pasty", "Pastry filled with meat, potatoes, and vegetables", Recipe.getCornishPastySteps(), 40, "path_to_cornish_pasty.jpg", "English"));
        dishes.add(new Dish("Steak and Kidney Pie", "Pie filled with diced beef, kidney, and gravy", Recipe.getSteakAndKidneyPieSteps(), 50, "path_to_steak_and_kidney_pie.jpg", "English"));
        dishes.add(new Dish("Eton Mess", "Dessert with strawberries, meringue, and whipped cream", Recipe.getEtonMessSteps(), 20, "path_to_eton_mess.jpg", "English"));
        dishes.add(new Dish("Tea and Scones", "Traditional afternoon tea with scones and clotted cream", Recipe.getTeaAndSconesSteps(), 15, "path_to_tea_and_scones.jpg", "English"));
        
        return dishes;
    }
}
