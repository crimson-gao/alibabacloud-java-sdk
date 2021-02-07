// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubscriptionDetailResponseBody extends TeaModel {
    @NameInMap("SecretBindDetailDTO")
    public QuerySubscriptionDetailResponseBodySecretBindDetailDTO secretBindDetailDTO;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static QuerySubscriptionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscriptionDetailResponseBody self = new QuerySubscriptionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySubscriptionDetailResponseBody setSecretBindDetailDTO(QuerySubscriptionDetailResponseBodySecretBindDetailDTO secretBindDetailDTO) {
        this.secretBindDetailDTO = secretBindDetailDTO;
        return this;
    }
    public QuerySubscriptionDetailResponseBodySecretBindDetailDTO getSecretBindDetailDTO() {
        return this.secretBindDetailDTO;
    }

    public QuerySubscriptionDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySubscriptionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySubscriptionDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QuerySubscriptionDetailResponseBodySecretBindDetailDTO extends TeaModel {
        @NameInMap("Status")
        public Long status;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("PhoneNoB")
        public String phoneNoB;

        @NameInMap("ASRStatus")
        public Boolean ASRStatus;

        @NameInMap("NeedRecord")
        public Boolean needRecord;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("SubsId")
        public String subsId;

        @NameInMap("CallRestrict")
        public String callRestrict;

        @NameInMap("PhoneNoX")
        public String phoneNoX;

        @NameInMap("ASRModelId")
        public String ASRModelId;

        @NameInMap("PhoneNoA")
        public String phoneNoA;

        public static QuerySubscriptionDetailResponseBodySecretBindDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySubscriptionDetailResponseBodySecretBindDetailDTO self = new QuerySubscriptionDetailResponseBodySecretBindDetailDTO();
            return TeaModel.build(map, self);
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setPhoneNoB(String phoneNoB) {
            this.phoneNoB = phoneNoB;
            return this;
        }
        public String getPhoneNoB() {
            return this.phoneNoB;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setASRStatus(Boolean ASRStatus) {
            this.ASRStatus = ASRStatus;
            return this;
        }
        public Boolean getASRStatus() {
            return this.ASRStatus;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setNeedRecord(Boolean needRecord) {
            this.needRecord = needRecord;
            return this;
        }
        public Boolean getNeedRecord() {
            return this.needRecord;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setCallRestrict(String callRestrict) {
            this.callRestrict = callRestrict;
            return this;
        }
        public String getCallRestrict() {
            return this.callRestrict;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setASRModelId(String ASRModelId) {
            this.ASRModelId = ASRModelId;
            return this;
        }
        public String getASRModelId() {
            return this.ASRModelId;
        }

        public QuerySubscriptionDetailResponseBodySecretBindDetailDTO setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

    }

}
