package tests;

import model.enemies.Enemy;
import model.starters.Gnar;
import model.starters.Starter;
import model.starters.Teemo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GnarTest {
    Gnar gnar;
    Enemy enemy;

    @BeforeEach
    public void setUp() {
        gnar = new Gnar(10, 100, 300, false, 20, new FakeRandomizer());
        enemy = new FakeEnemy(10, 100, 150);
    }

    @Test
    public void mainAttackGnarMini() {
        gnar.setIsMonster(false);
        
        assertEquals(100, enemy.getHealth());
        gnar.mainAttack(enemy);
        assertEquals(90, enemy.getHealth());
    }
    @Test
    public void mainAttackGnarMega() {
        gnar.setIsMonster(true);
        
        assertEquals(100, enemy.getHealth());
        gnar.mainAttack(enemy);
        assertEquals(78, enemy.getHealth());
    }
    @Test
    public void secondaryAttackGnarMini() {
        gnar.setIsMonster(false);
        
        assertEquals(100, enemy.getHealth());
        gnar.secondaryAttack(enemy);
        assertEquals(90, enemy.getHealth());
    }
    @Test
    public void secondaryAttackGnarMega() {
        gnar.setIsMonster(true);
        
        assertEquals(100, enemy.getHealth());
        gnar.secondaryAttack(enemy);
        assertEquals(80, enemy.getHealth());
    }
    
    
    
    @Test
    public void getAttackDamageOfMainAttackGnarMini() {
        gnar.setIsMonster(false);
        
        double damage = gnar.getAttackDamageOfMainAttack();
        assertEquals(10, damage);
    }
    @Test
    public void getAttackDamageOfMainAttackGnarMega() {
        gnar.setIsMonster(true);
        
        double damage = gnar.getAttackDamageOfMainAttack();
        assertEquals(22, damage);
    }
    @Test
    public void getAttackDamageOfSecondaryAttackGnarMini() {
        gnar.setIsMonster(false);
        
        double damage = gnar.getAttackDamageOfSecondaryAttack();
        assertEquals(10, damage);
    }
    @Test
    public void getAttackDamageOfSecondaryAttackGnarMega() {
        gnar.setIsMonster(true);
        
        double damage = gnar.getAttackDamageOfSecondaryAttack();
        assertEquals(20, damage);
    }
    
}
