package org.sang.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created by sang on 2018/2/2.
 */
@Data
public class MsgContent {
    private Long id;
    private String message;
    private String title;
    private Date createDate;
}
