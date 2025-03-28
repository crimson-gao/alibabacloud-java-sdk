// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QuerySkillGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<QuerySkillGroupsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("OnePageSize")
    public Integer onePageSize;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    /**
     * <strong>example:</strong>
     * <p>76</p>
     */
    @NameInMap("TotalResults")
    public Integer totalResults;

    public static QuerySkillGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySkillGroupsResponseBody self = new QuerySkillGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySkillGroupsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QuerySkillGroupsResponseBody setData(java.util.List<QuerySkillGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySkillGroupsResponseBodyData> getData() {
        return this.data;
    }

    public QuerySkillGroupsResponseBody setOnePageSize(Integer onePageSize) {
        this.onePageSize = onePageSize;
        return this;
    }
    public Integer getOnePageSize() {
        return this.onePageSize;
    }

    public QuerySkillGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySkillGroupsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public QuerySkillGroupsResponseBody setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }
    public Integer getTotalResults() {
        return this.totalResults;
    }

    public static class QuerySkillGroupsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static QuerySkillGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySkillGroupsResponseBodyData self = new QuerySkillGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySkillGroupsResponseBodyData setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public QuerySkillGroupsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySkillGroupsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QuerySkillGroupsResponseBodyData setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

        public QuerySkillGroupsResponseBodyData setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

}
