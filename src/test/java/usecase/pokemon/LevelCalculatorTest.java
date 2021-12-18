package usecase.pokemon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LevelCalculatorTest {

    @Test
    public void testCalculateLevel() {
        Assert.assertEquals(100, new LevelCalculator().calculateLevel(10000));
    }

    @Test
    public void testCalculateExperiencePoint() {
        assertEquals(10000, new LevelCalculator().calculateExperiencePoint(100));
    }
}