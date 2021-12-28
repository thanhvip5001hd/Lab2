package visitor;

import java.awt.Rectangle;

import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(shapes.Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);

}
