package com.econovation.recruitdomain.domain.comment;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentLike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_like_id")
    private Integer id;

    @Column(name = " comment_id")
    private Integer commentId;

    @Column(name = "idp_id")
    private Integer idpId;
}
