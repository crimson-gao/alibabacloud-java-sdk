// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageModerationTaskRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxFrames")
    public Long maxFrames;

    /**
     * <p>消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Scenes")
    public java.util.List<String> scenes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <strong>example:</strong>
     * <p>{&quot;test&quot;: &quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateImageModerationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageModerationTaskRequest self = new CreateImageModerationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageModerationTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateImageModerationTaskRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public CreateImageModerationTaskRequest setMaxFrames(Long maxFrames) {
        this.maxFrames = maxFrames;
        return this;
    }
    public Long getMaxFrames() {
        return this.maxFrames;
    }

    public CreateImageModerationTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateImageModerationTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateImageModerationTaskRequest setScenes(java.util.List<String> scenes) {
        this.scenes = scenes;
        return this;
    }
    public java.util.List<String> getScenes() {
        return this.scenes;
    }

    public CreateImageModerationTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateImageModerationTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateImageModerationTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
