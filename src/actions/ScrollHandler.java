package actions;

import data.Map;
import data.Mouse;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class ScrollHandler implements MouseWheelListener{

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

        Map.scroll(e.getWheelRotation());

        if (Map.mapActive) {
            Mouse.insideMap(e.getX(), e.getY());
            if (Mouse.insideMap) {
                Mouse.coordToPos(e.getX(), e.getY());
                Mouse.posToCoord(Mouse.pos.x, Mouse.pos.y);
            }
        }
    }
}
