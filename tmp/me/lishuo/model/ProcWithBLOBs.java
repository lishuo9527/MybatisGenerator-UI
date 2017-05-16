package me.lishuo.model;

public class ProcWithBLOBs extends Proc {
    private byte[] param_list;

    private byte[] returns;

    private byte[] body;

    private String comment;

    private byte[] body_utf8;

    public byte[] getParam_list() {
        return param_list;
    }

    public void setParam_list(byte[] param_list) {
        this.param_list = param_list;
    }

    public byte[] getReturns() {
        return returns;
    }

    public void setReturns(byte[] returns) {
        this.returns = returns;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public byte[] getBody_utf8() {
        return body_utf8;
    }

    public void setBody_utf8(byte[] body_utf8) {
        this.body_utf8 = body_utf8;
    }
}