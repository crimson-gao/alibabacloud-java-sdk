// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UnFreezeUserPointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public UnFreezeUserPointResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>6103AD7B-21C2-523B-89D0-579DA58D08E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnFreezeUserPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnFreezeUserPointResponseBody self = new UnFreezeUserPointResponseBody();
        return TeaModel.build(map, self);
    }

    public UnFreezeUserPointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnFreezeUserPointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnFreezeUserPointResponseBody setModel(UnFreezeUserPointResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public UnFreezeUserPointResponseBodyModel getModel() {
        return this.model;
    }

    public UnFreezeUserPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnFreezeUserPointResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17******31</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>22******37</p>
         */
        @NameInMap("BizUid")
        public String bizUid;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        /**
         * <strong>example:</strong>
         * <p>20211212******31746-1202</p>
         */
        @NameInMap("IdempotentId")
        public String idempotentId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Rest")
        public Long rest;

        /**
         * <strong>example:</strong>
         * <p>136</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Status")
        public String status;

        public static UnFreezeUserPointResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UnFreezeUserPointResponseBodyModel self = new UnFreezeUserPointResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public UnFreezeUserPointResponseBodyModel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UnFreezeUserPointResponseBodyModel setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UnFreezeUserPointResponseBodyModel setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public UnFreezeUserPointResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public UnFreezeUserPointResponseBodyModel setBizUid(String bizUid) {
            this.bizUid = bizUid;
            return this;
        }
        public String getBizUid() {
            return this.bizUid;
        }

        public UnFreezeUserPointResponseBodyModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UnFreezeUserPointResponseBodyModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public UnFreezeUserPointResponseBodyModel setIdempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }
        public String getIdempotentId() {
            return this.idempotentId;
        }

        public UnFreezeUserPointResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UnFreezeUserPointResponseBodyModel setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public UnFreezeUserPointResponseBodyModel setRest(Long rest) {
            this.rest = rest;
            return this;
        }
        public Long getRest() {
            return this.rest;
        }

        public UnFreezeUserPointResponseBodyModel setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UnFreezeUserPointResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
