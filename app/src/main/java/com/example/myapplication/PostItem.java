package com.example.myapplication;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class PostItem {
    private String title;
    private String content;
    private Uri imageUri;
    private Long postId;

    private boolean isLiked = false;
    private int likeCount = 0;

    // 🔹 댓글 리스트
    private List<CommentItem> commentList = new ArrayList<>();

    // 생성자
    public PostItem(Long postId, String title, String content, Uri imageUri) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.imageUri = imageUri;
    }

    public PostItem(String title, String content, Uri imageUri) {
        this.title = title;
        this.content = content;
        this.imageUri = imageUri;
    }


    // ✅ Getter
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public List<CommentItem> getCommentList() {
        return commentList;
    }

    // ✅ Setter
    public void setTitle(String title) {
        this.title = title;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public void setLiked(boolean liked) {
        this.isLiked = liked;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public void setCommentList(List<CommentItem> commentList) {
        this.commentList = commentList;
    }

    public Long getPostId() { return postId; }
    public void setPostId(Long postId) { this.postId = postId; }
    // ✅ 좋아요 수 증가/감소 메서드
    public void incrementLike() {
        this.likeCount++;
    }

    public void decrementLike() {
        if (likeCount > 0) this.likeCount--;
    }

    // ✅ 댓글 추가 메서드
    public void addComment(CommentItem comment) {
        this.commentList.add(comment);
    }
}
