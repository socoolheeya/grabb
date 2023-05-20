package com.brownee.grabb.domain.boards.model.entity;

import com.brownee.grabb.common.enums.CommonEnum;
import com.brownee.grabb.common.model.BaseTimeEntity;
import com.brownee.grabb.domain.boards.model.Board;
import com.brownee.grabb.domain.cards.model.entity.CardListEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BoardEntity extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id", columnDefinition = "bigint(10)")
    BigInteger id;

    @Column(name = "title")
    String title;

    @Column(name = "visibility")
    @Enumerated(EnumType.STRING)
    CommonEnum.BoardVisibility visibility;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    CommonEnum.BoardStatus status;

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    String createdBy;

    @LastModifiedBy
    @Column(name = "updated_by")
    String updatedBy;

    @OneToMany(mappedBy = "board")
    List<CardListEntity> cardLists = new ArrayList<>();

    @Builder
    public BoardEntity(BigInteger id, String title, CommonEnum.BoardVisibility visibility, CommonEnum.BoardStatus status, String createdBy, String updatedBy, List<CardListEntity> cardLists) {
        this.id = id;
        this.title = title;
        this.visibility = visibility;
        this.status = status;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.cardLists = cardLists;
    }


    public static Board toDomain(BoardEntity entity) {
        return Board.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .status(entity.getStatus())
                .visibility(entity.getVisibility())
                .createdBy(entity.getCreatedBy())
                .createdAt(entity.getCreatedAt())
                .updatedBy(entity.getUpdatedBy())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }

}
