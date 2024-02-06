package com.srusu.designpatterns.behavioral.strategy;

import org.springframework.stereotype.Component;

@Component
public class WarriorAttackBehaviorStrategy implements AttackBehaviorStrategy {
    @Override
    public void invokeAttack(Character character) {
        if (character.getCharacterClass() == CharacterClass.WARRIOR) {
            System.out.println("Warrior attacks with sword");
        }
    }

    @Override
    public boolean accepts(CharacterClass characterClass) {
        return characterClass == CharacterClass.WARRIOR;
    }
}
