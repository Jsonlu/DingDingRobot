package cn.jsonlu.bean;

public class GitLabProject {
    private String path_with_namespace;
    private String ssh_url;
    private String description;
    private String git_http_url;
    private String git_ssh_url;
    private String url;
    private String http_url;
    private String web_url;
    private Object avatar_url;
    private String name;
    private String namespace;
    private int visibility_level;
    private String default_branch;
    private String homepage;

    public String getPath_with_namespace() {
        return this.path_with_namespace;
    }

    public void setPath_with_namespace(String path_with_namespace) {
        this.path_with_namespace = path_with_namespace;
    }

    public String getSsh_url() {
        return this.ssh_url;
    }

    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGit_http_url() {
        return this.git_http_url;
    }

    public void setGit_http_url(String git_http_url) {
        this.git_http_url = git_http_url;
    }

    public String getGit_ssh_url() {
        return this.git_ssh_url;
    }

    public void setGit_ssh_url(String git_ssh_url) {
        this.git_ssh_url = git_ssh_url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHttp_url() {
        return this.http_url;
    }

    public void setHttp_url(String http_url) {
        this.http_url = http_url;
    }

    public String getWeb_url() {
        return this.web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public Object getAvatar_url() {
        return this.avatar_url;
    }

    public void setAvatar_url(Object avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public int getVisibility_level() {
        return this.visibility_level;
    }

    public void setVisibility_level(int visibility_level) {
        this.visibility_level = visibility_level;
    }

    public String getDefault_branch() {
        return this.default_branch;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public String getHomepage() {
        return this.homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
}
