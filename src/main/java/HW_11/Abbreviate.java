package HW_11;

import org.apache.commons.lang3.StringUtils;

public class Abbreviate {

    public static String abbreviateString(String str, int length) {
        return StringUtils.abbreviate(str, length);
    }
}
