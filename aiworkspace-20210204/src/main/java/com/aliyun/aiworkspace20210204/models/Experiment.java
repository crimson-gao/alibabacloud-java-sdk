// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Experiment extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("ArtifactUri")
    public String artifactUri;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Labels")
    public java.util.List<ExperimentLabel> labels;

    @NameInMap("LatestRun")
    public Run latestRun;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TensorboardLogUri")
    public String tensorboardLogUri;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Experiment build(java.util.Map<String, ?> map) throws Exception {
        Experiment self = new Experiment();
        return TeaModel.build(map, self);
    }

    public Experiment setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Experiment setArtifactUri(String artifactUri) {
        this.artifactUri = artifactUri;
        return this;
    }
    public String getArtifactUri() {
        return this.artifactUri;
    }

    public Experiment setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public Experiment setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Experiment setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Experiment setLabels(java.util.List<ExperimentLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ExperimentLabel> getLabels() {
        return this.labels;
    }

    public Experiment setLatestRun(Run latestRun) {
        this.latestRun = latestRun;
        return this;
    }
    public Run getLatestRun() {
        return this.latestRun;
    }

    public Experiment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Experiment setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Experiment setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Experiment setTensorboardLogUri(String tensorboardLogUri) {
        this.tensorboardLogUri = tensorboardLogUri;
        return this;
    }
    public String getTensorboardLogUri() {
        return this.tensorboardLogUri;
    }

    public Experiment setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Experiment setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
