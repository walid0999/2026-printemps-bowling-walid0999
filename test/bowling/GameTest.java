package bowling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	@BeforeEach
	void initialisation(){
		game= new Game();
	}

	@Test
	void niveau1test() {
		game.roll(0);
		assertEquals(0, game.score());
		
		for(int i=0; i<20; i++) {
			game.roll(0);
		}
	}

}
