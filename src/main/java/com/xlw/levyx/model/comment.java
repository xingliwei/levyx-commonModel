package com.xlw.levyx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by levyx on 2017/7/26.
 */
public class Comment implements Serializable{
    private static final long serialVersionUID = 7258478531765702865L;
    private String id;
    private String authorId;
    private String content;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
