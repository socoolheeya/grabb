package com.brownee.grabb.domain.cards.model.entity;

import com.brownee.grabb.domain.members.model.entity.MemberEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "card")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CardEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    BigInteger id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "due_date")
    LocalDateTime dueDate;

    @OneToMany(mappedBy = "card")
    List<ActivityEntity> activities = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    List<LabelEntity> labels = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    List<MemberEntity> members = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    List<CheckListEntity> checkLists = new ArrayList<>();



}
