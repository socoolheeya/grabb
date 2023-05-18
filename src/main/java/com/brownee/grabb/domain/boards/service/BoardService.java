package com.brownee.grabb.domain.boards.service;

import com.brownee.grabb.domain.boards.model.entity.BoardEntity;
import com.brownee.grabb.domain.boards.model.http.BoardRequest;
import com.brownee.grabb.domain.boards.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardRequest.Save request) {
        BoardEntity entity = BoardEntity.builder()
                .id(request.getId())
                .title(request.getTitle())
                .status(request.getStatus())
                .visibility(request.getVisibility())
                .build();
        boardRepository.save(entity);
    }
}
