package com.brownee.grabb.domain.workspace.controller;

import com.brownee.grabb.domain.workspace.model.WorkSpace;
import com.brownee.grabb.domain.workspace.model.http.WorkSpaceRequest;
import com.brownee.grabb.domain.workspace.model.http.WorkSpaceResponse;
import com.brownee.grabb.domain.workspace.service.WorkSpaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping("/workspace")
public class WorkSpaceController {
    private final WorkSpaceService workSpaceService;

    @PutMapping("/{workSpaceId}")
    public ResponseEntity<WorkSpaceResponse.Save> update(@PathVariable BigInteger workSpaceId, @RequestBody WorkSpaceRequest.Save request) {
        request.setId(workSpaceId);
        WorkSpace workSpace = workSpaceService.update(request);

        return ResponseEntity.status(HttpStatus.OK)
                .body(WorkSpaceResponse.Save.builder()
                        .workSpace(workSpace)
                        .build());
    }
}
