package com.econovation.recruitdomain.domain.board;


import com.econovation.recruitcommon.annotation.EnumClass;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EnumClass
public enum CardType {
    CARD("Card"),
    APPLICANT("Applicant");

    private final String value;
}
