// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229;

import com.aliyun.tea.*;
import com.aliyun.bailian20231229.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("bailian", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AddCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategoryWithOptions(String WorkspaceId, AddCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            body.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("CategoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategoryId)) {
            body.put("ParentCategoryId", request.parentCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCategory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/category/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCategoryResponse());
    }

    /**
     * @param request AddCategoryRequest
     * @return AddCategoryResponse
     */
    public AddCategoryResponse addCategory(String WorkspaceId, AddCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCategoryWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将临时上传的文档导入百炼数据中心，导入成功之后会自动触发文档解析。</p>
     * 
     * @param request AddFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFileResponse
     */
    public AddFileResponse addFileWithOptions(String WorkspaceId, AddFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leaseId)) {
            body.put("LeaseId", request.leaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parser)) {
            body.put("Parser", request.parser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFile"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将临时上传的文档导入百炼数据中心，导入成功之后会自动触发文档解析。</p>
     * 
     * @param request AddFileRequest
     * @return AddFileResponse
     */
    public AddFileResponse addFile(String WorkspaceId, AddFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addFileWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>请求文档上传租约，进行文档上传。</p>
     * 
     * @param request ApplyFileUploadLeaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyFileUploadLeaseResponse
     */
    public ApplyFileUploadLeaseResponse applyFileUploadLeaseWithOptions(String CategoryId, String WorkspaceId, ApplyFileUploadLeaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            body.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeInBytes)) {
            body.put("SizeInBytes", request.sizeInBytes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyFileUploadLease"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/category/" + com.aliyun.openapiutil.Client.getEncodeParam(CategoryId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyFileUploadLeaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>请求文档上传租约，进行文档上传。</p>
     * 
     * @param request ApplyFileUploadLeaseRequest
     * @return ApplyFileUploadLeaseResponse
     */
    public ApplyFileUploadLeaseResponse applyFileUploadLease(String CategoryId, String WorkspaceId, ApplyFileUploadLeaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFileUploadLeaseWithOptions(CategoryId, WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建并发布智能体应用</p>
     * 
     * @param tmpReq CreateAndPulishAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndPulishAgentResponse
     */
    public CreateAndPulishAgentResponse createAndPulishAgentWithOptions(String workspaceId, CreateAndPulishAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAndPulishAgentShrinkRequest request = new CreateAndPulishAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationConfig)) {
            request.applicationConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationConfig, "applicationConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigShrink)) {
            body.put("applicationConfig", request.applicationConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructions)) {
            body.put("instructions", request.instructions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndPulishAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndPulishAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建并发布智能体应用</p>
     * 
     * @param request CreateAndPulishAgentRequest
     * @return CreateAndPulishAgentResponse
     */
    public CreateAndPulishAgentResponse createAndPulishAgent(String workspaceId, CreateAndPulishAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAndPulishAgentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建并运行pipeline</p>
     * 
     * @param tmpReq CreateIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndexWithOptions(String WorkspaceId, CreateIndexRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIndexShrinkRequest request = new CreateIndexShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categoryIds)) {
            request.categoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categoryIds, "CategoryIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columns)) {
            request.columnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columns, "Columns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentIds)) {
            request.documentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentIds, "DocumentIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryIdsShrink)) {
            query.put("CategoryIds", request.categoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkSize)) {
            query.put("ChunkSize", request.chunkSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnsShrink)) {
            query.put("Columns", request.columnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentIdsShrink)) {
            query.put("DocumentIds", request.documentIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.embeddingModelName)) {
            query.put("EmbeddingModelName", request.embeddingModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overlapSize)) {
            query.put("OverlapSize", request.overlapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankMinScore)) {
            query.put("RerankMinScore", request.rerankMinScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankModelName)) {
            query.put("RerankModelName", request.rerankModelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.separator)) {
            query.put("Separator", request.separator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkInstanceId)) {
            query.put("SinkInstanceId", request.sinkInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkRegion)) {
            query.put("SinkRegion", request.sinkRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkType)) {
            query.put("SinkType", request.sinkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureType)) {
            query.put("StructureType", request.structureType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIndex"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建并运行pipeline</p>
     * 
     * @param request CreateIndexRequest
     * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndex(String WorkspaceId, CreateIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndexWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Memory</p>
     * 
     * @param request CreateMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemoryResponse
     */
    public CreateMemoryResponse createMemoryWithOptions(String workspaceId, CreateMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Memory</p>
     * 
     * @param request CreateMemoryRequest
     * @return CreateMemoryResponse
     */
    public CreateMemoryResponse createMemory(String workspaceId, CreateMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemoryWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建记忆Node</p>
     * 
     * @param request CreateMemoryNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemoryNodeResponse
     */
    public CreateMemoryNodeResponse createMemoryNodeWithOptions(String workspaceId, String memoryId, CreateMemoryNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemoryNode"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMemoryNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建记忆Node</p>
     * 
     * @param request CreateMemoryNodeRequest
     * @return CreateMemoryNodeResponse
     */
    public CreateMemoryNodeResponse createMemoryNode(String workspaceId, String memoryId, CreateMemoryNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemoryNodeWithOptions(workspaceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除智能体</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(String workspaceId, String appCode, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(appCode) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除智能体</p>
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(String workspaceId, String appCode) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentWithOptions(workspaceId, appCode, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategoryWithOptions(String CategoryId, String WorkspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCategory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/category/" + com.aliyun.openapiutil.Client.getEncodeParam(CategoryId) + "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCategoryResponse());
    }

    /**
     * @return DeleteCategoryResponse
     */
    public DeleteCategoryResponse deleteCategory(String CategoryId, String WorkspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCategoryWithOptions(CategoryId, WorkspaceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文档</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFileWithOptions(String FileId, String WorkspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file/" + com.aliyun.openapiutil.Client.getEncodeParam(FileId) + "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除文档</p>
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(String FileId, String WorkspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(FileId, WorkspaceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Index</p>
     * 
     * @param request DeleteIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndexWithOptions(String WorkspaceId, DeleteIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndex"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Index</p>
     * 
     * @param request DeleteIndexRequest
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndex(String WorkspaceId, DeleteIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除index doc</p>
     * 
     * @param tmpReq DeleteIndexDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIndexDocumentResponse
     */
    public DeleteIndexDocumentResponse deleteIndexDocumentWithOptions(String WorkspaceId, DeleteIndexDocumentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteIndexDocumentShrinkRequest request = new DeleteIndexDocumentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentIds)) {
            request.documentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentIds, "DocumentIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentIdsShrink)) {
            query.put("DocumentIds", request.documentIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndexDocument"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/delete_index_document"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除index doc</p>
     * 
     * @param request DeleteIndexDocumentRequest
     * @return DeleteIndexDocumentResponse
     */
    public DeleteIndexDocumentResponse deleteIndexDocument(String WorkspaceId, DeleteIndexDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexDocumentWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除memory</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemoryWithOptions(String workspaceId, String memoryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除memory</p>
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemory(String workspaceId, String memoryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryWithOptions(workspaceId, memoryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除记忆Node</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryNodeResponse
     */
    public DeleteMemoryNodeResponse deleteMemoryNodeWithOptions(String workspaceId, String memoryId, String memoryNodeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemoryNode"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryNodeId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMemoryNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除记忆Node</p>
     * @return DeleteMemoryNodeResponse
     */
    public DeleteMemoryNodeResponse deleteMemoryNode(String workspaceId, String memoryId, String memoryNodeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryNodeWithOptions(workspaceId, memoryId, memoryNodeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档基本信息，包括文档名称、类型、状态等。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileResponse
     */
    public DescribeFileResponse describeFileWithOptions(String WorkspaceId, String FileId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFile"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/file/" + com.aliyun.openapiutil.Client.getEncodeParam(FileId) + "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档基本信息，包括文档名称、类型、状态等。</p>
     * @return DescribeFileResponse
     */
    public DescribeFileResponse describeFile(String WorkspaceId, String FileId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFileWithOptions(WorkspaceId, FileId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Index运行状态</p>
     * 
     * @param request GetIndexJobStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIndexJobStatusResponse
     */
    public GetIndexJobStatusResponse getIndexJobStatusWithOptions(String WorkspaceId, GetIndexJobStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndexJobStatus"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/job/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexJobStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Index运行状态</p>
     * 
     * @param request GetIndexJobStatusRequest
     * @return GetIndexJobStatusResponse
     */
    public GetIndexJobStatusResponse getIndexJobStatus(String WorkspaceId, GetIndexJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexJobStatusWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取memory</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemoryWithOptions(String workspaceId, String memoryId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取memory</p>
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemory(String workspaceId, String memoryId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryWithOptions(workspaceId, memoryId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取记忆Node</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryNodeResponse
     */
    public GetMemoryNodeResponse getMemoryNodeWithOptions(String workspaceId, String memoryId, String memoryNodeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemoryNode"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryNodeId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMemoryNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取记忆Node</p>
     * @return GetMemoryNodeResponse
     */
    public GetMemoryNodeResponse getMemoryNode(String workspaceId, String memoryId, String memoryNodeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryNodeWithOptions(workspaceId, memoryId, memoryNodeId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取发布态智能体应用</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPublishedAgentResponse
     */
    public GetPublishedAgentResponse getPublishedAgentWithOptions(String workspaceId, String appCode, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPublishedAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(appCode) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPublishedAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取发布态智能体应用</p>
     * @return GetPublishedAgentResponse
     */
    public GetPublishedAgentResponse getPublishedAgent(String workspaceId, String appCode) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPublishedAgentWithOptions(workspaceId, appCode, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListCategory</p>
     * 
     * @param request ListCategoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCategoryResponse
     */
    public ListCategoryResponse listCategoryWithOptions(String WorkspaceId, ListCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            body.put("CategoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategoryId)) {
            body.put("ParentCategoryId", request.parentCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCategory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/categories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListCategory</p>
     * 
     * @param request ListCategoryRequest
     * @return ListCategoryResponse
     */
    public ListCategoryResponse listCategory(String WorkspaceId, ListCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCategoryWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Chunk</p>
     * 
     * @param request ListChunksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChunksResponse
     */
    public ListChunksResponse listChunksWithOptions(String WorkspaceId, ListChunksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("Fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filed)) {
            body.put("Filed", request.filed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            body.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChunks"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/list_chunks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChunksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Chunk</p>
     * 
     * @param request ListChunksRequest
     * @return ListChunksResponse
     */
    public ListChunksResponse listChunks(String WorkspaceId, ListChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChunksWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档列表</p>
     * 
     * @param request ListFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileResponse
     */
    public ListFileResponse listFileWithOptions(String WorkspaceId, ListFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFile"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/datacenter/files"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档列表</p>
     * 
     * @param request ListFileRequest
     * @return ListFileResponse
     */
    public ListFileResponse listFile(String WorkspaceId, ListFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFileWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Index文件</p>
     * 
     * @param request ListIndexDocumentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndexDocumentsResponse
     */
    public ListIndexDocumentsResponse listIndexDocumentsWithOptions(String WorkspaceId, ListIndexDocumentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            query.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentStatus)) {
            query.put("DocumentStatus", request.documentStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexDocuments"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/list_index_documents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexDocumentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Index文件</p>
     * 
     * @param request ListIndexDocumentsRequest
     * @return ListIndexDocumentsResponse
     */
    public ListIndexDocumentsResponse listIndexDocuments(String WorkspaceId, ListIndexDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexDocumentsWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询pipeline</p>
     * 
     * @param request ListIndicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndicesResponse
     */
    public ListIndicesResponse listIndicesWithOptions(String WorkspaceId, ListIndicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexName)) {
            query.put("IndexName", request.indexName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndices"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/list_indices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询pipeline</p>
     * 
     * @param request ListIndicesRequest
     * @return ListIndicesResponse
     */
    public ListIndicesResponse listIndices(String WorkspaceId, ListIndicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndicesWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取memory</p>
     * 
     * @param request ListMemoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemoriesResponse
     */
    public ListMemoriesResponse listMemoriesWithOptions(String workspaceId, ListMemoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemories"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取memory</p>
     * 
     * @param request ListMemoriesRequest
     * @return ListMemoriesResponse
     */
    public ListMemoriesResponse listMemories(String workspaceId, ListMemoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemoriesWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取记忆Node列表</p>
     * 
     * @param request ListMemoryNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemoryNodesResponse
     */
    public ListMemoryNodesResponse listMemoryNodesWithOptions(String workspaceId, String memoryId, ListMemoryNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemoryNodes"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemoryNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取记忆Node列表</p>
     * 
     * @param request ListMemoryNodesRequest
     * @return ListMemoryNodesResponse
     */
    public ListMemoryNodesResponse listMemoryNodes(String workspaceId, String memoryId, ListMemoryNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMemoryNodesWithOptions(workspaceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询已发布的智能体应用列表</p>
     * 
     * @param request ListPublishedAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublishedAgentResponse
     */
    public ListPublishedAgentResponse listPublishedAgentWithOptions(String workspaceId, ListPublishedAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("pageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublishedAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishedAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询已发布的智能体应用列表</p>
     * 
     * @param request ListPublishedAgentRequest
     * @return ListPublishedAgentResponse
     */
    public ListPublishedAgentResponse listPublishedAgent(String workspaceId, ListPublishedAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPublishedAgentWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>召回测试</p>
     * 
     * @param tmpReq RetrieveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetrieveResponse
     */
    public RetrieveResponse retrieveWithOptions(String WorkspaceId, RetrieveRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetrieveShrinkRequest request = new RetrieveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rerank)) {
            request.rerankShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rerank, "Rerank", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rewrite)) {
            request.rewriteShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rewrite, "Rewrite", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchFilters)) {
            request.searchFiltersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchFilters, "SearchFilters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.denseSimilarityTopK)) {
            query.put("DenseSimilarityTopK", request.denseSimilarityTopK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableReranking)) {
            query.put("EnableReranking", request.enableReranking);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRewrite)) {
            query.put("EnableRewrite", request.enableRewrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankShrink)) {
            query.put("Rerank", request.rerankShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankMinScore)) {
            query.put("RerankMinScore", request.rerankMinScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankTopN)) {
            query.put("RerankTopN", request.rerankTopN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rewriteShrink)) {
            query.put("Rewrite", request.rewriteShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveRetrieverHistory)) {
            query.put("SaveRetrieverHistory", request.saveRetrieverHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchFiltersShrink)) {
            query.put("SearchFilters", request.searchFiltersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sparseSimilarityTopK)) {
            query.put("SparseSimilarityTopK", request.sparseSimilarityTopK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Retrieve"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/retrieve"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetrieveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>召回测试</p>
     * 
     * @param request RetrieveRequest
     * @return RetrieveResponse
     */
    public RetrieveResponse retrieve(String WorkspaceId, RetrieveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retrieveWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>知识索引</p>
     * 
     * @param tmpReq SubmitIndexAddDocumentsJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIndexAddDocumentsJobResponse
     */
    public SubmitIndexAddDocumentsJobResponse submitIndexAddDocumentsJobWithOptions(String WorkspaceId, SubmitIndexAddDocumentsJobRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitIndexAddDocumentsJobShrinkRequest request = new SubmitIndexAddDocumentsJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categoryIds)) {
            request.categoryIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categoryIds, "CategoryIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.documentIds)) {
            request.documentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.documentIds, "DocumentIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryIdsShrink)) {
            query.put("CategoryIds", request.categoryIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentIdsShrink)) {
            query.put("DocumentIds", request.documentIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIndexAddDocumentsJob"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/add_documents_to_index"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIndexAddDocumentsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>知识索引</p>
     * 
     * @param request SubmitIndexAddDocumentsJobRequest
     * @return SubmitIndexAddDocumentsJobResponse
     */
    public SubmitIndexAddDocumentsJobResponse submitIndexAddDocumentsJob(String WorkspaceId, SubmitIndexAddDocumentsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitIndexAddDocumentsJobWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交索引任务</p>
     * 
     * @param request SubmitIndexJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIndexJobResponse
     */
    public SubmitIndexJobResponse submitIndexJobWithOptions(String WorkspaceId, SubmitIndexJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexId)) {
            query.put("IndexId", request.indexId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIndexJob"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(WorkspaceId) + "/index/submit_index_job"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIndexJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交索引任务</p>
     * 
     * @param request SubmitIndexJobRequest
     * @return SubmitIndexJobResponse
     */
    public SubmitIndexJobResponse submitIndexJob(String WorkspaceId, SubmitIndexJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitIndexJobWithOptions(WorkspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新并发布智能体应用</p>
     * 
     * @param tmpReq UpdateAndPublishAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAndPublishAgentResponse
     */
    public UpdateAndPublishAgentResponse updateAndPublishAgentWithOptions(String workspaceId, String appCode, UpdateAndPublishAgentRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAndPublishAgentShrinkRequest request = new UpdateAndPublishAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.applicationConfig)) {
            request.applicationConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.applicationConfig, "applicationConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigShrink)) {
            body.put("applicationConfig", request.applicationConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instructions)) {
            body.put("instructions", request.instructions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("modelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAndPublishAgent"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/application/agents/" + com.aliyun.openapiutil.Client.getEncodeParam(appCode) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAndPublishAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新并发布智能体应用</p>
     * 
     * @param request UpdateAndPublishAgentRequest
     * @return UpdateAndPublishAgentResponse
     */
    public UpdateAndPublishAgentResponse updateAndPublishAgent(String workspaceId, String appCode, UpdateAndPublishAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAndPublishAgentWithOptions(workspaceId, appCode, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新memory</p>
     * 
     * @param request UpdateMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemoryResponse
     */
    public UpdateMemoryResponse updateMemoryWithOptions(String workspaceId, String memoryId, UpdateMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemory"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新memory</p>
     * 
     * @param request UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    public UpdateMemoryResponse updateMemory(String workspaceId, String memoryId, UpdateMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemoryWithOptions(workspaceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新记忆Node</p>
     * 
     * @param request UpdateMemoryNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemoryNodeResponse
     */
    public UpdateMemoryNodeResponse updateMemoryNodeWithOptions(String workspaceId, String memoryId, String memoryNodeId, UpdateMemoryNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemoryNode"),
            new TeaPair("version", "2023-12-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/memories/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryId) + "/memoryNodes/" + com.aliyun.openapiutil.Client.getEncodeParam(memoryNodeId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemoryNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新记忆Node</p>
     * 
     * @param request UpdateMemoryNodeRequest
     * @return UpdateMemoryNodeResponse
     */
    public UpdateMemoryNodeResponse updateMemoryNode(String workspaceId, String memoryId, String memoryNodeId, UpdateMemoryNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemoryNodeWithOptions(workspaceId, memoryId, memoryNodeId, request, headers, runtime);
    }
}
