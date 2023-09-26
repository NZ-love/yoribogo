package com.app.yoribogo.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class MemberVO implements Serializable {
    private Long id;
    private String memberName;
    private String memberEmail;
    private String memberPassword;
    private String memberProfile;
}
