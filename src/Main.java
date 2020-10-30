import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AthleteView.fxml"));
        primaryStage.setTitle("COMP1011_Midterm");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
