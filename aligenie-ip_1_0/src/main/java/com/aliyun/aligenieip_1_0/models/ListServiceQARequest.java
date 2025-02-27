// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListServiceQARequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Active")
    public Boolean active;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7***83</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public ListServiceQARequestPage page;

    public static ListServiceQARequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceQARequest self = new ListServiceQARequest();
        return TeaModel.build(map, self);
    }

    public ListServiceQARequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public ListServiceQARequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListServiceQARequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListServiceQARequest setPage(ListServiceQARequestPage page) {
        this.page = page;
        return this;
    }
    public ListServiceQARequestPage getPage() {
        return this.page;
    }

    public static class ListServiceQARequestPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListServiceQARequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListServiceQARequestPage self = new ListServiceQARequestPage();
            return TeaModel.build(map, self);
        }

        public ListServiceQARequestPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListServiceQARequestPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
