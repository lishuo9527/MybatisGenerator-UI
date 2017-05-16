package me.lishuo.model;

public class Func {
    private String name;

    private Boolean ret;

    private String dl;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getRet() {
        return ret;
    }

    public void setRet(Boolean ret) {
        this.ret = ret;
    }

    public String getDl() {
        return dl;
    }

    public void setDl(String dl) {
        this.dl = dl == null ? null : dl.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}