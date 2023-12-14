// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequestRequest extends TeaModel {
    /**
     * <p>The ID of the certificate application order that you want to delete.</p>
     * <br>
     * <p>>  After you call the [CreateCertificateForPackageRequest](~~455296~~), [CreateCertificateRequest](~~455292~~), or [CreateCertificateWithCsrRequest](~~455801~~) operation to submit a certificate application, you can obtain the ID of the certificate application order from the **OrderId** response parameter.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static DeleteCertificateRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequestRequest self = new DeleteCertificateRequestRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
