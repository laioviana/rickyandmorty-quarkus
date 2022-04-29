package com.laio.service;

import com.laio.entity.Character;

import java.util.List;
import java.util.Optional;

public interface CharacterService {

    Optional<List<Character>> getAllCharacter();

    Optional<Character> getCharacterById(Long id);
}
