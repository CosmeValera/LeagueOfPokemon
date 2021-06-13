package tests;

import model.enemies.Enemy;
import model.starters.Teemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class TeemoTest {
    private Teemo teemo;
    private Enemy enemy;

    @BeforeEach
    public void setUp() {
        teemo = new Teemo(10, 100, 300, 3, new FakeRandomizer());
        enemy = new FakeEnemy(10, 100, 150);
    }

    @Test
    public void mainAttack() {
        assertEquals(100, enemy.getHealth());
        assertEquals(100, teemo.getHealth());
        assertEquals(false, enemy.isPoorSight());
        teemo.mainAttack(enemy);
        assertEquals(85, enemy.getHealth());
        assertEquals(100.9, teemo.getHealth());
        assertEquals(true, enemy.isPoorSight());
    }
    @Test
    public void secondaryAttack() {
        assertEquals(100, enemy.getHealth());
        assertEquals(100, teemo.getHealth());
        assertEquals(false, enemy.isBlinded());
        assertEquals(false, enemy.isPoisoned());
        teemo.secondaryAttack(enemy);
        assertEquals(90, enemy.getHealth());
        assertEquals(100.6, teemo.getHealth());
        assertEquals(true, enemy.isBlinded());
        assertEquals(false, enemy.isPoisoned());
    }
    
    @Test
    public void getAttackDamageOfMainAttack() {
        assertEquals(100, teemo.getHealth());
        double damage = teemo.getAttackDamageOfMainAttack();
        assertEquals(15, damage);
        assertEquals(100.9, teemo.getHealth());
    }
    @Test
    public void getAttackDamageOfMainAttackTeemoWithEffect() {
        teemo.setBlindedIfPossible(true);
        
        assertEquals(100, teemo.getHealth());
        double damage = teemo.getAttackDamageOfMainAttack();
        assertEquals(15, damage);
        assertEquals(100, teemo.getHealth());
    }
    @Test
    public void getAttackDamageOfSecondaryAttack() {
        assertEquals(100, teemo.getHealth());
        double damage = teemo.getAttackDamageOfSecondaryAttack();
        assertEquals(10, damage);
        assertEquals(100.6, teemo.getHealth());
    }
    
    @Test
    public void getAttackDamageOfSecondaryAttackTeemoWithEffect() {
        teemo.setBlindedIfPossible(true);
        
        assertEquals(100, teemo.getHealth());
        double damage = teemo.getAttackDamageOfSecondaryAttack();
        assertEquals(10, damage);
        assertEquals(100, teemo.getHealth());
    }
}
