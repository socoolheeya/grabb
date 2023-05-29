package com.brownee.grabb.common.components;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class GrabbUserAuditorAware implements AuditorAware<BigInteger> {

    @Override
    public Optional<BigInteger> getCurrentAuditor() {

        return Optional.empty();
    }
}
