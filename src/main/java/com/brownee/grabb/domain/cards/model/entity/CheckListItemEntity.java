package com.brownee.grabb.domain.cards.model.entity;

import com.brownee.grabb.common.enums.CommonEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "check_list_item")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheckListItemEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "check_list_item_id")
    BigInteger id;

    @Column(name = "name")
    String name;

    @Column(name = "dueDate")
    LocalDateTime dueDate;

    @Column(name = "status")
    CommonEnum.CheckListItemStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "check_list_id")
    CheckListEntity checkList;

}
