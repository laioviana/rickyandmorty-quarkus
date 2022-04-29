package com.laio.repository;

import com.laio.entity.Episode;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EpisodeRepository  implements PanacheRepository<Episode> {
}
