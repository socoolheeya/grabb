package com.brownee.grabb.domain.cards.repository;

import com.brownee.grabb.domain.cards.model.entity.ActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityEntity, BigInteger> {
}
