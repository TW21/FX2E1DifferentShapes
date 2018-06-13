package view;

/**
 * A class to represent graphically a MRectangle-Object
 * @author Till Wischniewski
 */
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.MSquare;
import model.MShape;

public class VSquare {

    public static Rectangle getShape(MShape s) {
        MSquare ssqu = (MSquare) s;
        Rectangle rec = new Rectangle(ssqu.getXOrigin(),
                ssqu.getYOrigin(), 2*ssqu.getXDelta(), 2*ssqu.getXDelta());
        //color blue is made transparent
        //so that overlapping shapes are visible
        rec.setFill(Color.rgb(0, 0, 255, 0.15));
        return rec;
    }
}
