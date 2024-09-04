// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetAccountInfoResponseBody extends TeaModel {
    /**
     * <p>Account Type:</p>
     * <ul>
     * <li>1 Agency\&quot;s End User</li>
     * <li>2 Reseller\&quot;s End User</li>
     * <li>3 Enterprise</li>
     * <li>4 T2 Agency Partner</li>
     * <li>5 T2 Reseller Partner</li>
     * <li>6 T2 Agency+Reseller Partner</li>
     * </ul>
     */
    @NameInMap("AccountInfoList")
    public GetAccountInfoResponseBodyAccountInfoList accountInfoList;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>message</p>
     * 
     * <strong>example:</strong>
     * <p>Pagination Information</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pagination, page volume in total.</p>
     */
    @NameInMap("PageInfo")
    public GetAccountInfoResponseBodyPageInfo pageInfo;

    /**
     * <p>Request id, a unique identifier generated by Alibaba cloud for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Pagination, record number on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountInfoResponseBody self = new GetAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountInfoResponseBody setAccountInfoList(GetAccountInfoResponseBodyAccountInfoList accountInfoList) {
        this.accountInfoList = accountInfoList;
        return this;
    }
    public GetAccountInfoResponseBodyAccountInfoList getAccountInfoList() {
        return this.accountInfoList;
    }

    public GetAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccountInfoResponseBody setPageInfo(GetAccountInfoResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetAccountInfoResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountInfoResponseBodyAccountInfoListAccountInfo extends TeaModel {
        /**
         * <p>The E-mail of Distribution Customer.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of Distribution Customer.</p>
         */
        @NameInMap("AccountNickname")
        public String accountNickname;

        /**
         * <p>Account CID of Distribution Customer.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:1234@qq.com">1234@qq.com</a></p>
         */
        @NameInMap("AliyunId")
        public String aliyunId;

        /**
         * <p>XXX Technology LTD.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-01</p>
         */
        @NameInMap("AssociationSuccessTime")
        public String associationSuccessTime;

        /**
         * <p>customer\&quot;s CID</p>
         * 
         * <strong>example:</strong>
         * <p>61479572</p>
         */
        @NameInMap("Cid")
        public Long cid;

        /**
         * <p>customer manager</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("CustomerBd")
        public String customerBd;

        /**
         * <p>The account have Shutdown-delay Privilege, After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("DelayAmount")
        public String delayAmount;

        /**
         * <p>Partner\&quot;s Shutdown Policy Management for Sub Account.
         * 1: delayStop. The account have Shutdown-delay Privilege, After Shutdown-delay Credit is ran out, Alibaba Cloud will take over resources and keep the instance for 15 days. In addition, the instance will be released if Sub Account failed to pay the bill within these 15 days.
         * 2: noStop. Partner will manually manage Shutdown Status for Sub Account. Meanwhile, System would not manage the resource\&quot;s life-circle of Sub Account.
         * 3: immediatelyStop. Once valid quota of Sub Account falls below 0 and be identified as defaulting account, it will trigger the instance shutdown immediately.</p>
         * 
         * <strong>example:</strong>
         * <p>noStop</p>
         */
        @NameInMap("DelayStatus")
        public String delayStatus;

        /**
         * <p>Sub Account</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:1234@qq.com">1234@qq.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Account UID of Distribution Customer.</p>
         * 
         * <strong>example:</strong>
         * <p>13641588680</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>Purchase Forbidden：Ban the new purchase action
         * normal：Normal--End Use can issue Cloud Resource order immediately.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("NewBuyStatus")
        public String newBuyStatus;

        /**
         * <p>Valid mobile number of Distribution Customer.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Login name of Distribution Customer.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The name of Sub Account:
         * 1.	Use the official name of Company, if Sub Account is an enterprise.
         * 2.	Use the official name of Partner, if Sub Account is a T2 reseller.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubAccountType")
        public Integer subAccountType;

        /**
         * <p>Request ID, the unique request identifier generated by Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>1415740779475837</p>
         */
        @NameInMap("Uid")
        public Long uid;

        public static GetAccountInfoResponseBodyAccountInfoListAccountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyAccountInfoListAccountInfo self = new GetAccountInfoResponseBodyAccountInfoListAccountInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAccountNickname(String accountNickname) {
            this.accountNickname = accountNickname;
            return this;
        }
        public String getAccountNickname() {
            return this.accountNickname;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAssociationSuccessTime(String associationSuccessTime) {
            this.associationSuccessTime = associationSuccessTime;
            return this;
        }
        public String getAssociationSuccessTime() {
            return this.associationSuccessTime;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setCustomerBd(String customerBd) {
            this.customerBd = customerBd;
            return this;
        }
        public String getCustomerBd() {
            return this.customerBd;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setDelayAmount(String delayAmount) {
            this.delayAmount = delayAmount;
            return this;
        }
        public String getDelayAmount() {
            return this.delayAmount;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setDelayStatus(String delayStatus) {
            this.delayStatus = delayStatus;
            return this;
        }
        public String getDelayStatus() {
            return this.delayStatus;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setNewBuyStatus(String newBuyStatus) {
            this.newBuyStatus = newBuyStatus;
            return this;
        }
        public String getNewBuyStatus() {
            return this.newBuyStatus;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setSubAccountType(Integer subAccountType) {
            this.subAccountType = subAccountType;
            return this;
        }
        public Integer getSubAccountType() {
            return this.subAccountType;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetAccountInfoResponseBodyAccountInfoList extends TeaModel {
        @NameInMap("AccountInfo")
        public java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> accountInfo;

        public static GetAccountInfoResponseBodyAccountInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyAccountInfoList self = new GetAccountInfoResponseBodyAccountInfoList();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyAccountInfoList setAccountInfo(java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> accountInfo) {
            this.accountInfo = accountInfo;
            return this;
        }
        public java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> getAccountInfo() {
            return this.accountInfo;
        }

    }

    public static class GetAccountInfoResponseBodyPageInfo extends TeaModel {
        /**
         * <p>Account Information</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>Pagination, current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>List of Account Information</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetAccountInfoResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyPageInfo self = new GetAccountInfoResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetAccountInfoResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAccountInfoResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
