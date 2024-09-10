// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCloudVendorAccountAKResponseBody extends TeaModel {
    /**
     * <p>The information about the AccessKey pair that is added.</p>
     */
    @NameInMap("Data")
    public ModifyCloudVendorAccountAKResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6635CED5-4B20-5D2D-94EC-A1C8F9C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudVendorAccountAKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudVendorAccountAKResponseBody self = new ModifyCloudVendorAccountAKResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudVendorAccountAKResponseBody setData(ModifyCloudVendorAccountAKResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyCloudVendorAccountAKResponseBodyData getData() {
        return this.data;
    }

    public ModifyCloudVendorAccountAKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyCloudVendorAccountAKResponseBodyDataAuthModules extends TeaModel {
        /**
         * <p>The error message of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_domain_error</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The code of the module. Valid values:</p>
         * <ul>
         * <li><strong>HOST</strong>: host.</li>
         * <li><strong>CSPM</strong>: configuration assessment.</li>
         * <li><strong>SIEM</strong>: threat analysis and response.</li>
         * <li><strong>TRIAL</strong>: log audit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOST</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The type of the cloud asset that is associated with the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Module.</p>
         */
        @NameInMap("ModuleAssetType")
        public String moduleAssetType;

        /**
         * <p>The display name of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("ModuleDisp")
        public String moduleDisp;

        /**
         * <p>The service status of the module. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: being used.</li>
         * <li><strong>1</strong>: exception occurred.</li>
         * <li><strong>2</strong>: being validated.</li>
         * <li><strong>3</strong>: validation timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ModuleServiceStatus")
        public Integer moduleServiceStatus;

        /**
         * <p>The permission description of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("ModuleStatement")
        public String moduleStatement;

        public static ModifyCloudVendorAccountAKResponseBodyDataAuthModules build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudVendorAccountAKResponseBodyDataAuthModules self = new ModifyCloudVendorAccountAKResponseBodyDataAuthModules();
            return TeaModel.build(map, self);
        }

        public ModifyCloudVendorAccountAKResponseBodyDataAuthModules setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ModifyCloudVendorAccountAKResponseBodyDataAuthModules setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public ModifyCloudVendorAccountAKResponseBodyDataAuthModules setModuleAssetType(String moduleAssetType) {
            this.moduleAssetType = moduleAssetType;
            return this;
        }
        public String getModuleAssetType() {
            return this.moduleAssetType;
        }

        public ModifyCloudVendorAccountAKResponseBodyDataAuthModules setModuleDisp(String moduleDisp) {
            this.moduleDisp = moduleDisp;
            return this;
        }
        public String getModuleDisp() {
            return this.moduleDisp;
        }

        public ModifyCloudVendorAccountAKResponseBodyDataAuthModules setModuleServiceStatus(Integer moduleServiceStatus) {
            this.moduleServiceStatus = moduleServiceStatus;
            return this;
        }
        public Integer getModuleServiceStatus() {
            return this.moduleServiceStatus;
        }

        public ModifyCloudVendorAccountAKResponseBodyDataAuthModules setModuleStatement(String moduleStatement) {
            this.moduleStatement = moduleStatement;
            return this;
        }
        public String getModuleStatement() {
            return this.moduleStatement;
        }

    }

    public static class ModifyCloudVendorAccountAKResponseBodyData extends TeaModel {
        /**
         * <p>The type of the account to which the AccessKey pair belongs. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong></li>
         * <li><strong>sub</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("AkType")
        public String akType;

        /**
         * <p>The unique ID of the AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>2158</p>
         */
        @NameInMap("AuthId")
        public Long authId;

        /**
         * <p>The modules that are associated with the AccessKey pair.</p>
         */
        @NameInMap("AuthModules")
        public java.util.List<ModifyCloudVendorAccountAKResponseBodyDataAuthModules> authModules;

        /**
         * <p>The error message of the AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>The IAM user is forbidden in the currently selected region</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE6SLd****</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>The service status of the AccessKey pair. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: being used.</li>
         * <li><strong>1</strong>: exception occurred.</li>
         * <li><strong>2</strong>: being validated.</li>
         * <li><strong>3</strong>: validation timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        /**
         * <p>The status of the AccessKey pair. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: enabled.</li>
         * <li><strong>1</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The cloud service provider. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong></li>
         * <li><strong>HUAWEICLOUD</strong></li>
         * <li><strong>Azure</strong></li>
         * <li><strong>AWS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static ModifyCloudVendorAccountAKResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudVendorAccountAKResponseBodyData self = new ModifyCloudVendorAccountAKResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyCloudVendorAccountAKResponseBodyData setAkType(String akType) {
            this.akType = akType;
            return this;
        }
        public String getAkType() {
            return this.akType;
        }

        public ModifyCloudVendorAccountAKResponseBodyData setAuthId(Long authId) {
            this.authId = authId;
            return this;
        }
        public Long getAuthId() {
            return this.authId;
        }

        public ModifyCloudVendorAccountAKResponseBodyData setAuthModules(java.util.List<ModifyCloudVendorAccountAKResponseBodyDataAuthModules> authModules) {
            this.authModules = authModules;
            return this;
        }
        public java.util.List<ModifyCloudVendorAccountAKResponseBodyDataAuthModules> getAuthModules() {
            return this.authModules;
        }

        public ModifyCloudVendorAccountAKResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ModifyCloudVendorAccountAKResponseBodyData setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public ModifyCloudVendorAccountAKResponseBodyData setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public ModifyCloudVendorAccountAKResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ModifyCloudVendorAccountAKResponseBodyData setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
