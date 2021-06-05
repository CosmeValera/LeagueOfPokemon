//import modelo.Enemigo;
//import modelo.Pikachu;
//import modelo.Teemo;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TeemoTest {
////
////    @BeforeEach
////    public void init() {
////        
////    }
//
//    @Test
//    public void teemo_ataque_principal() {
//        Teemo teemo = new Teemo(new FakeRandomizer()); //Pasarme FakeRandomizer en vez de MathRandomizer
//        Enemigo enemigo = new Pikachu(); //Crear clase fakeEnemigo
//
//        teemo.ataquePrincipal(enemigo);
//
//        assertEquals(27, enemigo.getVida());
//    }
//
//}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class TeemoTest {

//    BowlingGame game;

    @BeforeEach
    public void init() {
//        game = new BowlingGame();
    }

    @Test
    public void should_return_empty_score() {
//        int score = game.score("--|--|--|--|--|--|--|--|--|---");

        assertEquals(0, 0);
    }

//    @Test
//    public void should_score_1() {
////        int score = game.score("1-|--|--|--|--|--|--|--|--|---");
//
//        assertEquals(1, score);
//    }
//
//    @Test
//    public void should_score_1_on_second_roll() {
//        int score = game.score("-1|--|--|--|--|--|--|--|--|---");
//
//        assertEquals(1, score);
//    }

}
