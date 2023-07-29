package com.econovation.recruitdomain.domain.comment;


import com.econovation.recruitdomain.domain.BaseTimeEntity;
import com.econovation.recruitdomain.domain.applicant.Applicant;
import com.econovation.recruitdomain.domain.board.CardType;
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
public class Comment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id")
    private Integer id;

    @Column(name = "card_type")
    private CardType cardType;

    @Column(name = "card_id")
    private Integer cardId;

    @Column(name = "idp_id")
    private Integer idpId;

    @Column(name = "content")
    private String content;

    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "like_count")
    private Integer likeCount;


    public void delete() {
        this.isDeleted = true;
    }


    @PrePersist
    public void prePersist() {
        this.likeCount = this.likeCount == null ? 0 : this.likeCount;
        this.isDeleted = false;
    }

    public void plusLikeCount() {
        this.likeCount++;
    }

    public void minusLikeCount() {
        this.likeCount++;
    }
}
