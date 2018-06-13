package view;

/**
 * A class to represent graphically a MCircle-Object
 * @author Till Wischniewski
 */

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import model.MEllipse;
import model.MShape;

public class VEllipse {

    /**
     * expects a MCircle-Object and returns its graphical representation
     * as a Circle-Object
     * @param s a MCircle-Object
     * @return the Circle-Object that represents s
     */

    public static Ellipse getShape(MShape s) {
        MEllipse se = (MEllipse) s;
        Ellipse elli = new Ellipse(se.getXOrigin(),
                se.getYOrigin(), se.getRadiusX(), se.getRadiusY());
        //color purple is made transparent
        //so that overlapping shapes are visible
        elli.setFill(Color.rgb(255, 0, 255, 0.15));
        return elli;
    }

}