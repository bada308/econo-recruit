package com.econovation.recruitdomain.out;


import com.econovation.recruitdomain.domains.label.Label;

public interface LabelRecordPort {
    Label save(Label label);

    Boolean delete(Label label);
}
