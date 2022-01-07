package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String parameter) {
        return parameter == null || parameter.isBlank();
    }

    public static boolean isEmpty(List<String> parameter) {
        return parameter == null || parameter.size() == 0;
    }
}