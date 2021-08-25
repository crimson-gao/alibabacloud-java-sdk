// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteRemediationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RemediationDeleteResults")
    public java.util.List<DeleteRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults;

    public static DeleteRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemediationsResponseBody self = new DeleteRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRemediationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRemediationsResponseBody setRemediationDeleteResults(java.util.List<DeleteRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults) {
        this.remediationDeleteResults = remediationDeleteResults;
        return this;
    }
    public java.util.List<DeleteRemediationsResponseBodyRemediationDeleteResults> getRemediationDeleteResults() {
        return this.remediationDeleteResults;
    }

    public static class DeleteRemediationsResponseBodyRemediationDeleteResults extends TeaModel {
        @NameInMap("RemediationId")
        public String remediationId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteRemediationsResponseBodyRemediationDeleteResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteRemediationsResponseBodyRemediationDeleteResults self = new DeleteRemediationsResponseBodyRemediationDeleteResults();
            return TeaModel.build(map, self);
        }

        public DeleteRemediationsResponseBodyRemediationDeleteResults setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public DeleteRemediationsResponseBodyRemediationDeleteResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeleteRemediationsResponseBodyRemediationDeleteResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
