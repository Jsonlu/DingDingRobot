package cn.jsonlu.bean;

public class GitLab {
    private String user_avatar;
    private String user_email;
    private int total_commits_count;
    private String before;
    private String user_name;
    private String checkout_sha;
    private GitLabProject project;
    private Object message;
    private GitLabRepository repository;
    private String object_kind;
    private String ref;
    private int user_id;
    private int project_id;
    private String event_name;
    private GitLabCommits[] commits;
    private String after;

    public String getUser_avatar() {
        return this.user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getUser_email() {
        return this.user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getTotal_commits_count() {
        return this.total_commits_count;
    }

    public void setTotal_commits_count(int total_commits_count) {
        this.total_commits_count = total_commits_count;
    }

    public String getBefore() {
        return this.before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCheckout_sha() {
        return this.checkout_sha;
    }

    public void setCheckout_sha(String checkout_sha) {
        this.checkout_sha = checkout_sha;
    }

    public GitLabProject getProject() {
        return this.project;
    }

    public void setProject(GitLabProject project) {
        this.project = project;
    }

    public Object getMessage() {
        return this.message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public GitLabRepository getRepository() {
        return this.repository;
    }

    public void setRepository(GitLabRepository repository) {
        this.repository = repository;
    }

    public String getObject_kind() {
        return this.object_kind;
    }

    public void setObject_kind(String object_kind) {
        this.object_kind = object_kind;
    }

    public String getRef() {
        return this.ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProject_id() {
        return this.project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getEvent_name() {
        return this.event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public GitLabCommits[] getCommits() {
        return this.commits;
    }

    public void setCommits(GitLabCommits[] commits) {
        this.commits = commits;
    }

    public String getAfter() {
        return this.after;
    }

    public void setAfter(String after) {
        this.after = after;
    }
}
