package com.laio.service;

import com.laio.entity.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {

    Optional<List<Location>> getAllLocations();

    Optional<Location> getLocationById(Long id);
}
