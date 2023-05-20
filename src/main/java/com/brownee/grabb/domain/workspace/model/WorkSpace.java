package com.brownee.grabb.domain.workspace.model;

import com.brownee.grabb.common.enums.CommonEnum;
import com.brownee.grabb.domain.workspace.model.entity.WorkSpaceEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

    @Enumerated(EnumType.STRING)
    CommonEnum.WorkSpaceType type;

    String url;

    String webSite;

    String description;

    String logoUrl;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    LocalDateTime trialStartedAt;

    String createdBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    LocalDateTime createdAt;

    String updatedBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
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

    public static WorkSpaceEntity toEntity(WorkSpace workSpace) {
        return WorkSpaceEntity.builder()
                .id(workSpace.getId())
                .name(workSpace.getName())
                .shortName(workSpace.getShortName())
                .type(workSpace.getType())
                .url(workSpace.getUrl())
                .logoUrl(workSpace.getLogoUrl())
                .webSite(workSpace.getWebSite())
                .description(workSpace.getDescription())
                .trialStartedAt(workSpace.getTrialStartedAt())
                .build();
    }
}
