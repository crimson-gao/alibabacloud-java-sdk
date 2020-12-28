// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListExperimentMetasResponseBody extends TeaModel {
    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Content")
    public java.util.List<ListExperimentMetasResponseBodyContent> content;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListExperimentMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentMetasResponseBody self = new ListExperimentMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentMetasResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public ListExperimentMetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentMetasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExperimentMetasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExperimentMetasResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListExperimentMetasResponseBody setContent(java.util.List<ListExperimentMetasResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ListExperimentMetasResponseBodyContent> getContent() {
        return this.content;
    }

    public ListExperimentMetasResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListExperimentMetasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListExperimentMetasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExperimentMetasResponseBodyContent extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Name")
        public String name;

        public static ListExperimentMetasResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentMetasResponseBodyContent self = new ListExperimentMetasResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListExperimentMetasResponseBodyContent setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListExperimentMetasResponseBodyContent setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListExperimentMetasResponseBodyContent setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentMetasResponseBodyContent setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListExperimentMetasResponseBodyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
