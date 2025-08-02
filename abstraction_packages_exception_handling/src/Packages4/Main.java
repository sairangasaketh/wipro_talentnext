package Packages4;

import Packages3.automobiles.twowheeler.Hero;
import Packages4.com.automobile.fourwheeler.Ford;
import Packages4.com.automobile.fourwheeler.Logan;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Honda honda = new Honda();
        Ford ford = new Ford();
        Logan logan = new Logan();
        
        System.out.println("Hero's speed: " + hero.getSpeed()+" km/hr");
        hero.radio();
        
        System.out.println("Honda's speed: " + honda.getSpeed()+" km/hr");
        honda.cdplayer();
        
        System.out.println("Ford's speed: " + ford.speed()+" km/hr");
        ford.tempControl();
        
        System.out.println("Logan's speed: " + logan.speed()+" km/hr");
        logan.gps();
    }
}