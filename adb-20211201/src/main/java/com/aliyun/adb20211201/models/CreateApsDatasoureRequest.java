// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsDatasoureRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-xxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The information about the Databricks data source.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DatabricksInfo")
    public CreateApsDatasoureRequestDatabricksInfo databricksInfo;

    /**
     * <p>The description of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("DatasourceDescription")
    public String datasourceDescription;

    /**
     * <p>The name of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-******</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The type of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KAFKA</p>
     */
    @NameInMap("DatasourceType")
    public String datasourceType;

    /**
     * <p>The information about the Hive data source.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("HiveInfo")
    public CreateApsDatasoureRequestHiveInfo hiveInfo;

    /**
     * <p>The information about the source Apache Kafka instance.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("KafkaInfo")
    public CreateApsDatasoureRequestKafkaInfo kafkaInfo;

    /**
     * <p>The mode.</p>
     * 
     * <strong>example:</strong>
     * <p>ALI_CLOUD_INSTANCE</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The information about the source PolarDB for MySQL cluster.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PolarDBMysqlInfo")
    public CreateApsDatasoureRequestPolarDBMysqlInfo polarDBMysqlInfo;

    /**
     * <p>The information about the source PolarDB-X instance.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PolarDBXInfo")
    public CreateApsDatasoureRequestPolarDBXInfo polarDBXInfo;

    /**
     * <p>The information about the source ApsaraDB RDS for MySQL instance.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RdsMysqlInfo")
    public CreateApsDatasoureRequestRdsMysqlInfo rdsMysqlInfo;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the source Simple Log Service (SLS) instance or cluster.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("SlsInfo")
    public CreateApsDatasoureRequestSlsInfo slsInfo;

    public static CreateApsDatasoureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsDatasoureRequest self = new CreateApsDatasoureRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsDatasoureRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsDatasoureRequest setDatabricksInfo(CreateApsDatasoureRequestDatabricksInfo databricksInfo) {
        this.databricksInfo = databricksInfo;
        return this;
    }
    public CreateApsDatasoureRequestDatabricksInfo getDatabricksInfo() {
        return this.databricksInfo;
    }

    public CreateApsDatasoureRequest setDatasourceDescription(String datasourceDescription) {
        this.datasourceDescription = datasourceDescription;
        return this;
    }
    public String getDatasourceDescription() {
        return this.datasourceDescription;
    }

    public CreateApsDatasoureRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public CreateApsDatasoureRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public CreateApsDatasoureRequest setHiveInfo(CreateApsDatasoureRequestHiveInfo hiveInfo) {
        this.hiveInfo = hiveInfo;
        return this;
    }
    public CreateApsDatasoureRequestHiveInfo getHiveInfo() {
        return this.hiveInfo;
    }

    public CreateApsDatasoureRequest setKafkaInfo(CreateApsDatasoureRequestKafkaInfo kafkaInfo) {
        this.kafkaInfo = kafkaInfo;
        return this;
    }
    public CreateApsDatasoureRequestKafkaInfo getKafkaInfo() {
        return this.kafkaInfo;
    }

    public CreateApsDatasoureRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateApsDatasoureRequest setPolarDBMysqlInfo(CreateApsDatasoureRequestPolarDBMysqlInfo polarDBMysqlInfo) {
        this.polarDBMysqlInfo = polarDBMysqlInfo;
        return this;
    }
    public CreateApsDatasoureRequestPolarDBMysqlInfo getPolarDBMysqlInfo() {
        return this.polarDBMysqlInfo;
    }

    public CreateApsDatasoureRequest setPolarDBXInfo(CreateApsDatasoureRequestPolarDBXInfo polarDBXInfo) {
        this.polarDBXInfo = polarDBXInfo;
        return this;
    }
    public CreateApsDatasoureRequestPolarDBXInfo getPolarDBXInfo() {
        return this.polarDBXInfo;
    }

    public CreateApsDatasoureRequest setRdsMysqlInfo(CreateApsDatasoureRequestRdsMysqlInfo rdsMysqlInfo) {
        this.rdsMysqlInfo = rdsMysqlInfo;
        return this;
    }
    public CreateApsDatasoureRequestRdsMysqlInfo getRdsMysqlInfo() {
        return this.rdsMysqlInfo;
    }

    public CreateApsDatasoureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsDatasoureRequest setSlsInfo(CreateApsDatasoureRequestSlsInfo slsInfo) {
        this.slsInfo = slsInfo;
        return this;
    }
    public CreateApsDatasoureRequestSlsInfo getSlsInfo() {
        return this.slsInfo;
    }

    public static class CreateApsDatasoureRequestDatabricksInfo extends TeaModel {
        /**
         * <p>The token that is used to access Databricks.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>The URL of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("WorkspaceURL")
        public String workspaceURL;

        public static CreateApsDatasoureRequestDatabricksInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateApsDatasoureRequestDatabricksInfo self = new CreateApsDatasoureRequestDatabricksInfo();
            return TeaModel.build(map, self);
        }

        public CreateApsDatasoureRequestDatabricksInfo setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public CreateApsDatasoureRequestDatabricksInfo setWorkspaceURL(String workspaceURL) {
            this.workspaceURL = workspaceURL;
            return this;
        }
        public String getWorkspaceURL() {
            return this.workspaceURL;
        }

    }

    public static class CreateApsDatasoureRequestHiveInfo extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The configuration of the host.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("HostConfig")
        public String hostConfig;

        /**
         * <p>The URL of the Hive Metastore.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("MetaStoreUri")
        public String metaStoreUri;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf*******h</p>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1*****k</p>
         */
        @NameInMap("Vswitch")
        public String vswitch;

        public static CreateApsDatasoureRequestHiveInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateApsDatasoureRequestHiveInfo self = new CreateApsDatasoureRequestHiveInfo();
            return TeaModel.build(map, self);
        }

        public CreateApsDatasoureRequestHiveInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateApsDatasoureRequestHiveInfo setHostConfig(String hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public String getHostConfig() {
            return this.hostConfig;
        }

        public CreateApsDatasoureRequestHiveInfo setMetaStoreUri(String metaStoreUri) {
            this.metaStoreUri = metaStoreUri;
            return this;
        }
        public String getMetaStoreUri() {
            return this.metaStoreUri;
        }

        public CreateApsDatasoureRequestHiveInfo setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public CreateApsDatasoureRequestHiveInfo setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

    public static class CreateApsDatasoureRequestKafkaInfo extends TeaModel {
        /**
         * <p>The ID of the Apache Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("KafkaClusterId")
        public String kafkaClusterId;

        /**
         * <p>The topic of the Apache Kafka instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("KafkaTopic")
        public String kafkaTopic;

        public static CreateApsDatasoureRequestKafkaInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateApsDatasoureRequestKafkaInfo self = new CreateApsDatasoureRequestKafkaInfo();
            return TeaModel.build(map, self);
        }

        public CreateApsDatasoureRequestKafkaInfo setKafkaClusterId(String kafkaClusterId) {
            this.kafkaClusterId = kafkaClusterId;
            return this;
        }
        public String getKafkaClusterId() {
            return this.kafkaClusterId;
        }

        public CreateApsDatasoureRequestKafkaInfo setKafkaTopic(String kafkaTopic) {
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        public String getKafkaTopic() {
            return this.kafkaTopic;
        }

    }

    public static class CreateApsDatasoureRequestPolarDBMysqlInfo extends TeaModel {
        /**
         * <p>Specifies whether the data source is a cross-account resource. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Across")
        public Boolean across;

        /**
         * <p>The name of the cross-account role.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        @NameInMap("AcrossRole")
        public String acrossRole;

        /**
         * <p>The cross-account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789*</p>
         */
        @NameInMap("AcrossUid")
        public String acrossUid;

        /**
         * <p>The URL used to connect to the custom ApsaraDB RDS for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp*********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-******</p>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The username used to access the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-user-name</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateApsDatasoureRequestPolarDBMysqlInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateApsDatasoureRequestPolarDBMysqlInfo self = new CreateApsDatasoureRequestPolarDBMysqlInfo();
            return TeaModel.build(map, self);
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setAcross(Boolean across) {
            this.across = across;
            return this;
        }
        public Boolean getAcross() {
            return this.across;
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setAcrossRole(String acrossRole) {
            this.acrossRole = acrossRole;
            return this;
        }
        public String getAcrossRole() {
            return this.acrossRole;
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setAcrossUid(String acrossUid) {
            this.acrossUid = acrossUid;
            return this;
        }
        public String getAcrossUid() {
            return this.acrossUid;
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public CreateApsDatasoureRequestPolarDBMysqlInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateApsDatasoureRequestPolarDBXInfo extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateApsDatasoureRequestPolarDBXInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateApsDatasoureRequestPolarDBXInfo self = new CreateApsDatasoureRequestPolarDBXInfo();
            return TeaModel.build(map, self);
        }

        public CreateApsDatasoureRequestPolarDBXInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateApsDatasoureRequestRdsMysqlInfo extends TeaModel {
        /**
         * <p>The URL used to connect to the read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-xxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The password of the database account of the instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-******</p>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The name of the database account of the instance.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateApsDatasoureRequestRdsMysqlInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateApsDatasoureRequestRdsMysqlInfo self = new CreateApsDatasoureRequestRdsMysqlInfo();
            return TeaModel.build(map, self);
        }

        public CreateApsDatasoureRequestRdsMysqlInfo setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public CreateApsDatasoureRequestRdsMysqlInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateApsDatasoureRequestRdsMysqlInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateApsDatasoureRequestRdsMysqlInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateApsDatasoureRequestRdsMysqlInfo setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public CreateApsDatasoureRequestRdsMysqlInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateApsDatasoureRequestSlsInfo extends TeaModel {
        /**
         * <p>Specifies whether the data source is a cross-account resource.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Across")
        public Boolean across;

        /**
         * <p>The name of the cross-account role.</p>
         * 
         * <strong>example:</strong>
         * <p>yyy</p>
         */
        @NameInMap("AcrossRole")
        public String acrossRole;

        /**
         * <p>The cross-account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("AcrossUid")
        public String acrossUid;

        /**
         * <p>The SLS project.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The name of the SLS Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test-store</p>
         */
        @NameInMap("Store")
        public String store;

        public static CreateApsDatasoureRequestSlsInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateApsDatasoureRequestSlsInfo self = new CreateApsDatasoureRequestSlsInfo();
            return TeaModel.build(map, self);
        }

        public CreateApsDatasoureRequestSlsInfo setAcross(Boolean across) {
            this.across = across;
            return this;
        }
        public Boolean getAcross() {
            return this.across;
        }

        public CreateApsDatasoureRequestSlsInfo setAcrossRole(String acrossRole) {
            this.acrossRole = acrossRole;
            return this;
        }
        public String getAcrossRole() {
            return this.acrossRole;
        }

        public CreateApsDatasoureRequestSlsInfo setAcrossUid(String acrossUid) {
            this.acrossUid = acrossUid;
            return this;
        }
        public String getAcrossUid() {
            return this.acrossUid;
        }

        public CreateApsDatasoureRequestSlsInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateApsDatasoureRequestSlsInfo setSourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        public CreateApsDatasoureRequestSlsInfo setStore(String store) {
            this.store = store;
            return this;
        }
        public String getStore() {
            return this.store;
        }

    }

}
