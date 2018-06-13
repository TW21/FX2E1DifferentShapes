package view;

/**
 * A class to represent graphically an Array of Shape-objects.
 * A Shape Object can be a rectangle or a circle.
 * The shapes appear with their real dimensions and positions,
 * and their area (number rounded) displayed at their origin.
 * @author agathe merceron
 * expanded from Till Wischniewski
 */


import javafx.scene.shape.Ellipse;
import model.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowShapesA extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Group root = new Group();
            // the data that should be graphically represented
            MShape[] shapes = MAllShapes.getDefaultShapes();

            for (MShape s : shapes) {
                // check whether the shape is a rectangle
                if (s instanceof MRectangle) {
                    // cast necessary for the methods getXDelta and getYDelta
                    MRectangle srec = (MRectangle) s;
                    Rectangle rec = new Rectangle(srec.getXOrigin(),
                            srec.getYOrigin(), 2*srec.getXDelta(),  2*srec.getYDelta());
                    //color red is made transparent
                    //so that overlapping shapes are visible
                    rec.setFill(Color.rgb(255, 0, 0, 0.15));
                    // the area (number rounded) displayed as text
                    Text text = new Text(srec.getXOrigin(), srec.getYOrigin(),
                            "a: "+Double.toString(Math.round(srec.area())));

                    root.getChildren().addAll(rec, text);
                } else if (s instanceof MCircle) {
                    // cast necessary for the methods getXDelta and getYDelta
                    MCircle sc = (MCircle) s;
                    Circle circ = new Circle(sc.getXOrigin(),
                            sc.getYOrigin(), sc.getRadius());
                    //color green is made transparent
                    //so that overlapping shapes are visible
                    circ.setFill(Color.rgb(0, 255, 0, 0.15));
                    // the area (number rounded) displayed as text
                    Text text = new Text(sc.getXOrigin(), sc.getYOrigin(),
                            "a: "+Double.toString(Math.round(sc.area())));

                    root.getChildren().addAll(circ, text);
                } else if (s instanceof MSquare) {
                    // cast necessary for the methods getXDelta and getYDelta
                    MSquare ssqu =(MSquare) s;
                    Rectangle rec = new Rectangle(ssqu.getXOrigin(),
                            ssqu.getYOrigin(), 2*ssqu.getXDelta(),  2*ssqu.getXDelta());
                    //color blue is made transparent
                    //so that overlapping shapes are visible
                    rec.setFill(Color.rgb(0, 0, 255, 0.15));
                    // the area (number rounded) displayed as text
                    Text text = new Text(ssqu.getXOrigin(), ssqu.getYOrigin(),
                            "a: "+Double.toString(Math.round(ssqu.area())));

                    root.getChildren().addAll(rec, text);
                } else if (s instanceof MEllipse) {
                    // cast necessary for the methods getXDelta and getYDelta
                    MEllipse se = (MEllipse) s;
                    Ellipse elli = new Ellipse(se.getXOrigin(),
                            se.getYOrigin(), se.getRadiusX(), se.getRadiusY());
                    //color yellow is made transparent
                    //so that overlapping shapes are visible
                    elli.setFill(Color.rgb(255, 255, 0, 0.15));
                    // the area (number rounded) displayed as text
                    Text text = new Text(se.getXOrigin(), se.getYOrigin(),
                            "a: "+Double.toString(Math.round(se.area())));

                    root.getChildren().addAll(elli, text);
                }
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