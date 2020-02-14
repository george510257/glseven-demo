package org.glseven;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合字母
 *
 * @author lizhiyong
 */
public class Combination {

    private List<String> digitList = new ArrayList<>();

    private List<String[]> lettersList = new ArrayList<>();


    public Combination(String... digits) {
        for (String digit : digits) {
            Constant constant = Constant.getConstant(digit);
            if (constant != null) {
                setConstant(constant);
            } else if (StringUtils.isNumber(digit)) {
                char[] digitCharArray = digit.toCharArray();
                for (char digitChar : digitCharArray) {
                    Constant constant1 = Constant.getConstant(String.valueOf(digitChar));
                    if (constant1 != null) {
                        setConstant(constant1);
                    }
                }
            }
        }
    }

    private void setConstant(Constant constant) {
        digitList.add(constant.getDigit());
        lettersList.add(constant.getLetters());
    }

    public String[] getAllLetters() {
        String[] allLetters = new String[1];
        for (String[] letters : lettersList) {
            allLetters = allLetterAddLetters(allLetters, letters);
        }
        return allLetters;
    }

    private String[] allLetterAddLetters(String[] letters1, String[] letters2) {
        String[] allLetters = new String[letters1.length * letters2.length];
        for (int i = 0; i < letters1.length; i++) {
            for (int j = 0; j < letters2.length; j++) {
                allLetters[i + letters1.length * j] = addLetter(letters1[i], letters2[j]);
            }
        }
        return allLetters;
    }

    private String addLetter(String s1, String s2) {
        if (s1 == null || "".equalsIgnoreCase(s1)) {
            s1 = "";
        }
        if (s2 == null || "".equalsIgnoreCase(s2)) {
            s2 = "";
        }
        return s1 + s2;
    }

}
