// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateRequestRequest extends TeaModel {
    /**
     * <p>The domain name that you want to bind to the certificate. You can specify only one domain name.</p>
     * <blockquote>
     * <p> The domain name must match the certificate specifications that you specify for the <strong>ProductCode</strong> parameter. If you apply for a single-domain certificate, you must specify a single domain name for this parameter. If you apply for a wildcard certificate, you must specify a wildcard domain name such as <code>*.aliyundoc.com</code> for this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The contact email address of the applicant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The phone number of the applicant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The specifications of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>digicert-free-1-free</strong> (default): DigiCert single-domain DV certificate, which is free and valid for 3 months.</li>
     * <li><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate, which is free and valid for 1 year. This value is available only on the China site (aliyun.com).</li>
     * <li><strong>symantec-dv-1-starter</strong>: DigiCert wildcard DV certificate.</li>
     * <li><strong>geotrust-dv-1-starter</strong>: GeoTrust single-domain DV certificate.</li>
     * <li><strong>geotrust-dv-w-starter</strong>: GeoTrust wildcard DV certificate.</li>
     * <li><strong>globalsign-dv-1-personal</strong>: GlobalSign single-domain DV certificate.</li>
     * <li><strong>globalsign-dv-w-advanced</strong>: GlobalSign wildcard DV certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>symantec-free-1-free</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The name of the applicant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tom</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The method to verify the ownership of a domain name. Valid values:</p>
     * <ul>
     * <li><strong>DNS</strong>: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name. You must have operation permissions on domain name resolution to verify the ownership of the domain name.</li>
     * <li><strong>FILE</strong>: file verification. If you use this method, you must create a specified file on the DNS server. You must have administrative rights on the DNS server to verify the ownership of the domain name.</li>
     * </ul>
     * <p>For more information about the verification methods, see <a href="https://help.aliyun.com/document_detail/48016.html">Verify the ownership of a domain name</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    public static CreateCertificateRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequestRequest self = new CreateCertificateRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateRequestRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateCertificateRequestRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCertificateRequestRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateCertificateRequestRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateCertificateRequestRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateCertificateRequestRequest setValidateType(String validateType) {
        this.validateType = validateType;
        return this;
    }
    public String getValidateType() {
        return this.validateType;
    }

}
