package org.glseven;

/**
 * 自定义数字与字母对应关系
 *
 * @author lizhiyong
 */
public enum Constant {

    zero("0", ""),

    one("1", ""),

    two("2", "A", "B", "C"),

    three("3", "D", "E", "F"),

    four("4", "G", "H", "I"),

    five("5", "J", "K", "L"),

    six("6", "M", "N", "O"),

    seven("7", "P", "Q", "R", "S"),

    eight("8", "Y", "U", "V"),

    nine("9", "W", "X", "Y", "Z");

    private String digit;

    private String[] letters;

    Constant(String digit, String... letters) {
        this.digit = digit;
        this.letters = letters;
    }

    public static Constant getConstant(String digit) {
        for (Constant constant : Constant.values()) {
            if (constant.getDigit().equalsIgnoreCase(digit)) {
                return constant;
            }
        }
        return null;
    }

    public String getDigit() {
        return digit;
    }

    public String[] getLetters() {
        return letters;
    }
}
