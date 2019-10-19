package layouts.borderpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author JorgeLPR
 */
public class LayoutsBorderPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button("BOTON 1");
        Button btn2 = new Button("BOTON 2");
        Button btn3 = new Button("BOTON 3");
        Button btn4 = new Button("BOTON 4");
        Button btn5 = new Button("BOTON 5");
        
        BorderPane root = new BorderPane();
        
        root.setCenter(btn1);
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn1.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(btn1, new Insets(5, 5, 5, 5));
        
        root.setTop(btn2);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxHeight(Double.MAX_VALUE);
                
        root.setBottom(btn3);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxHeight(Double.MAX_VALUE);

        root.setLeft(btn4);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(btn4, new Insets(5, 0, 5, 0));
        
        root.setRight(btn5);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxHeight(Double.MAX_VALUE);
        BorderPane.setMargin(btn5, new Insets(5, 0, 5, 0));
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Layout - BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
