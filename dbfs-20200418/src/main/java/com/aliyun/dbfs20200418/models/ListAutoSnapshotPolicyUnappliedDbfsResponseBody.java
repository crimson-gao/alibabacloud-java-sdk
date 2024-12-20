// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListAutoSnapshotPolicyUnappliedDbfsResponseBody extends TeaModel {
    @NameInMap("DbfsList")
    public java.util.List<ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList> dbfsList;

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

    public static ListAutoSnapshotPolicyUnappliedDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoSnapshotPolicyUnappliedDbfsResponseBody self = new ListAutoSnapshotPolicyUnappliedDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponseBody setDbfsList(java.util.List<ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList> dbfsList) {
        this.dbfsList = dbfsList;
        return this;
    }
    public java.util.List<ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList> getDbfsList() {
        return this.dbfsList;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoSnapshotPolicyUnappliedDbfsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList extends TeaModel {
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

        public static ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList build(java.util.Map<String, ?> map) throws Exception {
            ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList self = new ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList();
            return TeaModel.build(map, self);
        }

        public ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList setFsId(String fsId) {
            this.fsId = fsId;
            return this;
        }
        public String getFsId() {
            return this.fsId;
        }

        public ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList setSizeG(Long sizeG) {
            this.sizeG = sizeG;
            return this;
        }
        public Long getSizeG() {
            return this.sizeG;
        }

        public ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList setSnapshotCount(Integer snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }
        public Integer getSnapshotCount() {
            return this.snapshotCount;
        }

        public ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAutoSnapshotPolicyUnappliedDbfsResponseBodyDbfsList setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
