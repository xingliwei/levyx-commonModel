package com.xlw.levyx.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by levyx on 2017/7/26.
 */
public class Article implements Serializable{
    private static final long serialVersionUID = -6696487430826099799L;
    private String id;
    private String authorId;
    private String authorName;
    private String content;
    private List<Comment> commentList;

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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
