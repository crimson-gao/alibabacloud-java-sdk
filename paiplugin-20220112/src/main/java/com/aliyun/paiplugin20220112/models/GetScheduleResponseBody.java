// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetScheduleResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public GetScheduleResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static GetScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleResponseBody self = new GetScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduleResponseBody setData(GetScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScheduleResponseBodyData getData() {
        return this.data;
    }

    public GetScheduleResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetScheduleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class GetScheduleResponseBodyData extends TeaModel {
        // 创建时间 (UTC+8)
        @NameInMap("CreatedTime")
        public String createdTime;

        // 终止时间（UTC+8），精确到分钟。
        @NameInMap("EndTime")
        public Integer endTime;

        // 执行时间 (UTC+8)，为空立即执行。
        @NameInMap("ExecuteTime")
        public String executeTime;

        // 人群Id。
        @NameInMap("GroupId")
        public String groupId;

        // 历史记录
        @NameInMap("History")
        public String history;

        // Id
        @NameInMap("Id")
        public String id;

        // 发送计划名称。
        @NameInMap("Name")
        public String name;

        // 重复周期，按重复周期与重复周期单位执行。
        @NameInMap("RepeatCycle")
        public Integer repeatCycle;

        // 重复周期单位，若指定执行时间，则重复周期生效。
        // - 0: 从不（默认）
        // - 1: 小时
        // - 2: 天
        // - 3: 周
        // - 4: 月
        @NameInMap("RepeatCycleUnit")
        public Integer repeatCycleUnit;

        // 重复次数。
        // - -1: 不设终止时间
        // - 0: 不重复
        // - N: 重复N次后终止
        @NameInMap("RepeatTimes")
        public Integer repeatTimes;

        // 签名Id。
        @NameInMap("SignatureId")
        public String signatureId;

        // 状态
        // - 0: 检查中
        // - 1: 检查成功
        // - 2: 检查失败
        // - 3: 发送中
        // - 4: 发送成功
        // - 5: 发送失败
        @NameInMap("Status")
        public Integer status;

        // 模板Id。
        @NameInMap("TemplateId")
        public String templateId;

        // 更新时间 (UTC+8)
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleResponseBodyData self = new GetScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScheduleResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetScheduleResponseBodyData setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public GetScheduleResponseBodyData setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public GetScheduleResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetScheduleResponseBodyData setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public GetScheduleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetScheduleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduleResponseBodyData setRepeatCycle(Integer repeatCycle) {
            this.repeatCycle = repeatCycle;
            return this;
        }
        public Integer getRepeatCycle() {
            return this.repeatCycle;
        }

        public GetScheduleResponseBodyData setRepeatCycleUnit(Integer repeatCycleUnit) {
            this.repeatCycleUnit = repeatCycleUnit;
            return this;
        }
        public Integer getRepeatCycleUnit() {
            return this.repeatCycleUnit;
        }

        public GetScheduleResponseBodyData setRepeatTimes(Integer repeatTimes) {
            this.repeatTimes = repeatTimes;
            return this;
        }
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        public GetScheduleResponseBodyData setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public GetScheduleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetScheduleResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetScheduleResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
