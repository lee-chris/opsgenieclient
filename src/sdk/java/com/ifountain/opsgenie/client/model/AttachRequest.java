package com.ifountain.opsgenie.client.model;

import java.io.File;

/**
 * Container for the parameters to make an attach api call.
 *
 * @author Sezgin Kucukkaraaslan
 * @version 5/31/12 3:38 PM
 * @see com.ifountain.opsgenie.client.IOpsGenieClient#attach(AttachRequest)
 */
public class AttachRequest extends BaseRequest {
    private String alertId;
    private String alias;
    private String indexFile;
    private File file;
    private String user;

    /**
     * Rest api uri of attach operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/alert/attach";
    }

    /**
     * The id of the alert that the file will be attached.
     */
    public String getAlertId() {
        return alertId;
    }

    /**
     * Sets the id of the alert that the file will be attached. Either this or alias should be set.
     */
    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    /**
     * The user defined identifier of the alert that the file will be attached.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the user defined identifier of the alert that the file will be attached. Either this or alertId should be set.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getIndexFile() {
        return indexFile;
    }

    public void setIndexFile(String indexFile) {
        this.indexFile = indexFile;
    }

    /**
     * The file that will be attached to the specified alert.
     */
    public File getFile() {
        return file;
    }

    /**
     * Sets the file that will be attached to the specified alert.
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * The user who is performing attach operation.
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the user who is performing attach operation.
     */
    public void setUser(String user) {
        this.user = user;
    }
}
