package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CookbookApp extends Application {

    private List<Dish> dishes;
    private List<Dish> likedDishes;
    private List<Dish> dislikedDishes;

    private ImageView dishImageView;
    private Text dishInfoText;
    private Button likeButton;
    private Button dislikeButton;

    private double xInitial;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        DishProvider dishProvider = new DishProvider();
        dishes = dishProvider.getDishes();
        likedDishes = new ArrayList<>();
        dislikedDishes = new ArrayList<>();

        dishImageView = new ImageView();
        dishImageView.setFitWidth(667);
        dishImageView.setFitHeight(400);

        dishInfoText = new Text();
        dishInfoText.setWrappingWidth(400);

        likeButton = new Button("Like");
        dislikeButton = new Button("Dislike");

        // Set up event handlers for mouse drag events
        dishImageView.setOnMousePressed(this::handleMousePressed);
        dishImageView.setOnMouseDragged(this::handleMouseDragged);

        likeButton.setOnAction(e -> handleSwipe(true));
        dislikeButton.setOnAction(e -> handleSwipe(false));

        HBox buttonsBox = new HBox(10, likeButton, dislikeButton);
        buttonsBox.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setTop(dishImageView);
        BorderPane.setAlignment(dishImageView, Pos.CENTER); // Center the image
        root.setCenter(dishInfoText);
        root.setBottom(buttonsBox);

        Scene scene = new Scene(root, 400, 600);

        primaryStage.setTitle("Cookbook App");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Display the initial dish
        showRandomDish();
    }

    private void showRandomDish() {
        if (!dishes.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(dishes.size());
            Dish currentDish = dishes.get(randomIndex);

            Image image = new Image(currentDish.getImagePath());
            dishImageView.setImage(image);

            // Set the food information to the text
            dishInfoText.setText("Food: " + currentDish.getName() + "\nOrigin: " + currentDish.getCuisineType()
                    + "\nDescription: " + currentDish.getDescription() + "\nCooktime: " + currentDish.getCookTime()
                    + " mins" + "\nRecipe:\n" + currentDish.getRecipe());

            // Clear any previous liked or disliked information
            dishInfoText.setText(dishInfoText.getText() + "\n\n");
        }
    }

    private void handleSwipe(boolean liked) {
        Dish currentDish = dishes.get(0);

        if (liked) {
            likedDishes.add(currentDish);
        } else {
            dislikedDishes.add(currentDish);
        }

        // Remove the current dish from the list
        dishes.remove(0);

        // Show a new dish or end the process
        if (dishes.isEmpty()) {
            // You can display a message or take some action when all dishes are swiped
            System.out.println("You've swiped through all dishes!");
        } else {
            showRandomDish();
        }
    }

    private void handleMousePressed(MouseEvent event) {
        xInitial = event.getSceneX();
    }

    private void handleMouseDragged(MouseEvent event) {
        double xFinal = event.getSceneX();

        // Determine the swipe direction based on the change in X position
        double deltaX = xFinal - xInitial;
        if (deltaX > 50) {
            // Right swipe, consider it as "Like"
            handleSwipe(true);
        } else if (deltaX < -50) {
            // Left swipe, consider it as "Dislike"
            handleSwipe(false);
        }

        // Reset initial X position for the next drag event
        xInitial = xFinal;
    }
}
