package me.lishuo.entity;

/**
 * Created by lis on 17/5/15.
 */
public class RequestParam {

    String ip;

    String db;

    String port;

    String username;

    String password;

    String modelPackageName;

    String daoPackageName;

    String mapperPath;

    String tableName;

    String tableModel;

    public String getDaoPackageName() {
        return daoPackageName;
    }

    public void setDaoPackageName(String daoPackageName) {
        this.daoPackageName = daoPackageName;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMapperPath() {
        return mapperPath;
    }

    public void setMapperPath(String mapperPath) {
        this.mapperPath = mapperPath;
    }

    public String getModelPackageName() {
        return modelPackageName;
    }

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getTableModel() {
        return tableModel;
    }

    public void setTableModel(String tableModel) {
        this.tableModel = tableModel;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
