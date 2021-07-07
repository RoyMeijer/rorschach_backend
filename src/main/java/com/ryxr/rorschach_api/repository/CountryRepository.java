package com.ryxr.rorschach_api.repository;

import com.ryxr.rorschach_api.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
