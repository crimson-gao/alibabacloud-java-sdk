// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetWeatherRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public GetWeatherRequestDeviceInfo deviceInfo;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Payload")
    public GetWeatherRequestPayload payload;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public GetWeatherRequestUserInfo userInfo;

    public static GetWeatherRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWeatherRequest self = new GetWeatherRequest();
        return TeaModel.build(map, self);
    }

    public GetWeatherRequest setDeviceInfo(GetWeatherRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetWeatherRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public GetWeatherRequest setPayload(GetWeatherRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetWeatherRequestPayload getPayload() {
        return this.payload;
    }

    public GetWeatherRequest setUserInfo(GetWeatherRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetWeatherRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetWeatherRequestDeviceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetWeatherRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherRequestDeviceInfo self = new GetWeatherRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetWeatherRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetWeatherRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetWeatherRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWeatherRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetWeatherRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetWeatherRequestPayload extends TeaModel {
        public static GetWeatherRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherRequestPayload self = new GetWeatherRequestPayload();
            return TeaModel.build(map, self);
        }

    }

    public static class GetWeatherRequestUserInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetWeatherRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherRequestUserInfo self = new GetWeatherRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetWeatherRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetWeatherRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetWeatherRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWeatherRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetWeatherRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
