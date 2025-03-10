// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySchedulePeriodListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySchedulePeriodListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>sound code service has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySchedulePeriodListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySchedulePeriodListResponseBody self = new QuerySchedulePeriodListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySchedulePeriodListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySchedulePeriodListResponseBody setData(QuerySchedulePeriodListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySchedulePeriodListResponseBodyData getData() {
        return this.data;
    }

    public QuerySchedulePeriodListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySchedulePeriodListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySchedulePeriodListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySchedulePeriodListResponseBodyDataListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>00:10</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        @NameInMap("PeriodCode")
        public String periodCode;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
         */
        @NameInMap("SoundCodeContent")
        public String soundCodeContent;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QuerySchedulePeriodListResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySchedulePeriodListResponseBodyDataListItems self = new QuerySchedulePeriodListResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySchedulePeriodListResponseBodyDataListItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySchedulePeriodListResponseBodyDataListItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QuerySchedulePeriodListResponseBodyDataListItems setPeriodCode(String periodCode) {
            this.periodCode = periodCode;
            return this;
        }
        public String getPeriodCode() {
            return this.periodCode;
        }

        public QuerySchedulePeriodListResponseBodyDataListItems setSoundCodeContent(String soundCodeContent) {
            this.soundCodeContent = soundCodeContent;
            return this;
        }
        public String getSoundCodeContent() {
            return this.soundCodeContent;
        }

        public QuerySchedulePeriodListResponseBodyDataListItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QuerySchedulePeriodListResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySchedulePeriodListResponseBodyDataListItems> items;

        public static QuerySchedulePeriodListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySchedulePeriodListResponseBodyDataList self = new QuerySchedulePeriodListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySchedulePeriodListResponseBodyDataList setItems(java.util.List<QuerySchedulePeriodListResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySchedulePeriodListResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySchedulePeriodListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySchedulePeriodListResponseBodyDataList list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySchedulePeriodListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySchedulePeriodListResponseBodyData self = new QuerySchedulePeriodListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySchedulePeriodListResponseBodyData setList(QuerySchedulePeriodListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySchedulePeriodListResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySchedulePeriodListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySchedulePeriodListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySchedulePeriodListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
