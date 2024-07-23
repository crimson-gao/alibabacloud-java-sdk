// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901;

import com.aliyun.tea.*;
import com.aliyun.appstream_center20210901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("appstream-center", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>获取访问管理页配置</p>
     * 
     * @param request AccessPageGetAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AccessPageGetAclResponse
     */
    public AccessPageGetAclResponse accessPageGetAclWithOptions(AccessPageGetAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPageId)) {
            query.put("AccessPageId", request.accessPageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccessPageGetAcl"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccessPageGetAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取访问管理页配置</p>
     * 
     * @param request AccessPageGetAclRequest
     * @return AccessPageGetAclResponse
     */
    public AccessPageGetAclResponse accessPageGetAcl(AccessPageGetAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.accessPageGetAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新访问管理</p>
     * 
     * @param request AccessPageSetAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AccessPageSetAclResponse
     */
    public AccessPageSetAclResponse accessPageSetAclWithOptions(AccessPageSetAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessMode)) {
            query.put("AccessMode", request.accessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPageId)) {
            query.put("AccessPageId", request.accessPageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPageName)) {
            query.put("AccessPageName", request.accessPageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectTime)) {
            query.put("EffectTime", request.effectTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unit)) {
            query.put("Unit", request.unit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccessPageSetAcl"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccessPageSetAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新访问管理</p>
     * 
     * @param request AccessPageSetAclRequest
     * @return AccessPageSetAclResponse
     */
    public AccessPageSetAclResponse accessPageSetAcl(AccessPageSetAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.accessPageSetAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同意Ota升级</p>
     * 
     * @param request ApproveOtaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveOtaTaskResponse
     */
    public ApproveOtaTaskResponse approveOtaTaskWithOptions(ApproveOtaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaType)) {
            body.put("OtaType", request.otaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveOtaTask"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveOtaTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同意Ota升级</p>
     * 
     * @param request ApproveOtaTaskRequest
     * @return ApproveOtaTaskResponse
     */
    public ApproveOtaTaskResponse approveOtaTask(ApproveOtaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveOtaTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话包收费查询</p>
     * 
     * @param request AskSessionPackagePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AskSessionPackagePriceResponse
     */
    public AskSessionPackagePriceResponse askSessionPackagePriceWithOptions(AskSessionPackagePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSessions)) {
            query.put("MaxSessions", request.maxSessions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionPackageType)) {
            query.put("SessionPackageType", request.sessionPackageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionSpec)) {
            query.put("SessionSpec", request.sessionSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionType)) {
            query.put("SessionType", request.sessionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AskSessionPackagePrice"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AskSessionPackagePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会话包收费查询</p>
     * 
     * @param request AskSessionPackagePriceRequest
     * @return AskSessionPackagePriceResponse
     */
    public AskSessionPackagePriceResponse askSessionPackagePrice(AskSessionPackagePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.askSessionPackagePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话包续费询价</p>
     * 
     * @param request AskSessionPackageRenewPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AskSessionPackageRenewPriceResponse
     */
    public AskSessionPackageRenewPriceResponse askSessionPackageRenewPriceWithOptions(AskSessionPackageRenewPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionPackageId)) {
            query.put("SessionPackageId", request.sessionPackageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AskSessionPackageRenewPrice"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AskSessionPackageRenewPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会话包续费询价</p>
     * 
     * @param request AskSessionPackageRenewPriceRequest
     * @return AskSessionPackageRenewPriceResponse
     */
    public AskSessionPackageRenewPriceResponse askSessionPackageRenewPrice(AskSessionPackageRenewPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.askSessionPackageRenewPriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>授权用户</p>
     * 
     * @param request AuthorizeInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeInstanceGroupResponse
     */
    public AuthorizeInstanceGroupResponse authorizeInstanceGroupWithOptions(AuthorizeInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeUserIds)) {
            body.put("AuthorizeUserIds", request.authorizeUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unAuthorizeUserIds)) {
            body.put("UnAuthorizeUserIds", request.unAuthorizeUserIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>授权用户</p>
     * 
     * @param request AuthorizeInstanceGroupRequest
     * @return AuthorizeInstanceGroupResponse
     */
    public AuthorizeInstanceGroupResponse authorizeInstanceGroup(AuthorizeInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置会话包</p>
     * 
     * @param request BuySessionPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BuySessionPackageResponse
     */
    public BuySessionPackageResponse buySessionPackageWithOptions(BuySessionPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSessions)) {
            query.put("MaxSessions", request.maxSessions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionPackageName)) {
            query.put("SessionPackageName", request.sessionPackageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionPackageType)) {
            query.put("SessionPackageType", request.sessionPackageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionSpec)) {
            query.put("SessionSpec", request.sessionSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionType)) {
            query.put("SessionType", request.sessionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuySessionPackage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuySessionPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置会话包</p>
     * 
     * @param request BuySessionPackageRequest
     * @return BuySessionPackageResponse
     */
    public BuySessionPackageResponse buySessionPackage(BuySessionPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.buySessionPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消Ota升级</p>
     * 
     * @param request CancelOtaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOtaTaskResponse
     */
    public CancelOtaTaskResponse cancelOtaTaskWithOptions(CancelOtaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOtaTask"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOtaTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消Ota升级</p>
     * 
     * @param request CancelOtaTaskRequest
     * @return CancelOtaTaskResponse
     */
    public CancelOtaTaskResponse cancelOtaTask(CancelOtaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOtaTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建访问页面 </p>
     * 
     * @param request CreateAccessPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessPageResponse
     */
    public CreateAccessPageResponse createAccessPageWithOptions(CreateAccessPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPageName)) {
            query.put("AccessPageName", request.accessPageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudEnvId)) {
            query.put("CloudEnvId", request.cloudEnvId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectTime)) {
            query.put("EffectTime", request.effectTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unit)) {
            query.put("Unit", request.unit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessPage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建访问页面 </p>
     * 
     * @param request CreateAccessPageRequest
     * @return CreateAccessPageResponse
     */
    public CreateAccessPageResponse createAccessPage(CreateAccessPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建云应用交付组</p>
     * 
     * @param tmpReq CreateAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppInstanceGroupResponse
     */
    public CreateAppInstanceGroupResponse createAppInstanceGroupWithOptions(CreateAppInstanceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppInstanceGroupShrinkRequest request = new CreateAppInstanceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.network)) {
            request.networkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.network, "Network", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodePool)) {
            request.nodePoolShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodePool, "NodePool", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runtimePolicy)) {
            request.runtimePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runtimePolicy, "RuntimePolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.securityPolicy)) {
            request.securityPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.securityPolicy, "SecurityPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storagePolicy)) {
            request.storagePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storagePolicy, "StoragePolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userDefinePolicy)) {
            request.userDefinePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userDefinePolicy, "UserDefinePolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoPolicy)) {
            request.videoPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoPolicy, "VideoPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userDefinePolicyShrink)) {
            query.put("UserDefinePolicy", request.userDefinePolicyShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageId)) {
            body.put("AppCenterImageId", request.appCenterImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            body.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeResourceMode)) {
            body.put("ChargeResourceMode", request.chargeResourceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkShrink)) {
            body.put("Network", request.networkShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePoolShrink)) {
            body.put("NodePool", request.nodePoolShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preOpenAppId)) {
            body.put("PreOpenAppId", request.preOpenAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            body.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimePolicyShrink)) {
            body.put("RuntimePolicy", request.runtimePolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyShrink)) {
            body.put("SecurityPolicy", request.securityPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionTimeout)) {
            body.put("SessionTimeout", request.sessionTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePolicyShrink)) {
            body.put("StoragePolicy", request.storagePolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoPolicyShrink)) {
            body.put("VideoPolicy", request.videoPolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建云应用交付组</p>
     * 
     * @param request CreateAppInstanceGroupRequest
     * @return CreateAppInstanceGroupResponse
     */
    public CreateAppInstanceGroupResponse createAppInstanceGroup(CreateAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateImageFromAppInstanceGroup</p>
     * 
     * @param request CreateImageFromAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageFromAppInstanceGroupResponse
     */
    public CreateImageFromAppInstanceGroupResponse createImageFromAppInstanceGroupWithOptions(CreateImageFromAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageName)) {
            body.put("AppCenterImageName", request.appCenterImageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageFromAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageFromAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateImageFromAppInstanceGroup</p>
     * 
     * @param request CreateImageFromAppInstanceGroupRequest
     * @return CreateImageFromAppInstanceGroupResponse
     */
    public CreateImageFromAppInstanceGroupResponse createImageFromAppInstanceGroup(CreateImageFromAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageFromAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            query.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudEnvId)) {
            query.put("CloudEnvId", request.cloudEnvId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentId)) {
            query.put("ContentId", request.contentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileTransfer)) {
            query.put("FileTransfer", request.fileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameRate)) {
            query.put("FrameRate", request.frameRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepAliveDuration)) {
            query.put("KeepAliveDuration", request.keepAliveDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionResolutionHeight)) {
            query.put("SessionResolutionHeight", request.sessionResolutionHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionResolutionWidth)) {
            query.put("SessionResolutionWidth", request.sessionResolutionWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionSpec)) {
            query.put("SessionSpec", request.sessionSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamingMode)) {
            query.put("StreamingMode", request.streamingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalResolutionAdaptation)) {
            query.put("TerminalResolutionAdaptation", request.terminalResolutionAdaptation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除访问页面</p>
     * 
     * @param request DeleteAccessPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessPageResponse
     */
    public DeleteAccessPageResponse deleteAccessPageWithOptions(DeleteAccessPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPageId)) {
            query.put("AccessPageId", request.accessPageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessPage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除访问页面</p>
     * 
     * @param request DeleteAccessPageRequest
     * @return DeleteAccessPageResponse
     */
    public DeleteAccessPageResponse deleteAccessPage(DeleteAccessPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例组释放接口</p>
     * 
     * @param request DeleteAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppInstanceGroupResponse
     */
    public DeleteAppInstanceGroupResponse deleteAppInstanceGroupWithOptions(DeleteAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例组释放接口</p>
     * 
     * @param request DeleteAppInstanceGroupRequest
     * @return DeleteAppInstanceGroupResponse
     */
    public DeleteAppInstanceGroupResponse deleteAppInstanceGroup(DeleteAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除实例</p>
     * 
     * @param request DeleteAppInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppInstancesResponse
     */
    public DeleteAppInstancesResponse deleteAppInstancesWithOptions(DeleteAppInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceIds)) {
            body.put("AppInstanceIds", request.appInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppInstances"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除实例</p>
     * 
     * @param request DeleteAppInstancesRequest
     * @return DeleteAppInstancesResponse
     */
    public DeleteAppInstancesResponse deleteAppInstances(DeleteAppInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>访客进入访问页面的匿名api</p>
     * 
     * @param request GetAccessPageSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessPageSessionResponse
     */
    public GetAccessPageSessionResponse getAccessPageSessionWithOptions(GetAccessPageSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPageId)) {
            query.put("AccessPageId", request.accessPageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPageToken)) {
            query.put("AccessPageToken", request.accessPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            query.put("ExternalUserId", request.externalUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessPageSession"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessPageSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>访客进入访问页面的匿名api</p>
     * 
     * @param request GetAccessPageSessionRequest
     * @return GetAccessPageSessionResponse
     */
    public GetAccessPageSessionResponse getAccessPageSession(GetAccessPageSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessPageSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取交付组详情</p>
     * 
     * @param request GetAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppInstanceGroupResponse
     */
    public GetAppInstanceGroupResponse getAppInstanceGroupWithOptions(GetAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取交付组详情</p>
     * 
     * @param request GetAppInstanceGroupRequest
     * @return GetAppInstanceGroupResponse
     */
    public GetAppInstanceGroupResponse getAppInstanceGroup(GetAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取连接ticket，Open API</p>
     * 
     * @param request GetConnectionTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupIdList)) {
            body.put("AppInstanceGroupIdList", request.appInstanceGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            body.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentId)) {
            body.put("AppInstancePersistentId", request.appInstancePersistentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appStartParam)) {
            body.put("AppStartParam", request.appStartParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnectionTicket"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectionTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取连接ticket，Open API</p>
     * 
     * @param request GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetDebugAppInstance</p>
     * 
     * @param request GetDebugAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDebugAppInstanceResponse
     */
    public GetDebugAppInstanceResponse getDebugAppInstanceWithOptions(GetDebugAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDebugAppInstance"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDebugAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetDebugAppInstance</p>
     * 
     * @param request GetDebugAppInstanceRequest
     * @return GetDebugAppInstanceResponse
     */
    public GetDebugAppInstanceResponse getDebugAppInstance(GetDebugAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDebugAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ota任务明细</p>
     * 
     * @param request GetOtaTaskByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOtaTaskByTaskIdResponse
     */
    public GetOtaTaskByTaskIdResponse getOtaTaskByTaskIdWithOptions(GetOtaTaskByTaskIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOtaTaskByTaskId"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOtaTaskByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ota任务明细</p>
     * 
     * @param request GetOtaTaskByTaskIdRequest
     * @return GetOtaTaskByTaskIdResponse
     */
    public GetOtaTaskByTaskIdResponse getOtaTaskByTaskId(GetOtaTaskByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOtaTaskByTaskIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取策略配置</p>
     * 
     * @param request GetProjectPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectPoliciesResponse
     */
    public GetProjectPoliciesResponse getProjectPoliciesWithOptions(GetProjectPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectPolicies"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取策略配置</p>
     * 
     * @param request GetProjectPoliciesRequest
     * @return GetProjectPoliciesResponse
     */
    public GetProjectPoliciesResponse getProjectPolicies(GetProjectPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云应用资源询价接口</p>
     * 
     * @param request GetResourcePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourcePriceResponse
     */
    public GetResourcePriceResponse getResourcePriceWithOptions(GetResourcePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceType)) {
            query.put("AppInstanceType", request.appInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceType)) {
            query.put("NodeInstanceType", request.nodeInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourcePrice"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云应用资源询价接口</p>
     * 
     * @param request GetResourcePriceRequest
     * @return GetResourcePriceResponse
     */
    public GetResourcePriceResponse getResourcePrice(GetResourcePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourcePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云应用资源询价接口</p>
     * 
     * @param request GetResourceRenewPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceRenewPriceResponse
     */
    public GetResourceRenewPriceResponse getResourceRenewPriceWithOptions(GetResourceRenewPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceRenewPrice"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceRenewPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云应用资源询价接口</p>
     * 
     * @param request GetResourceRenewPriceRequest
     * @return GetResourceRenewPriceResponse
     */
    public GetResourceRenewPriceResponse getResourceRenewPrice(GetResourceRenewPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceRenewPriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>访问页面分页查询</p>
     * 
     * @param request ListAccessPagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessPagesResponse
     */
    public ListAccessPagesResponse listAccessPagesWithOptions(ListAccessPagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPageId)) {
            query.put("AccessPageId", request.accessPageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPageName)) {
            query.put("AccessPageName", request.accessPageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessPages"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessPagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>访问页面分页查询</p>
     * 
     * @param request ListAccessPagesRequest
     * @return ListAccessPagesResponse
     */
    public ListAccessPagesResponse listAccessPages(ListAccessPagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessPagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列表展示云应用交付组</p>
     * 
     * @param request ListAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstanceGroupResponse
     */
    public ListAppInstanceGroupResponse listAppInstanceGroupWithOptions(ListAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageId)) {
            query.put("AppCenterImageId", request.appCenterImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            query.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceType)) {
            query.put("NodeInstanceType", request.nodeInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列表展示云应用交付组</p>
     * 
     * @param request ListAppInstanceGroupRequest
     * @return ListAppInstanceGroupResponse
     */
    public ListAppInstanceGroupResponse listAppInstanceGroup(ListAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询交付组内实例列表</p>
     * 
     * @param request ListAppInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstancesWithOptions(ListAppInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDeleted)) {
            query.put("IncludeDeleted", request.includeDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceIdList)) {
            body.put("AppInstanceIdList", request.appInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstances"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询交付组内实例列表</p>
     * 
     * @param request ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstances(ListAppInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源规格</p>
     * 
     * @param request ListNodeInstanceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeInstanceTypeResponse
     */
    public ListNodeInstanceTypeResponse listNodeInstanceTypeWithOptions(ListNodeInstanceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceType)) {
            query.put("NodeInstanceType", request.nodeInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeInstanceType"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeInstanceTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源规格</p>
     * 
     * @param request ListNodeInstanceTypeRequest
     * @return ListNodeInstanceTypeResponse
     */
    public ListNodeInstanceTypeResponse listNodeInstanceType(ListNodeInstanceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeInstanceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>升级历史记录</p>
     * 
     * @param request ListOtaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOtaTaskResponse
     */
    public ListOtaTaskResponse listOtaTaskWithOptions(ListOtaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaType)) {
            body.put("OtaType", request.otaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOtaTask"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOtaTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>升级历史记录</p>
     * 
     * @param request ListOtaTaskRequest
     * @return ListOtaTaskResponse
     */
    public ListOtaTaskResponse listOtaTask(ListOtaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOtaTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目列表</p>
     * 
     * @param request ListProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateList)) {
            query.put("StateList", request.stateList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目列表</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云应用支持的地域列表</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云应用支持的地域列表</p>
     * 
     * @param request ListRegionsRequest
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>项目的会话包列表</p>
     * 
     * @param request ListSessionPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSessionPackagesResponse
     */
    public ListSessionPackagesResponse listSessionPackagesWithOptions(ListSessionPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionPackageId)) {
            query.put("SessionPackageId", request.sessionPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionPackageName)) {
            query.put("SessionPackageName", request.sessionPackageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateList)) {
            query.put("StateList", request.stateList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSessionPackages"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSessionPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>项目的会话包列表</p>
     * 
     * @param request ListSessionPackagesRequest
     * @return ListSessionPackagesResponse
     */
    public ListSessionPackagesResponse listSessionPackages(ListSessionPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSessionPackagesWithOptions(request, runtime);
    }

    /**
     * @param request ListTenantConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTenantConfigResponse
     */
    public ListTenantConfigResponse listTenantConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenantConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantConfigResponse());
    }

    /**
     * @return ListTenantConfigResponse
     */
    public ListTenantConfigResponse listTenantConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTenantConfigWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注销交付下所有会话</p>
     * 
     * @param request LogOffAllSessionsInAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    public LogOffAllSessionsInAppInstanceGroupResponse logOffAllSessionsInAppInstanceGroupWithOptions(LogOffAllSessionsInAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogOffAllSessionsInAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogOffAllSessionsInAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注销交付下所有会话</p>
     * 
     * @param request LogOffAllSessionsInAppInstanceGroupRequest
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    public LogOffAllSessionsInAppInstanceGroupResponse logOffAllSessionsInAppInstanceGroup(LogOffAllSessionsInAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.logOffAllSessionsInAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话包 迁移/分配</p>
     * 
     * @param request MigrateSessionPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateSessionPackageResponse
     */
    public MigrateSessionPackageResponse migrateSessionPackageWithOptions(MigrateSessionPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destProjectId)) {
            body.put("DestProjectId", request.destProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionPackageId)) {
            body.put("SessionPackageId", request.sessionPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProjectId)) {
            body.put("SourceProjectId", request.sourceProjectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateSessionPackage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateSessionPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会话包 迁移/分配</p>
     * 
     * @param request MigrateSessionPackageRequest
     * @return MigrateSessionPackageResponse
     */
    public MigrateSessionPackageResponse migrateSessionPackage(MigrateSessionPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateSessionPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改云应用交付组</p>
     * 
     * @param tmpReq ModifyAppInstanceGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppInstanceGroupAttributeResponse
     */
    public ModifyAppInstanceGroupAttributeResponse modifyAppInstanceGroupAttributeWithOptions(ModifyAppInstanceGroupAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppInstanceGroupAttributeShrinkRequest request = new ModifyAppInstanceGroupAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.network)) {
            request.networkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.network, "Network", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodePool)) {
            request.nodePoolShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodePool, "NodePool", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.securityPolicy)) {
            request.securityPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.securityPolicy, "SecurityPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storagePolicy)) {
            request.storagePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storagePolicy, "StoragePolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            query.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePoolShrink)) {
            query.put("NodePool", request.nodePoolShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionTimeout)) {
            query.put("SessionTimeout", request.sessionTimeout);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkShrink)) {
            body.put("Network", request.networkShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preOpenAppId)) {
            body.put("PreOpenAppId", request.preOpenAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preOpenMode)) {
            body.put("PreOpenMode", request.preOpenMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyShrink)) {
            body.put("SecurityPolicy", request.securityPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePolicyShrink)) {
            body.put("StoragePolicy", request.storagePolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppInstanceGroupAttribute"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppInstanceGroupAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改云应用交付组</p>
     * 
     * @param request ModifyAppInstanceGroupAttributeRequest
     * @return ModifyAppInstanceGroupAttributeResponse
     */
    public ModifyAppInstanceGroupAttributeResponse modifyAppInstanceGroupAttribute(ModifyAppInstanceGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppInstanceGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改策略信息</p>
     * 
     * @param tmpReq ModifyAppPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppPolicyResponse
     */
    public ModifyAppPolicyResponse modifyAppPolicyWithOptions(ModifyAppPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppPolicyShrinkRequest request = new ModifyAppPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoPolicy)) {
            request.videoPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoPolicy, "VideoPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appPolicyId)) {
            query.put("AppPolicyId", request.appPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoPolicyShrink)) {
            query.put("VideoPolicy", request.videoPolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppPolicy"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改策略信息</p>
     * 
     * @param request ModifyAppPolicyRequest
     * @return ModifyAppPolicyResponse
     */
    public ModifyAppPolicyResponse modifyAppPolicy(ModifyAppPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppPolicyWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ModifyNodePoolAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodePoolAttributeResponse
     */
    public ModifyNodePoolAttributeResponse modifyNodePoolAttributeWithOptions(ModifyNodePoolAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyNodePoolAttributeShrinkRequest request = new ModifyNodePoolAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodePoolStrategy)) {
            request.nodePoolStrategyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodePoolStrategy, "NodePoolStrategy", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeCapacity)) {
            body.put("NodeCapacity", request.nodeCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePoolStrategyShrink)) {
            body.put("NodePoolStrategy", request.nodePoolStrategyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolId)) {
            body.put("PoolId", request.poolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodePoolAttribute"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodePoolAttributeResponse());
    }

    /**
     * @param request ModifyNodePoolAttributeRequest
     * @return ModifyNodePoolAttributeResponse
     */
    public ModifyNodePoolAttributeResponse modifyNodePoolAttribute(ModifyNodePoolAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNodePoolAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改项目策略</p>
     * 
     * @param request ModifyProjectPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyProjectPolicyResponse
     */
    public ModifyProjectPolicyResponse modifyProjectPolicyWithOptions(ModifyProjectPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            query.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileTransfer)) {
            query.put("FileTransfer", request.fileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameRate)) {
            query.put("FrameRate", request.frameRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepAliveDuration)) {
            query.put("KeepAliveDuration", request.keepAliveDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionResolutionHeight)) {
            query.put("SessionResolutionHeight", request.sessionResolutionHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionResolutionWidth)) {
            query.put("SessionResolutionWidth", request.sessionResolutionWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamingMode)) {
            query.put("StreamingMode", request.streamingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalResolutionAdaptation)) {
            query.put("TerminalResolutionAdaptation", request.terminalResolutionAdaptation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProjectPolicy"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProjectPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改项目策略</p>
     * 
     * @param request ModifyProjectPolicyRequest
     * @return ModifyProjectPolicyResponse
     */
    public ModifyProjectPolicyResponse modifyProjectPolicy(ModifyProjectPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProjectPolicyWithOptions(request, runtime);
    }

    /**
     * @param request ModifyTenantConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantConfigResponse
     */
    public ModifyTenantConfigResponse modifyTenantConfigWithOptions(ModifyTenantConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupExpireRemind)) {
            body.put("AppInstanceGroupExpireRemind", request.appInstanceGroupExpireRemind);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantConfigResponse());
    }

    /**
     * @param request ModifyTenantConfigRequest
     * @return ModifyTenantConfigResponse
     */
    public ModifyTenantConfigResponse modifyTenantConfig(ModifyTenantConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权用户列表</p>
     * 
     * @param request PageListAppInstanceGroupUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageListAppInstanceGroupUserResponse
     */
    public PageListAppInstanceGroupUserResponse pageListAppInstanceGroupUserWithOptions(PageListAppInstanceGroupUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageListAppInstanceGroupUser"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageListAppInstanceGroupUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权用户列表</p>
     * 
     * @param request PageListAppInstanceGroupUserRequest
     * @return PageListAppInstanceGroupUserResponse
     */
    public PageListAppInstanceGroupUserResponse pageListAppInstanceGroupUser(PageListAppInstanceGroupUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageListAppInstanceGroupUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>刷新访问url</p>
     * 
     * @param request RefreshAccessUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshAccessUrlResponse
     */
    public RefreshAccessUrlResponse refreshAccessUrlWithOptions(RefreshAccessUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPageId)) {
            query.put("AccessPageId", request.accessPageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshAccessUrl"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAccessUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>刷新访问url</p>
     * 
     * @param request RefreshAccessUrlRequest
     * @return RefreshAccessUrlResponse
     */
    public RefreshAccessUrlResponse refreshAccessUrl(RefreshAccessUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshAccessUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>资源续费接口</p>
     * 
     * @param request RenewAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAppInstanceGroupResponse
     */
    public RenewAppInstanceGroupResponse renewAppInstanceGroupWithOptions(RenewAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>资源续费接口</p>
     * 
     * @param request RenewAppInstanceGroupRequest
     * @return RenewAppInstanceGroupResponse
     */
    public RenewAppInstanceGroupResponse renewAppInstanceGroup(RenewAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会话包续费</p>
     * 
     * @param request RenewSessionPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewSessionPackageResponse
     */
    public RenewSessionPackageResponse renewSessionPackageWithOptions(RenewSessionPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionPackageId)) {
            query.put("SessionPackageId", request.sessionPackageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewSessionPackage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewSessionPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会话包续费</p>
     * 
     * @param request RenewSessionPackageRequest
     * @return RenewSessionPackageResponse
     */
    public RenewSessionPackageResponse renewSessionPackage(RenewSessionPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewSessionPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解除用户绑定</p>
     * 
     * @param request UnbindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindResponse
     */
    public UnbindResponse unbindWithOptions(UnbindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            body.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentId)) {
            body.put("AppInstancePersistentId", request.appInstancePersistentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Unbind"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解除用户绑定</p>
     * 
     * @param request UnbindRequest
     * @return UnbindResponse
     */
    public UnbindResponse unbind(UnbindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新访问页面状态</p>
     * 
     * @param request UpdateAccessPageStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccessPageStateResponse
     */
    public UpdateAccessPageStateResponse updateAccessPageStateWithOptions(UpdateAccessPageStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPageId)) {
            query.put("AccessPageId", request.accessPageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPageState)) {
            query.put("AccessPageState", request.accessPageState);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccessPageState"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccessPageStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新访问页面状态</p>
     * 
     * @param request UpdateAccessPageStateRequest
     * @return UpdateAccessPageStateResponse
     */
    public UpdateAccessPageStateResponse updateAccessPageState(UpdateAccessPageStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccessPageStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新镜像</p>
     * 
     * @param request UpdateAppInstanceGroupImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppInstanceGroupImageResponse
     */
    public UpdateAppInstanceGroupImageResponse updateAppInstanceGroupImageWithOptions(UpdateAppInstanceGroupImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageId)) {
            query.put("AppCenterImageId", request.appCenterImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppInstanceGroupImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppInstanceGroupImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新镜像</p>
     * 
     * @param request UpdateAppInstanceGroupImageRequest
     * @return UpdateAppInstanceGroupImageResponse
     */
    public UpdateAppInstanceGroupImageResponse updateAppInstanceGroupImage(UpdateAppInstanceGroupImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppInstanceGroupImageWithOptions(request, runtime);
    }
}
