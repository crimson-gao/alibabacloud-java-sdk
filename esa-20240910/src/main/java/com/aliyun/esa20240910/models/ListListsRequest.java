// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListListsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>ListLists</p>
     */
    @NameInMap("QueryArgs")
    public ListListsRequestQueryArgs queryArgs;

    public static ListListsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListsRequest self = new ListListsRequest();
        return TeaModel.build(map, self);
    }

    public ListListsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListsRequest setQueryArgs(ListListsRequestQueryArgs queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public ListListsRequestQueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public static class ListListsRequestQueryArgs extends TeaModel {
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        @NameInMap("DescriptionLike")
        public String descriptionLike;

        /**
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        @NameInMap("IdLike")
        public String idLike;

        /**
         * <strong>example:</strong>
         * <p>10.1.1.1</p>
         */
        @NameInMap("ItemLike")
        public String itemLike;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <strong>example:</strong>
         * <p>10.1.1.1</p>
         */
        @NameInMap("NameItemLike")
        public String nameItemLike;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        public static ListListsRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListListsRequestQueryArgs self = new ListListsRequestQueryArgs();
            return TeaModel.build(map, self);
        }

        public ListListsRequestQueryArgs setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
        public Boolean getDesc() {
            return this.desc;
        }

        public ListListsRequestQueryArgs setDescriptionLike(String descriptionLike) {
            this.descriptionLike = descriptionLike;
            return this;
        }
        public String getDescriptionLike() {
            return this.descriptionLike;
        }

        public ListListsRequestQueryArgs setIdLike(String idLike) {
            this.idLike = idLike;
            return this;
        }
        public String getIdLike() {
            return this.idLike;
        }

        public ListListsRequestQueryArgs setItemLike(String itemLike) {
            this.itemLike = itemLike;
            return this;
        }
        public String getItemLike() {
            return this.itemLike;
        }

        public ListListsRequestQueryArgs setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListListsRequestQueryArgs setNameItemLike(String nameItemLike) {
            this.nameItemLike = nameItemLike;
            return this;
        }
        public String getNameItemLike() {
            return this.nameItemLike;
        }

        public ListListsRequestQueryArgs setNameLike(String nameLike) {
            this.nameLike = nameLike;
            return this;
        }
        public String getNameLike() {
            return this.nameLike;
        }

        public ListListsRequestQueryArgs setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

    }

}
