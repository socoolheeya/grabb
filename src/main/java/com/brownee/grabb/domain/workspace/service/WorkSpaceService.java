package com.brownee.grabb.domain.workspace.service;

import com.brownee.grabb.domain.workspace.model.WorkSpace;
import com.brownee.grabb.domain.workspace.model.entity.WorkSpaceEntity;
import com.brownee.grabb.domain.workspace.model.http.WorkSpaceRequest;
import com.brownee.grabb.domain.workspace.repository.WorkSpaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkSpaceService {
    private final WorkSpaceRepository workSpaceRepository;

    public WorkSpace update(WorkSpaceRequest.Save request) {
        WorkSpaceEntity entity = WorkSpaceEntity.builder()
                .id(request.getId())
                .name(request.getName())
                .shortName(request.getShortName())
                .description(request.getDescription())
                .webSite(request.getWebSite())
                .build();
        workSpaceRepository.save(entity);

        return WorkSpaceEntity.toDomain(entity);
    }
}
