package methodpass.window;

import java.util.List;

public class WindowOperation {

    public void riseSize(List<Window> windows, int plusSize) {
        for (Window actual: windows) {
            actual.setHeight(actual.getHeight() + plusSize);
        }
    }
}