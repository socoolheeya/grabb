package com.brownee.grabb.domain.workspace.model.http;

import com.brownee.grabb.domain.workspace.model.WorkSpace;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.UtilityClass;

@UtilityClass
public class WorkSpaceResponse {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Search {
        WorkSpace workSpace;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Save {
        WorkSpace workSpace;
    }
}
