package com.econovation.recruitdomain.domain.interviewer;


import com.econovation.recruitcommon.annotation.EnumClass;
import com.econovation.recruitdomain.domain.interviewer.exception.InterviewerNotFoundException;
import lombok.Getter;

@Getter
@EnumClass
public enum InterviewerRole {
    ROLE_PRESIDENT("PRESIDENT"),
    ROLE_OPERATION("OPERATION"),
    ROLE_TF("TF");
    private final String role;

    InterviewerRole(String role) {
        this.role = role;
    }

    public String value() {
        return role;
    }
    // 1번
    public static InterviewerRole getByName(String name) {
        for (InterviewerRole os : InterviewerRole.values()) {
            if (os.getRole().equals(name)) {
                return os;
            }
        }
        throw InterviewerNotFoundException.EXCEPTION;
    }
}
