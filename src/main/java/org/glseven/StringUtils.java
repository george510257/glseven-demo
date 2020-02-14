package org.glseven;


import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;


/**
 * @author lizhiyong
 */
public class StringUtils {

    public static boolean isNumber(String str) {
        Pattern pattern = compile("[0-9]*");
        return pattern.matcher(str).matches();

    }
}
