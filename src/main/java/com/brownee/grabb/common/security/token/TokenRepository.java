package com.brownee.grabb.common.security.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, BigInteger> {
    @Query(value = """
      select t from TokenEntity t inner join MemberEntity u\s
      on t.member.memberId = u.memberId\s
      where u.memberId = :memberId and (t.expired = false or t.revoked = false)\s
      """)
    List<TokenEntity> findAllValidTokenByMember(BigInteger memberId);

    Optional<TokenEntity> findByToken(String token);
}
