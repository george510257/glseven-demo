package org.glseven;

import org.junit.Assert;
import org.junit.Test;

public class CombinationTest {

    @Test
    public void combinationLetter1() {
        Combination combination = new Combination("2", "9");
        String[] strings = combination.getAllLetters();
        for (String str : strings) {
            System.out.print(str + ",");
        }
        Assert.assertEquals(strings.length, 3 * 4);
    }

    @Test
    public void combinationLetter2() {
        Combination combination = new Combination("2", "99");
        String[] strings = combination.getAllLetters();
        for (String str : strings) {
            System.out.print(str + ",");
        }
        Assert.assertEquals(strings.length, 3 * 4 * 4);
    }

    @Test
    public void combinationLetter3() {
        Combination combination = new Combination("0", "2");
        String[] strings = combination.getAllLetters();
        for (String str : strings) {
            System.out.print(str + ",");
        }
        Assert.assertEquals(strings.length, 1 * 3);
    }
}