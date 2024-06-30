package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class War {
        private List<Vikings> vikingArmy;
        private List<Saxon> saxonArmy;

        public War() {
            this.vikingArmy = new ArrayList<>();
            this.saxonArmy = new ArrayList<>();
        }

        public void addViking(Vikings viking) {
            this.vikingArmy.add(viking);
        }

        public void addSaxon(Saxon saxon) {
            this.saxonArmy.add(saxon);
        }

        public String vikingAttack() {
            if (saxonArmy.isEmpty() || vikingArmy.isEmpty()) {
                return "No battle can happen";
            }

            Random rand = new Random();
            Vikings randomViking = vikingArmy.get(rand.nextInt(vikingArmy.size()));
            Saxon randomSaxon = saxonArmy.get(rand.nextInt(saxonArmy.size()));

            randomSaxon.receiveDamage(randomViking.attack());

            if (randomSaxon.getHealth() <= 0) {
                saxonArmy.remove(randomSaxon);
            }

            return randomSaxon.getMsg();
        }

        public String saxonAttack() {
            if (saxonArmy.isEmpty() || vikingArmy.isEmpty()) {
                return "No battle can happen";
            }

            Random rand = new Random();
            Vikings randomViking = vikingArmy.get(rand.nextInt(vikingArmy.size()));
            Saxon randomSaxon = saxonArmy.get(rand.nextInt(saxonArmy.size()));

            randomViking.receiveDamage(randomSaxon.attack());

            if (randomViking.getHealth() <= 0) {
                vikingArmy.remove(randomViking);
            }

            return randomViking.getMsg();
        }

        public String showStatus() {
            if (saxonArmy.isEmpty()) {
                return "Vikings have won the war of the century!";
            } else if (vikingArmy.isEmpty()) {
                return "Saxons have fought for their lives and survive another day...";
            } else {
                return "Vikings and Saxons are still in the thick of battle.";
            }
        }
    }
