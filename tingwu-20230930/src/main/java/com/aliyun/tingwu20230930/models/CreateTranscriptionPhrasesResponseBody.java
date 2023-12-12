// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTranscriptionPhrasesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateTranscriptionPhrasesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTranscriptionPhrasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTranscriptionPhrasesResponseBody self = new CreateTranscriptionPhrasesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTranscriptionPhrasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTranscriptionPhrasesResponseBody setData(CreateTranscriptionPhrasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTranscriptionPhrasesResponseBodyData getData() {
        return this.data;
    }

    public CreateTranscriptionPhrasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTranscriptionPhrasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTranscriptionPhrasesResponseBodyData extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("PhraseId")
        public String phraseId;

        @NameInMap("Status")
        public String status;

        public static CreateTranscriptionPhrasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTranscriptionPhrasesResponseBodyData self = new CreateTranscriptionPhrasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTranscriptionPhrasesResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateTranscriptionPhrasesResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateTranscriptionPhrasesResponseBodyData setPhraseId(String phraseId) {
            this.phraseId = phraseId;
            return this;
        }
        public String getPhraseId() {
            return this.phraseId;
        }

        public CreateTranscriptionPhrasesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
