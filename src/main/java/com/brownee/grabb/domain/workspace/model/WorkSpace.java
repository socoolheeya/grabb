package com.brownee.grabb.domain.workspace.model;

import com.brownee.grabb.common.enums.CommonEnum;
import jakarta.persistence.Column;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkSpace {
    BigInteger id;

    String name;

    String shortName;

    CommonEnum.WorkSpaceType type;

    String url;

    String webSite;

    String description;

    String logoUrl;

    LocalDateTime trialStartedAt;

    String createdBy;

    LocalDateTime createdAt;

    String updatedBy;

    LocalDateTime updatedAt;

    @Builder
    public WorkSpace(BigInteger id, String name, String shortName, CommonEnum.WorkSpaceType type, String url, String webSite, String description, String logoUrl, LocalDateTime trialStartedAt, String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.type = type;
        this.url = url;
        this.webSite = webSite;
        this.description = description;
        this.logoUrl = logoUrl;
        this.trialStartedAt = trialStartedAt;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }
}
