package com.econovation.recruitdomain.domain.interviewer.exception;

import com.econovation.recruitcommon.exception.RecruitCodeException;

public class InterviewerNotFoundException extends RecruitCodeException{
    public static final RecruitCodeException EXCEPTION = new InterviewerNotFoundException();

    private InterviewerNotFoundException() {
        super(InterviewerErrorCode.INTERVIEWER_NOT_FOUND);
    }
}
