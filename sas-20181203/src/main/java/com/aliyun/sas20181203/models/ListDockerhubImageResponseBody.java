// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListDockerhubImageResponseBody extends TeaModel {
    /**
     * <p>List of image information.</p>
     */
    @NameInMap("ImageList")
    public java.util.List<ListDockerhubImageResponseBodyImageList> imageList;

    /**
     * <p>The unique identifier generated by Alibaba Cloud for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDockerhubImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDockerhubImageResponseBody self = new ListDockerhubImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDockerhubImageResponseBody setImageList(java.util.List<ListDockerhubImageResponseBodyImageList> imageList) {
        this.imageList = imageList;
        return this;
    }
    public java.util.List<ListDockerhubImageResponseBodyImageList> getImageList() {
        return this.imageList;
    }

    public ListDockerhubImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDockerhubImageResponseBodyImageList extends TeaModel {
        /**
         * <p>Image digest value.</p>
         * 
         * <strong>example:</strong>
         * <p>5ffded22661b0f1e9c7fcccb0d488cff*****f8c52a819bd7179ef3e4a041988</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>Number of baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HcCount")
        public Integer hcCount;

        /**
         * <p>Image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d943de1933650d74b415d3ae8b37c064a0e0c700574d7a949c26db3291******</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Image size, unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ImageSize")
        public Long imageSize;

        /**
         * <p>Repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>python</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>Repository namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>python</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>Risk details of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;vul&quot;:0}</p>
         */
        @NameInMap("RiskLevelDetail")
        public String riskLevelDetail;

        /**
         * <p>Image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>3.9</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>Image UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>a9b50827-801f-414c-900d-c4a223d*****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>Number of detected vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        public static ListDockerhubImageResponseBodyImageList build(java.util.Map<String, ?> map) throws Exception {
            ListDockerhubImageResponseBodyImageList self = new ListDockerhubImageResponseBodyImageList();
            return TeaModel.build(map, self);
        }

        public ListDockerhubImageResponseBodyImageList setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public ListDockerhubImageResponseBodyImageList setHcCount(Integer hcCount) {
            this.hcCount = hcCount;
            return this;
        }
        public Integer getHcCount() {
            return this.hcCount;
        }

        public ListDockerhubImageResponseBodyImageList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListDockerhubImageResponseBodyImageList setImageSize(Long imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Long getImageSize() {
            return this.imageSize;
        }

        public ListDockerhubImageResponseBodyImageList setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListDockerhubImageResponseBodyImageList setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public ListDockerhubImageResponseBodyImageList setRiskLevelDetail(String riskLevelDetail) {
            this.riskLevelDetail = riskLevelDetail;
            return this;
        }
        public String getRiskLevelDetail() {
            return this.riskLevelDetail;
        }

        public ListDockerhubImageResponseBodyImageList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListDockerhubImageResponseBodyImageList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListDockerhubImageResponseBodyImageList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

    }

}
