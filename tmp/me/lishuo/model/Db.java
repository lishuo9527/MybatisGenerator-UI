package me.lishuo.model;

public class Db extends DbKey {
    private String select_priv;

    private String insert_priv;

    private String update_priv;

    private String delete_priv;

    private String create_priv;

    private String drop_priv;

    private String grant_priv;

    private String references_priv;

    private String index_priv;

    private String alter_priv;

    private String create_tmp_table_priv;

    private String lock_tables_priv;

    private String create_view_priv;

    private String show_view_priv;

    private String create_routine_priv;

    private String alter_routine_priv;

    private String execute_priv;

    private String event_priv;

    private String trigger_priv;

    public String getSelect_priv() {
        return select_priv;
    }

    public void setSelect_priv(String select_priv) {
        this.select_priv = select_priv == null ? null : select_priv.trim();
    }

    public String getInsert_priv() {
        return insert_priv;
    }

    public void setInsert_priv(String insert_priv) {
        this.insert_priv = insert_priv == null ? null : insert_priv.trim();
    }

    public String getUpdate_priv() {
        return update_priv;
    }

    public void setUpdate_priv(String update_priv) {
        this.update_priv = update_priv == null ? null : update_priv.trim();
    }

    public String getDelete_priv() {
        return delete_priv;
    }

    public void setDelete_priv(String delete_priv) {
        this.delete_priv = delete_priv == null ? null : delete_priv.trim();
    }

    public String getCreate_priv() {
        return create_priv;
    }

    public void setCreate_priv(String create_priv) {
        this.create_priv = create_priv == null ? null : create_priv.trim();
    }

    public String getDrop_priv() {
        return drop_priv;
    }

    public void setDrop_priv(String drop_priv) {
        this.drop_priv = drop_priv == null ? null : drop_priv.trim();
    }

    public String getGrant_priv() {
        return grant_priv;
    }

    public void setGrant_priv(String grant_priv) {
        this.grant_priv = grant_priv == null ? null : grant_priv.trim();
    }

    public String getReferences_priv() {
        return references_priv;
    }

    public void setReferences_priv(String references_priv) {
        this.references_priv = references_priv == null ? null : references_priv.trim();
    }

    public String getIndex_priv() {
        return index_priv;
    }

    public void setIndex_priv(String index_priv) {
        this.index_priv = index_priv == null ? null : index_priv.trim();
    }

    public String getAlter_priv() {
        return alter_priv;
    }

    public void setAlter_priv(String alter_priv) {
        this.alter_priv = alter_priv == null ? null : alter_priv.trim();
    }

    public String getCreate_tmp_table_priv() {
        return create_tmp_table_priv;
    }

    public void setCreate_tmp_table_priv(String create_tmp_table_priv) {
        this.create_tmp_table_priv = create_tmp_table_priv == null ? null : create_tmp_table_priv.trim();
    }

    public String getLock_tables_priv() {
        return lock_tables_priv;
    }

    public void setLock_tables_priv(String lock_tables_priv) {
        this.lock_tables_priv = lock_tables_priv == null ? null : lock_tables_priv.trim();
    }

    public String getCreate_view_priv() {
        return create_view_priv;
    }

    public void setCreate_view_priv(String create_view_priv) {
        this.create_view_priv = create_view_priv == null ? null : create_view_priv.trim();
    }

    public String getShow_view_priv() {
        return show_view_priv;
    }

    public void setShow_view_priv(String show_view_priv) {
        this.show_view_priv = show_view_priv == null ? null : show_view_priv.trim();
    }

    public String getCreate_routine_priv() {
        return create_routine_priv;
    }

    public void setCreate_routine_priv(String create_routine_priv) {
        this.create_routine_priv = create_routine_priv == null ? null : create_routine_priv.trim();
    }

    public String getAlter_routine_priv() {
        return alter_routine_priv;
    }

    public void setAlter_routine_priv(String alter_routine_priv) {
        this.alter_routine_priv = alter_routine_priv == null ? null : alter_routine_priv.trim();
    }

    public String getExecute_priv() {
        return execute_priv;
    }

    public void setExecute_priv(String execute_priv) {
        this.execute_priv = execute_priv == null ? null : execute_priv.trim();
    }

    public String getEvent_priv() {
        return event_priv;
    }

    public void setEvent_priv(String event_priv) {
        this.event_priv = event_priv == null ? null : event_priv.trim();
    }

    public String getTrigger_priv() {
        return trigger_priv;
    }

    public void setTrigger_priv(String trigger_priv) {
        this.trigger_priv = trigger_priv == null ? null : trigger_priv.trim();
    }
}