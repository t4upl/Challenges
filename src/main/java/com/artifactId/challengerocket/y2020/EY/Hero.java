package com.artifactId.challengerocket.y2020.EY;

import java.util.ArrayList;
import java.util.List;

public class Hero {

  String name;
  int health;
  int damage;
  boolean isAlive = true;

  public Hero(String name, int health, int damage) {
    this.name = name;
    this.health = health;
    this.damage = damage;
  }

  public String GetName() {
    return name;
  }

  public int GetHealth() {
    return health;
  }

  public int GetDamage() {
    return damage;
  }

  public boolean GetAliveStatus() {
    return isAlive;
  }

  public void ChangeHealth(int difference) {
    this.health+=difference;
  }

  public boolean Attack(Hero target) {
    if (GetAliveStatus() && target.GetAliveStatus()) {
      target.ChangeHealth(-GetDamage());
      if(target.GetHealth() <= 0) {
        target.Die();
      }
      return true;
    }
    return false;
  }

  public void Die() {
    this.isAlive = false;
  }


}

class Wizard extends Hero{

  private List<String> spellBook = new ArrayList<>();

  public Wizard(String name, int health, int damage) {
    super(name, health, damage);
  }

  public String[] GetSpellBook() {
    String[] itemsArray = new String[spellBook.size()];
    itemsArray = spellBook.toArray(itemsArray);
    return itemsArray;
  }

  public void AddToSpellBook(String spell) {
    this.spellBook.add(spell);
  }

  public boolean HealingSpell(Hero target) {
    if (GetAliveStatus() && target.GetAliveStatus() && spellBook.indexOf("Healing spell") != -1) {
      target.ChangeHealth(50);
      return true;
    }

    return false;
  }

}

class Knight extends Hero {
  private int staminaPoints;

  public Knight(String name, int health, int damage) {
    super(name, health, damage);
  }

  public int GetStaminaPoints() {
    return staminaPoints;
  }

  public void ChangeStaminaPoints(int difference) {
    this.staminaPoints += difference;
  }

  public boolean SpecialAttack(Hero target) {
    if (GetAliveStatus() && target.GetAliveStatus() && this.GetStaminaPoints() >= 100) {
      target.ChangeHealth(-100);
      this.ChangeStaminaPoints(-100);
      return true;
    }

    return false;
  }

}
