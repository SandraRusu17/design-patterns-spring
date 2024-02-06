package com.srusu.designpatterns.behavioral.strategy;

import org.springframework.stereotype.Component;

@Component
public class MageAttackBehaviorStrategy implements AttackBehaviorStrategy {
    @Override
    public void invokeAttack(Character character) {
        if (character.getCharacterClass() == CharacterClass.MAGE) {
            System.out.println("Mage attacks with magic");
        }
    }

    @Override
    public boolean accepts(CharacterClass characterClass) {
        return characterClass == CharacterClass.MAGE;
    }
}
