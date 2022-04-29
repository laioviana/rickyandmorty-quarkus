package com.laio.service;

import com.laio.entity.Episode;

import java.util.List;
import java.util.Optional;

public interface EpisodeService {

    Optional<List<Episode>> getAllEpisodes();

    Optional<Episode> getEpisodeById(Long id);
}
