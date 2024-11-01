// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910;

import com.aliyun.tea.*;
import com.aliyun.esa20240910.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("esa", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>激活客户端证书</p>
     * 
     * @param request ActivateClientCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateClientCertificateResponse
     */
    public ActivateClientCertificateResponse activateClientCertificateWithOptions(ActivateClientCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateClientCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateClientCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>激活客户端证书</p>
     * 
     * @param request ActivateClientCertificateRequest
     * @return ActivateClientCertificateResponse
     */
    public ActivateClientCertificateResponse activateClientCertificate(ActivateClientCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateClientCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建记录</p>
     * 
     * @param tmpReq BatchCreateRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateRecordsResponse
     */
    public BatchCreateRecordsResponse batchCreateRecordsWithOptions(BatchCreateRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCreateRecordsShrinkRequest request = new BatchCreateRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordList)) {
            request.recordListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordList, "RecordList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordListShrink)) {
            query.put("RecordList", request.recordListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建记录</p>
     * 
     * @param request BatchCreateRecordsRequest
     * @return BatchCreateRecordsResponse
     */
    public BatchCreateRecordsResponse batchCreateRecords(BatchCreateRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建WAF规则</p>
     * 
     * @param tmpReq BatchCreateWafRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateWafRulesResponse
     */
    public BatchCreateWafRulesResponse batchCreateWafRulesWithOptions(BatchCreateWafRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCreateWafRulesShrinkRequest request = new BatchCreateWafRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configs)) {
            request.configsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configs, "Configs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shared)) {
            request.sharedShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shared, "Shared", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsShrink)) {
            body.put("Configs", request.configsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedShrink)) {
            body.put("Shared", request.sharedShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateWafRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateWafRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建WAF规则</p>
     * 
     * @param request BatchCreateWafRulesRequest
     * @return BatchCreateWafRulesResponse
     */
    public BatchCreateWafRulesResponse batchCreateWafRules(BatchCreateWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除Namespace的key-value对</p>
     * 
     * @param tmpReq BatchDeleteKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteKvResponse
     */
    public BatchDeleteKvResponse batchDeleteKvWithOptions(BatchDeleteKvRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteKvShrinkRequest request = new BatchDeleteKvShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            body.put("Keys", request.keysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除Namespace的key-value对</p>
     * 
     * @param request BatchDeleteKvRequest
     * @return BatchDeleteKvResponse
     */
    public BatchDeleteKvResponse batchDeleteKv(BatchDeleteKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除Namespace下的KV队，支持大body的上传，上限100M</p>
     * 
     * @param request BatchDeleteKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteKvWithHighCapacityResponse
     */
    public BatchDeleteKvWithHighCapacityResponse batchDeleteKvWithHighCapacityWithOptions(BatchDeleteKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteKvWithHighCapacity"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteKvWithHighCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除Namespace下的KV队，支持大body的上传，上限100M</p>
     * 
     * @param request BatchDeleteKvWithHighCapacityRequest
     * @return BatchDeleteKvWithHighCapacityResponse
     */
    public BatchDeleteKvWithHighCapacityResponse batchDeleteKvWithHighCapacity(BatchDeleteKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteKvWithHighCapacityWithOptions(request, runtime);
    }

    public BatchDeleteKvWithHighCapacityResponse batchDeleteKvWithHighCapacityAdvance(BatchDeleteKvWithHighCapacityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "ESA"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        BatchDeleteKvWithHighCapacityRequest batchDeleteKvWithHighCapacityReq = new BatchDeleteKvWithHighCapacityRequest();
        com.aliyun.openapiutil.Client.convert(request, batchDeleteKvWithHighCapacityReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            batchDeleteKvWithHighCapacityReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        BatchDeleteKvWithHighCapacityResponse batchDeleteKvWithHighCapacityResp = this.batchDeleteKvWithHighCapacityWithOptions(batchDeleteKvWithHighCapacityReq, runtime);
        return batchDeleteKvWithHighCapacityResp;
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取表达式的匹配项</p>
     * 
     * @param tmpReq BatchGetExpressionFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetExpressionFieldsResponse
     */
    public BatchGetExpressionFieldsResponse batchGetExpressionFieldsWithOptions(BatchGetExpressionFieldsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetExpressionFieldsShrinkRequest request = new BatchGetExpressionFieldsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.expressions)) {
            request.expressionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.expressions, "Expressions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expressionsShrink)) {
            body.put("Expressions", request.expressionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetExpressionFields"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetExpressionFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取表达式的匹配项</p>
     * 
     * @param request BatchGetExpressionFieldsRequest
     * @return BatchGetExpressionFieldsResponse
     */
    public BatchGetExpressionFieldsResponse batchGetExpressionFields(BatchGetExpressionFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetExpressionFieldsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置Namespace的key-value对</p>
     * 
     * @param tmpReq BatchPutKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchPutKvResponse
     */
    public BatchPutKvResponse batchPutKvWithOptions(BatchPutKvRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchPutKvShrinkRequest request = new BatchPutKvShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kvList)) {
            request.kvListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kvList, "KvList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kvListShrink)) {
            body.put("KvList", request.kvListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchPutKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchPutKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置Namespace的key-value对</p>
     * 
     * @param request BatchPutKvRequest
     * @return BatchPutKvResponse
     */
    public BatchPutKvResponse batchPutKv(BatchPutKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchPutKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置Namespace的key-value对，支持最大100M的请求体</p>
     * 
     * @param request BatchPutKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchPutKvWithHighCapacityResponse
     */
    public BatchPutKvWithHighCapacityResponse batchPutKvWithHighCapacityWithOptions(BatchPutKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchPutKvWithHighCapacity"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchPutKvWithHighCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量设置Namespace的key-value对，支持最大100M的请求体</p>
     * 
     * @param request BatchPutKvWithHighCapacityRequest
     * @return BatchPutKvWithHighCapacityResponse
     */
    public BatchPutKvWithHighCapacityResponse batchPutKvWithHighCapacity(BatchPutKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchPutKvWithHighCapacityWithOptions(request, runtime);
    }

    public BatchPutKvWithHighCapacityResponse batchPutKvWithHighCapacityAdvance(BatchPutKvWithHighCapacityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "ESA"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        BatchPutKvWithHighCapacityRequest batchPutKvWithHighCapacityReq = new BatchPutKvWithHighCapacityRequest();
        com.aliyun.openapiutil.Client.convert(request, batchPutKvWithHighCapacityReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            batchPutKvWithHighCapacityReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        BatchPutKvWithHighCapacityResponse batchPutKvWithHighCapacityResp = this.batchPutKvWithHighCapacityWithOptions(batchPutKvWithHighCapacityReq, runtime);
        return batchPutKvWithHighCapacityResp;
    }

    /**
     * <b>summary</b> : 
     * <p>批量修改WAF规则</p>
     * 
     * @param tmpReq BatchUpdateWafRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateWafRulesResponse
     */
    public BatchUpdateWafRulesResponse batchUpdateWafRulesWithOptions(BatchUpdateWafRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateWafRulesShrinkRequest request = new BatchUpdateWafRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configs)) {
            request.configsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configs, "Configs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shared)) {
            request.sharedShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shared, "Shared", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsShrink)) {
            body.put("Configs", request.configsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesetId)) {
            body.put("RulesetId", request.rulesetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedShrink)) {
            body.put("Shared", request.sharedShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateWafRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateWafRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量修改WAF规则</p>
     * 
     * @param request BatchUpdateWafRulesRequest
     * @return BatchUpdateWafRulesResponse
     */
    public BatchUpdateWafRulesResponse batchUpdateWafRules(BatchUpdateWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>URL封禁</p>
     * 
     * @param tmpReq BlockObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BlockObjectResponse
     */
    public BlockObjectResponse blockObjectWithOptions(BlockObjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BlockObjectShrinkRequest request = new BlockObjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            query.put("Extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxage)) {
            query.put("Maxage", request.maxage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BlockObject"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BlockObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>URL封禁</p>
     * 
     * @param request BlockObjectRequest
     * @return BlockObjectResponse
     */
    public BlockObjectResponse blockObject(BlockObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.blockObjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点的企业资源组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点的企业资源组</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验站点名称是否可用</p>
     * 
     * @param request CheckSiteNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSiteNameResponse
     */
    public CheckSiteNameResponse checkSiteNameWithOptions(CheckSiteNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteName)) {
            query.put("SiteName", request.siteName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSiteName"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSiteNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验站点名称是否可用</p>
     * 
     * @param request CheckSiteNameRequest
     * @return CheckSiteNameResponse
     */
    public CheckSiteNameResponse checkSiteName(CheckSiteNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSiteNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实时日志任务投递名检查</p>
     * 
     * @param request CheckSiteProjectNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSiteProjectNameResponse
     */
    public CheckSiteProjectNameResponse checkSiteProjectNameWithOptions(CheckSiteProjectNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSiteProjectName"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSiteProjectNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实时日志任务投递名检查</p>
     * 
     * @param request CheckSiteProjectNameRequest
     * @return CheckSiteProjectNameResponse
     */
    public CheckSiteProjectNameResponse checkSiteProjectName(CheckSiteProjectNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSiteProjectNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实时日志用户任务投递名检查</p>
     * 
     * @param request CheckUserProjectNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUserProjectNameResponse
     */
    public CheckUserProjectNameResponse checkUserProjectNameWithOptions(CheckUserProjectNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUserProjectName"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUserProjectNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实时日志用户任务投递名检查</p>
     * 
     * @param request CheckUserProjectNameRequest
     * @return CheckUserProjectNameResponse
     */
    public CheckUserProjectNameResponse checkUserProjectName(CheckUserProjectNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUserProjectNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交Routine测试版本代码</p>
     * 
     * @param request CommitRoutineStagingCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommitRoutineStagingCodeResponse
     */
    public CommitRoutineStagingCodeResponse commitRoutineStagingCodeWithOptions(CommitRoutineStagingCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeDescription)) {
            body.put("CodeDescription", request.codeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitRoutineStagingCode"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitRoutineStagingCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交Routine测试版本代码</p>
     * 
     * @param request CommitRoutineStagingCodeRequest
     * @return CommitRoutineStagingCodeResponse
     */
    public CommitRoutineStagingCodeResponse commitRoutineStagingCode(CommitRoutineStagingCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitRoutineStagingCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建定制场景策略</p>
     * 
     * @param request CreateCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomScenePolicyResponse
     */
    public CreateCustomScenePolicyResponse createCustomScenePolicyWithOptions(CreateCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objects)) {
            query.put("Objects", request.objects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建定制场景策略</p>
     * 
     * @param request CreateCustomScenePolicyRequest
     * @return CreateCustomScenePolicyResponse
     */
    public CreateCustomScenePolicyResponse createCustomScenePolicy(CreateCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建边缘容器的应用</p>
     * 
     * @param request CreateEdgeContainerAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEdgeContainerAppResponse
     */
    public CreateEdgeContainerAppResponse createEdgeContainerAppWithOptions(CreateEdgeContainerAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckFailTimes)) {
            body.put("HealthCheckFailTimes", request.healthCheckFailTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHost)) {
            body.put("HealthCheckHost", request.healthCheckHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            body.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            body.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            body.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPort)) {
            body.put("HealthCheckPort", request.healthCheckPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckSuccTimes)) {
            body.put("HealthCheckSuccTimes", request.healthCheckSuccTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            body.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            body.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            body.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePort)) {
            body.put("ServicePort", request.servicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPort)) {
            body.put("TargetPort", request.targetPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeContainerApp"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeContainerAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建边缘容器的应用</p>
     * 
     * @param request CreateEdgeContainerAppRequest
     * @return CreateEdgeContainerAppResponse
     */
    public CreateEdgeContainerAppResponse createEdgeContainerApp(CreateEdgeContainerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEdgeContainerAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个边缘容器应用的域名记录</p>
     * 
     * @param request CreateEdgeContainerAppRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEdgeContainerAppRecordResponse
     */
    public CreateEdgeContainerAppRecordResponse createEdgeContainerAppRecordWithOptions(CreateEdgeContainerAppRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("RecordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeContainerAppRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeContainerAppRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个边缘容器应用的域名记录</p>
     * 
     * @param request CreateEdgeContainerAppRecordRequest
     * @return CreateEdgeContainerAppRecordResponse
     */
    public CreateEdgeContainerAppRecordResponse createEdgeContainerAppRecord(CreateEdgeContainerAppRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEdgeContainerAppRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建边缘容器应用的版本</p>
     * 
     * @param tmpReq CreateEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEdgeContainerAppVersionResponse
     */
    public CreateEdgeContainerAppVersionResponse createEdgeContainerAppVersionWithOptions(CreateEdgeContainerAppVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEdgeContainerAppVersionShrinkRequest request = new CreateEdgeContainerAppVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.containers)) {
            request.containersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.containers, "Containers", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containersShrink)) {
            body.put("Containers", request.containersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建边缘容器应用的版本</p>
     * 
     * @param request CreateEdgeContainerAppVersionRequest
     * @return CreateEdgeContainerAppVersionResponse
     */
    public CreateEdgeContainerAppVersionResponse createEdgeContainerAppVersion(CreateEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加Namespace</p>
     * 
     * @param request CreateKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKvNamespaceResponse
     */
    public CreateKvNamespaceResponse createKvNamespaceWithOptions(CreateKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKvNamespace"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKvNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加Namespace</p>
     * 
     * @param request CreateKvNamespaceRequest
     * @return CreateKvNamespaceResponse
     */
    public CreateKvNamespaceResponse createKvNamespace(CreateKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义列表</p>
     * 
     * @param tmpReq CreateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateListResponse
     */
    public CreateListResponse createListWithOptions(CreateListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateListShrinkRequest request = new CreateListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemsShrink)) {
            body.put("Items", request.itemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            body.put("Kind", request.kind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义列表</p>
     * 
     * @param request CreateListRequest
     * @return CreateListResponse
     */
    public CreateListResponse createList(CreateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用CreatePage创建自定义响应页面</p>
     * 
     * @param request CreatePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePageResponse
     */
    public CreatePageResponse createPageWithOptions(CreatePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用CreatePage创建自定义响应页面</p>
     * 
     * @param request CreatePageRequest
     * @return CreatePageResponse
     */
    public CreatePageResponse createPage(CreatePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建记录</p>
     * 
     * @param tmpReq CreateRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecordResponse
     */
    public CreateRecordResponse createRecordWithOptions(CreateRecordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRecordShrinkRequest request = new CreateRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authConf)) {
            request.authConfShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authConf, "AuthConf", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfShrink)) {
            query.put("AuthConf", request.authConfShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            query.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            query.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostPolicy)) {
            query.put("HostPolicy", request.hostPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxied)) {
            query.put("Proxied", request.proxied);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            query.put("RecordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建记录</p>
     * 
     * @param request CreateRecordRequest
     * @return CreateRecordResponse
     */
    public CreateRecordResponse createRecord(CreateRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建routine</p>
     * 
     * @param request CreateRoutineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoutineResponse
     */
    public CreateRoutineResponse createRoutineWithOptions(CreateRoutineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specName)) {
            body.put("SpecName", request.specName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoutine"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoutineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建routine</p>
     * 
     * @param request CreateRoutineRequest
     * @return CreateRoutineResponse
     */
    public CreateRoutineResponse createRoutine(CreateRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加Routine关联域名</p>
     * 
     * @param request CreateRoutineRelatedRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoutineRelatedRecordResponse
     */
    public CreateRoutineRelatedRecordResponse createRoutineRelatedRecordWithOptions(CreateRoutineRelatedRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("RecordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoutineRelatedRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoutineRelatedRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加Routine关联域名</p>
     * 
     * @param request CreateRoutineRelatedRecordRequest
     * @return CreateRoutineRelatedRecordResponse
     */
    public CreateRoutineRelatedRecordResponse createRoutineRelatedRecord(CreateRoutineRelatedRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineRelatedRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加Routine关联路由</p>
     * 
     * @param request CreateRoutineRelatedRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoutineRelatedRouteResponse
     */
    public CreateRoutineRelatedRouteResponse createRoutineRelatedRouteWithOptions(CreateRoutineRelatedRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.route)) {
            body.put("Route", request.route);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoutineRelatedRoute"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoutineRelatedRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加Routine关联路由</p>
     * 
     * @param request CreateRoutineRelatedRouteRequest
     * @return CreateRoutineRelatedRouteResponse
     */
    public CreateRoutineRelatedRouteResponse createRoutineRelatedRoute(CreateRoutineRelatedRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoutineRelatedRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增定时预热任务的计划</p>
     * 
     * @param tmpReq CreateScheduledPreloadExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledPreloadExecutionsResponse
     */
    public CreateScheduledPreloadExecutionsResponse createScheduledPreloadExecutionsWithOptions(CreateScheduledPreloadExecutionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScheduledPreloadExecutionsShrinkRequest request = new CreateScheduledPreloadExecutionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executions)) {
            request.executionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executions, "Executions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionsShrink)) {
            body.put("Executions", request.executionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledPreloadExecutions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledPreloadExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增定时预热任务的计划</p>
     * 
     * @param request CreateScheduledPreloadExecutionsRequest
     * @return CreateScheduledPreloadExecutionsResponse
     */
    public CreateScheduledPreloadExecutionsResponse createScheduledPreloadExecutions(CreateScheduledPreloadExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledPreloadExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增定时预热任务</p>
     * 
     * @param request CreateScheduledPreloadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledPreloadJobResponse
     */
    public CreateScheduledPreloadJobResponse createScheduledPreloadJobWithOptions(CreateScheduledPreloadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.insertWay)) {
            body.put("InsertWay", request.insertWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossUrl)) {
            body.put("OssUrl", request.ossUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlList)) {
            body.put("UrlList", request.urlList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledPreloadJob"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledPreloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增定时预热任务</p>
     * 
     * @param request CreateScheduledPreloadJobRequest
     * @return CreateScheduledPreloadJobResponse
     */
    public CreateScheduledPreloadJobResponse createScheduledPreloadJob(CreateScheduledPreloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledPreloadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建站点</p>
     * 
     * @param request CreateSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSiteResponse
     */
    public CreateSiteResponse createSiteWithOptions(CreateSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverage)) {
            query.put("Coverage", request.coverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteName)) {
            query.put("SiteName", request.siteName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSite"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建站点</p>
     * 
     * @param request CreateSiteRequest
     * @return CreateSiteResponse
     */
    public CreateSiteResponse createSite(CreateSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建自定义字段</p>
     * 
     * @param tmpReq CreateSiteCustomLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSiteCustomLogResponse
     */
    public CreateSiteCustomLogResponse createSiteCustomLogWithOptions(CreateSiteCustomLogRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSiteCustomLogShrinkRequest request = new CreateSiteCustomLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cookies)) {
            request.cookiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cookies, "Cookies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.requestHeaders)) {
            request.requestHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.requestHeaders, "RequestHeaders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.responseHeaders)) {
            request.responseHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.responseHeaders, "ResponseHeaders", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookiesShrink)) {
            body.put("Cookies", request.cookiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestHeadersShrink)) {
            body.put("RequestHeaders", request.requestHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseHeadersShrink)) {
            body.put("ResponseHeaders", request.responseHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSiteCustomLog"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSiteCustomLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建自定义字段</p>
     * 
     * @param request CreateSiteCustomLogRequest
     * @return CreateSiteCustomLogResponse
     */
    public CreateSiteCustomLogResponse createSiteCustomLog(CreateSiteCustomLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSiteCustomLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建一个任务投递</p>
     * 
     * @param tmpReq CreateSiteDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSiteDeliveryTaskResponse
     */
    public CreateSiteDeliveryTaskResponse createSiteDeliveryTaskWithOptions(CreateSiteDeliveryTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSiteDeliveryTaskShrinkRequest request = new CreateSiteDeliveryTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.httpDelivery)) {
            request.httpDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.httpDelivery, "HttpDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kafkaDelivery)) {
            request.kafkaDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kafkaDelivery, "KafkaDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ossDelivery)) {
            request.ossDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ossDelivery, "OssDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.s3Delivery)) {
            request.s3DeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.s3Delivery, "S3Delivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.slsDelivery)) {
            request.slsDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.slsDelivery, "SlsDelivery", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCenter)) {
            body.put("DataCenter", request.dataCenter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            body.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardRate)) {
            body.put("DiscardRate", request.discardRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            body.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpDeliveryShrink)) {
            body.put("HttpDelivery", request.httpDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaDeliveryShrink)) {
            body.put("KafkaDelivery", request.kafkaDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossDeliveryShrink)) {
            body.put("OssDelivery", request.ossDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.s3DeliveryShrink)) {
            body.put("S3Delivery", request.s3DeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsDeliveryShrink)) {
            body.put("SlsDelivery", request.slsDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSiteDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSiteDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建一个任务投递</p>
     * 
     * @param request CreateSiteDeliveryTaskRequest
     * @return CreateSiteDeliveryTaskResponse
     */
    public CreateSiteDeliveryTaskResponse createSiteDeliveryTask(CreateSiteDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSiteDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建一个用户粒度任务投递</p>
     * 
     * @param tmpReq CreateUserDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserDeliveryTaskResponse
     */
    public CreateUserDeliveryTaskResponse createUserDeliveryTaskWithOptions(CreateUserDeliveryTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserDeliveryTaskShrinkRequest request = new CreateUserDeliveryTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.httpDelivery)) {
            request.httpDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.httpDelivery, "HttpDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kafkaDelivery)) {
            request.kafkaDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kafkaDelivery, "KafkaDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ossDelivery)) {
            request.ossDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ossDelivery, "OssDelivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.s3Delivery)) {
            request.s3DeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.s3Delivery, "S3Delivery", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.slsDelivery)) {
            request.slsDeliveryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.slsDelivery, "SlsDelivery", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCenter)) {
            body.put("DataCenter", request.dataCenter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            body.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardRate)) {
            body.put("DiscardRate", request.discardRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            body.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpDeliveryShrink)) {
            body.put("HttpDelivery", request.httpDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaDeliveryShrink)) {
            body.put("KafkaDelivery", request.kafkaDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossDeliveryShrink)) {
            body.put("OssDelivery", request.ossDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.s3DeliveryShrink)) {
            body.put("S3Delivery", request.s3DeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsDeliveryShrink)) {
            body.put("SlsDelivery", request.slsDeliveryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建一个用户粒度任务投递</p>
     * 
     * @param request CreateUserDeliveryTaskRequest
     * @return CreateUserDeliveryTaskResponse
     */
    public CreateUserDeliveryTaskResponse createUserDeliveryTask(CreateUserDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建WAF规则</p>
     * 
     * @param tmpReq CreateWafRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWafRuleResponse
     */
    public CreateWafRuleResponse createWafRuleWithOptions(CreateWafRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWafRuleShrinkRequest request = new CreateWafRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configShrink)) {
            body.put("Config", request.configShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWafRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWafRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建WAF规则</p>
     * 
     * @param request CreateWafRuleRequest
     * @return CreateWafRuleResponse
     */
    public CreateWafRuleResponse createWafRule(CreateWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建等候室</p>
     * 
     * @param tmpReq CreateWaitingRoomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWaitingRoomResponse
     */
    public CreateWaitingRoomResponse createWaitingRoomWithOptions(CreateWaitingRoomRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWaitingRoomShrinkRequest request = new CreateWaitingRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hostNameAndPath)) {
            request.hostNameAndPathShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hostNameAndPath, "HostNameAndPath", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookieName)) {
            query.put("CookieName", request.cookieName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPageHtml)) {
            query.put("CustomPageHtml", request.customPageHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionRenewalEnable)) {
            query.put("DisableSessionRenewalEnable", request.disableSessionRenewalEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostNameAndPathShrink)) {
            query.put("HostNameAndPath", request.hostNameAndPathShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonResponseEnable)) {
            query.put("JsonResponseEnable", request.jsonResponseEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUsersPerMinute)) {
            query.put("NewUsersPerMinute", request.newUsersPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueAllEnable)) {
            query.put("QueueAllEnable", request.queueAllEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingMethod)) {
            query.put("QueuingMethod", request.queuingMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingStatusCode)) {
            query.put("QueuingStatusCode", request.queuingStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalActiveUsers)) {
            query.put("TotalActiveUsers", request.totalActiveUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomType)) {
            query.put("WaitingRoomType", request.waitingRoomType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWaitingRoom"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWaitingRoomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建等候室</p>
     * 
     * @param request CreateWaitingRoomRequest
     * @return CreateWaitingRoomResponse
     */
    public CreateWaitingRoomResponse createWaitingRoom(CreateWaitingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWaitingRoomWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建等候室事件</p>
     * 
     * @param request CreateWaitingRoomEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWaitingRoomEventResponse
     */
    public CreateWaitingRoomEventResponse createWaitingRoomEventWithOptions(CreateWaitingRoomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPageHtml)) {
            query.put("CustomPageHtml", request.customPageHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionRenewalEnable)) {
            query.put("DisableSessionRenewalEnable", request.disableSessionRenewalEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonResponseEnable)) {
            query.put("JsonResponseEnable", request.jsonResponseEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUsersPerMinute)) {
            query.put("NewUsersPerMinute", request.newUsersPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preQueueEnable)) {
            query.put("PreQueueEnable", request.preQueueEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preQueueStartTime)) {
            query.put("PreQueueStartTime", request.preQueueStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingMethod)) {
            query.put("QueuingMethod", request.queuingMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingStatusCode)) {
            query.put("QueuingStatusCode", request.queuingStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomPreQueueEnable)) {
            query.put("RandomPreQueueEnable", request.randomPreQueueEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalActiveUsers)) {
            query.put("TotalActiveUsers", request.totalActiveUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomId)) {
            query.put("WaitingRoomId", request.waitingRoomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomType)) {
            query.put("WaitingRoomType", request.waitingRoomType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWaitingRoomEvent"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWaitingRoomEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建等候室事件</p>
     * 
     * @param request CreateWaitingRoomEventRequest
     * @return CreateWaitingRoomEventResponse
     */
    public CreateWaitingRoomEventResponse createWaitingRoomEvent(CreateWaitingRoomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWaitingRoomEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建等候室规则</p>
     * 
     * @param request CreateWaitingRoomRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWaitingRoomRuleResponse
     */
    public CreateWaitingRoomRuleResponse createWaitingRoomRuleWithOptions(CreateWaitingRoomRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomId)) {
            query.put("WaitingRoomId", request.waitingRoomId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWaitingRoomRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWaitingRoomRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建等候室规则</p>
     * 
     * @param request CreateWaitingRoomRuleRequest
     * @return CreateWaitingRoomRuleResponse
     */
    public CreateWaitingRoomRuleResponse createWaitingRoomRule(CreateWaitingRoomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWaitingRoomRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除定制场景策略</p>
     * 
     * @param request DeleteCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomScenePolicyResponse
     */
    public DeleteCustomScenePolicyResponse deleteCustomScenePolicyWithOptions(DeleteCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除定制场景策略</p>
     * 
     * @param request DeleteCustomScenePolicyRequest
     * @return DeleteCustomScenePolicyResponse
     */
    public DeleteCustomScenePolicyResponse deleteCustomScenePolicy(DeleteCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除边缘容器的应用</p>
     * 
     * @param request DeleteEdgeContainerAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEdgeContainerAppResponse
     */
    public DeleteEdgeContainerAppResponse deleteEdgeContainerAppWithOptions(DeleteEdgeContainerAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeContainerApp"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeContainerAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除边缘容器的应用</p>
     * 
     * @param request DeleteEdgeContainerAppRequest
     * @return DeleteEdgeContainerAppResponse
     */
    public DeleteEdgeContainerAppResponse deleteEdgeContainerApp(DeleteEdgeContainerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEdgeContainerAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个边缘容器应用的域名记录</p>
     * 
     * @param request DeleteEdgeContainerAppRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEdgeContainerAppRecordResponse
     */
    public DeleteEdgeContainerAppRecordResponse deleteEdgeContainerAppRecordWithOptions(DeleteEdgeContainerAppRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("RecordName", request.recordName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeContainerAppRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeContainerAppRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个边缘容器应用的域名记录</p>
     * 
     * @param request DeleteEdgeContainerAppRecordRequest
     * @return DeleteEdgeContainerAppRecordResponse
     */
    public DeleteEdgeContainerAppRecordResponse deleteEdgeContainerAppRecord(DeleteEdgeContainerAppRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEdgeContainerAppRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除边缘容器应用的版本</p>
     * 
     * @param request DeleteEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEdgeContainerAppVersionResponse
     */
    public DeleteEdgeContainerAppVersionResponse deleteEdgeContainerAppVersionWithOptions(DeleteEdgeContainerAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除边缘容器应用的版本</p>
     * 
     * @param request DeleteEdgeContainerAppVersionRequest
     * @return DeleteEdgeContainerAppVersionResponse
     */
    public DeleteEdgeContainerAppVersionResponse deleteEdgeContainerAppVersion(DeleteEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Namespace的Key-Value对</p>
     * 
     * @param request DeleteKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKvResponse
     */
    public DeleteKvResponse deleteKvWithOptions(DeleteKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Namespace的Key-Value对</p>
     * 
     * @param request DeleteKvRequest
     * @return DeleteKvResponse
     */
    public DeleteKvResponse deleteKv(DeleteKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Namespace</p>
     * 
     * @param request DeleteKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKvNamespaceResponse
     */
    public DeleteKvNamespaceResponse deleteKvNamespaceWithOptions(DeleteKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKvNamespace"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKvNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Namespace</p>
     * 
     * @param request DeleteKvNamespaceRequest
     * @return DeleteKvNamespaceResponse
     */
    public DeleteKvNamespaceResponse deleteKvNamespace(DeleteKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义列表</p>
     * 
     * @param request DeleteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteListResponse
     */
    public DeleteListResponse deleteListWithOptions(DeleteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义列表</p>
     * 
     * @param request DeleteListRequest
     * @return DeleteListResponse
     */
    public DeleteListResponse deleteList(DeleteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义响应页面</p>
     * 
     * @param request DeletePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePageResponse
     */
    public DeletePageResponse deletePageWithOptions(DeletePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义响应页面</p>
     * 
     * @param request DeletePageRequest
     * @return DeletePageResponse
     */
    public DeletePageResponse deletePage(DeletePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除记录</p>
     * 
     * @param request DeleteRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecordResponse
     */
    public DeleteRecordResponse deleteRecordWithOptions(DeleteRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除记录</p>
     * 
     * @param request DeleteRecordRequest
     * @return DeleteRecordResponse
     */
    public DeleteRecordResponse deleteRecord(DeleteRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Routine</p>
     * 
     * @param request DeleteRoutineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineResponse
     */
    public DeleteRoutineResponse deleteRoutineWithOptions(DeleteRoutineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutine"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Routine</p>
     * 
     * @param request DeleteRoutineRequest
     * @return DeleteRoutineResponse
     */
    public DeleteRoutineResponse deleteRoutine(DeleteRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Routine某版本代码</p>
     * 
     * @param request DeleteRoutineCodeVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineCodeVersionResponse
     */
    public DeleteRoutineCodeVersionResponse deleteRoutineCodeVersionWithOptions(DeleteRoutineCodeVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeVersion)) {
            body.put("CodeVersion", request.codeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineCodeVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineCodeVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Routine某版本代码</p>
     * 
     * @param request DeleteRoutineCodeVersionRequest
     * @return DeleteRoutineCodeVersionResponse
     */
    public DeleteRoutineCodeVersionResponse deleteRoutineCodeVersion(DeleteRoutineCodeVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineCodeVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Routine关联域名</p>
     * 
     * @param request DeleteRoutineRelatedRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineRelatedRecordResponse
     */
    public DeleteRoutineRelatedRecordResponse deleteRoutineRelatedRecordWithOptions(DeleteRoutineRelatedRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            body.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordName)) {
            body.put("RecordName", request.recordName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineRelatedRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineRelatedRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Routine关联域名</p>
     * 
     * @param request DeleteRoutineRelatedRecordRequest
     * @return DeleteRoutineRelatedRecordResponse
     */
    public DeleteRoutineRelatedRecordResponse deleteRoutineRelatedRecord(DeleteRoutineRelatedRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineRelatedRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Routine关联路由</p>
     * 
     * @param request DeleteRoutineRelatedRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoutineRelatedRouteResponse
     */
    public DeleteRoutineRelatedRouteResponse deleteRoutineRelatedRouteWithOptions(DeleteRoutineRelatedRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.route)) {
            body.put("Route", request.route);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            body.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoutineRelatedRoute"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoutineRelatedRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Routine关联路由</p>
     * 
     * @param request DeleteRoutineRelatedRouteRequest
     * @return DeleteRoutineRelatedRouteResponse
     */
    public DeleteRoutineRelatedRouteResponse deleteRoutineRelatedRoute(DeleteRoutineRelatedRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoutineRelatedRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除单个定时预热计划</p>
     * 
     * @param request DeleteScheduledPreloadExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledPreloadExecutionResponse
     */
    public DeleteScheduledPreloadExecutionResponse deleteScheduledPreloadExecutionWithOptions(DeleteScheduledPreloadExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledPreloadExecution"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledPreloadExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除单个定时预热计划</p>
     * 
     * @param request DeleteScheduledPreloadExecutionRequest
     * @return DeleteScheduledPreloadExecutionResponse
     */
    public DeleteScheduledPreloadExecutionResponse deleteScheduledPreloadExecution(DeleteScheduledPreloadExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledPreloadExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定定时预热任务</p>
     * 
     * @param request DeleteScheduledPreloadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledPreloadJobResponse
     */
    public DeleteScheduledPreloadJobResponse deleteScheduledPreloadJobWithOptions(DeleteScheduledPreloadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledPreloadJob"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledPreloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定定时预热任务</p>
     * 
     * @param request DeleteScheduledPreloadJobRequest
     * @return DeleteScheduledPreloadJobResponse
     */
    public DeleteScheduledPreloadJobResponse deleteScheduledPreloadJob(DeleteScheduledPreloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledPreloadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除站点</p>
     * 
     * @param request DeleteSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSiteResponse
     */
    public DeleteSiteResponse deleteSiteWithOptions(DeleteSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSite"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除站点</p>
     * 
     * @param request DeleteSiteRequest
     * @return DeleteSiteResponse
     */
    public DeleteSiteResponse deleteSite(DeleteSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个任务投递</p>
     * 
     * @param request DeleteSiteDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSiteDeliveryTaskResponse
     */
    public DeleteSiteDeliveryTaskResponse deleteSiteDeliveryTaskWithOptions(DeleteSiteDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSiteDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSiteDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个任务投递</p>
     * 
     * @param request DeleteSiteDeliveryTaskRequest
     * @return DeleteSiteDeliveryTaskResponse
     */
    public DeleteSiteDeliveryTaskResponse deleteSiteDeliveryTask(DeleteSiteDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSiteDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个用户任务投递</p>
     * 
     * @param request DeleteUserDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserDeliveryTaskResponse
     */
    public DeleteUserDeliveryTaskResponse deleteUserDeliveryTaskWithOptions(DeleteUserDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个用户任务投递</p>
     * 
     * @param request DeleteUserDeliveryTaskRequest
     * @return DeleteUserDeliveryTaskResponse
     */
    public DeleteUserDeliveryTaskResponse deleteUserDeliveryTask(DeleteUserDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除WAF规则</p>
     * 
     * @param request DeleteWafRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWafRuleResponse
     */
    public DeleteWafRuleResponse deleteWafRuleWithOptions(DeleteWafRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWafRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWafRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除WAF规则</p>
     * 
     * @param request DeleteWafRuleRequest
     * @return DeleteWafRuleResponse
     */
    public DeleteWafRuleResponse deleteWafRule(DeleteWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除WAF规则集</p>
     * 
     * @param request DeleteWafRulesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWafRulesetResponse
     */
    public DeleteWafRulesetResponse deleteWafRulesetWithOptions(DeleteWafRulesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWafRuleset"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWafRulesetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除WAF规则集</p>
     * 
     * @param request DeleteWafRulesetRequest
     * @return DeleteWafRulesetResponse
     */
    public DeleteWafRulesetResponse deleteWafRuleset(DeleteWafRulesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWafRulesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除等候室</p>
     * 
     * @param request DeleteWaitingRoomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWaitingRoomResponse
     */
    public DeleteWaitingRoomResponse deleteWaitingRoomWithOptions(DeleteWaitingRoomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomId)) {
            query.put("WaitingRoomId", request.waitingRoomId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWaitingRoom"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWaitingRoomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除等候室</p>
     * 
     * @param request DeleteWaitingRoomRequest
     * @return DeleteWaitingRoomResponse
     */
    public DeleteWaitingRoomResponse deleteWaitingRoom(DeleteWaitingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWaitingRoomWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除等候室事件</p>
     * 
     * @param request DeleteWaitingRoomEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWaitingRoomEventResponse
     */
    public DeleteWaitingRoomEventResponse deleteWaitingRoomEventWithOptions(DeleteWaitingRoomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomEventId)) {
            query.put("WaitingRoomEventId", request.waitingRoomEventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWaitingRoomEvent"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWaitingRoomEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除等候室事件</p>
     * 
     * @param request DeleteWaitingRoomEventRequest
     * @return DeleteWaitingRoomEventResponse
     */
    public DeleteWaitingRoomEventResponse deleteWaitingRoomEvent(DeleteWaitingRoomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWaitingRoomEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除等候室规则</p>
     * 
     * @param request DeleteWaitingRoomRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWaitingRoomRuleResponse
     */
    public DeleteWaitingRoomRuleResponse deleteWaitingRoomRuleWithOptions(DeleteWaitingRoomRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomRuleId)) {
            query.put("WaitingRoomRuleId", request.waitingRoomRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWaitingRoomRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWaitingRoomRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除等候室规则</p>
     * 
     * @param request DeleteWaitingRoomRuleRequest
     * @return DeleteWaitingRoomRuleResponse
     */
    public DeleteWaitingRoomRuleResponse deleteWaitingRoomRule(DeleteWaitingRoomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWaitingRoomRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询定制场景策略配置</p>
     * 
     * @param request DescribeCustomScenePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomScenePoliciesResponse
     */
    public DescribeCustomScenePoliciesResponse describeCustomScenePoliciesWithOptions(DescribeCustomScenePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomScenePolicies"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomScenePoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询定制场景策略配置</p>
     * 
     * @param request DescribeCustomScenePoliciesRequest
     * @return DescribeCustomScenePoliciesResponse
     */
    public DescribeCustomScenePoliciesResponse describeCustomScenePolicies(DescribeCustomScenePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomScenePoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>攻击分析-查询攻击事件列表</p>
     * 
     * @param request DescribeDDoSAllEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDDoSAllEventListResponse
     */
    public DescribeDDoSAllEventListResponse describeDDoSAllEventListWithOptions(DescribeDDoSAllEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDDoSAllEventList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDDoSAllEventListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>攻击分析-查询攻击事件列表</p>
     * 
     * @param request DescribeDDoSAllEventListRequest
     * @return DescribeDDoSAllEventListResponse
     */
    public DescribeDDoSAllEventListResponse describeDDoSAllEventList(DescribeDDoSAllEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDDoSAllEventListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询HTTP DDoS智能防护配置信息</p>
     * 
     * @param request DescribeHttpDDoSAttackIntelligentProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHttpDDoSAttackIntelligentProtectionResponse
     */
    public DescribeHttpDDoSAttackIntelligentProtectionResponse describeHttpDDoSAttackIntelligentProtectionWithOptions(DescribeHttpDDoSAttackIntelligentProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHttpDDoSAttackIntelligentProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHttpDDoSAttackIntelligentProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询HTTP DDoS智能防护配置信息</p>
     * 
     * @param request DescribeHttpDDoSAttackIntelligentProtectionRequest
     * @return DescribeHttpDDoSAttackIntelligentProtectionResponse
     */
    public DescribeHttpDDoSAttackIntelligentProtectionResponse describeHttpDDoSAttackIntelligentProtection(DescribeHttpDDoSAttackIntelligentProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHttpDDoSAttackIntelligentProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询HTTP DDoS攻击防护配置信息</p>
     * 
     * @param request DescribeHttpDDoSAttackProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHttpDDoSAttackProtectionResponse
     */
    public DescribeHttpDDoSAttackProtectionResponse describeHttpDDoSAttackProtectionWithOptions(DescribeHttpDDoSAttackProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHttpDDoSAttackProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHttpDDoSAttackProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询HTTP DDoS攻击防护配置信息</p>
     * 
     * @param request DescribeHttpDDoSAttackProtectionRequest
     * @return DescribeHttpDDoSAttackProtectionResponse
     */
    public DescribeHttpDDoSAttackProtectionResponse describeHttpDDoSAttackProtection(DescribeHttpDDoSAttackProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHttpDDoSAttackProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询加速服务节点IP段列表</p>
     * 
     * @param request DescribeIPRangeListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIPRangeListResponse
     */
    public DescribeIPRangeListResponse describeIPRangeListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIPRangeList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIPRangeListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询加速服务节点IP段列表</p>
     * @return DescribeIPRangeListResponse
     */
    public DescribeIPRangeListResponse describeIPRangeList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIPRangeListWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询账户的KV状态信</p>
     * 
     * @param request DescribeKvAccountStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKvAccountStatusResponse
     */
    public DescribeKvAccountStatusResponse describeKvAccountStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKvAccountStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKvAccountStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询账户的KV状态信</p>
     * @return DescribeKvAccountStatusResponse
     */
    public DescribeKvAccountStatusResponse describeKvAccountStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKvAccountStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预热任务查询接口</p>
     * 
     * @param request DescribePreloadTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePreloadTasksResponse
     */
    public DescribePreloadTasksResponse describePreloadTasksWithOptions(DescribePreloadTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreloadTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreloadTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预热任务查询接口</p>
     * 
     * @param request DescribePreloadTasksRequest
     * @return DescribePreloadTasksResponse
     */
    public DescribePreloadTasksResponse describePreloadTasks(DescribePreloadTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreloadTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>刷新任务查询接口</p>
     * 
     * @param request DescribePurgeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePurgeTasksResponse
     */
    public DescribePurgeTasksResponse describePurgeTasksWithOptions(DescribePurgeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurgeTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurgeTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>刷新任务查询接口</p>
     * 
     * @param request DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     */
    public DescribePurgeTasksResponse describePurgeTasks(DescribePurgeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurgeTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用定制场景策略</p>
     * 
     * @param request DisableCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCustomScenePolicyResponse
     */
    public DisableCustomScenePolicyResponse disableCustomScenePolicyWithOptions(DisableCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用定制场景策略</p>
     * 
     * @param request DisableCustomScenePolicyRequest
     * @return DisableCustomScenePolicyResponse
     */
    public DisableCustomScenePolicyResponse disableCustomScenePolicy(DisableCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑站点WAF配置</p>
     * 
     * @param tmpReq EditSiteWafSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditSiteWafSettingsResponse
     */
    public EditSiteWafSettingsResponse editSiteWafSettingsWithOptions(EditSiteWafSettingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EditSiteWafSettingsShrinkRequest request = new EditSiteWafSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.settings)) {
            request.settingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.settings, "Settings", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.settingsShrink)) {
            body.put("Settings", request.settingsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditSiteWafSettings"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditSiteWafSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑站点WAF配置</p>
     * 
     * @param request EditSiteWafSettingsRequest
     * @return EditSiteWafSettingsResponse
     */
    public EditSiteWafSettingsResponse editSiteWafSettings(EditSiteWafSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editSiteWafSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动定制场景策略</p>
     * 
     * @param request EnableCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCustomScenePolicyResponse
     */
    public EnableCustomScenePolicyResponse enableCustomScenePolicyWithOptions(EnableCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动定制场景策略</p>
     * 
     * @param request EnableCustomScenePolicyRequest
     * @return EnableCustomScenePolicyResponse
     */
    public EnableCustomScenePolicyResponse enableCustomScenePolicy(EnableCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出记录</p>
     * 
     * @param request ExportRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportRecordsResponse
     */
    public ExportRecordsResponse exportRecordsWithOptions(ExportRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出记录</p>
     * 
     * @param request ExportRecordsRequest
     * @return ExportRecordsResponse
     */
    public ExportRecordsResponse exportRecords(ExportRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询缓存保持实例规格</p>
     * 
     * @param request GetCacheReserveSpecificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCacheReserveSpecificationResponse
     */
    public GetCacheReserveSpecificationResponse getCacheReserveSpecificationWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCacheReserveSpecification"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCacheReserveSpecificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询缓存保持实例规格</p>
     * @return GetCacheReserveSpecificationResponse
     */
    public GetCacheReserveSpecificationResponse getCacheReserveSpecification() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCacheReserveSpecificationWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用信息</p>
     * 
     * @param request GetEdgeContainerAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppResponse
     */
    public GetEdgeContainerAppResponse getEdgeContainerAppWithOptions(GetEdgeContainerAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerApp"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用信息</p>
     * 
     * @param request GetEdgeContainerAppRequest
     * @return GetEdgeContainerAppResponse
     */
    public GetEdgeContainerAppResponse getEdgeContainerApp(GetEdgeContainerAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用的状态信息</p>
     * 
     * @param request GetEdgeContainerAppStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppStatusResponse
     */
    public GetEdgeContainerAppStatusResponse getEdgeContainerAppStatusWithOptions(GetEdgeContainerAppStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishEnv)) {
            query.put("PublishEnv", request.publishEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerAppStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用的状态信息</p>
     * 
     * @param request GetEdgeContainerAppStatusRequest
     * @return GetEdgeContainerAppStatusResponse
     */
    public GetEdgeContainerAppStatusResponse getEdgeContainerAppStatus(GetEdgeContainerAppStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用的某个版本信息</p>
     * 
     * @param request GetEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerAppVersionResponse
     */
    public GetEdgeContainerAppVersionResponse getEdgeContainerAppVersionWithOptions(GetEdgeContainerAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用的某个版本信息</p>
     * 
     * @param request GetEdgeContainerAppVersionRequest
     * @return GetEdgeContainerAppVersionResponse
     */
    public GetEdgeContainerAppVersionResponse getEdgeContainerAppVersion(GetEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用部署区域</p>
     * 
     * @param request GetEdgeContainerDeployRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerDeployRegionsResponse
     */
    public GetEdgeContainerDeployRegionsResponse getEdgeContainerDeployRegionsWithOptions(GetEdgeContainerDeployRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerDeployRegions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerDeployRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用部署区域</p>
     * 
     * @param request GetEdgeContainerDeployRegionsRequest
     * @return GetEdgeContainerDeployRegionsResponse
     */
    public GetEdgeContainerDeployRegionsResponse getEdgeContainerDeployRegions(GetEdgeContainerDeployRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerDeployRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器日志信息</p>
     * 
     * @param request GetEdgeContainerLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerLogsResponse
     */
    public GetEdgeContainerLogsResponse getEdgeContainerLogsWithOptions(GetEdgeContainerLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerLogs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器日志信息</p>
     * 
     * @param request GetEdgeContainerLogsRequest
     * @return GetEdgeContainerLogsResponse
     */
    public GetEdgeContainerLogsResponse getEdgeContainerLogs(GetEdgeContainerLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用测试环境部署状态</p>
     * 
     * @param request GetEdgeContainerStagingDeployStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerStagingDeployStatusResponse
     */
    public GetEdgeContainerStagingDeployStatusResponse getEdgeContainerStagingDeployStatusWithOptions(GetEdgeContainerStagingDeployStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerStagingDeployStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerStagingDeployStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用测试环境部署状态</p>
     * 
     * @param request GetEdgeContainerStagingDeployStatusRequest
     * @return GetEdgeContainerStagingDeployStatusResponse
     */
    public GetEdgeContainerStagingDeployStatusResponse getEdgeContainerStagingDeployStatus(GetEdgeContainerStagingDeployStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerStagingDeployStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用终端信息</p>
     * 
     * @param request GetEdgeContainerTerminalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeContainerTerminalResponse
     */
    public GetEdgeContainerTerminalResponse getEdgeContainerTerminalWithOptions(GetEdgeContainerTerminalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeContainerTerminal"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeContainerTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用终端信息</p>
     * 
     * @param request GetEdgeContainerTerminalRequest
     * @return GetEdgeContainerTerminalResponse
     */
    public GetEdgeContainerTerminalResponse getEdgeContainerTerminal(GetEdgeContainerTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeContainerTerminalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetErService</p>
     * 
     * @param request GetErServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErServiceResponse
     */
    public GetErServiceResponse getErServiceWithOptions(GetErServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetErService"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetErServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetErService</p>
     * 
     * @param request GetErServiceRequest
     * @return GetErServiceResponse
     */
    public GetErServiceResponse getErService(GetErServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Key-Value对的某个Key值</p>
     * 
     * @param request GetKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKvResponse
     */
    public GetKvResponse getKvWithOptions(GetKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Key-Value对的某个Key值</p>
     * 
     * @param request GetKvRequest
     * @return GetKvResponse
     */
    public GetKvResponse getKv(GetKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出账号下的NS</p>
     * 
     * @param request GetKvAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKvAccountResponse
     */
    public GetKvAccountResponse getKvAccountWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKvAccount"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKvAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出账号下的NS</p>
     * @return GetKvAccountResponse
     */
    public GetKvAccountResponse getKvAccount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKvAccountWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Namespace信息</p>
     * 
     * @param request GetKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKvNamespaceResponse
     */
    public GetKvNamespaceResponse getKvNamespaceWithOptions(GetKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKvNamespace"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKvNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Namespace信息</p>
     * 
     * @param request GetKvNamespaceRequest
     * @return GetKvNamespaceResponse
     */
    public GetKvNamespaceResponse getKvNamespace(GetKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个自定义列表</p>
     * 
     * @param request GetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListResponse
     */
    public GetListResponse getListWithOptions(GetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个自定义列表</p>
     * 
     * @param request GetListRequest
     * @return GetListResponse
     */
    public GetListResponse getList(GetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个自定义响应页面详情</p>
     * 
     * @param request GetPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPageResponse
     */
    public GetPageResponse getPageWithOptions(GetPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个自定义响应页面详情</p>
     * 
     * @param request GetPageRequest
     * @return GetPageResponse
     */
    public GetPageResponse getPage(GetPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取刷新Quota</p>
     * 
     * @param request GetPurgeQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPurgeQuotaResponse
     */
    public GetPurgeQuotaResponse getPurgeQuotaWithOptions(GetPurgeQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPurgeQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPurgeQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取刷新Quota</p>
     * 
     * @param request GetPurgeQuotaRequest
     * @return GetPurgeQuotaResponse
     */
    public GetPurgeQuotaResponse getPurgeQuota(GetPurgeQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPurgeQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ub日志字段列表接口</p>
     * 
     * @param request GetRealtimeDeliveryFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealtimeDeliveryFieldResponse
     */
    public GetRealtimeDeliveryFieldResponse getRealtimeDeliveryFieldWithOptions(GetRealtimeDeliveryFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeDeliveryField"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeDeliveryFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ub日志字段列表接口</p>
     * 
     * @param request GetRealtimeDeliveryFieldRequest
     * @return GetRealtimeDeliveryFieldResponse
     */
    public GetRealtimeDeliveryFieldResponse getRealtimeDeliveryField(GetRealtimeDeliveryFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeDeliveryFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个记录信息</p>
     * 
     * @param request GetRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecordResponse
     */
    public GetRecordResponse getRecordWithOptions(GetRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个记录信息</p>
     * 
     * @param request GetRecordRequest
     * @return GetRecordResponse
     */
    public GetRecordResponse getRecord(GetRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Routine配置信息</p>
     * 
     * @param request GetRoutineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineResponse
     */
    public GetRoutineResponse getRoutineWithOptions(GetRoutineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutine"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Routine配置信息</p>
     * 
     * @param request GetRoutineRequest
     * @return GetRoutineResponse
     */
    public GetRoutineResponse getRoutine(GetRoutineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传Routine的测试版本代码, 返回上传代码到OSS的参数</p>
     * 
     * @param request GetRoutineStagingCodeUploadInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineStagingCodeUploadInfoResponse
     */
    public GetRoutineStagingCodeUploadInfoResponse getRoutineStagingCodeUploadInfoWithOptions(GetRoutineStagingCodeUploadInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeDescription)) {
            body.put("CodeDescription", request.codeDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutineStagingCodeUploadInfo"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineStagingCodeUploadInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传Routine的测试版本代码, 返回上传代码到OSS的参数</p>
     * 
     * @param request GetRoutineStagingCodeUploadInfoRequest
     * @return GetRoutineStagingCodeUploadInfoResponse
     */
    public GetRoutineStagingCodeUploadInfoResponse getRoutineStagingCodeUploadInfo(GetRoutineStagingCodeUploadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineStagingCodeUploadInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘函数测试环境IP</p>
     * 
     * @param request GetRoutineStagingEnvIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineStagingEnvIpResponse
     */
    public GetRoutineStagingEnvIpResponse getRoutineStagingEnvIpWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutineStagingEnvIp"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineStagingEnvIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘函数测试环境IP</p>
     * @return GetRoutineStagingEnvIpResponse
     */
    public GetRoutineStagingEnvIpResponse getRoutineStagingEnvIp() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineStagingEnvIpWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户的Routine列表</p>
     * 
     * @param request GetRoutineUserInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoutineUserInfoResponse
     */
    public GetRoutineUserInfoResponse getRoutineUserInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoutineUserInfo"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoutineUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户的Routine列表</p>
     * @return GetRoutineUserInfoResponse
     */
    public GetRoutineUserInfoResponse getRoutineUserInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoutineUserInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个定时预热任务</p>
     * 
     * @param request GetScheduledPreloadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledPreloadJobResponse
     */
    public GetScheduledPreloadJobResponse getScheduledPreloadJobWithOptions(GetScheduledPreloadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledPreloadJob"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduledPreloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个定时预热任务</p>
     * 
     * @param request GetScheduledPreloadJobRequest
     * @return GetScheduledPreloadJobResponse
     */
    public GetScheduledPreloadJobResponse getScheduledPreloadJob(GetScheduledPreloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScheduledPreloadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个站点信息</p>
     * 
     * @param request GetSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteResponse
     */
    public GetSiteResponse getSiteWithOptions(GetSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSite"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个站点信息</p>
     * 
     * @param request GetSiteRequest
     * @return GetSiteResponse
     */
    public GetSiteResponse getSite(GetSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前NS列表</p>
     * 
     * @param request GetSiteCurrentNSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteCurrentNSResponse
     */
    public GetSiteCurrentNSResponse getSiteCurrentNSWithOptions(GetSiteCurrentNSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteCurrentNS"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteCurrentNSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前NS列表</p>
     * 
     * @param request GetSiteCurrentNSRequest
     * @return GetSiteCurrentNSResponse
     */
    public GetSiteCurrentNSResponse getSiteCurrentNS(GetSiteCurrentNSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteCurrentNSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义字段</p>
     * 
     * @param request GetSiteCustomLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteCustomLogResponse
     */
    public GetSiteCustomLogResponse getSiteCustomLogWithOptions(GetSiteCustomLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteCustomLog"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteCustomLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义字段</p>
     * 
     * @param request GetSiteCustomLogRequest
     * @return GetSiteCustomLogResponse
     */
    public GetSiteCustomLogResponse getSiteCustomLog(GetSiteCustomLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteCustomLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个实时日志任务投递</p>
     * 
     * @param request GetSiteDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteDeliveryTaskResponse
     */
    public GetSiteDeliveryTaskResponse getSiteDeliveryTaskWithOptions(GetSiteDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个实时日志任务投递</p>
     * 
     * @param request GetSiteDeliveryTaskRequest
     * @return GetSiteDeliveryTaskResponse
     */
    public GetSiteDeliveryTaskResponse getSiteDeliveryTask(GetSiteDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志投递任务quota数</p>
     * 
     * @param request GetSiteLogDeliveryQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteLogDeliveryQuotaResponse
     */
    public GetSiteLogDeliveryQuotaResponse getSiteLogDeliveryQuotaWithOptions(GetSiteLogDeliveryQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteLogDeliveryQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteLogDeliveryQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志投递任务quota数</p>
     * 
     * @param request GetSiteLogDeliveryQuotaRequest
     * @return GetSiteLogDeliveryQuotaResponse
     */
    public GetSiteLogDeliveryQuotaResponse getSiteLogDeliveryQuota(GetSiteLogDeliveryQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteLogDeliveryQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取站点WAF配置</p>
     * 
     * @param request GetSiteWafSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSiteWafSettingsResponse
     */
    public GetSiteWafSettingsResponse getSiteWafSettingsWithOptions(GetSiteWafSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSiteWafSettings"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSiteWafSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取站点WAF配置</p>
     * 
     * @param request GetSiteWafSettingsRequest
     * @return GetSiteWafSettingsResponse
     */
    public GetSiteWafSettingsResponse getSiteWafSettings(GetSiteWafSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSiteWafSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文件上传任务查询接口</p>
     * 
     * @param request GetUploadTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadTaskResponse
     */
    public GetUploadTaskResponse getUploadTaskWithOptions(GetUploadTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文件上传任务查询接口</p>
     * 
     * @param request GetUploadTaskRequest
     * @return GetUploadTaskResponse
     */
    public GetUploadTaskResponse getUploadTask(GetUploadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个用户粒度任务投递</p>
     * 
     * @param request GetUserDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserDeliveryTaskResponse
     */
    public GetUserDeliveryTaskResponse getUserDeliveryTaskWithOptions(GetUserDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个用户粒度任务投递</p>
     * 
     * @param request GetUserDeliveryTaskRequest
     * @return GetUserDeliveryTaskResponse
     */
    public GetUserDeliveryTaskResponse getUserDeliveryTask(GetUserDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志投递任务用户quota数</p>
     * 
     * @param request GetUserLogDeliveryQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserLogDeliveryQuotaResponse
     */
    public GetUserLogDeliveryQuotaResponse getUserLogDeliveryQuotaWithOptions(GetUserLogDeliveryQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserLogDeliveryQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserLogDeliveryQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志投递任务用户quota数</p>
     * 
     * @param request GetUserLogDeliveryQuotaRequest
     * @return GetUserLogDeliveryQuotaResponse
     */
    public GetUserLogDeliveryQuotaResponse getUserLogDeliveryQuota(GetUserLogDeliveryQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserLogDeliveryQuotaWithOptions(request, runtime);
    }

    /**
     * @param request GetWafBotAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafBotAppKeyResponse
     */
    public GetWafBotAppKeyResponse getWafBotAppKeyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafBotAppKey"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafBotAppKeyResponse());
    }

    /**
     * @return GetWafBotAppKeyResponse
     */
    public GetWafBotAppKeyResponse getWafBotAppKey() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafBotAppKeyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将匹配项转换为表达式</p>
     * 
     * @param request GetWafFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafFilterResponse
     */
    public GetWafFilterResponse getWafFilterWithOptions(GetWafFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafFilter"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将匹配项转换为表达式</p>
     * 
     * @param request GetWafFilterRequest
     * @return GetWafFilterResponse
     */
    public GetWafFilterResponse getWafFilter(GetWafFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafFilterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取WAF配额详情</p>
     * 
     * @param request GetWafQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafQuotaResponse
     */
    public GetWafQuotaResponse getWafQuotaWithOptions(GetWafQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paths)) {
            query.put("Paths", request.paths);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafQuota"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取WAF配额详情</p>
     * 
     * @param request GetWafQuotaRequest
     * @return GetWafQuotaResponse
     */
    public GetWafQuotaResponse getWafQuota(GetWafQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个WAF规则详情</p>
     * 
     * @param request GetWafRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafRuleResponse
     */
    public GetWafRuleResponse getWafRuleWithOptions(GetWafRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个WAF规则详情</p>
     * 
     * @param request GetWafRuleRequest
     * @return GetWafRuleResponse
     */
    public GetWafRuleResponse getWafRule(GetWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取WAF规则集详情</p>
     * 
     * @param request GetWafRulesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWafRulesetResponse
     */
    public GetWafRulesetResponse getWafRulesetWithOptions(GetWafRulesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWafRuleset"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWafRulesetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取WAF规则集详情</p>
     * 
     * @param request GetWafRulesetRequest
     * @return GetWafRulesetResponse
     */
    public GetWafRulesetResponse getWafRuleset(GetWafRulesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWafRulesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询缓存保持实例列表</p>
     * 
     * @param request ListCacheReserveInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCacheReserveInstancesResponse
     */
    public ListCacheReserveInstancesResponse listCacheReserveInstancesWithOptions(ListCacheReserveInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCacheReserveInstances"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCacheReserveInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询缓存保持实例列表</p>
     * 
     * @param request ListCacheReserveInstancesRequest
     * @return ListCacheReserveInstancesResponse
     */
    public ListCacheReserveInstancesResponse listCacheReserveInstances(ListCacheReserveInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCacheReserveInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点下客户端证书列表</p>
     * 
     * @param request ListClientCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientCertificatesResponse
     */
    public ListClientCertificatesResponse listClientCertificatesWithOptions(ListClientCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientCertificates"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientCertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点下客户端证书列表</p>
     * 
     * @param request ListClientCertificatesRequest
     * @return ListClientCertificatesResponse
     */
    public ListClientCertificatesResponse listClientCertificates(ListClientCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个边缘容器应用的全部域名记录</p>
     * 
     * @param request ListEdgeContainerAppRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeContainerAppRecordsResponse
     */
    public ListEdgeContainerAppRecordsResponse listEdgeContainerAppRecordsWithOptions(ListEdgeContainerAppRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeContainerAppRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeContainerAppRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一个边缘容器应用的全部域名记录</p>
     * 
     * @param request ListEdgeContainerAppRecordsRequest
     * @return ListEdgeContainerAppRecordsResponse
     */
    public ListEdgeContainerAppRecordsResponse listEdgeContainerAppRecords(ListEdgeContainerAppRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeContainerAppRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用的全部版本信息</p>
     * 
     * @param request ListEdgeContainerAppVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeContainerAppVersionsResponse
     */
    public ListEdgeContainerAppVersionsResponse listEdgeContainerAppVersionsWithOptions(ListEdgeContainerAppVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeContainerAppVersions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeContainerAppVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取边缘容器应用的全部版本信息</p>
     * 
     * @param request ListEdgeContainerAppVersionsRequest
     * @return ListEdgeContainerAppVersionsResponse
     */
    public ListEdgeContainerAppVersionsResponse listEdgeContainerAppVersions(ListEdgeContainerAppVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeContainerAppVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户全部边缘容器应用</p>
     * 
     * @param request ListEdgeContainerAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeContainerAppsResponse
     */
    public ListEdgeContainerAppsResponse listEdgeContainerAppsWithOptions(ListEdgeContainerAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderKey)) {
            query.put("OrderKey", request.orderKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("SearchType", request.searchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeContainerApps"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeContainerAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户全部边缘容器应用</p>
     * 
     * @param request ListEdgeContainerAppsRequest
     * @return ListEdgeContainerAppsResponse
     */
    public ListEdgeContainerAppsResponse listEdgeContainerApps(ListEdgeContainerAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeContainerAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点的边缘容器记录</p>
     * 
     * @param request ListEdgeContainerRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeContainerRecordsResponse
     */
    public ListEdgeContainerRecordsResponse listEdgeContainerRecordsWithOptions(ListEdgeContainerRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeContainerRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeContainerRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点的边缘容器记录</p>
     * 
     * @param request ListEdgeContainerRecordsRequest
     * @return ListEdgeContainerRecordsResponse
     */
    public ListEdgeContainerRecordsResponse listEdgeContainerRecords(ListEdgeContainerRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeContainerRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户可购买的边缘函数的套餐</p>
     * 
     * @param request ListEdgeRoutinePlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeRoutinePlansResponse
     */
    public ListEdgeRoutinePlansResponse listEdgeRoutinePlansWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeRoutinePlans"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeRoutinePlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户可购买的边缘函数的套餐</p>
     * @return ListEdgeRoutinePlansResponse
     */
    public ListEdgeRoutinePlansResponse listEdgeRoutinePlans() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeRoutinePlansWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点的边缘路由记录</p>
     * 
     * @param request ListEdgeRoutineRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeRoutineRecordsResponse
     */
    public ListEdgeRoutineRecordsResponse listEdgeRoutineRecordsWithOptions(ListEdgeRoutineRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeRoutineRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeRoutineRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点的边缘路由记录</p>
     * 
     * @param request ListEdgeRoutineRecordsRequest
     * @return ListEdgeRoutineRecordsResponse
     */
    public ListEdgeRoutineRecordsResponse listEdgeRoutineRecords(ListEdgeRoutineRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeRoutineRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例或者站点的quota值</p>
     * 
     * @param request ListInstanceQuotasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceQuotasResponse
     */
    public ListInstanceQuotasResponse listInstanceQuotasWithOptions(ListInstanceQuotasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceQuotas"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceQuotasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例或者站点的quota值</p>
     * 
     * @param request ListInstanceQuotasRequest
     * @return ListInstanceQuotasResponse
     */
    public ListInstanceQuotasResponse listInstanceQuotas(ListInstanceQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceQuotasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询功能quota和用量</p>
     * 
     * @param request ListInstanceQuotasWithUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceQuotasWithUsageResponse
     */
    public ListInstanceQuotasWithUsageResponse listInstanceQuotasWithUsageWithOptions(ListInstanceQuotasWithUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceQuotasWithUsage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceQuotasWithUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询功能quota和用量</p>
     * 
     * @param request ListInstanceQuotasWithUsageRequest
     * @return ListInstanceQuotasWithUsageResponse
     */
    public ListInstanceQuotasWithUsageResponse listInstanceQuotasWithUsage(ListInstanceQuotasWithUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceQuotasWithUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>遍历Namespace的Key值</p>
     * 
     * @param request ListKvsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKvsResponse
     */
    public ListKvsResponse listKvsWithOptions(ListKvsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKvs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKvsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>遍历Namespace的Key值</p>
     * 
     * @param request ListKvsRequest
     * @return ListKvsResponse
     */
    public ListKvsResponse listKvs(ListKvsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKvsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举自定义列表</p>
     * 
     * @param tmpReq ListListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListListsResponse
     */
    public ListListsResponse listListsWithOptions(ListListsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListListsShrinkRequest request = new ListListsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLists"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举自定义列表</p>
     * 
     * @param request ListListsRequest
     * @return ListListsResponse
     */
    public ListListsResponse listLists(ListListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询负载均衡区域列表</p>
     * 
     * @param request ListLoadBalancerRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLoadBalancerRegionsResponse
     */
    public ListLoadBalancerRegionsResponse listLoadBalancerRegionsWithOptions(ListLoadBalancerRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLoadBalancerRegions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLoadBalancerRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询负载均衡区域列表</p>
     * 
     * @param request ListLoadBalancerRegionsRequest
     * @return ListLoadBalancerRegionsResponse
     */
    public ListLoadBalancerRegionsResponse listLoadBalancerRegions(ListLoadBalancerRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLoadBalancerRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举自定义托管规则组</p>
     * 
     * @param request ListManagedRulesGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListManagedRulesGroupsResponse
     */
    public ListManagedRulesGroupsResponse listManagedRulesGroupsWithOptions(ListManagedRulesGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListManagedRulesGroups"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManagedRulesGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举自定义托管规则组</p>
     * 
     * @param request ListManagedRulesGroupsRequest
     * @return ListManagedRulesGroupsResponse
     */
    public ListManagedRulesGroupsResponse listManagedRulesGroups(ListManagedRulesGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listManagedRulesGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举自定义响应页面</p>
     * 
     * @param request ListPagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPagesResponse
     */
    public ListPagesResponse listPagesWithOptions(ListPagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPages"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举自定义响应页面</p>
     * 
     * @param request ListPagesRequest
     * @return ListPagesResponse
     */
    public ListPagesResponse listPages(ListPagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点下的记录列表</p>
     * 
     * @param request ListRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecordsResponse
     */
    public ListRecordsResponse listRecordsWithOptions(ListRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecords"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点下的记录列表</p>
     * 
     * @param request ListRecordsRequest
     * @return ListRecordsResponse
     */
    public ListRecordsResponse listRecords(ListRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Routine灰度环境列表</p>
     * 
     * @param request ListRoutineCanaryAreasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutineCanaryAreasResponse
     */
    public ListRoutineCanaryAreasResponse listRoutineCanaryAreasWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutineCanaryAreas"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutineCanaryAreasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Routine灰度环境列表</p>
     * @return ListRoutineCanaryAreasResponse
     */
    public ListRoutineCanaryAreasResponse listRoutineCanaryAreas() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutineCanaryAreasWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Routine可选择规格列表</p>
     * 
     * @param request ListRoutineOptionalSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutineOptionalSpecsResponse
     */
    public ListRoutineOptionalSpecsResponse listRoutineOptionalSpecsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutineOptionalSpecs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutineOptionalSpecsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Routine可选择规格列表</p>
     * @return ListRoutineOptionalSpecsResponse
     */
    public ListRoutineOptionalSpecsResponse listRoutineOptionalSpecs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutineOptionalSpecsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出指定任务下的执行计划</p>
     * 
     * @param request ListScheduledPreloadExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledPreloadExecutionsResponse
     */
    public ListScheduledPreloadExecutionsResponse listScheduledPreloadExecutionsWithOptions(ListScheduledPreloadExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledPreloadExecutions"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledPreloadExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出指定任务下的执行计划</p>
     * 
     * @param request ListScheduledPreloadExecutionsRequest
     * @return ListScheduledPreloadExecutionsResponse
     */
    public ListScheduledPreloadExecutionsResponse listScheduledPreloadExecutions(ListScheduledPreloadExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScheduledPreloadExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出定时预热任务列表</p>
     * 
     * @param request ListScheduledPreloadJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledPreloadJobsResponse
     */
    public ListScheduledPreloadJobsResponse listScheduledPreloadJobsWithOptions(ListScheduledPreloadJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledPreloadJobs"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledPreloadJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出定时预热任务列表</p>
     * 
     * @param request ListScheduledPreloadJobsRequest
     * @return ListScheduledPreloadJobsResponse
     */
    public ListScheduledPreloadJobsResponse listScheduledPreloadJobs(ListScheduledPreloadJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScheduledPreloadJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出全部任务投递</p>
     * 
     * @param request ListSiteDeliveryTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSiteDeliveryTasksResponse
     */
    public ListSiteDeliveryTasksResponse listSiteDeliveryTasksWithOptions(ListSiteDeliveryTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSiteDeliveryTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSiteDeliveryTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出全部任务投递</p>
     * 
     * @param request ListSiteDeliveryTasksRequest
     * @return ListSiteDeliveryTasksResponse
     */
    public ListSiteDeliveryTasksResponse listSiteDeliveryTasks(ListSiteDeliveryTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSiteDeliveryTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点列表</p>
     * 
     * @param tmpReq ListSitesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSitesResponse
     */
    public ListSitesResponse listSitesWithOptions(ListSitesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSitesShrinkRequest request = new ListSitesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagFilter)) {
            request.tagFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagFilter, "TagFilter", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSites"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSitesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询站点列表</p>
     * 
     * @param request ListSitesRequest
     * @return ListSitesResponse
     */
    public ListSitesResponse listSites(ListSitesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSitesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源已经绑定的标签列表</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxItem)) {
            query.put("MaxItem", request.maxItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源已经绑定的标签列表</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件上传任务</p>
     * 
     * @param request ListUploadTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUploadTasksResponse
     */
    public ListUploadTasksResponse listUploadTasksWithOptions(ListUploadTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUploadTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUploadTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件上传任务</p>
     * 
     * @param request ListUploadTasksRequest
     * @return ListUploadTasksResponse
     */
    public ListUploadTasksResponse listUploadTasks(ListUploadTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUploadTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出用户全部任务投递</p>
     * 
     * @param request ListUserDeliveryTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserDeliveryTasksResponse
     */
    public ListUserDeliveryTasksResponse listUserDeliveryTasksWithOptions(ListUserDeliveryTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserDeliveryTasks"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserDeliveryTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出用户全部任务投递</p>
     * 
     * @param request ListUserDeliveryTasksRequest
     * @return ListUserDeliveryTasksResponse
     */
    public ListUserDeliveryTasksResponse listUserDeliveryTasks(ListUserDeliveryTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserDeliveryTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询该用户下可用的已购套餐实例</p>
     * 
     * @param request ListUserRatePlanInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserRatePlanInstancesResponse
     */
    public ListUserRatePlanInstancesResponse listUserRatePlanInstancesWithOptions(ListUserRatePlanInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserRatePlanInstances"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserRatePlanInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询该用户下可用的已购套餐实例</p>
     * 
     * @param request ListUserRatePlanInstancesRequest
     * @return ListUserRatePlanInstancesResponse
     */
    public ListUserRatePlanInstancesResponse listUserRatePlanInstances(ListUserRatePlanInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserRatePlanInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF托管规则</p>
     * 
     * @param tmpReq ListWafManagedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafManagedRulesResponse
     */
    public ListWafManagedRulesResponse listWafManagedRulesWithOptions(ListWafManagedRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWafManagedRulesShrinkRequest request = new ListWafManagedRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attackType)) {
            query.put("AttackType", request.attackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafManagedRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafManagedRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF托管规则</p>
     * 
     * @param request ListWafManagedRulesRequest
     * @return ListWafManagedRulesResponse
     */
    public ListWafManagedRulesResponse listWafManagedRules(ListWafManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafManagedRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF阶段</p>
     * 
     * @param request ListWafPhasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafPhasesResponse
     */
    public ListWafPhasesResponse listWafPhasesWithOptions(ListWafPhasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafPhases"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafPhasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF阶段</p>
     * 
     * @param request ListWafPhasesRequest
     * @return ListWafPhasesResponse
     */
    public ListWafPhasesResponse listWafPhases(ListWafPhasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafPhasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF规则</p>
     * 
     * @param tmpReq ListWafRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafRulesResponse
     */
    public ListWafRulesResponse listWafRulesWithOptions(ListWafRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWafRulesShrinkRequest request = new ListWafRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF规则</p>
     * 
     * @param request ListWafRulesRequest
     * @return ListWafRulesResponse
     */
    public ListWafRulesResponse listWafRules(ListWafRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF规则集</p>
     * 
     * @param tmpReq ListWafRulesetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafRulesetsResponse
     */
    public ListWafRulesetsResponse listWafRulesetsWithOptions(ListWafRulesetsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWafRulesetsShrinkRequest request = new ListWafRulesetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafRulesets"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafRulesetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF规则集</p>
     * 
     * @param request ListWafRulesetsRequest
     * @return ListWafRulesetsResponse
     */
    public ListWafRulesetsResponse listWafRulesets(ListWafRulesetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafRulesetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF模板规则</p>
     * 
     * @param tmpReq ListWafTemplateRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafTemplateRulesResponse
     */
    public ListWafTemplateRulesResponse listWafTemplateRulesWithOptions(ListWafTemplateRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWafTemplateRulesShrinkRequest request = new ListWafTemplateRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryArgs)) {
            request.queryArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryArgs, "QueryArgs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryArgsShrink)) {
            query.put("QueryArgs", request.queryArgsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafTemplateRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafTemplateRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF模板规则</p>
     * 
     * @param request ListWafTemplateRulesRequest
     * @return ListWafTemplateRulesResponse
     */
    public ListWafTemplateRulesResponse listWafTemplateRules(ListWafTemplateRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafTemplateRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF规则使用情况</p>
     * 
     * @param request ListWafUsageOfRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWafUsageOfRulesResponse
     */
    public ListWafUsageOfRulesResponse listWafUsageOfRulesWithOptions(ListWafUsageOfRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWafUsageOfRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWafUsageOfRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举WAF规则使用情况</p>
     * 
     * @param request ListWafUsageOfRulesRequest
     * @return ListWafUsageOfRulesResponse
     */
    public ListWafUsageOfRulesResponse listWafUsageOfRules(ListWafUsageOfRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWafUsageOfRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询等候室事件</p>
     * 
     * @param request ListWaitingRoomEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWaitingRoomEventsResponse
     */
    public ListWaitingRoomEventsResponse listWaitingRoomEventsWithOptions(ListWaitingRoomEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWaitingRoomEvents"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWaitingRoomEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询等候室事件</p>
     * 
     * @param request ListWaitingRoomEventsRequest
     * @return ListWaitingRoomEventsResponse
     */
    public ListWaitingRoomEventsResponse listWaitingRoomEvents(ListWaitingRoomEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWaitingRoomEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询等候室绕过规则</p>
     * 
     * @param request ListWaitingRoomRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWaitingRoomRulesResponse
     */
    public ListWaitingRoomRulesResponse listWaitingRoomRulesWithOptions(ListWaitingRoomRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWaitingRoomRules"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWaitingRoomRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询等候室绕过规则</p>
     * 
     * @param request ListWaitingRoomRulesRequest
     * @return ListWaitingRoomRulesResponse
     */
    public ListWaitingRoomRulesResponse listWaitingRoomRules(ListWaitingRoomRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWaitingRoomRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询等候室</p>
     * 
     * @param request ListWaitingRoomsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWaitingRoomsResponse
     */
    public ListWaitingRoomsResponse listWaitingRoomsWithOptions(ListWaitingRoomsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWaitingRooms"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWaitingRoomsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询等候室</p>
     * 
     * @param request ListWaitingRoomsRequest
     * @return ListWaitingRoomsResponse
     */
    public ListWaitingRoomsResponse listWaitingRooms(ListWaitingRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWaitingRoomsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>缓存预热</p>
     * 
     * @param tmpReq PreloadCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreloadCachesResponse
     */
    public PreloadCachesResponse preloadCachesWithOptions(PreloadCachesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PreloadCachesShrinkRequest request = new PreloadCachesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.headers)) {
            request.headersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.headers, "Headers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headersShrink)) {
            query.put("Headers", request.headersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreloadCaches"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreloadCachesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>缓存预热</p>
     * 
     * @param request PreloadCachesRequest
     * @return PreloadCachesResponse
     */
    public PreloadCachesResponse preloadCaches(PreloadCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadCachesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布边缘容器应用的某个版本</p>
     * 
     * @param tmpReq PublishEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishEdgeContainerAppVersionResponse
     */
    public PublishEdgeContainerAppVersionResponse publishEdgeContainerAppVersionWithOptions(PublishEdgeContainerAppVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PublishEdgeContainerAppVersionShrinkRequest request = new PublishEdgeContainerAppVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regions)) {
            request.regionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regions, "Regions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fullRelease)) {
            query.put("FullRelease", request.fullRelease);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishType)) {
            query.put("PublishType", request.publishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionsShrink)) {
            query.put("Regions", request.regionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.percentage)) {
            body.put("Percentage", request.percentage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishEnv)) {
            body.put("PublishEnv", request.publishEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布边缘容器应用的某个版本</p>
     * 
     * @param request PublishEdgeContainerAppVersionRequest
     * @return PublishEdgeContainerAppVersionResponse
     */
    public PublishEdgeContainerAppVersionResponse publishEdgeContainerAppVersion(PublishEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布Routine某版本代码</p>
     * 
     * @param tmpReq PublishRoutineCodeVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRoutineCodeVersionResponse
     */
    public PublishRoutineCodeVersionResponse publishRoutineCodeVersionWithOptions(PublishRoutineCodeVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PublishRoutineCodeVersionShrinkRequest request = new PublishRoutineCodeVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.canaryAreaList)) {
            request.canaryAreaListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.canaryAreaList, "CanaryAreaList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canaryAreaListShrink)) {
            body.put("CanaryAreaList", request.canaryAreaListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.canaryCodeVersion)) {
            body.put("CanaryCodeVersion", request.canaryCodeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeVersion)) {
            body.put("CodeVersion", request.codeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRoutineCodeVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRoutineCodeVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布Routine某版本代码</p>
     * 
     * @param request PublishRoutineCodeVersionRequest
     * @return PublishRoutineCodeVersionResponse
     */
    public PublishRoutineCodeVersionResponse publishRoutineCodeVersion(PublishRoutineCodeVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishRoutineCodeVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>缓存刷新</p>
     * 
     * @param tmpReq PurgeCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PurgeCachesResponse
     */
    public PurgeCachesResponse purgeCachesWithOptions(PurgeCachesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PurgeCachesShrinkRequest request = new PurgeCachesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgeComputePurge)) {
            query.put("EdgeComputePurge", request.edgeComputePurge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PurgeCaches"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PurgeCachesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>缓存刷新</p>
     * 
     * @param request PurgeCachesRequest
     * @return PurgeCachesResponse
     */
    public PurgeCachesResponse purgeCaches(PurgeCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purgeCachesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置Namespace的Key-Value对</p>
     * 
     * @param request PutKvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutKvResponse
     */
    public PutKvResponse putKvWithOptions(PutKvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.base64)) {
            query.put("Base64", request.base64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTtl)) {
            query.put("ExpirationTtl", request.expirationTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutKv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutKvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置Namespace的Key-Value对</p>
     * 
     * @param request PutKvRequest
     * @return PutKvResponse
     */
    public PutKvResponse putKv(PutKvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putKvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置Namespace的Key-Value对，支持最大25M的Body</p>
     * 
     * @param request PutKvWithHighCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutKvWithHighCapacityResponse
     */
    public PutKvWithHighCapacityResponse putKvWithHighCapacityWithOptions(PutKvWithHighCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutKvWithHighCapacity"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutKvWithHighCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置Namespace的Key-Value对，支持最大25M的Body</p>
     * 
     * @param request PutKvWithHighCapacityRequest
     * @return PutKvWithHighCapacityResponse
     */
    public PutKvWithHighCapacityResponse putKvWithHighCapacity(PutKvWithHighCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putKvWithHighCapacityWithOptions(request, runtime);
    }

    public PutKvWithHighCapacityResponse putKvWithHighCapacityAdvance(PutKvWithHighCapacityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "ESA"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        PutKvWithHighCapacityRequest putKvWithHighCapacityReq = new PutKvWithHighCapacityRequest();
        com.aliyun.openapiutil.Client.convert(request, putKvWithHighCapacityReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            putKvWithHighCapacityReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        PutKvWithHighCapacityResponse putKvWithHighCapacityResp = this.putKvWithHighCapacityWithOptions(putKvWithHighCapacityReq, runtime);
        return putKvWithHighCapacityResp;
    }

    /**
     * <b>summary</b> : 
     * <p>重建边缘容器应用的测试环境</p>
     * 
     * @param request RebuildEdgeContainerAppStagingEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebuildEdgeContainerAppStagingEnvResponse
     */
    public RebuildEdgeContainerAppStagingEnvResponse rebuildEdgeContainerAppStagingEnvWithOptions(RebuildEdgeContainerAppStagingEnvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebuildEdgeContainerAppStagingEnv"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebuildEdgeContainerAppStagingEnvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重建边缘容器应用的测试环境</p>
     * 
     * @param request RebuildEdgeContainerAppStagingEnvRequest
     * @return RebuildEdgeContainerAppStagingEnvResponse
     */
    public RebuildEdgeContainerAppStagingEnvResponse rebuildEdgeContainerAppStagingEnv(RebuildEdgeContainerAppStagingEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebuildEdgeContainerAppStagingEnvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置定时预热任务的进度，从头开始预热</p>
     * 
     * @param request ResetScheduledPreloadJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetScheduledPreloadJobResponse
     */
    public ResetScheduledPreloadJobResponse resetScheduledPreloadJobWithOptions(ResetScheduledPreloadJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetScheduledPreloadJob"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetScheduledPreloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重置定时预热任务的进度，从头开始预热</p>
     * 
     * @param request ResetScheduledPreloadJobRequest
     * @return ResetScheduledPreloadJobResponse
     */
    public ResetScheduledPreloadJobResponse resetScheduledPreloadJob(ResetScheduledPreloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetScheduledPreloadJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>回滚边缘容器应用的某个版本</p>
     * 
     * @param request RollbackEdgeContainerAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackEdgeContainerAppVersionResponse
     */
    public RollbackEdgeContainerAppVersionResponse rollbackEdgeContainerAppVersionWithOptions(RollbackEdgeContainerAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackEdgeContainerAppVersion"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackEdgeContainerAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>回滚边缘容器应用的某个版本</p>
     * 
     * @param request RollbackEdgeContainerAppVersionRequest
     * @return RollbackEdgeContainerAppVersionResponse
     */
    public RollbackEdgeContainerAppVersionResponse rollbackEdgeContainerAppVersion(RollbackEdgeContainerAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackEdgeContainerAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置证书</p>
     * 
     * @param request SetCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCertificateResponse
     */
    public SetCertificateResponse setCertificateWithOptions(SetCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.casId)) {
            body.put("CasId", request.casId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificate)) {
            body.put("Certificate", request.certificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            body.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.update)) {
            body.put("Update", request.update);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCertificate"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置证书</p>
     * 
     * @param request SetCertificateRequest
     * @return SetCertificateResponse
     */
    public SetCertificateResponse setCertificate(SetCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置HTTP DDoS智能防护配置信息</p>
     * 
     * @param request SetHttpDDoSAttackIntelligentProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetHttpDDoSAttackIntelligentProtectionResponse
     */
    public SetHttpDDoSAttackIntelligentProtectionResponse setHttpDDoSAttackIntelligentProtectionWithOptions(SetHttpDDoSAttackIntelligentProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiMode)) {
            query.put("AiMode", request.aiMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aiTemplate)) {
            query.put("AiTemplate", request.aiTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetHttpDDoSAttackIntelligentProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetHttpDDoSAttackIntelligentProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置HTTP DDoS智能防护配置信息</p>
     * 
     * @param request SetHttpDDoSAttackIntelligentProtectionRequest
     * @return SetHttpDDoSAttackIntelligentProtectionResponse
     */
    public SetHttpDDoSAttackIntelligentProtectionResponse setHttpDDoSAttackIntelligentProtection(SetHttpDDoSAttackIntelligentProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setHttpDDoSAttackIntelligentProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置HTTP DDoS攻击防护配置信息</p>
     * 
     * @param request SetHttpDDoSAttackProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetHttpDDoSAttackProtectionResponse
     */
    public SetHttpDDoSAttackProtectionResponse setHttpDDoSAttackProtectionWithOptions(SetHttpDDoSAttackProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalMode)) {
            query.put("GlobalMode", request.globalMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetHttpDDoSAttackProtection"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetHttpDDoSAttackProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置HTTP DDoS攻击防护配置信息</p>
     * 
     * @param request SetHttpDDoSAttackProtectionRequest
     * @return SetHttpDDoSAttackProtectionResponse
     */
    public SetHttpDDoSAttackProtectionResponse setHttpDDoSAttackProtection(SetHttpDDoSAttackProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setHttpDDoSAttackProtectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开始单个定时预热计划</p>
     * 
     * @param request StartScheduledPreloadExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartScheduledPreloadExecutionResponse
     */
    public StartScheduledPreloadExecutionResponse startScheduledPreloadExecutionWithOptions(StartScheduledPreloadExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartScheduledPreloadExecution"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartScheduledPreloadExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开始单个定时预热计划</p>
     * 
     * @param request StartScheduledPreloadExecutionRequest
     * @return StartScheduledPreloadExecutionResponse
     */
    public StartScheduledPreloadExecutionResponse startScheduledPreloadExecution(StartScheduledPreloadExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startScheduledPreloadExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止单个定时预热计划</p>
     * 
     * @param request StopScheduledPreloadExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopScheduledPreloadExecutionResponse
     */
    public StopScheduledPreloadExecutionResponse stopScheduledPreloadExecutionWithOptions(StopScheduledPreloadExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopScheduledPreloadExecution"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopScheduledPreloadExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止单个定时预热计划</p>
     * 
     * @param request StopScheduledPreloadExecutionRequest
     * @return StopScheduledPreloadExecutionResponse
     */
    public StopScheduledPreloadExecutionResponse stopScheduledPreloadExecution(StopScheduledPreloadExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopScheduledPreloadExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将表达式转换为匹配项</p>
     * 
     * @param request TransformExpressionToMatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransformExpressionToMatchResponse
     */
    public TransformExpressionToMatchResponse transformExpressionToMatchWithOptions(TransformExpressionToMatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            body.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransformExpressionToMatch"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransformExpressionToMatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将表达式转换为匹配项</p>
     * 
     * @param request TransformExpressionToMatchRequest
     * @return TransformExpressionToMatchResponse
     */
    public TransformExpressionToMatchResponse transformExpressionToMatch(TransformExpressionToMatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transformExpressionToMatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将匹配项转换为表达式</p>
     * 
     * @param tmpReq TransformMatchToExpressionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransformMatchToExpressionResponse
     */
    public TransformMatchToExpressionResponse transformMatchToExpressionWithOptions(TransformMatchToExpressionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TransformMatchToExpressionShrinkRequest request = new TransformMatchToExpressionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.match)) {
            request.matchShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.match, "Match", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.matchShrink)) {
            body.put("Match", request.matchShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("Phase", request.phase);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransformMatchToExpression"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransformMatchToExpressionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将匹配项转换为表达式</p>
     * 
     * @param request TransformMatchToExpressionRequest
     * @return TransformMatchToExpressionResponse
     */
    public TransformMatchToExpressionResponse transformMatchToExpression(TransformMatchToExpressionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transformMatchToExpressionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为资源列表统一解绑标签</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为资源列表统一解绑标签</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改定制场景策略</p>
     * 
     * @param request UpdateCustomScenePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomScenePolicyResponse
     */
    public UpdateCustomScenePolicyResponse updateCustomScenePolicyWithOptions(UpdateCustomScenePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objects)) {
            query.put("Objects", request.objects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomScenePolicy"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomScenePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改定制场景策略</p>
     * 
     * @param request UpdateCustomScenePolicyRequest
     * @return UpdateCustomScenePolicyResponse
     */
    public UpdateCustomScenePolicyResponse updateCustomScenePolicy(UpdateCustomScenePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomScenePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重命名账号下的Namespace</p>
     * 
     * @param request UpdateKvNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKvNamespaceResponse
     */
    public UpdateKvNamespaceResponse updateKvNamespaceWithOptions(UpdateKvNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKvNamespace"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKvNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重命名账号下的Namespace</p>
     * 
     * @param request UpdateKvNamespaceRequest
     * @return UpdateKvNamespaceResponse
     */
    public UpdateKvNamespaceResponse updateKvNamespace(UpdateKvNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKvNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义列表</p>
     * 
     * @param tmpReq UpdateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateListResponse
     */
    public UpdateListResponse updateListWithOptions(UpdateListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateListShrinkRequest request = new UpdateListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemsShrink)) {
            body.put("Items", request.itemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateList"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义列表</p>
     * 
     * @param request UpdateListRequest
     * @return UpdateListResponse
     */
    public UpdateListResponse updateList(UpdateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义响应页面</p>
     * 
     * @param request UpdatePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePageResponse
     */
    public UpdatePageResponse updatePageWithOptions(UpdatePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义响应页面</p>
     * 
     * @param request UpdatePageRequest
     * @return UpdatePageResponse
     */
    public UpdatePageResponse updatePage(UpdatePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新记录</p>
     * 
     * @param tmpReq UpdateRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecordResponse
     */
    public UpdateRecordResponse updateRecordWithOptions(UpdateRecordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRecordShrinkRequest request = new UpdateRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authConf)) {
            request.authConfShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authConf, "AuthConf", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfShrink)) {
            query.put("AuthConf", request.authConfShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            query.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            query.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostPolicy)) {
            query.put("HostPolicy", request.hostPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxied)) {
            query.put("Proxied", request.proxied);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecord"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新记录</p>
     * 
     * @param request UpdateRecordRequest
     * @return UpdateRecordResponse
     */
    public UpdateRecordResponse updateRecord(UpdateRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新单个定时预热计划</p>
     * 
     * @param request UpdateScheduledPreloadExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduledPreloadExecutionResponse
     */
    public UpdateScheduledPreloadExecutionResponse updateScheduledPreloadExecutionWithOptions(UpdateScheduledPreloadExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            body.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sliceLen)) {
            body.put("SliceLen", request.sliceLen);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScheduledPreloadExecution"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScheduledPreloadExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新单个定时预热计划</p>
     * 
     * @param request UpdateScheduledPreloadExecutionRequest
     * @return UpdateScheduledPreloadExecutionResponse
     */
    public UpdateScheduledPreloadExecutionResponse updateScheduledPreloadExecution(UpdateScheduledPreloadExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScheduledPreloadExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点接入方式</p>
     * 
     * @param request UpdateSiteAccessTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteAccessTypeResponse
     */
    public UpdateSiteAccessTypeResponse updateSiteAccessTypeWithOptions(UpdateSiteAccessTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            query.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteAccessType"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteAccessTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点接入方式</p>
     * 
     * @param request UpdateSiteAccessTypeRequest
     * @return UpdateSiteAccessTypeResponse
     */
    public UpdateSiteAccessTypeResponse updateSiteAccessType(UpdateSiteAccessTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteAccessTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新站点加速区域</p>
     * 
     * @param request UpdateSiteCoverageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteCoverageResponse
     */
    public UpdateSiteCoverageResponse updateSiteCoverageWithOptions(UpdateSiteCoverageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverage)) {
            query.put("Coverage", request.coverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteCoverage"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteCoverageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新站点加速区域</p>
     * 
     * @param request UpdateSiteCoverageRequest
     * @return UpdateSiteCoverageResponse
     */
    public UpdateSiteCoverageResponse updateSiteCoverage(UpdateSiteCoverageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteCoverageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改自定义字段</p>
     * 
     * @param tmpReq UpdateSiteCustomLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteCustomLogResponse
     */
    public UpdateSiteCustomLogResponse updateSiteCustomLogWithOptions(UpdateSiteCustomLogRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSiteCustomLogShrinkRequest request = new UpdateSiteCustomLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cookies)) {
            request.cookiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cookies, "Cookies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.requestHeaders)) {
            request.requestHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.requestHeaders, "RequestHeaders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.responseHeaders)) {
            request.responseHeadersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.responseHeaders, "ResponseHeaders", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookiesShrink)) {
            body.put("Cookies", request.cookiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestHeadersShrink)) {
            body.put("RequestHeaders", request.requestHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseHeadersShrink)) {
            body.put("ResponseHeaders", request.responseHeadersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteCustomLog"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteCustomLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改自定义字段</p>
     * 
     * @param request UpdateSiteCustomLogRequest
     * @return UpdateSiteCustomLogResponse
     */
    public UpdateSiteCustomLogResponse updateSiteCustomLog(UpdateSiteCustomLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteCustomLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改一个任务投递</p>
     * 
     * @param request UpdateSiteDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteDeliveryTaskResponse
     */
    public UpdateSiteDeliveryTaskResponse updateSiteDeliveryTaskWithOptions(UpdateSiteDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardRate)) {
            body.put("DiscardRate", request.discardRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            body.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改一个任务投递</p>
     * 
     * @param request UpdateSiteDeliveryTaskRequest
     * @return UpdateSiteDeliveryTaskResponse
     */
    public UpdateSiteDeliveryTaskResponse updateSiteDeliveryTask(UpdateSiteDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上下线一个任务投递</p>
     * 
     * @param request UpdateSiteDeliveryTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteDeliveryTaskStatusResponse
     */
    public UpdateSiteDeliveryTaskStatusResponse updateSiteDeliveryTaskStatusWithOptions(UpdateSiteDeliveryTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteDeliveryTaskStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteDeliveryTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上下线一个任务投递</p>
     * 
     * @param request UpdateSiteDeliveryTaskStatusRequest
     * @return UpdateSiteDeliveryTaskStatusResponse
     */
    public UpdateSiteDeliveryTaskStatusResponse updateSiteDeliveryTaskStatus(UpdateSiteDeliveryTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteDeliveryTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点自定义NS</p>
     * 
     * @param request UpdateSiteVanityNSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSiteVanityNSResponse
     */
    public UpdateSiteVanityNSResponse updateSiteVanityNSWithOptions(UpdateSiteVanityNSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vanityNSList)) {
            query.put("VanityNSList", request.vanityNSList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSiteVanityNS"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSiteVanityNSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改站点自定义NS</p>
     * 
     * @param request UpdateSiteVanityNSRequest
     * @return UpdateSiteVanityNSResponse
     */
    public UpdateSiteVanityNSResponse updateSiteVanityNS(UpdateSiteVanityNSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSiteVanityNSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改一个用户粒度任务投递</p>
     * 
     * @param request UpdateUserDeliveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDeliveryTaskResponse
     */
    public UpdateUserDeliveryTaskResponse updateUserDeliveryTaskWithOptions(UpdateUserDeliveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discardRate)) {
            body.put("DiscardRate", request.discardRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            body.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDeliveryTask"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDeliveryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改一个用户粒度任务投递</p>
     * 
     * @param request UpdateUserDeliveryTaskRequest
     * @return UpdateUserDeliveryTaskResponse
     */
    public UpdateUserDeliveryTaskResponse updateUserDeliveryTask(UpdateUserDeliveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDeliveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上下线一个用户任务投递</p>
     * 
     * @param request UpdateUserDeliveryTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDeliveryTaskStatusResponse
     */
    public UpdateUserDeliveryTaskStatusResponse updateUserDeliveryTaskStatusWithOptions(UpdateUserDeliveryTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDeliveryTaskStatus"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDeliveryTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上下线一个用户任务投递</p>
     * 
     * @param request UpdateUserDeliveryTaskStatusRequest
     * @return UpdateUserDeliveryTaskStatusResponse
     */
    public UpdateUserDeliveryTaskStatusResponse updateUserDeliveryTaskStatus(UpdateUserDeliveryTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDeliveryTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新WAF规则页面</p>
     * 
     * @param tmpReq UpdateWafRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWafRuleResponse
     */
    public UpdateWafRuleResponse updateWafRuleWithOptions(UpdateWafRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWafRuleShrinkRequest request = new UpdateWafRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configShrink)) {
            body.put("Config", request.configShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            body.put("Position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWafRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWafRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新WAF规则页面</p>
     * 
     * @param request UpdateWafRuleRequest
     * @return UpdateWafRuleResponse
     */
    public UpdateWafRuleResponse updateWafRule(UpdateWafRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWafRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新WAF规则集</p>
     * 
     * @param request UpdateWafRulesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWafRulesetResponse
     */
    public UpdateWafRulesetResponse updateWafRulesetWithOptions(UpdateWafRulesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWafRuleset"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWafRulesetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新WAF规则集</p>
     * 
     * @param request UpdateWafRulesetRequest
     * @return UpdateWafRulesetResponse
     */
    public UpdateWafRulesetResponse updateWafRuleset(UpdateWafRulesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWafRulesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改等候室</p>
     * 
     * @param tmpReq UpdateWaitingRoomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWaitingRoomResponse
     */
    public UpdateWaitingRoomResponse updateWaitingRoomWithOptions(UpdateWaitingRoomRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWaitingRoomShrinkRequest request = new UpdateWaitingRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hostNameAndPath)) {
            request.hostNameAndPathShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hostNameAndPath, "HostNameAndPath", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookieName)) {
            query.put("CookieName", request.cookieName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPageHtml)) {
            query.put("CustomPageHtml", request.customPageHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionRenewalEnable)) {
            query.put("DisableSessionRenewalEnable", request.disableSessionRenewalEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostNameAndPathShrink)) {
            query.put("HostNameAndPath", request.hostNameAndPathShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonResponseEnable)) {
            query.put("JsonResponseEnable", request.jsonResponseEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUsersPerMinute)) {
            query.put("NewUsersPerMinute", request.newUsersPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueAllEnable)) {
            query.put("QueueAllEnable", request.queueAllEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingMethod)) {
            query.put("QueuingMethod", request.queuingMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingStatusCode)) {
            query.put("QueuingStatusCode", request.queuingStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalActiveUsers)) {
            query.put("TotalActiveUsers", request.totalActiveUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomId)) {
            query.put("WaitingRoomId", request.waitingRoomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomType)) {
            query.put("WaitingRoomType", request.waitingRoomType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWaitingRoom"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWaitingRoomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改等候室</p>
     * 
     * @param request UpdateWaitingRoomRequest
     * @return UpdateWaitingRoomResponse
     */
    public UpdateWaitingRoomResponse updateWaitingRoom(UpdateWaitingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWaitingRoomWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改等候室事件</p>
     * 
     * @param request UpdateWaitingRoomEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWaitingRoomEventResponse
     */
    public UpdateWaitingRoomEventResponse updateWaitingRoomEventWithOptions(UpdateWaitingRoomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPageHtml)) {
            query.put("CustomPageHtml", request.customPageHtml);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionRenewalEnable)) {
            query.put("DisableSessionRenewalEnable", request.disableSessionRenewalEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonResponseEnable)) {
            query.put("JsonResponseEnable", request.jsonResponseEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUsersPerMinute)) {
            query.put("NewUsersPerMinute", request.newUsersPerMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preQueueEnable)) {
            query.put("PreQueueEnable", request.preQueueEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preQueueStartTime)) {
            query.put("PreQueueStartTime", request.preQueueStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingMethod)) {
            query.put("QueuingMethod", request.queuingMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuingStatusCode)) {
            query.put("QueuingStatusCode", request.queuingStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomPreQueueEnable)) {
            query.put("RandomPreQueueEnable", request.randomPreQueueEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalActiveUsers)) {
            query.put("TotalActiveUsers", request.totalActiveUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomEventId)) {
            query.put("WaitingRoomEventId", request.waitingRoomEventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomType)) {
            query.put("WaitingRoomType", request.waitingRoomType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWaitingRoomEvent"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWaitingRoomEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改等候室事件</p>
     * 
     * @param request UpdateWaitingRoomEventRequest
     * @return UpdateWaitingRoomEventResponse
     */
    public UpdateWaitingRoomEventResponse updateWaitingRoomEvent(UpdateWaitingRoomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWaitingRoomEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改等候室规则</p>
     * 
     * @param request UpdateWaitingRoomRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWaitingRoomRuleResponse
     */
    public UpdateWaitingRoomRuleResponse updateWaitingRoomRuleWithOptions(UpdateWaitingRoomRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleEnable)) {
            query.put("RuleEnable", request.ruleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitingRoomRuleId)) {
            query.put("WaitingRoomRuleId", request.waitingRoomRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWaitingRoomRule"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWaitingRoomRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改等候室规则</p>
     * 
     * @param request UpdateWaitingRoomRuleRequest
     * @return UpdateWaitingRoomRuleResponse
     */
    public UpdateWaitingRoomRuleResponse updateWaitingRoomRule(UpdateWaitingRoomRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWaitingRoomRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>缓存刷新文件上传</p>
     * 
     * @param request UploadFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFileWithOptions(UploadFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadTaskName)) {
            query.put("UploadTaskName", request.uploadTaskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadFile"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>缓存刷新文件上传</p>
     * 
     * @param request UploadFileRequest
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFile(UploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadFileWithOptions(request, runtime);
    }

    public UploadFileResponse uploadFileAdvance(UploadFileAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "ESA"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        UploadFileRequest uploadFileReq = new UploadFileRequest();
        com.aliyun.openapiutil.Client.convert(request, uploadFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            uploadFileReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        UploadFileResponse uploadFileResp = this.uploadFileWithOptions(uploadFileReq, runtime);
        return uploadFileResp;
    }

    /**
     * <b>summary</b> : 
     * <p>校验站点的归属</p>
     * 
     * @param request VerifySiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifySiteResponse
     */
    public VerifySiteResponse verifySiteWithOptions(VerifySiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifySite"),
            new TeaPair("version", "2024-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifySiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验站点的归属</p>
     * 
     * @param request VerifySiteRequest
     * @return VerifySiteResponse
     */
    public VerifySiteResponse verifySite(VerifySiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifySiteWithOptions(request, runtime);
    }
}
