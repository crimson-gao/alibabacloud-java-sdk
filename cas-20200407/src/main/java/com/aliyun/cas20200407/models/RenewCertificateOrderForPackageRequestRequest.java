// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RenewCertificateOrderForPackageRequestRequest extends TeaModel {
    /**
     * <p>The content of the certificate signing request (CSR) file that is manually generated for the domain name by using OpenSSL or Keytool. The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/42218.html">How do I create a CSR file?</a></p>
     * <p>If you do not specify this parameter, Certificate Management Service automatically generates a CSR file for the domain name in the certificate application order that you want to renew.</p>
     * <p>A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.</p>
     * <blockquote>
     * <p> The <strong>CN</strong> field in the CSR file specifies the domain name that is bound to the certificate.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- MIIC1TCCAb0CAQAwgY8xCzAJBgNVBAYTAkNOMRIwEAYDVQQIDAlHdWFuZ3pob3Ux ETAPBgNVBAcMCFNoZW56aGVuMQ8wDQYDVQQKDAZDaGFjdW8xEDAOBgNVBAsMB0lU IERlcHQxFzAVBgNVBAMMDnd3dy5jaGFjdW8ubmV0MR0wGwYJKoZIhvcNAQkBFg44 MjkyNjY5QHFxLmNvbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBALo7 atRvQf9tKo1NJ/MQqzHvIjHNhU+0MMerDq+tRlJ+a7Ro1r6IWNF5MB0Z****** -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The ID of the certificate application order that you want to renew.</p>
     * <blockquote>
     * <p> After you call the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a>, <a href="https://help.aliyun.com/document_detail/455292.html">CreateCertificateRequest</a>, or <a href="https://help.aliyun.com/document_detail/455801.html">CreateCertificateWithCsrRequest</a> operation to submit a certificate application, you can obtain the ID of the certificate application order from the <strong>OrderId</strong> response parameter. You can also call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the order ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123451222</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static RenewCertificateOrderForPackageRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewCertificateOrderForPackageRequestRequest self = new RenewCertificateOrderForPackageRequestRequest();
        return TeaModel.build(map, self);
    }

    public RenewCertificateOrderForPackageRequestRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public RenewCertificateOrderForPackageRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
