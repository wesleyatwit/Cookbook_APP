package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CookbookApp extends Application {

    private List<Dish> dishes;
    private List<Dish> likedDishes;
    private List<Dish> dislikedDishes;

    private ImageView dishImageView;
    private Button likeButton;
    private Button dislikeButton;

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
        likeButton = new Button("Like");
        dislikeButton = new Button("Dislike");

        likeButton.setOnAction(e -> handleSwipe(true));
        dislikeButton.setOnAction(e -> handleSwipe(false));

        VBox root = new VBox(10, dishImageView, likeButton, dislikeButton);
        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Cookbook App");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Display the initial dish
        showRandomDish();
    }

    private void showRandomDish() {
        Random random = new Random();
        int index = random.nextInt(dishes.size());
        Dish currentDish = dishes.get(index);

        Image image = new Image(currentDish.getImagePath());
        dishImageView.setImage(image);
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
}
