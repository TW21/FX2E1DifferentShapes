package view;

/**
 * A class to represent graphically an Array of Shape-objects.
 * A Shape Object can be a rectangle or a circle.
 * The shapes appear with their real dimensions and positions,
 * and their area (number rounded) displayed at their origin.
 * @author agathe merceron
 */


import java.lang.reflect.Method;
import model.MAllShapes;
import model.MShape;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowShapesB extends Application {
    private static final String PREFIXMODEL = "model.M";
    private static final String PREFIXVIEW = "view.V";
    private static final String METHODNAME = "getShape";
    private static final String PARAMTYPE = "model.MShape";



    @Override
    public void start(Stage primaryStage) {
        try {
            Group root = new Group();
            // the data that should be graphically represented
            MShape[] shapes = MAllShapes.getDefaultShapes();

            for (MShape s : shapes) {
                //the name of the class the object s is an instance of
                String modelname = s.getClass().getName();
                // the class that should be taken to build the view for s
                String viewname = PREFIXVIEW+modelname.substring(PREFIXMODEL.length());
                Class<?> c = Class.forName(viewname);
                //the Method-Object has to be created in order to invoke the method
                //the getMethod needs the name of the method and the Class-Object
                // of each parameter
                Method m = c.getMethod(METHODNAME, Class.forName(PARAMTYPE));
                // Method getShape is called;
                // the fist parameter is null, because getShape is static;
                // the method invoke returns an object of type Object,
                // therefore the cast
                Shape s1 = (Shape) m.invoke(null, s);

                // the area (number rounded) displayed as text
                Text text = new Text(s.getXOrigin(), s.getYOrigin(),
                        "a: "+Double.toString(Math.round(s.area())));

                root.getChildren().addAll(s1, text);
            }

            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}