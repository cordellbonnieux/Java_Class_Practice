import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class extends Application {
    @Override
    public void start(Stage primaryStage) {

        Button btOK = new Button(" OK "); // make a button

        Scene scene = new Scene(btOK, 200, 250); // make a scene and add the button to it

        primaryStage.setTitle("MyJavaFX"); // make a title for the stage
        primaryStage.setScene(scene); // add the scene (with the button in it) to the stage
        primaryStage.show(); // display the stage
    }
    
    /**
     * The main method is here just so it is convenient to run from the IDE
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}