// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateOTAUploadURLResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information returned if the call is successful. For more information, see the following parameters.</p>
     */
    @NameInMap("Data")
    public GenerateOTAUploadURLResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateOTAUploadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOTAUploadURLResponseBody self = new GenerateOTAUploadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOTAUploadURLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateOTAUploadURLResponseBody setData(GenerateOTAUploadURLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateOTAUploadURLResponseBodyData getData() {
        return this.data;
    }

    public GenerateOTAUploadURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateOTAUploadURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateOTAUploadURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateOTAUploadURLResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the update package file that is stored in OSS.</p>
         * <br>
         * <p>After the update package file is uploaded, this parameter is used to call the [CreateOTAFirmware](~~147311~~) operation to create an update package.</p>
         */
        @NameInMap("FirmwareUrl")
        public String firmwareUrl;

        /**
         * <p>The endpoint of OSS.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The full path of the file in OSS. The file is uploaded by calling the OSS PostObject operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The AccessKey ID of the bucket owner.</p>
         * <br>
         * <p>This OSS bucket stores the update package file.</p>
         */
        @NameInMap("OSSAccessKeyId")
        public String OSSAccessKeyId;

        /**
         * <p>The type of object storage. Default value: OSS.</p>
         */
        @NameInMap("ObjectStorage")
        public String objectStorage;

        /**
         * <p>The parameter that is used by OSS to verify form fields for the request.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The signature that is calculated based on **AccessKeySecret** and **Policy**. When you call an OSS operation, OSS uses the signature information to verify the POST request.</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The time when the URL of the uploaded update package file was generated. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        public static GenerateOTAUploadURLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateOTAUploadURLResponseBodyData self = new GenerateOTAUploadURLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateOTAUploadURLResponseBodyData setFirmwareUrl(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public GenerateOTAUploadURLResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateOTAUploadURLResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateOTAUploadURLResponseBodyData setOSSAccessKeyId(String OSSAccessKeyId) {
            this.OSSAccessKeyId = OSSAccessKeyId;
            return this;
        }
        public String getOSSAccessKeyId() {
            return this.OSSAccessKeyId;
        }

        public GenerateOTAUploadURLResponseBodyData setObjectStorage(String objectStorage) {
            this.objectStorage = objectStorage;
            return this;
        }
        public String getObjectStorage() {
            return this.objectStorage;
        }

        public GenerateOTAUploadURLResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateOTAUploadURLResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateOTAUploadURLResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
