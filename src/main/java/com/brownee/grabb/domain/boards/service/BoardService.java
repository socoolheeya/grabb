package com.brownee.grabb.domain.boards.service;

import com.brownee.grabb.common.exception.GrabbBadRequestException;
import com.brownee.grabb.domain.boards.model.Board;
import com.brownee.grabb.domain.boards.model.entity.BoardEntity;
import com.brownee.grabb.domain.boards.model.http.BoardRequest;
import com.brownee.grabb.domain.boards.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardRepository boardRepository;

    public Board search(BigInteger id) {
        BoardEntity entity = boardRepository.findById(id)
                .orElseThrow(() -> new GrabbBadRequestException("Not found Board[Board ID : " + id + "]"));

        return BoardEntity.toDomain(entity);
    }

    @Transactional
    public Board save(BoardRequest.Save request) {
        BoardEntity entity = BoardEntity.builder()
                .title(request.getTitle())
                .status(request.getStatus())
                .visibility(request.getVisibility())
                .build();
        boardRepository.save(entity);

        return BoardEntity.toDomain(entity);
    }

    @Transactional
    public Board modify(BoardRequest.Save request) {
        BoardEntity entity = BoardEntity.builder()
                .id(request.getId())
                .title(request.getTitle())
                .status(request.getStatus())
                .visibility(request.getVisibility())
                .build();
        boardRepository.save(entity);

        return BoardEntity.toDomain(entity);
    }

    @Transactional
    public void remove(BigInteger boardId) {
        boardRepository.deleteById(boardId);
    }
}
