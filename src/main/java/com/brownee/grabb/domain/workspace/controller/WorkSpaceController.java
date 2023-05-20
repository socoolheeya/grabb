package com.brownee.grabb.domain.workspace.controller;

import com.brownee.grabb.domain.workspace.model.WorkSpace;
import com.brownee.grabb.domain.workspace.model.http.WorkSpaceRequest;
import com.brownee.grabb.domain.workspace.model.http.WorkSpaceResponse;
import com.brownee.grabb.domain.workspace.service.WorkSpaceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/workspace")
public class WorkSpaceController {
    private final WorkSpaceService workSpaceService;

    @GetMapping("/{work-space-id}")
    public ResponseEntity<WorkSpace> search(@PathVariable(name = "work-space-id") BigInteger workSpaceId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(workSpaceService.search(workSpaceId));
    }

    @PostMapping("")
    public ResponseEntity<WorkSpaceResponse.Save> save(@RequestBody @Valid WorkSpaceRequest.Save request) {
        WorkSpace workSpace = workSpaceService.save(request);

        return ResponseEntity.status(HttpStatus.OK)
                .body(WorkSpaceResponse.Save.builder()
                        .workSpace(workSpace)
                        .build());
    }

    @PutMapping("/{work-space-id}")
    public ResponseEntity<WorkSpaceResponse.Save> update(
            @PathVariable("work-space-id") BigInteger workSpaceId,
            @RequestBody @Valid WorkSpaceRequest.Save request) {
        request.setId(workSpaceId);
        WorkSpace workSpace = workSpaceService.modify(request);

        return ResponseEntity.status(HttpStatus.OK)
                .body(WorkSpaceResponse.Save.builder()
                        .workSpace(workSpace)
                        .build());
    }
}
