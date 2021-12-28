// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstancesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceInstances")
    public java.util.List<ListServiceInstancesResponseBodyServiceInstances> serviceInstances;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListServiceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesResponseBody self = new ListServiceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstancesResponseBody setServiceInstances(java.util.List<ListServiceInstancesResponseBodyServiceInstances> serviceInstances) {
        this.serviceInstances = serviceInstances;
        return this;
    }
    public java.util.List<ListServiceInstancesResponseBodyServiceInstances> getServiceInstances() {
        return this.serviceInstances;
    }

    public ListServiceInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos extends TeaModel {
        @NameInMap("Image")
        public String image;

        @NameInMap("Locale")
        public String locale;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShortDescription")
        public String shortDescription;

        public static ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos self = new ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

    public static class ListServiceInstancesResponseBodyServiceInstancesService extends TeaModel {
        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceInfos")
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> serviceInfos;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("Version")
        public String version;

        public static ListServiceInstancesResponseBodyServiceInstancesService build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstancesService self = new ListServiceInstancesResponseBodyServiceInstancesService();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceInfos(java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListServiceInstancesResponseBodyServiceInstances extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EnableInstanceOps")
        public Boolean enableInstanceOps;

        @NameInMap("OperatedServiceInstanceId")
        public String operatedServiceInstanceId;

        @NameInMap("OperationEndTime")
        public String operationEndTime;

        @NameInMap("OperationStartTime")
        public String operationStartTime;

        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("Resources")
        public String resources;

        @NameInMap("Service")
        public ListServiceInstancesResponseBodyServiceInstancesService service;

        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusDetail")
        public String statusDetail;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListServiceInstancesResponseBodyServiceInstances build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstances self = new ListServiceInstancesResponseBodyServiceInstances();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setEnableInstanceOps(Boolean enableInstanceOps) {
            this.enableInstanceOps = enableInstanceOps;
            return this;
        }
        public Boolean getEnableInstanceOps() {
            return this.enableInstanceOps;
        }

        public ListServiceInstancesResponseBodyServiceInstances setOperatedServiceInstanceId(String operatedServiceInstanceId) {
            this.operatedServiceInstanceId = operatedServiceInstanceId;
            return this;
        }
        public String getOperatedServiceInstanceId() {
            return this.operatedServiceInstanceId;
        }

        public ListServiceInstancesResponseBodyServiceInstances setOperationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setOperationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }
        public String getOperationStartTime() {
            return this.operationStartTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListServiceInstancesResponseBodyServiceInstances setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListServiceInstancesResponseBodyServiceInstances setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ListServiceInstancesResponseBodyServiceInstances setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public ListServiceInstancesResponseBodyServiceInstances setService(ListServiceInstancesResponseBodyServiceInstancesService service) {
            this.service = service;
            return this;
        }
        public ListServiceInstancesResponseBodyServiceInstancesService getService() {
            return this.service;
        }

        public ListServiceInstancesResponseBodyServiceInstances setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public ListServiceInstancesResponseBodyServiceInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstancesResponseBodyServiceInstances setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public ListServiceInstancesResponseBodyServiceInstances setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListServiceInstancesResponseBodyServiceInstances setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
