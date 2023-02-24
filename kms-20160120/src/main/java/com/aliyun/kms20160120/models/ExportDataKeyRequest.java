// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportDataKeyRequest extends TeaModel {
    /**
     * <p>The ciphertext of the data key encrypted by using a CMK.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>A JSON string that consists of key-value pairs. If you specify this parameter when you use a CMK to encrypt the data key, an equivalent value is required here. For more information, see [EncryptionContext](~~42975~~).</p>
     */
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    /**
     * <p>A Base64-encoded public key.</p>
     */
    @NameInMap("PublicKeyBlob")
    public String publicKeyBlob;

    /**
     * <p>The encryption algorithm based on which you want to use the public key specified by PublicKeyBlob to encrypt the data key. For more information about encryption algorithms, see [AsymmetricDecrypt](~~148130~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   RSAES_OAEP_SHA\_256</p>
     * <p>*   RSAES_OAEP_SHA\_1</p>
     * <p>*   SM2PKE</p>
     */
    @NameInMap("WrappingAlgorithm")
    public String wrappingAlgorithm;

    /**
     * <p>The key type of the public key specified by PublicKeyBlob. For more information about key types, see [Introduction to asymmetric keys](~~148147~~).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   RSA\_2048</p>
     * <p>*   EC_SM2</p>
     */
    @NameInMap("WrappingKeySpec")
    public String wrappingKeySpec;

    public static ExportDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDataKeyRequest self = new ExportDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public ExportDataKeyRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public ExportDataKeyRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public ExportDataKeyRequest setPublicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
        return this;
    }
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    public ExportDataKeyRequest setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    public ExportDataKeyRequest setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

}
