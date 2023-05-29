package com.brownee.grabb.domain.members.repository;

import com.brownee.grabb.domain.members.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, BigInteger> {
    Optional<MemberEntity> findByEmail(String email);
}
