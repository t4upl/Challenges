package com.artifactId.challengerocket.y2020.EY;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;

public class HeroTest {

  @Test
  public void test1() {
    Wizard wizard1 = new Wizard("Shirius", 100, 20);
    Knight knight1 = new Knight("Rolf the Hawk", 200, 50);

    assertEquals("Shirius", wizard1.GetName());
    assertEquals(100, wizard1.GetHealth());
    assertEquals(20, wizard1.GetDamage());
    assertEquals(true, wizard1.GetAliveStatus());
    assertTrue(Arrays.equals(wizard1.GetSpellBook(), new String[0]));
  }

  @Test
  public void test3() {
    Wizard wizard1 = new Wizard("Shirius", 100, 20);
    Knight knight1 = new Knight("Rolf the Hawk", 200, 50);

    assertEquals(true, wizard1.Attack(knight1));
    assertEquals(180, knight1.GetHealth());
    assertEquals(100, wizard1.GetHealth());
    assertEquals(true, wizard1.GetAliveStatus());
  }

  @Test
  public void test4() {
    Wizard wizard1 = new Wizard("Shirius", 100, 20);
    Knight knight1 = new Knight("Rolf the Hawk", 200, 50);

    assertEquals("Shirius", wizard1.GetName());
    assertEquals(100, wizard1.GetHealth());
    assertEquals(20, wizard1.GetDamage());
    assertEquals(true, wizard1.GetAliveStatus());
    assertTrue(Arrays.equals(wizard1.GetSpellBook(), new String[0]));

    assertEquals("Rolf the Hawk", knight1.GetName());
    assertEquals(200, knight1.GetHealth());
    assertEquals(50, knight1.GetDamage());
    assertEquals(true, knight1.GetAliveStatus());
    assertEquals(0, knight1.GetStaminaPoints());

    assertEquals(true, wizard1.Attack(knight1));
    assertEquals(180, knight1.GetHealth());
    assertEquals(100, wizard1.GetHealth());
    assertEquals(true, wizard1.GetAliveStatus());

    assertEquals(true, knight1.Attack(wizard1));
    assertEquals(true, knight1.Attack(wizard1));
    assertEquals(180, knight1.GetHealth());
    assertEquals(0, wizard1.GetHealth());
    assertEquals(false, wizard1.GetAliveStatus());

    assertEquals(false, wizard1.Attack(knight1));
    assertEquals(false, wizard1.HealingSpell(knight1));

    Wizard wizard2 = new Wizard("Wizard2", 100, 20);
    assertEquals(false, wizard2.HealingSpell(knight1));
    wizard2.AddToSpellBook("Spell");
    assertEquals(false, wizard2.HealingSpell(knight1));
    wizard2.AddToSpellBook("Healing spell");
    assertEquals(true, wizard2.HealingSpell(knight1));
    assertEquals(230, knight1.GetHealth());

    assertEquals(false, knight1.SpecialAttack(wizard2));
    knight1.ChangeStaminaPoints(100);
    assertEquals(100, knight1.GetStaminaPoints());
    assertEquals(false, knight1.SpecialAttack(wizard1));
    assertEquals(true, knight1.SpecialAttack(wizard2));
    assertEquals(0, knight1.GetStaminaPoints());
    assertEquals(0, wizard2.GetHealth());

  }
}