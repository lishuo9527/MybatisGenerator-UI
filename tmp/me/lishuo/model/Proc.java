package me.lishuo.model;

import java.util.Date;

public class Proc extends ProcKey {
    private String specific_name;

    private String language;

    private String sql_data_access;

    private String is_deterministic;

    private String security_type;

    private String definer;

    private Date created;

    private Date modified;

    private String sql_mode;

    private String character_set_client;

    private String collation_connection;

    private String db_collation;

    public String getSpecific_name() {
        return specific_name;
    }

    public void setSpecific_name(String specific_name) {
        this.specific_name = specific_name == null ? null : specific_name.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getSql_data_access() {
        return sql_data_access;
    }

    public void setSql_data_access(String sql_data_access) {
        this.sql_data_access = sql_data_access == null ? null : sql_data_access.trim();
    }

    public String getIs_deterministic() {
        return is_deterministic;
    }

    public void setIs_deterministic(String is_deterministic) {
        this.is_deterministic = is_deterministic == null ? null : is_deterministic.trim();
    }

    public String getSecurity_type() {
        return security_type;
    }

    public void setSecurity_type(String security_type) {
        this.security_type = security_type == null ? null : security_type.trim();
    }

    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer == null ? null : definer.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getSql_mode() {
        return sql_mode;
    }

    public void setSql_mode(String sql_mode) {
        this.sql_mode = sql_mode == null ? null : sql_mode.trim();
    }

    public String getCharacter_set_client() {
        return character_set_client;
    }

    public void setCharacter_set_client(String character_set_client) {
        this.character_set_client = character_set_client == null ? null : character_set_client.trim();
    }

    public String getCollation_connection() {
        return collation_connection;
    }

    public void setCollation_connection(String collation_connection) {
        this.collation_connection = collation_connection == null ? null : collation_connection.trim();
    }

    public String getDb_collation() {
        return db_collation;
    }

    public void setDb_collation(String db_collation) {
        this.db_collation = db_collation == null ? null : db_collation.trim();
    }
}