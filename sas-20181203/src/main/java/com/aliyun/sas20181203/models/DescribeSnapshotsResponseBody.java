// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeSnapshotsResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snapshots")
    public java.util.List<DescribeSnapshotsResponseBodySnapshots> snapshots;

    public static DescribeSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponseBody self = new DescribeSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsResponseBody setPageInfo(DescribeSnapshotsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeSnapshotsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotsResponseBody setSnapshots(java.util.List<DescribeSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<DescribeSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public static class DescribeSnapshotsResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSnapshotsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodyPageInfo self = new DescribeSnapshotsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSnapshotsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeSnapshotsResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeSnapshotsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSnapshotsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSnapshotsResponseBodySnapshots extends TeaModel {
        @NameInMap("ActualBytes")
        public Long actualBytes;

        @NameInMap("ActualItems")
        public Long actualItems;

        @NameInMap("BytesDone")
        public Long bytesDone;

        @NameInMap("BytesTotal")
        public Long bytesTotal;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ContainerSnapshotId")
        public String containerSnapshotId;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("ErrorFile")
        public String errorFile;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("ExitCode")
        public String exitCode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ItemsDone")
        public Long itemsDone;

        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ParentHash")
        public String parentHash;

        @NameInMap("ParentSnapshotHash")
        public String parentSnapshotHash;

        @NameInMap("Path")
        public String path;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Retention")
        public Long retention;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SnapshotHash")
        public String snapshotHash;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SnapshotName")
        public String snapshotName;

        @NameInMap("SnapshotOption")
        public String snapshotOption;

        @NameInMap("SnapshotType")
        public String snapshotType;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshots self = new DescribeSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshots setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public DescribeSnapshotsResponseBodySnapshots setActualItems(Long actualItems) {
            this.actualItems = actualItems;
            return this;
        }
        public Long getActualItems() {
            return this.actualItems;
        }

        public DescribeSnapshotsResponseBodySnapshots setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public DescribeSnapshotsResponseBodySnapshots setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public DescribeSnapshotsResponseBodySnapshots setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeSnapshotsResponseBodySnapshots setContainerSnapshotId(String containerSnapshotId) {
            this.containerSnapshotId = containerSnapshotId;
            return this;
        }
        public String getContainerSnapshotId() {
            return this.containerSnapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshots setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeSnapshotsResponseBodySnapshots setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DescribeSnapshotsResponseBodySnapshots setErrorFile(String errorFile) {
            this.errorFile = errorFile;
            return this;
        }
        public String getErrorFile() {
            return this.errorFile;
        }

        public DescribeSnapshotsResponseBodySnapshots setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSnapshotsResponseBodySnapshots setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public DescribeSnapshotsResponseBodySnapshots setExitCode(String exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public String getExitCode() {
            return this.exitCode;
        }

        public DescribeSnapshotsResponseBodySnapshots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSnapshotsResponseBodySnapshots setItemsDone(Long itemsDone) {
            this.itemsDone = itemsDone;
            return this;
        }
        public Long getItemsDone() {
            return this.itemsDone;
        }

        public DescribeSnapshotsResponseBodySnapshots setItemsTotal(Long itemsTotal) {
            this.itemsTotal = itemsTotal;
            return this;
        }
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        public DescribeSnapshotsResponseBodySnapshots setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSnapshotsResponseBodySnapshots setParentHash(String parentHash) {
            this.parentHash = parentHash;
            return this;
        }
        public String getParentHash() {
            return this.parentHash;
        }

        public DescribeSnapshotsResponseBodySnapshots setParentSnapshotHash(String parentSnapshotHash) {
            this.parentSnapshotHash = parentSnapshotHash;
            return this;
        }
        public String getParentSnapshotHash() {
            return this.parentSnapshotHash;
        }

        public DescribeSnapshotsResponseBodySnapshots setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSnapshotsResponseBodySnapshots setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public DescribeSnapshotsResponseBodySnapshots setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeSnapshotsResponseBodySnapshots setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSnapshotsResponseBodySnapshots setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeSnapshotsResponseBodySnapshots setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotHash(String snapshotHash) {
            this.snapshotHash = snapshotHash;
            return this;
        }
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotOption(String snapshotOption) {
            this.snapshotOption = snapshotOption;
            return this;
        }
        public String getSnapshotOption() {
            return this.snapshotOption;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public DescribeSnapshotsResponseBodySnapshots setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotsResponseBodySnapshots setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeSnapshotsResponseBodySnapshots setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

}
