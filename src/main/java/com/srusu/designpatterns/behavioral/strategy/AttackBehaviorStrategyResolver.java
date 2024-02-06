package com.srusu.designpatterns.behavioral.strategy;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
class AttackBehaviorStrategyResolver {
    private final List<AttackBehaviorStrategy> strategies;

    AttackBehaviorStrategyResolver(List<AttackBehaviorStrategy> strategies) {
        this.strategies = strategies;
    }

    public AttackBehaviorStrategy resolveFor(CharacterClass characterClass) {
        return strategies.stream()
                .filter(s -> s.accepts(characterClass))
                .findFirst()
                .orElseGet(DefaultAttackBehaviorStrategy::new);
    }
}