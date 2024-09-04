// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetMonthlyBillResponseBody extends TeaModel {
    /**
     * <p>Result Code:</p>
     * <ul>
     * <li>200 OK</li>
     * <li>1109 System error</li>
     * <li>3030 Sub Account Nickname exceeds maximum length, maximum length 150 bytes.</li>
     * <li>3031 Remark exceeds maximum length, maximum length 3000 bytes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetMonthlyBillResponseBodyData data;

    /**
     * <p>Same as Code parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, the unique request identifier generated by Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>210e876f16704666020714468dab35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMonthlyBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonthlyBillResponseBody self = new GetMonthlyBillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonthlyBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMonthlyBillResponseBody setData(GetMonthlyBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMonthlyBillResponseBodyData getData() {
        return this.data;
    }

    public GetMonthlyBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMonthlyBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonthlyBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMonthlyBillResponseBodyData extends TeaModel {
        /**
         * <p>The link to download CSV file, please use HTTP Protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>intl-reseller-month-bill.oss-ap-southeast-1.aliyuncs.com/statements/month/dts/1064252248461886/202104/Month%20Billing%20Invoice%20202104.pdf?Expires=1671160973&amp;OSSAccessKeyId=TMP.3KhvoD9pW264cPv8sYe8E2zJ5HLWmrijNHgKiKpXcy8yS472BcrvemgTfNrrXKu5fCCdbLr2XhmYAyYPmbCe8zJyEkmYzL&amp;Signature=hns1PgiiYl1WdI%2FdiOqbEdsgmfI%3D</p>
         */
        @NameInMap("BillLinkCSV")
        public String billLinkCSV;

        /**
         * <p>The link to download XLSX file, please use HTTP Protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>intl-reseller-month-bill.oss-ap-southeast-1.aliyuncs.com/statements/month/dts/1064252248461886/202104/Month%20Billing%20Invoice%20202104.pdf?Expires=1671160973&amp;OSSAccessKeyId=TMP.3KhvoD9pW264cPv8sYe8E2zJ5HLWmrijNHgKiKpXcy8yS472BcrvemgTfNrrXKu5fCCdbLr2XhmYAyYPmbCe8zJyEkmYzL&amp;Signature=hns1PgiiYl1WdI%2FdiOqbEdsgmfI%3D</p>
         */
        @NameInMap("BillLinkXLSX")
        public String billLinkXLSX;

        /**
         * <p>Same as inserted parameter BillOwner.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BillOwner")
        public String billOwner;

        /**
         * <p>Same as inserted parameter BillType.</p>
         * 
         * <strong>example:</strong>
         * <p>MonthlyInvoice</p>
         */
        @NameInMap("BillType")
        public String billType;

        /**
         * <p>The URL to download invoice.</p>
         * 
         * <strong>example:</strong>
         * <p>intl-reseller-month-bill.oss-ap-southeast-1.aliyuncs.com/statements/month/dts/1064252248461886/202104/Month%20Billing%20Invoice%20202104.pdf?Expires=1671160973&amp;OSSAccessKeyId=TMP.3KhvoD9pW264cPv8sYe8E2zJ5HLWmrijNHgKiKpXcy8yS472BcrvemgTfNrrXKu5fCCdbLr2XhmYAyYPmbCe8zJyEkmYzL&amp;Signature=hns1PgiiYl1WdI%2FdiOqbEdsgmfI%3D</p>
         */
        @NameInMap("InvoiceLink")
        public String invoiceLink;

        /**
         * <p>It states the existence of refund invoice. </br>
         * Candidate Values: True/False</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("RefundInvoiceFlag")
        public Boolean refundInvoiceFlag;

        /**
         * <p>The URL to download refund invoice.</p>
         * 
         * <strong>example:</strong>
         * <p>intl-reseller-month-bill.oss-ap-southeast-1.aliyuncs.com/statements/month/dts/1064252248461886/202104/Month%20Billing%20Invoice%20202104.pdf?Expires=1671160973&amp;OSSAccessKeyId=TMP.3KhvoD9pW264cPv8sYe8E2zJ5HLWmrijNHgKiKpXcy8yS472BcrvemgTfNrrXKu5fCCdbLr2XhmYAyYPmbCe8zJyEkmYzL&amp;Signature=hns1PgiiYl1WdI%2FdiOqbEdsgmfI%3D</p>
         */
        @NameInMap("RefundInvoiceLink")
        public String refundInvoiceLink;

        /**
         * <p>Spending Time, refer to the exact time of costuming.</p>
         * 
         * <strong>example:</strong>
         * <p>20221201</p>
         */
        @NameInMap("SpendingTime")
        public String spendingTime;

        public static GetMonthlyBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMonthlyBillResponseBodyData self = new GetMonthlyBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMonthlyBillResponseBodyData setBillLinkCSV(String billLinkCSV) {
            this.billLinkCSV = billLinkCSV;
            return this;
        }
        public String getBillLinkCSV() {
            return this.billLinkCSV;
        }

        public GetMonthlyBillResponseBodyData setBillLinkXLSX(String billLinkXLSX) {
            this.billLinkXLSX = billLinkXLSX;
            return this;
        }
        public String getBillLinkXLSX() {
            return this.billLinkXLSX;
        }

        public GetMonthlyBillResponseBodyData setBillOwner(String billOwner) {
            this.billOwner = billOwner;
            return this;
        }
        public String getBillOwner() {
            return this.billOwner;
        }

        public GetMonthlyBillResponseBodyData setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public GetMonthlyBillResponseBodyData setInvoiceLink(String invoiceLink) {
            this.invoiceLink = invoiceLink;
            return this;
        }
        public String getInvoiceLink() {
            return this.invoiceLink;
        }

        public GetMonthlyBillResponseBodyData setRefundInvoiceFlag(Boolean refundInvoiceFlag) {
            this.refundInvoiceFlag = refundInvoiceFlag;
            return this;
        }
        public Boolean getRefundInvoiceFlag() {
            return this.refundInvoiceFlag;
        }

        public GetMonthlyBillResponseBodyData setRefundInvoiceLink(String refundInvoiceLink) {
            this.refundInvoiceLink = refundInvoiceLink;
            return this;
        }
        public String getRefundInvoiceLink() {
            return this.refundInvoiceLink;
        }

        public GetMonthlyBillResponseBodyData setSpendingTime(String spendingTime) {
            this.spendingTime = spendingTime;
            return this;
        }
        public String getSpendingTime() {
            return this.spendingTime;
        }

    }

}
