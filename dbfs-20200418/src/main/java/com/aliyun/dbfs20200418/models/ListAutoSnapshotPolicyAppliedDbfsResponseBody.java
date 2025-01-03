// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListAutoSnapshotPolicyAppliedDbfsResponseBody extends TeaModel {
    @NameInMap("DbfsList")
    public java.util.List<ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList> dbfsList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAutoSnapshotPolicyAppliedDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoSnapshotPolicyAppliedDbfsResponseBody self = new ListAutoSnapshotPolicyAppliedDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponseBody setDbfsList(java.util.List<ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList> dbfsList) {
        this.dbfsList = dbfsList;
        return this;
    }
    public java.util.List<ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList> getDbfsList() {
        return this.dbfsList;
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoSnapshotPolicyAppliedDbfsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dbfs-ejdvesb0qvuywvg*******</p>
         */
        @NameInMap("FsId")
        public String fsId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FsName")
        public String fsName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SizeG")
        public Long sizeG;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SnapshotCount")
        public Integer snapshotCount;

        /**
         * <strong>example:</strong>
         * <p>attached</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>50331648</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList build(java.util.Map<String, ?> map) throws Exception {
            ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList self = new ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList();
            return TeaModel.build(map, self);
        }

        public ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList setFsId(String fsId) {
            this.fsId = fsId;
            return this;
        }
        public String getFsId() {
            return this.fsId;
        }

        public ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList setSizeG(Long sizeG) {
            this.sizeG = sizeG;
            return this;
        }
        public Long getSizeG() {
            return this.sizeG;
        }

        public ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList setSnapshotCount(Integer snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }
        public Integer getSnapshotCount() {
            return this.snapshotCount;
        }

        public ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAutoSnapshotPolicyAppliedDbfsResponseBodyDbfsList setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
