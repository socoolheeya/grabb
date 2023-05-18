package com.brownee.grabb.domain.cards.repository;

import com.brownee.grabb.domain.cards.model.entity.LabelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface LabelRepository extends JpaRepository<LabelEntity, BigInteger> {
}
