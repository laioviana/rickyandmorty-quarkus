package com.laio.service.impl;

import com.laio.entity.Location;
import com.laio.repository.LocationRepository;
import com.laio.service.LocationService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    @Inject
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Optional<List<Location>> getAllLocations() {
        return Optional.of(locationRepository.listAll());
    }

    @Override
    public Optional<Location> getLocationById(Long id) {
        return Optional.of(locationRepository.findById(id));
    }
}
