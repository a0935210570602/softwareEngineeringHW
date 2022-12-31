import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class letterGrageTest {

    @Test
    void scoreBelowZeroShouldBeGradedByX() {
        assertEquals('X', letterGrage.letterGrade(-1));
    }

    @Test
    void scoreShouldBeGradedByFInLowBoundry() {
        assertEquals('F', letterGrage.letterGrade(0));
    }

    @Test
    void scoreShouldBeGradedByFInHighBoundry() {
        assertEquals('F', letterGrage.letterGrade(59));
    }

    @Test
    void scoreShouldBeGradedByDInLowBoundry() {
        assertEquals('D', letterGrage.letterGrade(60));
    }

    @Test
    void scoreShouldBeGradedByDInHighBoundry() {
        assertEquals('D', letterGrage.letterGrade(69));
    }

    @Test
    void scoreShouldBeGradedByCInLowBoundry() {
        assertEquals('C', letterGrage.letterGrade(70));
    }

    @Test
    void scoreShouldBeGradedByCInHighBoundry() {
        assertEquals('C', letterGrage.letterGrade(79));
    }

    @Test
    void scoreShouldBeGradedByBInLowBoundry() {
        assertEquals('B', letterGrage.letterGrade(80));
    }

    @Test
    void scoreShouldBeGradedByBInHighBoundry() {
        assertEquals('B', letterGrage.letterGrade(89));
    }

    @Test
    void scoreShouldBeGradedByAInLowBoundry() {
        assertEquals('A', letterGrage.letterGrade(90));
    }

    @Test
    void scoreShouldBeGradedByAInHighBoundry() {
        assertEquals('A', letterGrage.letterGrade(100   ));
    }

    @Test
    void scoreUponOnehundredShouldBeGradedByX() {
        assertEquals('X', letterGrage.letterGrade(101));
    }
}