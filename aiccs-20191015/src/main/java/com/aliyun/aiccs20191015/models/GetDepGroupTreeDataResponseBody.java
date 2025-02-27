// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetDepGroupTreeDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetDepGroupTreeDataResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetDepGroupTreeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDepGroupTreeDataResponseBody self = new GetDepGroupTreeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDepGroupTreeDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDepGroupTreeDataResponseBody setData(java.util.List<GetDepGroupTreeDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDepGroupTreeDataResponseBodyData> getData() {
        return this.data;
    }

    public GetDepGroupTreeDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDepGroupTreeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDepGroupTreeDataResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetDepGroupTreeDataResponseBodyDataGroupDTOS extends TeaModel {
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>555555</p>
         */
        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        public static GetDepGroupTreeDataResponseBodyDataGroupDTOS build(java.util.Map<String, ?> map) throws Exception {
            GetDepGroupTreeDataResponseBodyDataGroupDTOS self = new GetDepGroupTreeDataResponseBodyDataGroupDTOS();
            return TeaModel.build(map, self);
        }

        public GetDepGroupTreeDataResponseBodyDataGroupDTOS setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDepGroupTreeDataResponseBodyDataGroupDTOS setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class GetDepGroupTreeDataResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DepGroupId")
        public String depGroupId;

        @NameInMap("DepGroupName")
        public String depGroupName;

        @NameInMap("GroupDTOS")
        public java.util.List<GetDepGroupTreeDataResponseBodyDataGroupDTOS> groupDTOS;

        public static GetDepGroupTreeDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDepGroupTreeDataResponseBodyData self = new GetDepGroupTreeDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDepGroupTreeDataResponseBodyData setDepGroupId(String depGroupId) {
            this.depGroupId = depGroupId;
            return this;
        }
        public String getDepGroupId() {
            return this.depGroupId;
        }

        public GetDepGroupTreeDataResponseBodyData setDepGroupName(String depGroupName) {
            this.depGroupName = depGroupName;
            return this;
        }
        public String getDepGroupName() {
            return this.depGroupName;
        }

        public GetDepGroupTreeDataResponseBodyData setGroupDTOS(java.util.List<GetDepGroupTreeDataResponseBodyDataGroupDTOS> groupDTOS) {
            this.groupDTOS = groupDTOS;
            return this;
        }
        public java.util.List<GetDepGroupTreeDataResponseBodyDataGroupDTOS> getGroupDTOS() {
            return this.groupDTOS;
        }

    }

}
