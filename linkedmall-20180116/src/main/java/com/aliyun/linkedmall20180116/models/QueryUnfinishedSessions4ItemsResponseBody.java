// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessions4ItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LmItemActivitySessionModelListList")
    public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListList lmItemActivitySessionModelListList;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A209C555-3869-5259-9880-9747CBDA2B89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryUnfinishedSessions4ItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessions4ItemsResponseBody self = new QueryUnfinishedSessions4ItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessions4ItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUnfinishedSessions4ItemsResponseBody setLmItemActivitySessionModelListList(QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListList lmItemActivitySessionModelListList) {
        this.lmItemActivitySessionModelListList = lmItemActivitySessionModelListList;
        return this;
    }
    public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListList getLmItemActivitySessionModelListList() {
        return this.lmItemActivitySessionModelListList;
    }

    public QueryUnfinishedSessions4ItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUnfinishedSessions4ItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2022-03-30 13:53:00</p>
         */
        @NameInMap("DisplayDate")
        public String displayDate;

        /**
         * <strong>example:</strong>
         * <p>2022-04-01 00:00:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        /**
         * <strong>example:</strong>
         * <p>679</p>
         */
        @NameInMap("LmActivityId")
        public Long lmActivityId;

        @NameInMap("LmSessionId")
        public Long lmSessionId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2022-03-30 14:00:00</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p>cf5eddd******105378a3ea27b67</p>
         */
        @NameInMap("SubBizCode")
        public String subBizCode;

        public static QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel self = new QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

    }

    public static class QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels extends TeaModel {
        @NameInMap("LmActivitySessionModel")
        public java.util.List<QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel> lmActivitySessionModel;

        public static QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels self = new QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels setLmActivitySessionModel(java.util.List<QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel> lmActivitySessionModel) {
            this.lmActivitySessionModel = lmActivitySessionModel;
            return this;
        }
        public java.util.List<QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModelsLmActivitySessionModel> getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

    }

    public static class QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60716881****</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmActivitySessionModels")
        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels lmActivitySessionModels;

        /**
         * <strong>example:</strong>
         * <p>10000230-60716881****</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        public static QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList self = new QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList setLmActivitySessionModels(QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels lmActivitySessionModels) {
            this.lmActivitySessionModels = lmActivitySessionModels;
            return this;
        }
        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelListLmActivitySessionModels getLmActivitySessionModels() {
            return this.lmActivitySessionModels;
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

    }

    public static class QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListList extends TeaModel {
        @NameInMap("LmItemActivitySessionModelList")
        public java.util.List<QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList> lmItemActivitySessionModelList;

        public static QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListList build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListList self = new QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListList();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListList setLmItemActivitySessionModelList(java.util.List<QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList> lmItemActivitySessionModelList) {
            this.lmItemActivitySessionModelList = lmItemActivitySessionModelList;
            return this;
        }
        public java.util.List<QueryUnfinishedSessions4ItemsResponseBodyLmItemActivitySessionModelListListLmItemActivitySessionModelList> getLmItemActivitySessionModelList() {
            return this.lmItemActivitySessionModelList;
        }

    }

}
