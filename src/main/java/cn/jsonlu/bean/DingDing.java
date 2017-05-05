package cn.jsonlu.bean;

public class DingDing {
    private DingDingAt at;
    private DingDingText text;
    public String msgtype = "text";

    public DingDingAt getAt() {
        return this.at;
    }

    public void setAt(DingDingAt at) {
        this.at = at;
    }

    public DingDingText getText() {
        return this.text;
    }

    public void setText(DingDingText text) {
        this.text = text;
    }

}
