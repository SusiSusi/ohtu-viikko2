package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author susisusi
 */
public class StaticsticsTest {

    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }

    @Test
    public void findsPlayer() {
        Player yzerman = stats.search("Yzerman");
        assertEquals("Yzerman", yzerman.getName());
    }

    @Test
    public void returnsNullIfPlayerDoesntExistInList() {
        Player nobody = stats.search("Koivu");
        assertEquals(null, nobody);
    }

    @Test
    public void returnsRightPlayersOnTeam() {
        List<Player> players = stats.team("EDM");
        assertEquals(3, players.size());
        assertEquals("Semenko", players.get(0).getName());
        assertEquals("Kurri", players.get(1).getName());
        assertEquals("Gretzky", players.get(2).getName());
    }

    @Test
    public void returnsEmptyListIfTeamDoesntExist() {
        List<Player> players = stats.team("TPS");
        assertEquals(0, players.size());
    }

    @Test
    public void topScoresIsCorrect() {
        List<Player> players = stats.topScorers(3);
        assertEquals(3, players.size());
        assertEquals("Gretzky", players.get(0).getName());
        assertEquals("Lemieux", players.get(1).getName());
        assertEquals("Yzerman", players.get(2).getName());
    }
    
    @Test
    public void returnsEmptyListIfTopScoresValueIsIncorrect() {
        List<Player> players = stats.topScorers(-1);
        assertEquals(0, players.size());
    }
}
