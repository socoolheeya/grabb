package com.brownee.grabb.domain.cards.repository;

import com.brownee.grabb.domain.cards.model.entity.CheckListItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface CheckListItemRepository extends JpaRepository<CheckListItemEntity, BigInteger> {
}
