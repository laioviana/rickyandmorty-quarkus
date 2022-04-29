package com.laio.repository;

import com.laio.entity.Character;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CharacterRepository implements PanacheRepository<Character> {
}
