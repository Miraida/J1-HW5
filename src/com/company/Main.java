package com.company;

public class Main {
    private static String[] ability = {"Lucky","Golem","Berserk","Thor"};
    private static int[] health = {200,300,250,270};
    private static int[] damage = {5,10,25,15};


    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossDefenceType(ability);
      // sout Boss properties
        System.out.println("Boss Heath: "+boss.getBossHealth());
        System.out.println("Boss Damage: "+boss.getBossDamage());

        System.out.print("Boss Defence Types: ");
        for (int i = 0; i < ability.length; i++) {
            System.out.print(boss.getBossDefenceType()[i]+" , ");
        }
        System.out.println();

      // sout Heroes properties
        Heroes[] heroe;
        heroe = createHeroes();

        for (int i = 0; i < heroe[0].getHeroesHealth().length ; i++) {
            System.out.println("Hero "+heroe[0].getHeroesAbility()[i] +" || Health: "+ heroe[0].getHeroesHealth()[i]+" Damage: "+heroe[0].getHeroesDamage()[i]);
        }

    }

    public static Heroes[] createHeroes(){
        Heroes heroes = new Heroes(health,damage,ability);
        Heroes heroes1 = new Heroes(health,damage);
        Heroes[] heroMass ={heroes,heroes1};
        return heroMass;
    }
}
