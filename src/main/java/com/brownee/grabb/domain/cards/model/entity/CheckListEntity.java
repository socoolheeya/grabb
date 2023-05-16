package com.brownee.grabb.domain.cards.model.entity;

import com.brownee.grabb.domain.cards.model.CheckListItem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "check_list")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheckListEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "check_list_id")
    BigInteger id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    CardEntity cardEntity;

    @OneToMany(mappedBy = "checkList")
    List<CheckListItemEntity> checkListItems = new ArrayList<>();
}
