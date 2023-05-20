package com.brownee.grabb.domain.workspace.model.http;

import com.brownee.grabb.common.enums.CommonEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;
import org.springframework.validation.annotation.Validated;

import java.math.BigInteger;
import java.time.LocalDateTime;

@UtilityClass
public class WorkSpaceRequest {

    @Getter
    @Setter
    @Validated
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Save {
        BigInteger id;

        @NotEmpty
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
    }
}
