package cn.jsonlu.bean;

import java.util.List;

public class GitLabCommits {
    private GitLabCommitsAuthor author;
    private String[] modified;
    private String id;
    private String message;
    private String url;
    private String timestamp;
    private String[] added;
    private String[] removed;

    public String[] getAdded() {
        return added;
    }

    public void setAdded(String[] added) {
        this.added = added;
    }

    public String[] getRemoved() {
        return removed;
    }

    public void setRemoved(String[] removed) {
        this.removed = removed;
    }

    public GitLabCommitsAuthor getAuthor() {
        return this.author;
    }

    public void setAuthor(GitLabCommitsAuthor author) {
        this.author = author;
    }

    public String[] getModified() {
        return this.modified;
    }

    public void setModified(String[] modified) {
        this.modified = modified;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
