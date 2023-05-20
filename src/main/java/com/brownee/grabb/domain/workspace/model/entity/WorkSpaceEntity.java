package com.brownee.grabb.domain.workspace.model.entity;

import com.brownee.grabb.common.enums.CommonEnum;
import com.brownee.grabb.common.model.BaseTimeEntity;
import com.brownee.grabb.domain.workspace.model.WorkSpace;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "work_space")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkSpaceEntity extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_space_id", columnDefinition = "bigint(10)")
    BigInteger id;

    @Column(name = "name")
    String name;

    @Column(name = "short_name")
    String shortName;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    CommonEnum.WorkSpaceType type;

    @Column(name = "url")
    String url;

    @Column(name = "web_site")
    String webSite;

    @Column(name = "description")
    String description;

    @Column(name = "logo_url")
    String logoUrl;

    @Column(name = "trial_started_at")
    LocalDateTime trialStartedAt;

    @Column(name = "created_by", updatable = false)
    String createdBy;

    @Column(name = "updated_by")
    String updatedBy;

    @Builder
    public WorkSpaceEntity(BigInteger id, String name, String shortName, CommonEnum.WorkSpaceType type, String url, String webSite, String description, String logoUrl, LocalDateTime trialStartedAt, String createdBy, String updatedBy) {
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
        this.updatedBy = updatedBy;
    }

    public static WorkSpace toDomain(WorkSpaceEntity entity) {
        return WorkSpace.builder()
                .id(entity.getId())
                .name(entity.getName())
                .shortName(entity.getShortName())
                .url(entity.getUrl())
                .type(entity.getType())
                .logoUrl(entity.getLogoUrl())
                .webSite(entity.getWebSite())
                .description(entity.getDescription())
                .trialStartedAt(entity.getTrialStartedAt())
                .createdAt(entity.getCreatedAt())
                .createdBy(entity.getCreatedBy())
                .updatedAt(entity.getUpdatedAt())
                .updatedBy(entity.getUpdatedBy())
                .build();
    }
}
