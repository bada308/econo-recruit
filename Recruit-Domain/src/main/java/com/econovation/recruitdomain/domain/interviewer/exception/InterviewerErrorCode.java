package com.econovation.recruitdomain.domain.interviewer.exception;


import com.econovation.recruitcommon.annotation.ExplainError;
import com.econovation.recruitcommon.exception.BaseErrorCode;
import com.econovation.recruitcommon.exception.ErrorReason;
import java.lang.reflect.Field;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.econovation.recruitcommon.consts.RecruitStatic.BAD_REQUEST;
import static com.econovation.recruitcommon.consts.RecruitStatic.NOT_FOUND;

@Getter
@AllArgsConstructor
public enum InterviewerErrorCode implements BaseErrorCode {
    INTERVIEWER_NOT_FOUND(NOT_FOUND,"INTERVIEWER_404_1","해당하는 면접관을 찾을 수 없습니다."),
    INTERVIEWER_ALREADY_EXIST(BAD_REQUEST,"INTERVIEWER_400_1","이미 존재하는 면접관입니다.");

    private Integer status;
    private String code;
    private String reason;

    @Override
    public ErrorReason getErrorReason() {
        return ErrorReason.builder().reason(reason).code(code).status(status).build();
    }

    @Override
    public String getExplainError() throws NoSuchFieldException {
        Field field = this.getClass().getField(this.name());
        ExplainError annotation = field.getAnnotation(ExplainError.class);
        return Objects.nonNull(annotation) ? annotation.value() : this.getReason();
    }
}
