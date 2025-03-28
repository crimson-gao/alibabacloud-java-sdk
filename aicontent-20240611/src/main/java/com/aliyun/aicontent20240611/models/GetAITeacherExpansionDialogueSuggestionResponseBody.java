// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetAITeacherExpansionDialogueSuggestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public GetAITeacherExpansionDialogueSuggestionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetAITeacherExpansionDialogueSuggestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAITeacherExpansionDialogueSuggestionResponseBody self = new GetAITeacherExpansionDialogueSuggestionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAITeacherExpansionDialogueSuggestionResponseBody setData(GetAITeacherExpansionDialogueSuggestionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAITeacherExpansionDialogueSuggestionResponseBodyData getData() {
        return this.data;
    }

    public GetAITeacherExpansionDialogueSuggestionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetAITeacherExpansionDialogueSuggestionResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetAITeacherExpansionDialogueSuggestionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAITeacherExpansionDialogueSuggestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAITeacherExpansionDialogueSuggestionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAITeacherExpansionDialogueSuggestionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>谢谢莉莉.你喜欢吃肉吗，莉莉？</p>
         */
        @NameInMap("chineseResult")
        public String chineseResult;

        /**
         * <strong>example:</strong>
         * <p>Thanks, Lily. Do you like meat, Lily?</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        public static GetAITeacherExpansionDialogueSuggestionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAITeacherExpansionDialogueSuggestionResponseBodyData self = new GetAITeacherExpansionDialogueSuggestionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAITeacherExpansionDialogueSuggestionResponseBodyData setChineseResult(String chineseResult) {
            this.chineseResult = chineseResult;
            return this;
        }
        public String getChineseResult() {
            return this.chineseResult;
        }

        public GetAITeacherExpansionDialogueSuggestionResponseBodyData setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

    }

}
