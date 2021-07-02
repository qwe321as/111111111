package com.test.studying.common.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class SearchVO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String keytype;
    
    private String keyword;
    private int offSetNum;
    private int pageSize;
    

}
