package com.brownee.grabb.domain.boards.repository;

import com.brownee.grabb.domain.boards.model.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, BigInteger> {
}
