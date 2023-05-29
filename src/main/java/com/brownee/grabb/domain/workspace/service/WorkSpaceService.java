package com.brownee.grabb.domain.workspace.service;

import com.brownee.grabb.common.exception.GrabbBadRequestException;
import com.brownee.grabb.domain.workspace.model.WorkSpace;
import com.brownee.grabb.domain.workspace.model.entity.WorkSpaceEntity;
import com.brownee.grabb.domain.workspace.model.http.WorkSpaceRequest;
import com.brownee.grabb.domain.workspace.repository.WorkSpaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class WorkSpaceService {

    private final WorkSpaceRepository workSpaceRepository;

    public WorkSpace search(BigInteger workSpaceId) {
        WorkSpaceEntity entity = workSpaceRepository.findById(workSpaceId)
                .orElseThrow(() -> new GrabbBadRequestException("Not Found WorkSpace [workSpaceId : " + workSpaceId + "]"));
        return WorkSpaceEntity.toDomain(entity);
    }

    public WorkSpace save(WorkSpaceRequest.Save request) {
        WorkSpaceEntity entity = WorkSpaceEntity.builder()
                .name(request.getName())
                .shortName(request.getShortName())
                .url(request.getUrl())
                .logoUrl(request.getLogoUrl())
                .trialStartedAt(request.getTrialStartedAt())
                .description(request.getDescription())
                .webSite(request.getWebSite())
                .build();
        workSpaceRepository.save(entity);

        return WorkSpaceEntity.toDomain(entity);
    }

    public WorkSpace modify(WorkSpaceRequest.Save request) {

        workSpaceRepository.findById(request.getId())
                .orElseThrow(() -> new GrabbBadRequestException("Not Found WorkSpace"));

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
