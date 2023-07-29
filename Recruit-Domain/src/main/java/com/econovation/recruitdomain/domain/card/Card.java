package com.econovation.recruitdomain.domain.card;


import com.econovation.recruitdomain.domain.BaseTimeEntity;
import com.econovation.recruitdomain.domain.applicant.Applicant;
import com.econovation.recruitdomain.domain.board.Board;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Card extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "label_count")
    private Integer labelCount;

    @Column(name = "comment_count")
    private Integer commentCount;
}
