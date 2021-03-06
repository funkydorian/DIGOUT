package com.digout.model.entity.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATION_VERSIONS")
public class ApplicationVersionEntity extends AutoGeneratedIdentifier {
    private static final long serialVersionUID = -5764421937006494007L;

    @Column(name = "client_platform_type", nullable = false)
    private String clientPlatformType;
    @Column(name = "client_platform_version", nullable = false)
    private String clientPlatformVersion;
    @Column(name = "server_platform_version", nullable = false)
    private String serverPlatformVersion;
    @Column(name = "downloadUrl", nullable = false)
    private String downloadUrl;

    public String getClientPlatformType() {
        return this.clientPlatformType;
    }

    public String getClientPlatformVersion() {
        return this.clientPlatformVersion;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getServerPlatformVersion() {
        return this.serverPlatformVersion;
    }

    public void setClientPlatformType(final String clientPlatformType) {
        this.clientPlatformType = clientPlatformType;
    }

    public void setClientPlatformVersion(final String clientPlatformVersion) {
        this.clientPlatformVersion = clientPlatformVersion;
    }

    public void setDownloadUrl(final String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setServerPlatformVersion(final String serverPlatformVersion) {
        this.serverPlatformVersion = serverPlatformVersion;
    }

}
