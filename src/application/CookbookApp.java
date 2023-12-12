package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CookbookApp extends Application {

    private List<Dish> dishes;
    private List<Dish> likedDishes;
    private List<Dish> dislikedDishes;
    private Dish currentDish;

    private ImageView dishImageView;
    private Text dishInfoText;
    private Button likeButton;
    private Button dislikeButton;
    private Button likedButton;
    private Button dislikedButton;

    private double xInitial;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Initialize dish-related data
        DishProvider dishProvider = new DishProvider();
        dishes = dishProvider.getDishes();
        likedDishes = new ArrayList<>();
        dislikedDishes = new ArrayList<>();

        // Set up UI components
        dishImageView = new ImageView();
        dishImageView.setFitWidth(667);
        dishImageView.setFitHeight(400);

        dishInfoText = new Text();
        dishInfoText.setWrappingWidth(400);

        likeButton = new Button("Like");
        dislikeButton = new Button("Dislike");
        likedButton = new Button("Liked");
        dislikedButton = new Button("Disliked");

        // Set up event handlers
        dishImageView.setOnMousePressed(this::handleMousePressed);
        dishImageView.setOnMouseDragged(this::handleMouseDragged);

        likeButton.setOnAction(e -> handleSwipe(true));
        dislikeButton.setOnAction(e -> handleSwipe(false));
        likedButton.setOnAction(e -> showLikedDishes());
        dislikedButton.setOnAction(e -> showDislikedDishes());

        // Arrange buttons horizontally and center them
        HBox buttonsBox = new HBox(10, likeButton, dislikeButton, likedButton, dislikedButton);
        buttonsBox.setAlignment(Pos.CENTER);

        // Create the layout
        BorderPane root = new BorderPane();
        root.setTop(dishImageView);
        BorderPane.setAlignment(dishImageView, Pos.CENTER);
        root.setCenter(dishInfoText);
        root.setBottom(buttonsBox);

        // Create the scene
        Scene scene = new Scene(root, 400, 600);

        // Set up the primary stage
        primaryStage.setTitle("Flavor");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Display the initial dish
        showRandomDish();
    }

    // Show a random dish on the screen
    private void showRandomDish() {
        if (!dishes.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(dishes.size());
            currentDish = dishes.get(randomIndex);

            Image image = new Image(currentDish.getImagePath());
            dishImageView.setImage(image);

            dishInfoText.setText("Food: " + currentDish.getName() + "\nOrigin: " + currentDish.getCuisineType()
                    + "\nDescription: " + currentDish.getDescription() + "\nCooktime: " + currentDish.getCookTime()
                    + " mins" + "\nRecipe:\n" + currentDish.getRecipe());
        }
    }

    // Handle swipe (like or dislike) action
    private void handleSwipe(boolean liked) {
        if (liked) {
            likedDishes.add(currentDish);
        } else {
            dislikedDishes.add(currentDish);
        }

        dishes.remove(0);
        if (dishes.isEmpty()) {
            System.out.println("You've swiped through all dishes!");
        } else {
            showRandomDish();
        }
    }

    // Record initial X position when mouse is pressed
    private void handleMousePressed(MouseEvent event) {
        xInitial = event.getSceneX();
    }

    // Handle mouse dragged event to determine swipe direction
    private void handleMouseDragged(MouseEvent event) {
        double xFinal = event.getSceneX();
        double deltaX = xFinal - xInitial;
        if (deltaX > 50) {
            // Right swipe, consider it as "Like"
            handleSwipe(true);
        } else if (deltaX < -50) {
            // Left swipe, consider it as "Dislike"
            handleSwipe(false);
        }
        xInitial = xFinal;
    }

    // Display liked dishes in a new window with buttons
    private void showLikedDishes() {
        // Create a new stage for displaying liked dishes
        Stage likedDishesStage = new Stage();
        likedDishesStage.setTitle("Liked Dishes");

        // Create a VBox to hold buttons for each liked dish
        VBox likedDishesVBox = new VBox(10);

        // Create buttons for each liked dish and set their actions
        for (Dish likedDish : likedDishes) {
            Button dishButton = new Button(likedDish.getName());
            dishButton.setOnAction(e -> showRecipe(likedDish));

            // Add the button to the VBox
            likedDishesVBox.getChildren().add(dishButton);
        }

        // Create a scroll pane to handle cases where there are many liked dishes
        ScrollPane scrollPane = new ScrollPane(likedDishesVBox);
        scrollPane.setFitToWidth(true);

        // Set up the scene and show the stage
        likedDishesStage.setScene(new Scene(scrollPane, 300, 200));
        likedDishesStage.show();
    }

    // Display disliked dishes in a new window with buttons
    private void showDislikedDishes() {
        // Create a new stage for displaying disliked dishes
        Stage dislikedDishesStage = new Stage();
        dislikedDishesStage.setTitle("Disliked Dishes");

        // Create a VBox to hold buttons for each disliked dish
        VBox dislikedDishesVBox = new VBox(10);

        // Create buttons for each disliked dish and set their actions
        for (Dish dislikedDish : dislikedDishes) {
            Button dishButton = new Button(dislikedDish.getName());
            dishButton.setOnAction(e -> showRecipe(dislikedDish));

            // Add the button to the VBox
            dislikedDishesVBox.getChildren().add(dishButton);
        }

        // Create a scroll pane to handle cases where there are many disliked dishes
        ScrollPane scrollPane = new ScrollPane(dislikedDishesVBox);
        scrollPane.setFitToWidth(true);

        // Set up the scene and show the stage
        dislikedDishesStage.setScene(new Scene(scrollPane, 300, 200));
        dislikedDishesStage.show();
    }

    // Display the recipe for a selected dish
    private void showRecipe(Dish dish) {
        // Create a new stage for displaying the recipe
        Stage recipeStage = new Stage();
        recipeStage.setTitle(dish.getName() + " Recipe");

        // Join the lines of the recipe list into a single string
        String recipeText = String.join("\n", dish.getRecipe());

        // Create a TextArea for displaying the recipe
        TextArea recipeTextArea = new TextArea(recipeText);
        recipeTextArea.setEditable(false);

        // Set up the scene and show the stage
        recipeStage.setScene(new Scene(recipeTextArea, 400, 300));
        recipeStage.show();
    }
}
