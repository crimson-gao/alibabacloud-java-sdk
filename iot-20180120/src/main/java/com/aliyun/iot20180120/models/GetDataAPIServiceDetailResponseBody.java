// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDataAPIServiceDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataAPIServiceDetailResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>57b144cf-09fc-4916-a272-a62902d5b207</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataAPIServiceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataAPIServiceDetailResponseBody self = new GetDataAPIServiceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataAPIServiceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataAPIServiceDetailResponseBody setData(GetDataAPIServiceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataAPIServiceDetailResponseBodyData getData() {
        return this.data;
    }

    public GetDataAPIServiceDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataAPIServiceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAPIServiceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Example")
        public String example;

        /**
         * <strong>example:</strong>
         * <p>status</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>INTEGER</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams self = new GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParams extends TeaModel {
        @NameInMap("RequestParams")
        public java.util.List<GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams> requestParams;

        public static GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParams self = new GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParams();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParams setRequestParams(java.util.List<GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams> requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public java.util.List<GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParamsRequestParams> getRequestParams() {
            return this.requestParams;
        }

    }

    public static class GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Example")
        public String example;

        /**
         * <strong>example:</strong>
         * <p>deviceCount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>INTEGER</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams self = new GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParams extends TeaModel {
        @NameInMap("ResponseParams")
        public java.util.List<GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams> responseParams;

        public static GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParams build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParams self = new GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParams();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParams setResponseParams(java.util.List<GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams> responseParams) {
            this.responseParams = responseParams;
            return this;
        }
        public java.util.List<GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParamsResponseParams> getResponseParams() {
            return this.responseParams;
        }

    }

    public static class GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SELECT COUNT(*) FROM ${system.device} WHERE status = 1</p>
         */
        @NameInMap("OriginSql")
        public String originSql;

        @NameInMap("RequestParams")
        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParams requestParams;

        @NameInMap("ResponseParams")
        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParams responseParams;

        /**
         * <strong>example:</strong>
         * <p>SELECT COUNT(*) as deviceCount FROM ${system.device} WHERE status = ${status}</p>
         */
        @NameInMap("TemplateSql")
        public String templateSql;

        public static GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO self = new GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO setOriginSql(String originSql) {
            this.originSql = originSql;
            return this;
        }
        public String getOriginSql() {
            return this.originSql;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO setRequestParams(GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParams requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTORequestParams getRequestParams() {
            return this.requestParams;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO setResponseParams(GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParams responseParams) {
            this.responseParams = responseParams;
            return this;
        }
        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTOResponseParams getResponseParams() {
            return this.responseParams;
        }

        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO setTemplateSql(String templateSql) {
            this.templateSql = templateSql;
            return this;
        }
        public String getTemplateSql() {
            return this.templateSql;
        }

    }

    public static class GetDataAPIServiceDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/device/getDeviceCountByStatus</p>
         */
        @NameInMap("ApiPath")
        public String apiPath;

        /**
         * <strong>example:</strong>
         * <p>acs:iot:<em>:127103983461</em>***:serveapi/device/getDeviceCountByStatus2</p>
         */
        @NameInMap("ApiSrn")
        public String apiSrn;

        /**
         * <strong>example:</strong>
         * <p>1557839468865</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("DateFormat")
        public String dateFormat;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1557839468865</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>GET/POST</p>
         */
        @NameInMap("RequestMethod")
        public String requestMethod;

        /**
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("RequestProtocol")
        public String requestProtocol;

        @NameInMap("SqlTemplateDTO")
        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO sqlTemplateDTO;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetDataAPIServiceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseBodyData self = new GetDataAPIServiceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseBodyData setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public GetDataAPIServiceDetailResponseBodyData setApiSrn(String apiSrn) {
            this.apiSrn = apiSrn;
            return this;
        }
        public String getApiSrn() {
            return this.apiSrn;
        }

        public GetDataAPIServiceDetailResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataAPIServiceDetailResponseBodyData setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public String getDateFormat() {
            return this.dateFormat;
        }

        public GetDataAPIServiceDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataAPIServiceDetailResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetDataAPIServiceDetailResponseBodyData setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetDataAPIServiceDetailResponseBodyData setRequestMethod(String requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public String getRequestMethod() {
            return this.requestMethod;
        }

        public GetDataAPIServiceDetailResponseBodyData setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
            return this;
        }
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

        public GetDataAPIServiceDetailResponseBodyData setSqlTemplateDTO(GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO sqlTemplateDTO) {
            this.sqlTemplateDTO = sqlTemplateDTO;
            return this;
        }
        public GetDataAPIServiceDetailResponseBodyDataSqlTemplateDTO getSqlTemplateDTO() {
            return this.sqlTemplateDTO;
        }

        public GetDataAPIServiceDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
