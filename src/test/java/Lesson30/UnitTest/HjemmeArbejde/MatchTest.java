package Lesson30.UnitTest.HjemmeArbejde;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class MatchTest {

    // Test vinder (team A vinder)
    @Test
    public void testWinnerTeamA() {
        Match m = new Match("A", "B", 3, 1);
        assertEquals("A", m.getWinner());
    }

    // Test vinder (team B vinder)
    @Test
    public void testWinnerTeamB() {
        Match m = new Match("A", "B", 1, 4);
        assertEquals("B", m.getWinner());
    }

    // Test uafgjort
    @Test
    public void testDraw() {
        Match m = new Match("A", "B", 2, 2);
        assertEquals("Draw", m.getWinner());
    }

    // Test største scoreforskel
    @Test
    public void testBiggestWin() {
        List<Match> matches = new ArrayList<>();

        matches.add(new Match("A", "B", 2, 1)); // diff = 1
        matches.add(new Match("C", "D", 5, 0)); // diff = 5
        matches.add(new Match("E", "F", 3, 2)); // diff = 1

        Match biggest = Match.findBiggestWin(matches);

        assertEquals(5, biggest.getScoreDifference());
    }

    // Edge case: tom liste
    @Test
    public void testBiggestWinEmpty() {
        List<Match> matches = new ArrayList<>();
        assertNull(Match.findBiggestWin(matches));
    }

    // Test sortering
    @Test
    public void testSorting() {
        List<Match> matches = new ArrayList<>();

        matches.add(new Match("A", "B", 2, 1)); // diff = 1
        matches.add(new Match("C", "D", 5, 0)); // diff = 5
        matches.add(new Match("E", "F", 3, 2)); // diff = 1

        Match.sortByScoreDifference(matches);

        // Første element skal have størst scoreforskel
        assertEquals(5, matches.get(0).getScoreDifference());
    }
}