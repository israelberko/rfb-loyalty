package com.israelb.repository;

import com.israelb.domain.RfbLocation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the RfbLocation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RfbLocationRepository extends JpaRepository<RfbLocation, Long> {
    List<RfbLocation> findAllByRunDayOfWeek(Integer dayOfWeek);

    RfbLocation findByLocationName(String name);
}
