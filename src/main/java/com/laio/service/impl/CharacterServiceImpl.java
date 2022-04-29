package com.laio.service.impl;

import com.laio.entity.Character;
import com.laio.repository.CharacterRepository;
import com.laio.service.CharacterService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    @Inject
    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public Optional<List<Character>> getAllCharacter() {
        return Optional.of(characterRepository.listAll());
    }

    @Override
    public Optional<Character> getCharacterById(Long id) {
        return Optional.of(characterRepository.findById(id));
    }
}
