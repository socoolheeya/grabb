package com.brownee.grabb.domain.boards.controller;

import com.brownee.grabb.domain.boards.model.http.BoardRequest;
import com.brownee.grabb.domain.boards.model.http.BoardResponse;
import com.brownee.grabb.domain.boards.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/{board-id}")
    public ResponseEntity<BoardResponse.Search> search(@PathVariable("board-id") BigInteger boardId) {
        return ResponseEntity
                .ok(BoardResponse.Search.builder()
                        .board(boardService.search(boardId))
                        .build());
    }

    @PostMapping("")
    public ResponseEntity<BoardResponse.Save> save(@RequestBody BoardRequest.Save request) {
        return ResponseEntity
                .ok(BoardResponse.Save
                        .builder()
                        .board(boardService.save(request))
                        .build());
    }

    @PutMapping("/{board-id}")
    public ResponseEntity<BoardResponse.Save> modify(
            @PathVariable("board-id") BigInteger boardId,
            @RequestBody BoardRequest.Save request) {
        request.setId(boardId);
        return ResponseEntity
                .ok(BoardResponse.Save
                        .builder()
                        .board(boardService.modify(request))
                        .build());
    }

    @DeleteMapping("/{board-id}")
    public ResponseEntity<Void> remove(@PathVariable("board-id") BigInteger boardId) {
        boardService.remove(boardId);
        return ResponseEntity.ok().build();
    }


}
