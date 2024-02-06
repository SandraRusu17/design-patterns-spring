package com.srusu.designpatterns.behavioral.strategy;

import org.springframework.stereotype.Service;

@Service
public interface AttackBehaviorStrategy {
    void invokeAttack(Character character);

    boolean accepts(CharacterClass characterClass);
}
