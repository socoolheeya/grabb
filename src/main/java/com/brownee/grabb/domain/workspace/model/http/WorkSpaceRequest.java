package com.brownee.grabb.domain.workspace.model.http;

import com.brownee.grabb.common.enums.CommonEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

import java.math.BigInteger;
import java.time.LocalDateTime;

@UtilityClass
public class WorkSpaceRequest {

    @Getter
    @Setter
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Save {
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
    }
}
