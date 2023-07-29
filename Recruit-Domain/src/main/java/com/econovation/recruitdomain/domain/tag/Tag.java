package com.econovation.recruitdomain.domain.tag;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tag_type")
    @Enumerated(EnumType.STRING)
    private TagType tagType;

    @Column(name = "card_id")
    private Integer cardId;

    @Column(name = "idp_id")
    private Integer idpId;
}
