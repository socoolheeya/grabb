package com.brownee.grabb.domain.workspace.repository;

import com.brownee.grabb.domain.workspace.model.entity.WorkSpaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface WorkSpaceRepository extends JpaRepository<WorkSpaceEntity, BigInteger> {
}
