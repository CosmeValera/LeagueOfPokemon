package tests;

import model.enemies.Enemy;
import model.starters.Yuumi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class YuumiTest {
    private Yuumi yuumi;
    private Enemy enemy;

    @BeforeEach
    public void setUp() {
        yuumi = new Yuumi(10, 100, 300, 4, new FakeRandomizer());
        enemy = new FakeEnemy(10, 100, 150);
    }

    @Test
    public void mainAttackPoppy() {
        assertEquals(100, enemy.getHealth());
        assertEquals(100, yuumi.getHealth());
        yuumi.mainAttack(enemy);
        assertEquals(90, enemy.getHealth());
        assertEquals(104, yuumi.getHealth());
    }
    @Test
    public void secondaryAttackPoppy() {
        assertEquals(100, enemy.getHealth());
        assertEquals(false, enemy.isBlinded());
        assertEquals(100, yuumi.getHealth());
        yuumi.secondaryAttack(enemy);
        assertEquals(85, enemy.getHealth());
        assertEquals(true, enemy.isBlinded());
        assertEquals(101, yuumi.getHealth());
    }
    
    @Test
    public void getAttackDamageOfMainAttackPoppy() {
        assertEquals(100, enemy.getHealth());
        assertEquals(100, yuumi.getHealth());
        double damage = yuumi.getAttackDamageOfMainAttack();
        assertEquals(10, damage);
        assertEquals(104, yuumi.getHealth());
    }
    @Test
    public void getAttackDamageOfSecondaryAttackPoppy() {
        assertEquals(100, enemy.getHealth());
        assertEquals(100, yuumi.getHealth());
        double damage = yuumi.getAttackDamageOfSecondaryAttack();
        assertEquals(15, damage);
        assertEquals(101, yuumi.getHealth());
    }
    
}
