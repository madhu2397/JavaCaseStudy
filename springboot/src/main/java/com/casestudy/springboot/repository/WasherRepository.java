package com.casestudy.springboot.repository;

import com.casestudy.springboot.entity.Washer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasherRepository extends JpaRepository<Washer,Long> {
    public Washer findByWasherName(String washerName);

    public Washer findByWasherNameIgnoreCase(String washerName);
}
