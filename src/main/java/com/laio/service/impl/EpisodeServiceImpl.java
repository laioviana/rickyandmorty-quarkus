package com.laio.service.impl;

import com.laio.entity.Episode;
import com.laio.repository.EpisodeRepository;
import com.laio.service.EpisodeService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class EpisodeServiceImpl implements EpisodeService {

    private final EpisodeRepository episodeRepository;

    @Inject
    public EpisodeServiceImpl(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }

    @Override
    public Optional<List<Episode>> getAllEpisodes() {
        return Optional.of(episodeRepository.listAll());
    }

    @Override
    public Optional<Episode> getEpisodeById(Long id) {
        return Optional.of(episodeRepository.findById(id));
    }
}
