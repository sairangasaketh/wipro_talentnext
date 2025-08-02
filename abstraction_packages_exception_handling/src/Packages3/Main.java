package Packages3;

import Packages3.automobiles.twowheeler.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Honda honda = new Honda();
        
        System.out.println("Hero's speed: " + hero.getSpeed()+" km/hr");
        hero.radio();
        
        System.out.println("Honda's speed: " + honda.getSpeed()+" km/hr");
        honda.cdplayer();
    }
}