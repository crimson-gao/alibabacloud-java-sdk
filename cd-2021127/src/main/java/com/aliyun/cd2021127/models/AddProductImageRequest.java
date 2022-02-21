// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddProductImageRequest extends TeaModel {
    // 商品编号(ID)-必填
    @NameInMap("ProductId")
    public String productId;

    // 商品图片列表-必填
    @NameInMap("ProductImageList")
    public java.util.List<AddProductImageRequestProductImageList> productImageList;

    @NameInMap("ProductName")
    public String productName;

    public static AddProductImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductImageRequest self = new AddProductImageRequest();
        return TeaModel.build(map, self);
    }

    public AddProductImageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public AddProductImageRequest setProductImageList(java.util.List<AddProductImageRequestProductImageList> productImageList) {
        this.productImageList = productImageList;
        return this;
    }
    public java.util.List<AddProductImageRequestProductImageList> getProductImageList() {
        return this.productImageList;
    }

    public AddProductImageRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public static class AddProductImageRequestProductImageList extends TeaModel {
        @NameInMap("ProductImageCutout")
        public Boolean productImageCutout;

        @NameInMap("ProductImageLabels")
        public java.util.List<String> productImageLabels;

        // 商品图片类型（默认平拍：horizontal）-选填
        @NameInMap("ProductImageType")
        public String productImageType;

        // 商品图片URL-必填
        @NameInMap("ProductImageUrl")
        public String productImageUrl;

        public static AddProductImageRequestProductImageList build(java.util.Map<String, ?> map) throws Exception {
            AddProductImageRequestProductImageList self = new AddProductImageRequestProductImageList();
            return TeaModel.build(map, self);
        }

        public AddProductImageRequestProductImageList setProductImageCutout(Boolean productImageCutout) {
            this.productImageCutout = productImageCutout;
            return this;
        }
        public Boolean getProductImageCutout() {
            return this.productImageCutout;
        }

        public AddProductImageRequestProductImageList setProductImageLabels(java.util.List<String> productImageLabels) {
            this.productImageLabels = productImageLabels;
            return this;
        }
        public java.util.List<String> getProductImageLabels() {
            return this.productImageLabels;
        }

        public AddProductImageRequestProductImageList setProductImageType(String productImageType) {
            this.productImageType = productImageType;
            return this;
        }
        public String getProductImageType() {
            return this.productImageType;
        }

        public AddProductImageRequestProductImageList setProductImageUrl(String productImageUrl) {
            this.productImageUrl = productImageUrl;
            return this;
        }
        public String getProductImageUrl() {
            return this.productImageUrl;
        }

    }

}
