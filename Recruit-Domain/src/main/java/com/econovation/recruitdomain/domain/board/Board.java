package com.econovation.recruitdomain.domain.board;


import com.econovation.recruitdomain.domain.BaseTimeEntity;
import javax.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@SuperBuilder
public class Board extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "board_id")
    private Integer id;

    @Column(name = "navigation_id")
    private Integer navigationId;

    @Column(name = "prev_col_loc")
    private Integer prevLocIndex;

    @Column(name = "next_col_loc")
    private Integer nextLocIndex;

    @Column(name = "prev_col_loc")
    private Integer prevColIndex;

    @Column(name = "next_col_loc")
    private Integer nextColIndex;

    @Column(name = "col_title")
    private String colTitle;

    @Column(name = "card_type")
    @Enumerated(EnumType.STRING)
    private CardType cardType;

    @Column(name = "card_id")
    private Integer cardId;


    public void update(Integer colLoc, Integer lowLoc) {
    }

}
