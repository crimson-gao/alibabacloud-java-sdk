// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110;

import com.aliyun.tea.*;
import com.aliyun.ens20171110.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ens", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public AddBackendServersResponse addBackendServersWithOptions(AddBackendServersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddBackendServersShrinkRequest request = new AddBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackendServers", request.backendServersShrink);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBackendServers"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBackendServersResponse());
    }

    public AddBackendServersResponse addBackendServers(AddBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBackendServersWithOptions(request, runtime);
    }

    public AddDeviceInternetPortResponse addDeviceInternetPortWithOptions(AddDeviceInternetPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDeviceInternetPort"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDeviceInternetPortResponse());
    }

    public AddDeviceInternetPortResponse addDeviceInternetPort(AddDeviceInternetPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDeviceInternetPortWithOptions(request, runtime);
    }

    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstanceWithOptions(AddNetworkInterfaceToInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoStart", request.autoStart);
        query.put("InstanceId", request.instanceId);
        query.put("Networks", request.networks);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddNetworkInterfaceToInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddNetworkInterfaceToInstanceResponse());
    }

    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstance(AddNetworkInterfaceToInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addNetworkInterfaceToInstanceWithOptions(request, runtime);
    }

    public AllocateEipAddressResponse allocateEipAddressWithOptions(AllocateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Count", request.count);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("MinCount", request.minCount);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateEipAddress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateEipAddressResponse());
    }

    public AllocateEipAddressResponse allocateEipAddress(AllocateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateEipAddressWithOptions(request, runtime);
    }

    public AssociateEipAddressResponse associateEipAddressWithOptions(AssociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Eip", request.eip);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceIdInternetIp", request.instanceIdInternetIp);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateEipAddress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateEipAddressWithOptions(request, runtime);
    }

    public AssociateEnsEipAddressResponse associateEnsEipAddressWithOptions(AssociateEnsEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllocationId", request.allocationId);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceType", request.instanceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateEnsEipAddress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateEnsEipAddressResponse());
    }

    public AssociateEnsEipAddressResponse associateEnsEipAddress(AssociateEnsEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateEnsEipAddressWithOptions(request, runtime);
    }

    public AttachDiskResponse attachDiskWithOptions(AttachDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeleteWithInstance", request.deleteWithInstance);
        query.put("DiskId", request.diskId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDiskResponse());
    }

    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDiskWithOptions(request, runtime);
    }

    public AttachEnsInstancesResponse attachEnsInstancesWithOptions(AttachEnsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Scripts", request.scripts);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachEnsInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachEnsInstancesResponse());
    }

    public AttachEnsInstancesResponse attachEnsInstances(AttachEnsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachEnsInstancesWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroupWithOptions(AuthorizeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpProtocol", request.ipProtocol);
        query.put("Policy", request.policy);
        query.put("PortRange", request.portRange);
        query.put("Priority", request.priority);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("SourceCidrIp", request.sourceCidrIp);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeSecurityGroupResponse());
    }

    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressWithOptions(AuthorizeSecurityGroupEgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DestCidrIp", request.destCidrIp);
        query.put("IpProtocol", request.ipProtocol);
        query.put("Policy", request.policy);
        query.put("PortRange", request.portRange);
        query.put("Priority", request.priority);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeSecurityGroupEgress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeSecurityGroupEgressResponse());
    }

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeSecurityGroupEgressWithOptions(request, runtime);
    }

    public CheckQuotaResponse checkQuotaWithOptions(CheckQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AliUid", request.aliUid);
        query.put("GroupUuid", request.groupUuid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceAttribute)) {
            body.put("ResourceAttribute", request.resourceAttribute);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckQuota"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckQuotaResponse());
    }

    public CheckQuotaResponse checkQuota(CheckQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkQuotaWithOptions(request, runtime);
    }

    public ConfigureSecurityGroupPermissionsResponse configureSecurityGroupPermissionsWithOptions(ConfigureSecurityGroupPermissionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ConfigureSecurityGroupPermissionsShrinkRequest request = new ConfigureSecurityGroupPermissionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authorizePermissions)) {
            request.authorizePermissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authorizePermissions, "AuthorizePermissions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.revokePermissions)) {
            request.revokePermissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.revokePermissions, "RevokePermissions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizePermissions", request.authorizePermissionsShrink);
        query.put("RevokePermissions", request.revokePermissionsShrink);
        query.put("SecurityGroupId", request.securityGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSecurityGroupPermissions"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSecurityGroupPermissionsResponse());
    }

    public ConfigureSecurityGroupPermissionsResponse configureSecurityGroupPermissions(ConfigureSecurityGroupPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSecurityGroupPermissionsWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Template", request.template);
        query.put("Timeout", request.timeout);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public CreateDiskResponse createDiskWithOptions(CreateDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("Size", request.size);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiskResponse());
    }

    public CreateDiskResponse createDisk(CreateDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiskWithOptions(request, runtime);
    }

    public CreateDiskBuyOrderResponse createDiskBuyOrderWithOptions(CreateDiskBuyOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderDetails", request.orderDetails);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiskBuyOrder"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiskBuyOrderResponse());
    }

    public CreateDiskBuyOrderResponse createDiskBuyOrder(CreateDiskBuyOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiskBuyOrderWithOptions(request, runtime);
    }

    public CreateEPInstanceResponse createEPInstanceWithOptions(CreateEPInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceName", request.EPNInstanceName);
        query.put("EPNInstanceType", request.EPNInstanceType);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("NetworkingModel", request.networkingModel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEPInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEPInstanceResponse());
    }

    public CreateEPInstanceResponse createEPInstance(CreateEPInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEPInstanceWithOptions(request, runtime);
    }

    public CreateEipInstanceResponse createEipInstanceWithOptions(CreateEipInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Bandwidth", request.bandwidth);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("Isp", request.isp);
        query.put("Name", request.name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEipInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEipInstanceResponse());
    }

    public CreateEipInstanceResponse createEipInstance(CreateEipInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEipInstanceWithOptions(request, runtime);
    }

    public CreateEnsServiceResponse createEnsServiceWithOptions(CreateEnsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsServiceId", request.ensServiceId);
        query.put("OrderType", request.orderType);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnsService"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnsServiceResponse());
    }

    public CreateEnsServiceResponse createEnsService(CreateEnsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEnsServiceWithOptions(request, runtime);
    }

    public CreateEpnInstanceResponse createEpnInstanceWithOptions(CreateEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceName", request.EPNInstanceName);
        query.put("EPNInstanceType", request.EPNInstanceType);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("NetworkingModel", request.networkingModel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEpnInstanceResponse());
    }

    public CreateEpnInstanceResponse createEpnInstance(CreateEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEpnInstanceWithOptions(request, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeleteAfterImageUpload", request.deleteAfterImageUpload);
        query.put("ImageName", request.imageName);
        query.put("InstanceId", request.instanceId);
        query.put("product", request.product);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImage"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoRenew", request.autoRenew);
        query.put("AutoRenewPeriod", request.autoRenewPeriod);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("HostName", request.hostName);
        query.put("ImageId", request.imageId);
        query.put("InstanceName", request.instanceName);
        query.put("InstanceType", request.instanceType);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("IpType", request.ipType);
        query.put("KeyPairName", request.keyPairName);
        query.put("OwnerId", request.ownerId);
        query.put("Password", request.password);
        query.put("PaymentType", request.paymentType);
        query.put("Period", request.period);
        query.put("PrivateIpAddress", request.privateIpAddress);
        query.put("PublicIpIdentification", request.publicIpIdentification);
        query.put("Quantity", request.quantity);
        query.put("UniqueSuffix", request.uniqueSuffix);
        query.put("UserData", request.userData);
        query.put("VSwitchId", request.vSwitchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("KeyPairName", request.keyPairName);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKeyPair"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKeyPairResponse());
    }

    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("LoadBalancerName", request.loadBalancerName);
        query.put("LoadBalancerSpec", request.loadBalancerSpec);
        query.put("NetworkId", request.networkId);
        query.put("PayType", request.payType);
        query.put("VSwitchId", request.vSwitchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancer"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerResponse());
    }

    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListenerWithOptions(CreateLoadBalancerHTTPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("ForwardPort", request.forwardPort);
        query.put("HealthCheck", request.healthCheck);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckDomain", request.healthCheckDomain);
        query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckMethod", request.healthCheckMethod);
        query.put("HealthCheckTimeout", request.healthCheckTimeout);
        query.put("HealthCheckURI", request.healthCheckURI);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("IdleTimeout", request.idleTimeout);
        query.put("ListenerForward", request.listenerForward);
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("RequestTimeout", request.requestTimeout);
        query.put("Scheduler", request.scheduler);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        query.put("XForwardedFor", request.XForwardedFor);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerHTTPListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerHTTPListenerResponse());
    }

    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerHTTPListenerWithOptions(request, runtime);
    }

    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListenerWithOptions(CreateLoadBalancerHTTPSListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Cookie", request.cookie);
        query.put("CookieTimeout", request.cookieTimeout);
        query.put("Description", request.description);
        query.put("ForwardPort", request.forwardPort);
        query.put("HealthCheck", request.healthCheck);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckDomain", request.healthCheckDomain);
        query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckMethod", request.healthCheckMethod);
        query.put("HealthCheckTimeout", request.healthCheckTimeout);
        query.put("HealthCheckURI", request.healthCheckURI);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("IdleTimeout", request.idleTimeout);
        query.put("ListenerForward", request.listenerForward);
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("RequestTimeout", request.requestTimeout);
        query.put("Scheduler", request.scheduler);
        query.put("ServerCertificateId", request.serverCertificateId);
        query.put("StickySessionType", request.stickySessionType);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerHTTPSListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerHTTPSListenerResponse());
    }

    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerHTTPSListenerWithOptions(request, runtime);
    }

    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListenerWithOptions(CreateLoadBalancerTCPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackendServerPort", request.backendServerPort);
        query.put("Description", request.description);
        query.put("EipTransmit", request.eipTransmit);
        query.put("EstablishedTimeout", request.establishedTimeout);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        query.put("HealthCheckDomain", request.healthCheckDomain);
        query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckType", request.healthCheckType);
        query.put("HealthCheckURI", request.healthCheckURI);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("PersistenceTimeout", request.persistenceTimeout);
        query.put("Scheduler", request.scheduler);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerTCPListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerTCPListenerResponse());
    }

    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerTCPListenerWithOptions(request, runtime);
    }

    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListenerWithOptions(CreateLoadBalancerUDPListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackendServerPort", request.backendServerPort);
        query.put("Description", request.description);
        query.put("EipTransmit", request.eipTransmit);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        query.put("HealthCheckExp", request.healthCheckExp);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckReq", request.healthCheckReq);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("Scheduler", request.scheduler);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerUDPListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerUDPListenerResponse());
    }

    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerUDPListenerWithOptions(request, runtime);
    }

    public CreateNetworkResponse createNetworkWithOptions(CreateNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CidrBlock", request.cidrBlock);
        query.put("Description", request.description);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("NetworkName", request.networkName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetwork"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkResponse());
    }

    public CreateNetworkResponse createNetwork(CreateNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkWithOptions(request, runtime);
    }

    public CreateSecurityGroupResponse createSecurityGroupWithOptions(CreateSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("SecurityGroupName", request.securityGroupName);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityGroupResponse());
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSecurityGroupWithOptions(request, runtime);
    }

    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CidrBlock", request.cidrBlock);
        query.put("Description", request.description);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("NetworkId", request.networkId);
        query.put("VSwitchName", request.vSwitchName);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVSwitch"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVSwitchResponse());
    }

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    public CreateVmAndSaveStockResponse createVmAndSaveStockWithOptions(CreateVmAndSaveStockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AliUid", request.aliUid);
        query.put("GroupUuid", request.groupUuid);
        query.put("Tenant", request.tenant);
        query.put("WorkloadUuid", request.workloadUuid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceAttribute)) {
            body.put("ResourceAttribute", request.resourceAttribute);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVmAndSaveStock"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVmAndSaveStockResponse());
    }

    public CreateVmAndSaveStockResponse createVmAndSaveStock(CreateVmAndSaveStockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVmAndSaveStockWithOptions(request, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("Timeout", request.timeout);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    public DeleteDeviceInternetPortResponse deleteDeviceInternetPortWithOptions(DeleteDeviceInternetPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceInternetPort"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceInternetPortResponse());
    }

    public DeleteDeviceInternetPortResponse deleteDeviceInternetPort(DeleteDeviceInternetPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceInternetPortWithOptions(request, runtime);
    }

    public DeleteEpnInstanceResponse deleteEpnInstanceWithOptions(DeleteEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEpnInstanceResponse());
    }

    public DeleteEpnInstanceResponse deleteEpnInstance(DeleteEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEpnInstanceWithOptions(request, runtime);
    }

    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("KeyPairName", request.keyPairName);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeyPairs"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeyPairsResponse());
    }

    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListenerWithOptions(DeleteLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLoadBalancerListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoadBalancerListenerResponse());
    }

    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoadBalancerListenerWithOptions(request, runtime);
    }

    public DeleteNetworkResponse deleteNetworkWithOptions(DeleteNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NetworkId", request.networkId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetwork"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkResponse());
    }

    public DeleteNetworkResponse deleteNetwork(DeleteNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkWithOptions(request, runtime);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VSwitchId", request.vSwitchId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVSwitch"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVSwitchResponse());
    }

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    public DeleteVmResponse deleteVmWithOptions(DeleteVmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AliUid", request.aliUid);
        query.put("WorkloadUuid", request.workloadUuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVm"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVmResponse());
    }

    public DeleteVmResponse deleteVm(DeleteVmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVmWithOptions(request, runtime);
    }

    public DescribeApplicationResponse describeApplicationWithOptions(DescribeApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("AppVersions", request.appVersions);
        query.put("Level", request.level);
        query.put("OutDetailStatParams", request.outDetailStatParams);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationResponse());
    }

    public DescribeApplicationResponse describeApplication(DescribeApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApplicationWithOptions(request, runtime);
    }

    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummaryWithOptions(DescribeApplicationResourceSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Level", request.level);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationResourceSummary"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationResourceSummaryResponse());
    }

    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummary(DescribeApplicationResourceSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApplicationResourceSummaryWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableResource"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfoWithOptions(DescribeAvailableResourceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableResourceInfo"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourceInfoResponse());
    }

    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfo(DescribeAvailableResourceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceInfoWithOptions(request, runtime);
    }

    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeTypeWithOptions(DescribeBandWithdChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandWithdChargeType"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandWithdChargeTypeResponse());
    }

    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeType(DescribeBandWithdChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandWithdChargeTypeWithOptions(request, runtime);
    }

    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeTypeWithOptions(DescribeBandwitdhByInternetChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("Isp", request.isp);
        query.put("StartTime", request.startTime);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandwitdhByInternetChargeType"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandwitdhByInternetChargeTypeResponse());
    }

    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeType(DescribeBandwitdhByInternetChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

    public DescribeCloudDiskAvailableResourceInfoResponse describeCloudDiskAvailableResourceInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudDiskAvailableResourceInfo"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudDiskAvailableResourceInfoResponse());
    }

    public DescribeCloudDiskAvailableResourceInfoResponse describeCloudDiskAvailableResourceInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudDiskAvailableResourceInfoWithOptions(runtime);
    }

    public DescribeCloudDiskTypesResponse describeCloudDiskTypesWithOptions(DescribeCloudDiskTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudDiskTypes"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudDiskTypesResponse());
    }

    public DescribeCloudDiskTypesResponse describeCloudDiskTypes(DescribeCloudDiskTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudDiskTypesWithOptions(request, runtime);
    }

    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResultWithOptions(DescribeCreatePrePaidInstanceResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCreatePrePaidInstanceResult"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCreatePrePaidInstanceResultResponse());
    }

    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResult(DescribeCreatePrePaidInstanceResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCreatePrePaidInstanceResultWithOptions(request, runtime);
    }

    public DescribeDataDistResultResponse describeDataDistResultWithOptions(DescribeDataDistResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("DataNames", request.dataNames);
        query.put("DataVersions", request.dataVersions);
        query.put("InstanceIds", request.instanceIds);
        query.put("MaxDate", request.maxDate);
        query.put("MinDate", request.minDate);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataDistResult"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataDistResultResponse());
    }

    public DescribeDataDistResultResponse describeDataDistResult(DescribeDataDistResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataDistResultWithOptions(request, runtime);
    }

    public DescribeDataDownloadURLResponse describeDataDownloadURLWithOptions(DescribeDataDownloadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataDownloadURL"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataDownloadURLResponse());
    }

    public DescribeDataDownloadURLResponse describeDataDownloadURL(DescribeDataDownloadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataDownloadURLWithOptions(request, runtime);
    }

    public DescribeDataPushResultResponse describeDataPushResultWithOptions(DescribeDataPushResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("DataNames", request.dataNames);
        query.put("DataVersions", request.dataVersions);
        query.put("MaxDate", request.maxDate);
        query.put("MinDate", request.minDate);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionIds", request.regionIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataPushResult"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataPushResultResponse());
    }

    public DescribeDataPushResultResponse describeDataPushResult(DescribeDataPushResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataPushResultWithOptions(request, runtime);
    }

    public DescribeDeviceServiceResponse describeDeviceServiceWithOptions(DescribeDeviceServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceService"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceServiceResponse());
    }

    public DescribeDeviceServiceResponse describeDeviceService(DescribeDeviceServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceServiceWithOptions(request, runtime);
    }

    public DescribeDisksResponse describeDisksWithOptions(DescribeDisksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("DiskChargeType", request.diskChargeType);
        query.put("DiskId", request.diskId);
        query.put("DiskIds", request.diskIds);
        query.put("DiskName", request.diskName);
        query.put("DiskType", request.diskType);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("EnsRegionIds", request.ensRegionIds);
        query.put("OrderByParams", request.orderByParams);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Status", request.status);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisks"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisksResponse());
    }

    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDisksWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Eips", request.eips);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEipAddresses"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEipAddressesResponse());
    }

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    public DescribeEnsEipAddressesResponse describeEnsEipAddressesWithOptions(DescribeEnsEipAddressesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllocationId", request.allocationId);
        query.put("AssociatedInstanceId", request.associatedInstanceId);
        query.put("AssociatedInstanceType", request.associatedInstanceType);
        query.put("EipAddress", request.eipAddress);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsEipAddresses"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsEipAddressesResponse());
    }

    public DescribeEnsEipAddressesResponse describeEnsEipAddresses(DescribeEnsEipAddressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsEipAddressesWithOptions(request, runtime);
    }

    public DescribeEnsNetDistrictResponse describeEnsNetDistrictWithOptions(DescribeEnsNetDistrictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NetDistrictCode", request.netDistrictCode);
        query.put("NetLevelCode", request.netLevelCode);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsNetDistrict"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsNetDistrictResponse());
    }

    public DescribeEnsNetDistrictResponse describeEnsNetDistrict(DescribeEnsNetDistrictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsNetDistrictWithOptions(request, runtime);
    }

    public DescribeEnsNetLevelResponse describeEnsNetLevelWithOptions(DescribeEnsNetLevelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsNetLevel"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsNetLevelResponse());
    }

    public DescribeEnsNetLevelResponse describeEnsNetLevel(DescribeEnsNetLevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsNetLevelWithOptions(request, runtime);
    }

    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrictWithOptions(DescribeEnsNetSaleDistrictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NetDistrictCode", request.netDistrictCode);
        query.put("NetLevelCode", request.netLevelCode);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsNetSaleDistrict"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsNetSaleDistrictResponse());
    }

    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrict(DescribeEnsNetSaleDistrictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsNetSaleDistrictWithOptions(request, runtime);
    }

    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6InfoWithOptions(DescribeEnsRegionIdIpv6InfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsRegionIdIpv6Info"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsRegionIdIpv6InfoResponse());
    }

    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6Info(DescribeEnsRegionIdIpv6InfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsRegionIdIpv6InfoWithOptions(request, runtime);
    }

    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResourceWithOptions(DescribeEnsRegionIdResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("Isp", request.isp);
        query.put("OrderByParams", request.orderByParams);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsRegionIdResource"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsRegionIdResourceResponse());
    }

    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResource(DescribeEnsRegionIdResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsRegionIdResourceWithOptions(request, runtime);
    }

    public DescribeEnsRegionsResponse describeEnsRegionsWithOptions(DescribeEnsRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsRegions"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsRegionsResponse());
    }

    public DescribeEnsRegionsResponse describeEnsRegions(DescribeEnsRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsRegionsWithOptions(request, runtime);
    }

    public DescribeEnsResourceUsageResponse describeEnsResourceUsageWithOptions(DescribeEnsResourceUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsResourceUsage"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsResourceUsageResponse());
    }

    public DescribeEnsResourceUsageResponse describeEnsResourceUsage(DescribeEnsResourceUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEnsResourceUsageWithOptions(request, runtime);
    }

    public DescribeEpnBandWidthDataResponse describeEpnBandWidthDataWithOptions(DescribeEpnBandWidthDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        query.put("EndTime", request.endTime);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceId", request.instanceId);
        query.put("Isp", request.isp);
        query.put("NetworkingModel", request.networkingModel);
        query.put("Period", request.period);
        query.put("StartTime", request.startTime);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnBandWidthData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnBandWidthDataResponse());
    }

    public DescribeEpnBandWidthDataResponse describeEpnBandWidthData(DescribeEpnBandWidthDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnBandWidthDataWithOptions(request, runtime);
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeTypeWithOptions(DescribeEpnBandwitdhByInternetChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("Isp", request.isp);
        query.put("NetworkingModel", request.networkingModel);
        query.put("StartTime", request.startTime);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnBandwitdhByInternetChargeType"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnBandwitdhByInternetChargeTypeResponse());
    }

    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeType(DescribeEpnBandwitdhByInternetChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttributeWithOptions(DescribeEpnInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnInstanceAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnInstanceAttributeResponse());
    }

    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttribute(DescribeEpnInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeEpnInstancesResponse describeEpnInstancesWithOptions(DescribeEpnInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        query.put("EPNInstanceName", request.EPNInstanceName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnInstancesResponse());
    }

    public DescribeEpnInstancesResponse describeEpnInstances(DescribeEpnInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnInstancesWithOptions(request, runtime);
    }

    public DescribeEpnMeasurementDataResponse describeEpnMeasurementDataWithOptions(DescribeEpnMeasurementDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndDate", request.endDate);
        query.put("StartDate", request.startDate);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnMeasurementData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnMeasurementDataResponse());
    }

    public DescribeEpnMeasurementDataResponse describeEpnMeasurementData(DescribeEpnMeasurementDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEpnMeasurementDataWithOptions(request, runtime);
    }

    public DescribeExportImageInfoResponse describeExportImageInfoWithOptions(DescribeExportImageInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ImageId", request.imageId);
        query.put("ImageName", request.imageName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExportImageInfo"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExportImageInfoResponse());
    }

    public DescribeExportImageInfoResponse describeExportImageInfo(DescribeExportImageInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExportImageInfoWithOptions(request, runtime);
    }

    public DescribeExportImageStatusResponse describeExportImageStatusWithOptions(DescribeExportImageStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ImageId", request.imageId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExportImageStatus"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExportImageStatusResponse());
    }

    public DescribeExportImageStatusResponse describeExportImageStatus(DescribeExportImageStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExportImageStatusWithOptions(request, runtime);
    }

    public DescribeImageInfosResponse describeImageInfosWithOptions(DescribeImageInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OsType", request.osType);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageInfos"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageInfosResponse());
    }

    public DescribeImageInfosResponse describeImageInfos(DescribeImageInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageInfosWithOptions(request, runtime);
    }

    public DescribeImageSharePermissionResponse describeImageSharePermissionWithOptions(DescribeImageSharePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AliyunId", request.aliyunId);
        query.put("ImageId", request.imageId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageSharePermission"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageSharePermissionResponse());
    }

    public DescribeImageSharePermissionResponse describeImageSharePermission(DescribeImageSharePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageSharePermissionWithOptions(request, runtime);
    }

    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("ImageId", request.imageId);
        query.put("ImageName", request.imageName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Status", request.status);
        query.put("Version", request.version);
        query.put("product", request.product);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImages"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceIds", request.instanceIds);
        query.put("OwnerId", request.ownerId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAutoRenewAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorDataWithOptions(DescribeInstanceMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("InstanceId", request.instanceId);
        query.put("Period", request.period);
        query.put("StartTime", request.startTime);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceMonitorData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceMonitorDataResponse());
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMonitorDataWithOptions(request, runtime);
    }

    public DescribeInstanceSpecResponse describeInstanceSpecWithOptions(DescribeInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSpec"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSpecResponse());
    }

    public DescribeInstanceSpecResponse describeInstanceSpec(DescribeInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSpecWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTypes"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTypesResponse());
    }

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrlWithOptions(DescribeInstanceVncUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceVncUrl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceVncUrlResponse());
    }

    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceVncUrlWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("EnsRegionIds", request.ensRegionIds);
        query.put("EnsServiceId", request.ensServiceId);
        query.put("ImageId", request.imageId);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceIds", request.instanceIds);
        query.put("InstanceName", request.instanceName);
        query.put("InstanceResourceType", request.instanceResourceType);
        query.put("NetworkId", request.networkId);
        query.put("OrderByParams", request.orderByParams);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SearchKey", request.searchKey);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("Status", request.status);
        query.put("VSwitchId", request.vSwitchId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("KeyPairName", request.keyPairName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKeyPairs"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKeyPairsResponse());
    }

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeWithOptions(DescribeLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerAttributeResponse());
    }

    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeWithOptions(DescribeLoadBalancerHTTPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerHTTPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerHTTPListenerAttributeResponse());
    }

    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeWithOptions(DescribeLoadBalancerHTTPSListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerHTTPSListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerHTTPSListenerAttributeResponse());
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeWithOptions(DescribeLoadBalancerTCPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerTCPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerTCPListenerAttributeResponse());
    }

    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttributeWithOptions(DescribeLoadBalancerUDPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerUDPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerUDPListenerAttributeResponse());
    }

    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    public DescribeLoadBalancersResponse describeLoadBalancersWithOptions(DescribeLoadBalancersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancers"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancersResponse());
    }

    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadBalancersWithOptions(request, runtime);
    }

    public DescribeMeasurementDataResponse describeMeasurementDataWithOptions(DescribeMeasurementDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndDate", request.endDate);
        query.put("StartDate", request.startDate);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeasurementData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeasurementDataResponse());
    }

    public DescribeMeasurementDataResponse describeMeasurementData(DescribeMeasurementDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeasurementDataWithOptions(request, runtime);
    }

    public DescribeNetworkAttributeResponse describeNetworkAttributeWithOptions(DescribeNetworkAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NetworkId", request.networkId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkAttributeResponse());
    }

    public DescribeNetworkAttributeResponse describeNetworkAttribute(DescribeNetworkAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkAttributeWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfacesWithOptions(DescribeNetworkInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceId", request.instanceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("PrimaryIpAddress", request.primaryIpAddress);
        query.put("VSwitchId", request.vSwitchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkInterfaces"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkInterfacesResponse());
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkInterfacesWithOptions(request, runtime);
    }

    public DescribeNetworksResponse describeNetworksWithOptions(DescribeNetworksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("NetworkId", request.networkId);
        query.put("NetworkName", request.networkName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworks"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworksResponse());
    }

    public DescribeNetworksResponse describeNetworks(DescribeNetworksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworksWithOptions(request, runtime);
    }

    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStockWithOptions(DescribePrePaidInstanceStockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataDiskSize", request.dataDiskSize);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceSpec", request.instanceSpec);
        query.put("SystemDiskSize", request.systemDiskSize);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrePaidInstanceStock"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrePaidInstanceStockResponse());
    }

    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStock(DescribePrePaidInstanceStockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePrePaidInstanceStockWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceType", request.instanceType);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("Period", request.period);
        query.put("Quantity", request.quantity);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrice"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeRegionIspsResponse describeRegionIspsWithOptions(DescribeRegionIspsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegionIsps"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionIspsResponse());
    }

    public DescribeRegionIspsResponse describeRegionIsps(DescribeRegionIspsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionIspsWithOptions(request, runtime);
    }

    public DescribeReservedResourceResponse describeReservedResourceWithOptions(DescribeReservedResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReservedResource"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReservedResourceResponse());
    }

    public DescribeReservedResourceResponse describeReservedResource(DescribeReservedResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReservedResourceWithOptions(request, runtime);
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeWithOptions(DescribeSecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityGroupAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityGroupAttributeResponse());
    }

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("SecurityGroupName", request.securityGroupName);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityGroups"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityGroupsResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    public DescribeServcieScheduleResponse describeServcieScheduleWithOptions(DescribeServcieScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("PodConfigName", request.podConfigName);
        query.put("Uuid", request.uuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServcieSchedule"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServcieScheduleResponse());
    }

    public DescribeServcieScheduleResponse describeServcieSchedule(DescribeServcieScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServcieScheduleWithOptions(request, runtime);
    }

    public DescribeUserBandWidthDataResponse describeUserBandWidthDataWithOptions(DescribeUserBandWidthDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceId", request.instanceId);
        query.put("Isp", request.isp);
        query.put("Period", request.period);
        query.put("StartTime", request.startTime);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserBandWidthData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserBandWidthDataResponse());
    }

    public DescribeUserBandWidthDataResponse describeUserBandWidthData(DescribeUserBandWidthDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserBandWidthDataWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EnsRegionId", request.ensRegionId);
        query.put("NetworkId", request.networkId);
        query.put("OrderByParams", request.orderByParams);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("VSwitchId", request.vSwitchId);
        query.put("VSwitchName", request.vSwitchName);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVSwitches"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DetachDiskResponse detachDiskWithOptions(DetachDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DiskId", request.diskId);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDiskResponse());
    }

    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDiskWithOptions(request, runtime);
    }

    public DistApplicationDataResponse distApplicationDataWithOptions(DistApplicationDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("Data", request.data);
        query.put("DistStrategy", request.distStrategy);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DistApplicationData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DistApplicationDataResponse());
    }

    public DistApplicationDataResponse distApplicationData(DistApplicationDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.distApplicationDataWithOptions(request, runtime);
    }

    public ExportBillDetailDataResponse exportBillDetailDataWithOptions(ExportBillDetailDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndDate", request.endDate);
        query.put("StartDate", request.startDate);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportBillDetailData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportBillDetailDataResponse());
    }

    public ExportBillDetailDataResponse exportBillDetailData(ExportBillDetailDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportBillDetailDataWithOptions(request, runtime);
    }

    public ExportImageResponse exportImageWithOptions(ExportImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ImageId", request.imageId);
        query.put("OSSBucket", request.OSSBucket);
        query.put("OSSPrefix", request.OSSPrefix);
        query.put("OSSRegionId", request.OSSRegionId);
        query.put("RoleName", request.roleName);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportImage"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportImageResponse());
    }

    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

    public ExportMeasurementDataResponse exportMeasurementDataWithOptions(ExportMeasurementDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndDate", request.endDate);
        query.put("StartDate", request.startDate);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportMeasurementData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportMeasurementDataResponse());
    }

    public ExportMeasurementDataResponse exportMeasurementData(ExportMeasurementDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportMeasurementDataWithOptions(request, runtime);
    }

    public GetDeviceInternetPortResponse getDeviceInternetPortWithOptions(GetDeviceInternetPortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceInternetPort"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceInternetPortResponse());
    }

    public GetDeviceInternetPortResponse getDeviceInternetPort(GetDeviceInternetPortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceInternetPortWithOptions(request, runtime);
    }

    public GetVmListResponse getVmListWithOptions(GetVmListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVmList"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVmListResponse());
    }

    public GetVmListResponse getVmList(GetVmListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVmListWithOptions(request, runtime);
    }

    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("KeyPairName", request.keyPairName);
        query.put("PublicKeyBody", request.publicKeyBody);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportKeyPair"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportKeyPairResponse());
    }

    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstanceWithOptions(JoinPublicIpsToEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        query.put("InstanceInfos", request.instanceInfos);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinPublicIpsToEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinPublicIpsToEpnInstanceResponse());
    }

    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinPublicIpsToEpnInstanceWithOptions(request, runtime);
    }

    public JoinSecurityGroupResponse joinSecurityGroupWithOptions(JoinSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinSecurityGroupResponse());
    }

    public JoinSecurityGroupResponse joinSecurityGroup(JoinSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinSecurityGroupWithOptions(request, runtime);
    }

    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstanceWithOptions(JoinVSwitchesToEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        query.put("VSwitchesInfo", request.vSwitchesInfo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinVSwitchesToEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinVSwitchesToEpnInstanceResponse());
    }

    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinVSwitchesToEpnInstanceWithOptions(request, runtime);
    }

    public LeaveSecurityGroupResponse leaveSecurityGroupWithOptions(LeaveSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LeaveSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LeaveSecurityGroupResponse());
    }

    public LeaveSecurityGroupResponse leaveSecurityGroup(LeaveSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.leaveSecurityGroupWithOptions(request, runtime);
    }

    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppVersions", request.appVersions);
        query.put("ClusterNames", request.clusterNames);
        query.put("Level", request.level);
        query.put("MaxDate", request.maxDate);
        query.put("MinDate", request.minDate);
        query.put("OutAppInfoParams", request.outAppInfoParams);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsResponse());
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    public MigrateVmResponse migrateVmWithOptions(MigrateVmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupUuid", request.groupUuid);
        query.put("InstanceIds", request.instanceIds);
        query.put("Tenant", request.tenant);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("Instances", request.instances);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateVm"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateVmResponse());
    }

    public MigrateVmResponse migrateVm(MigrateVmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateVmWithOptions(request, runtime);
    }

    public ModifyEnsEipAddressAttributeResponse modifyEnsEipAddressAttributeWithOptions(ModifyEnsEipAddressAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllocationId", request.allocationId);
        query.put("Bandwidth", request.bandwidth);
        query.put("Description", request.description);
        query.put("Name", request.name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEnsEipAddressAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEnsEipAddressAttributeResponse());
    }

    public ModifyEnsEipAddressAttributeResponse modifyEnsEipAddressAttribute(ModifyEnsEipAddressAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEnsEipAddressAttributeWithOptions(request, runtime);
    }

    public ModifyEpnInstanceResponse modifyEpnInstanceWithOptions(ModifyEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        query.put("EPNInstanceName", request.EPNInstanceName);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("NetworkingModel", request.networkingModel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEpnInstanceResponse());
    }

    public ModifyEpnInstanceResponse modifyEpnInstance(ModifyEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEpnInstanceWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ImageId", request.imageId);
        query.put("ImageName", request.imageName);
        query.put("Version", request.version);
        query.put("product", request.product);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageAttributeResponse());
    }

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermissionWithOptions(ModifyImageSharePermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddAccounts", request.addAccounts);
        query.put("ImageId", request.imageId);
        query.put("RemoveAccounts", request.removeAccounts);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageSharePermission"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageSharePermissionResponse());
    }

    public ModifyImageSharePermissionResponse modifyImageSharePermission(ModifyImageSharePermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageSharePermissionWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("InstanceName", request.instanceName);
        query.put("Password", request.password);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttributeWithOptions(ModifyInstanceAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoRenew", request.autoRenew);
        query.put("Duration", request.duration);
        query.put("InstanceIds", request.instanceIds);
        query.put("OwnerId", request.ownerId);
        query.put("RenewalStatus", request.renewalStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAutoRenewAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAutoRenewAttributeResponse());
    }

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyLoadBalancerAttributeResponse modifyLoadBalancerAttributeWithOptions(ModifyLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("LoadBalancerName", request.loadBalancerName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLoadBalancerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLoadBalancerAttributeResponse());
    }

    public ModifyLoadBalancerAttributeResponse modifyLoadBalancerAttribute(ModifyLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLoadBalancerAttributeWithOptions(request, runtime);
    }

    public ModifyNetworkAttributeResponse modifyNetworkAttributeWithOptions(ModifyNetworkAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("NetworkId", request.networkId);
        query.put("NetworkName", request.networkName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkAttributeResponse());
    }

    public ModifyNetworkAttributeResponse modifyNetworkAttribute(ModifyNetworkAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkAttributeWithOptions(request, runtime);
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttributeWithOptions(ModifySecurityGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("SecurityGroupName", request.securityGroupName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityGroupAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityGroupAttributeResponse());
    }

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupAttributeWithOptions(request, runtime);
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttributeWithOptions(ModifyVSwitchAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("VSwitchId", request.vSwitchId);
        query.put("VSwitchName", request.vSwitchName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVSwitchAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVSwitchAttributeResponse());
    }

    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

    public PreCreateEnsServiceResponse preCreateEnsServiceWithOptions(PreCreateEnsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BandwidthType", request.bandwidthType);
        query.put("BuyResourcesDetail", request.buyResourcesDetail);
        query.put("DataDiskSize", request.dataDiskSize);
        query.put("EnsServiceName", request.ensServiceName);
        query.put("ImageId", request.imageId);
        query.put("InstanceBandwithdLimit", request.instanceBandwithdLimit);
        query.put("InstanceSpec", request.instanceSpec);
        query.put("KeyPairName", request.keyPairName);
        query.put("NetLevel", request.netLevel);
        query.put("Password", request.password);
        query.put("SchedulingPriceStrategy", request.schedulingPriceStrategy);
        query.put("SchedulingStrategy", request.schedulingStrategy);
        query.put("SystemDiskSize", request.systemDiskSize);
        query.put("UserData", request.userData);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreCreateEnsService"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreCreateEnsServiceResponse());
    }

    public PreCreateEnsServiceResponse preCreateEnsService(PreCreateEnsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.preCreateEnsServiceWithOptions(request, runtime);
    }

    public PushApplicationDataResponse pushApplicationDataWithOptions(PushApplicationDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("Data", request.data);
        query.put("PushStrategy", request.pushStrategy);
        query.put("Timeout", request.timeout);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushApplicationData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushApplicationDataResponse());
    }

    public PushApplicationDataResponse pushApplicationData(PushApplicationDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushApplicationDataWithOptions(request, runtime);
    }

    public ReInitDiskResponse reInitDiskWithOptions(ReInitDiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DiskId", request.diskId);
        query.put("ImageId", request.imageId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReInitDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReInitDiskResponse());
    }

    public ReInitDiskResponse reInitDisk(ReInitDiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reInitDiskWithOptions(request, runtime);
    }

    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ForceStop", request.forceStop);
        query.put("InstanceId", request.instanceId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootInstanceResponse());
    }

    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    public ReleaseEipAddressResponse releaseEipAddressWithOptions(ReleaseEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Eips", request.eips);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseEipAddress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseEipAddressResponse());
    }

    public ReleaseEipAddressResponse releaseEipAddress(ReleaseEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEipAddressWithOptions(request, runtime);
    }

    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    public ReleasePostPaidInstanceResponse releasePostPaidInstanceWithOptions(ReleasePostPaidInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleasePostPaidInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleasePostPaidInstanceResponse());
    }

    public ReleasePostPaidInstanceResponse releasePostPaidInstance(ReleasePostPaidInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePostPaidInstanceWithOptions(request, runtime);
    }

    public ReleasePrePaidInstanceResponse releasePrePaidInstanceWithOptions(ReleasePrePaidInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleasePrePaidInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleasePrePaidInstanceResponse());
    }

    public ReleasePrePaidInstanceResponse releasePrePaidInstance(ReleasePrePaidInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePrePaidInstanceWithOptions(request, runtime);
    }

    public RemoveBackendServersResponse removeBackendServersWithOptions(RemoveBackendServersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveBackendServersShrinkRequest request = new RemoveBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackendServers", request.backendServersShrink);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveBackendServers"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveBackendServersResponse());
    }

    public RemoveBackendServersResponse removeBackendServers(RemoveBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeBackendServersWithOptions(request, runtime);
    }

    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstanceWithOptions(RemovePublicIpsFromEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        query.put("InstanceInfos", request.instanceInfos);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePublicIpsFromEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePublicIpsFromEpnInstanceResponse());
    }

    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstance(RemovePublicIpsFromEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removePublicIpsFromEpnInstanceWithOptions(request, runtime);
    }

    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstanceWithOptions(RemoveVSwitchesFromEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        query.put("VSwitchesInfo", request.vSwitchesInfo);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVSwitchesFromEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVSwitchesFromEpnInstanceResponse());
    }

    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVSwitchesFromEpnInstanceWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public RescaleApplicationResponse rescaleApplicationWithOptions(RescaleApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("RescaleLevel", request.rescaleLevel);
        query.put("RescaleType", request.rescaleType);
        query.put("ResourceSelector", request.resourceSelector);
        query.put("Timeout", request.timeout);
        query.put("ToAppVersion", request.toAppVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RescaleApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RescaleApplicationResponse());
    }

    public RescaleApplicationResponse rescaleApplication(RescaleApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rescaleApplicationWithOptions(request, runtime);
    }

    public RescaleDeviceServiceResponse rescaleDeviceServiceWithOptions(RescaleDeviceServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("ImageId", request.imageId);
        query.put("IpType", request.ipType);
        query.put("RescaleLevel", request.rescaleLevel);
        query.put("RescaleType", request.rescaleType);
        query.put("ResourceSpec", request.resourceSpec);
        query.put("ServiceId", request.serviceId);
        query.put("Timeout", request.timeout);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceInfo)) {
            body.put("ResourceInfo", request.resourceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSelector)) {
            body.put("ResourceSelector", request.resourceSelector);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RescaleDeviceService"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RescaleDeviceServiceResponse());
    }

    public RescaleDeviceServiceResponse rescaleDeviceService(RescaleDeviceServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rescaleDeviceServiceWithOptions(request, runtime);
    }

    public ResetDeviceInstanceResponse resetDeviceInstanceWithOptions(ResetDeviceInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDeviceInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDeviceInstanceResponse());
    }

    public ResetDeviceInstanceResponse resetDeviceInstance(ResetDeviceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDeviceInstanceWithOptions(request, runtime);
    }

    public RestartDeviceInstanceResponse restartDeviceInstanceWithOptions(RestartDeviceInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDeviceInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDeviceInstanceResponse());
    }

    public RestartDeviceInstanceResponse restartDeviceInstance(RestartDeviceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDeviceInstanceWithOptions(request, runtime);
    }

    public RevokeSecurityGroupResponse revokeSecurityGroupWithOptions(RevokeSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpProtocol", request.ipProtocol);
        query.put("Policy", request.policy);
        query.put("PortRange", request.portRange);
        query.put("Priority", request.priority);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("SourceCidrIp", request.sourceCidrIp);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeSecurityGroupResponse());
    }

    public RevokeSecurityGroupResponse revokeSecurityGroup(RevokeSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeSecurityGroupWithOptions(request, runtime);
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressWithOptions(RevokeSecurityGroupEgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DestCidrIp", request.destCidrIp);
        query.put("IpProtocol", request.ipProtocol);
        query.put("Policy", request.policy);
        query.put("PortRange", request.portRange);
        query.put("Priority", request.priority);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("SourcePortRange", request.sourcePortRange);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeSecurityGroupEgress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeSecurityGroupEgressResponse());
    }

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeSecurityGroupEgressWithOptions(request, runtime);
    }

    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("FromAppVersion", request.fromAppVersion);
        query.put("Timeout", request.timeout);
        query.put("ToAppVersion", request.toAppVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackApplicationResponse());
    }

    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackApplicationWithOptions(request, runtime);
    }

    public RunInstancesResponse runInstancesWithOptions(RunInstancesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunInstancesShrinkRequest request = new RunInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataDisk)) {
            request.dataDiskShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataDisk, "DataDisk", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.systemDisk))) {
            request.systemDiskShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.systemDisk), "SystemDisk", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Amount", request.amount);
        query.put("AutoRenew", request.autoRenew);
        query.put("Carrier", request.carrier);
        query.put("DataDisk", request.dataDiskShrink);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("HostName", request.hostName);
        query.put("ImageId", request.imageId);
        query.put("InstanceChargeType", request.instanceChargeType);
        query.put("InstanceName", request.instanceName);
        query.put("InstanceType", request.instanceType);
        query.put("InternetChargeType", request.internetChargeType);
        query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        query.put("KeyPairName", request.keyPairName);
        query.put("NetDistrictCode", request.netDistrictCode);
        query.put("NetWorkId", request.netWorkId);
        query.put("Password", request.password);
        query.put("Period", request.period);
        query.put("PrivateIpAddress", request.privateIpAddress);
        query.put("ScheduleAreaLevel", request.scheduleAreaLevel);
        query.put("SchedulingPriceStrategy", request.schedulingPriceStrategy);
        query.put("SchedulingStrategy", request.schedulingStrategy);
        query.put("SecurityId", request.securityId);
        query.put("SystemDisk", request.systemDiskShrink);
        query.put("UniqueSuffix", request.uniqueSuffix);
        query.put("UserData", request.userData);
        query.put("VSwitchId", request.vSwitchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunInstancesResponse());
    }

    public RunInstancesResponse runInstances(RunInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runInstancesWithOptions(request, runtime);
    }

    public RunServiceScheduleResponse runServiceScheduleWithOptions(RunServiceScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("ClientIp", request.clientIp);
        query.put("Directorys", request.directorys);
        query.put("PodConfigName", request.podConfigName);
        query.put("PreLockedTimeout", request.preLockedTimeout);
        query.put("ScheduleStrategy", request.scheduleStrategy);
        query.put("ServiceAction", request.serviceAction);
        query.put("ServiceCommands", request.serviceCommands);
        query.put("Uuid", request.uuid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunServiceSchedule"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunServiceScheduleResponse());
    }

    public RunServiceScheduleResponse runServiceSchedule(RunServiceScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runServiceScheduleWithOptions(request, runtime);
    }

    public SchedulePodResponse schedulePodWithOptions(SchedulePodRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AliUid", request.aliUid);
        query.put("AreaCodes", request.areaCodes);
        query.put("GroupUuid", request.groupUuid);
        query.put("Isps", request.isps);
        query.put("Labels", request.labels);
        query.put("Regions", request.regions);
        query.put("Tenant", request.tenant);
        query.put("WorkloadUuid", request.workloadUuid);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requirements)) {
            body.put("Requirements", request.requirements);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAttribute)) {
            body.put("ResourceAttribute", request.resourceAttribute);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SchedulePod"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SchedulePodResponse());
    }

    public SchedulePodResponse schedulePod(SchedulePodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.schedulePodWithOptions(request, runtime);
    }

    public SetBackendServersResponse setBackendServersWithOptions(SetBackendServersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetBackendServersShrinkRequest request = new SetBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BackendServers", request.backendServersShrink);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetBackendServers"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetBackendServersResponse());
    }

    public SetBackendServersResponse setBackendServers(SetBackendServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setBackendServersWithOptions(request, runtime);
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttributeWithOptions(SetLoadBalancerHTTPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("HealthCheck", request.healthCheck);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckDomain", request.healthCheckDomain);
        query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckMethod", request.healthCheckMethod);
        query.put("HealthCheckTimeout", request.healthCheckTimeout);
        query.put("HealthCheckURI", request.healthCheckURI);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("IdleTimeout", request.idleTimeout);
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("RequestTimeout", request.requestTimeout);
        query.put("Scheduler", request.scheduler);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerHTTPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerHTTPListenerAttributeResponse());
    }

    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttributeWithOptions(SetLoadBalancerHTTPSListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("HealthCheck", request.healthCheck);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckDomain", request.healthCheckDomain);
        query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckMethod", request.healthCheckMethod);
        query.put("HealthCheckTimeout", request.healthCheckTimeout);
        query.put("HealthCheckURI", request.healthCheckURI);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("IdleTimeout", request.idleTimeout);
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("RequestTimeout", request.requestTimeout);
        query.put("Scheduler", request.scheduler);
        query.put("ServerCertificateId", request.serverCertificateId);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerHTTPSListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerHTTPSListenerAttributeResponse());
    }

    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    public SetLoadBalancerStatusResponse setLoadBalancerStatusWithOptions(SetLoadBalancerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("LoadBalancerStatus", request.loadBalancerStatus);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerStatus"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerStatusResponse());
    }

    public SetLoadBalancerStatusResponse setLoadBalancerStatus(SetLoadBalancerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerStatusWithOptions(request, runtime);
    }

    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttributeWithOptions(SetLoadBalancerTCPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("EipTransmit", request.eipTransmit);
        query.put("EstablishedTimeout", request.establishedTimeout);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        query.put("HealthCheckDomain", request.healthCheckDomain);
        query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckType", request.healthCheckType);
        query.put("HealthCheckURI", request.healthCheckURI);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("PersistenceTimeout", request.persistenceTimeout);
        query.put("Scheduler", request.scheduler);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerTCPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerTCPListenerAttributeResponse());
    }

    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttributeWithOptions(SetLoadBalancerUDPListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("EipTransmit", request.eipTransmit);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        query.put("HealthCheckExp", request.healthCheckExp);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckReq", request.healthCheckReq);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("Scheduler", request.scheduler);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerUDPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerUDPListenerAttributeResponse());
    }

    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    public StartEpnInstanceResponse startEpnInstanceWithOptions(StartEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartEpnInstanceResponse());
    }

    public StartEpnInstanceResponse startEpnInstance(StartEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startEpnInstanceWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public StartLoadBalancerListenerResponse startLoadBalancerListenerWithOptions(StartLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartLoadBalancerListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartLoadBalancerListenerResponse());
    }

    public StartLoadBalancerListenerResponse startLoadBalancerListener(StartLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startLoadBalancerListenerWithOptions(request, runtime);
    }

    public StopEpnInstanceResponse stopEpnInstanceWithOptions(StopEpnInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EPNInstanceId", request.EPNInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopEpnInstanceResponse());
    }

    public StopEpnInstanceResponse stopEpnInstance(StopEpnInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopEpnInstanceWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ForceStop", request.forceStop);
        query.put("InstanceId", request.instanceId);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public StopLoadBalancerListenerResponse stopLoadBalancerListenerWithOptions(StopLoadBalancerListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerPort", request.listenerPort);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopLoadBalancerListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLoadBalancerListenerResponse());
    }

    public StopLoadBalancerListenerResponse stopLoadBalancerListener(StopLoadBalancerListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLoadBalancerListenerWithOptions(request, runtime);
    }

    public UnAssociateEnsEipAddressResponse unAssociateEnsEipAddressWithOptions(UnAssociateEnsEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AllocationId", request.allocationId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnAssociateEnsEipAddress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnAssociateEnsEipAddressResponse());
    }

    public UnAssociateEnsEipAddressResponse unAssociateEnsEipAddress(UnAssociateEnsEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unAssociateEnsEipAddressWithOptions(request, runtime);
    }

    public UnassociateEipAddressResponse unassociateEipAddressWithOptions(UnassociateEipAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Eip", request.eip);
        query.put("EnsRegionId", request.ensRegionId);
        query.put("InstanceIdInternetIp", request.instanceIdInternetIp);
        query.put("Version", request.version);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassociateEipAddress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassociateEipAddressResponse());
    }

    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateEipAddressWithOptions(request, runtime);
    }

    public UpgradeApplicationResponse upgradeApplicationWithOptions(UpgradeApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("Template", request.template);
        query.put("Timeout", request.timeout);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeApplicationResponse());
    }

    public UpgradeApplicationResponse upgradeApplication(UpgradeApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeApplicationWithOptions(request, runtime);
    }
}
