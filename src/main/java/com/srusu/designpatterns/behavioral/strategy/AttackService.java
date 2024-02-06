package com.srusu.designpatterns.behavioral.strategy;

import org.springframework.stereotype.Service;

@Service
public class AttackService {
    private final AttackBehaviorStrategyResolver attackBehaviorStrategyResolver;

    public AttackService(AttackBehaviorStrategyResolver attackBehaviorStrategyResolver) {
        this.attackBehaviorStrategyResolver = attackBehaviorStrategyResolver;
    }

    public void invokeAttackFor(Character character) {
        AttackBehaviorStrategy attackBehaviorStrategy = attackBehaviorStrategyResolver.resolveFor(character.getCharacterClass());
        attackBehaviorStrategy.invokeAttack(character);
    }


}
