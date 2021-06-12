package tests;

import model.enemies.Enemy;
import model.starters.Poppy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class PoppyTest {
    Poppy poppy;
    Enemy enemy;

    @BeforeEach
    public void setUp() {
        poppy = new Poppy(10, 100, 300, false, 3, new FakeRandomizer());
        enemy = new FakeEnemy(10, 100, 150);
    }

    @Test
    public void mainAttackPoppy() {
        assertEquals(100, enemy.getHealth());
        poppy.mainAttack(enemy);
        assertEquals(90, enemy.getHealth());
    }
    @Test
    public void secondaryAttackPoppy() {
        assertEquals(100, enemy.getHealth());
        assertEquals(false, enemy.isConfused());
        poppy.secondaryAttack(enemy);
        assertEquals(95, enemy.getHealth());
        assertEquals(true, enemy.isConfused());
    }
    
    @Test
    public void getAttackDamageOfMainAttackPoppy() {
        assertEquals(100, enemy.getHealth());
        double damage = poppy.getAttackDamageOfMainAttack();
        assertEquals(10, damage);
    }
    @Test
    public void getAttackDamageOfSecondaryAttackPoppy() {
        assertEquals(100, enemy.getHealth());
        double damage = poppy.getAttackDamageOfSecondaryAttack();
        assertEquals(5, damage);
    }
    
}
