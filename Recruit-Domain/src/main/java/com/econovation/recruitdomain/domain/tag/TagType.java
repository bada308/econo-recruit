package com.econovation.recruitdomain.domain.tag;

import com.econovation.recruitcommon.annotation.EnumClass;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EnumClass
public enum TagType {
    // 태그
    APPLICANT("APPLICANT"),
    // 카테고리
    CARD("CARD");

    private final String value;
}
