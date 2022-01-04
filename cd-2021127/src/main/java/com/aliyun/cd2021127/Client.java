// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127;

import com.aliyun.tea.*;
import com.aliyun.cd2021127.models.*;
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
        this._endpoint = this.getEndpoint("cd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddProductImageResponse addProductImage(AddProductImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductImageWithOptions(request, headers, runtime);
    }

    public AddProductImageResponse addProductImageWithOptions(AddProductImageRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddProductImageShrinkRequest request = new AddProductImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productImageList)) {
            request.productImageListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productImageList, "ProductImageList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productImageListShrink)) {
            body.put("ProductImageList", request.productImageListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProductImage"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/AddProductImage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProductImageResponse());
    }

    public AddShopToGroupResponse addShopToGroup(AddShopToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addShopToGroupWithOptions(request, headers, runtime);
    }

    public AddShopToGroupResponse addShopToGroupWithOptions(AddShopToGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddShopToGroupShrinkRequest request = new AddShopToGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopIdList)) {
            request.shopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopIdList, "ShopIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopIdListShrink)) {
            body.put("ShopIdList", request.shopIdListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddShopToGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/AddShopToGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddShopToGroupResponse());
    }

    public CreateMenuDataResponse createMenuData(CreateMenuDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMenuDataWithOptions(request, headers, runtime);
    }

    public CreateMenuDataResponse createMenuDataWithOptions(CreateMenuDataRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMenuDataShrinkRequest request = new CreateMenuDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productCombineList)) {
            request.productCombineListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productCombineList, "ProductCombineList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopIdList)) {
            request.shopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopIdList, "ShopIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCombineListShrink)) {
            body.put("ProductCombineList", request.productCombineListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productContainerId)) {
            body.put("ProductContainerId", request.productContainerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopIdListShrink)) {
            body.put("ShopIdList", request.shopIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMenuData"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/CreateMenuData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMenuDataResponse());
    }

    public CreateShopResponse createShop(CreateShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createShopWithOptions(request, headers, runtime);
    }

    public CreateShopResponse createShopWithOptions(CreateShopRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateShopShrinkRequest request = new CreateShopShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopList)) {
            request.shopListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopList, "ShopList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopListShrink)) {
            body.put("ShopList", request.shopListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateShop"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/CreateShop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShopResponse());
    }

    public CreateShopGroupResponse createShopGroup(CreateShopGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createShopGroupWithOptions(request, headers, runtime);
    }

    public CreateShopGroupResponse createShopGroupWithOptions(CreateShopGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateShopGroupShrinkRequest request = new CreateShopGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopGroupList)) {
            request.shopGroupListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopGroupList, "ShopGroupList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupListShrink)) {
            body.put("ShopGroupList", request.shopGroupListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateShopGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/CreateShopGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShopGroupResponse());
    }

    public GetMenuDataStatusResponse getMenuDataStatus(GetMenuDataStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMenuDataStatusWithOptions(request, headers, runtime);
    }

    public GetMenuDataStatusResponse getMenuDataStatusWithOptions(GetMenuDataStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            body.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productContainerId)) {
            body.put("ProductContainerId", request.productContainerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMenuDataStatus"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/GetMenuDataStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMenuDataStatusResponse());
    }

    public RemoveShopFromGroupResponse removeShopFromGroup(RemoveShopFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeShopFromGroupWithOptions(request, headers, runtime);
    }

    public RemoveShopFromGroupResponse removeShopFromGroupWithOptions(RemoveShopFromGroupRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveShopFromGroupShrinkRequest request = new RemoveShopFromGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shopIdList)) {
            request.shopIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shopIdList, "ShopIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shopGroupId)) {
            body.put("ShopGroupId", request.shopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shopIdListShrink)) {
            body.put("ShopIdList", request.shopIdListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveShopFromGroup"),
            new TeaPair("version", "2021-12-7"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/RemoveShopFromGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveShopFromGroupResponse());
    }
}
