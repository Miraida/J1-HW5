package com.company;

public class Heroes {
   // private int LuckyHealth,GolemHealth,BerserkHealth,ThorHealth;
  //  private int LuckyDamage,GolemDamage,BerserkDamage,ThorDamage;
  // private String LuckyAbility,GolemAbility,BerserkAbility,ThorAbility;

    private int[] heroesHealth ;
    private int[] heroesDamage;
    private String[] heroesAbility;

    Heroes(int[] heroesHealth, int[] heroesDamage, String[] heroesAbility){

            this.heroesHealth = heroesHealth;
            this.heroesDamage = heroesDamage;
            this.heroesAbility = heroesAbility;
    }

    Heroes(int[] heroesHealth, int[] heroesDamage){
            this.heroesHealth = heroesHealth;
            this.heroesDamage = heroesDamage;

    }

    public int[] getHeroesHealth() {
            return heroesHealth;

    }

    public int[] getHeroesDamage() {
        return heroesDamage;
    }

    public String[] getHeroesAbility() {
        return heroesAbility;
    }
}
