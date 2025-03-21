// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubAlbumResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CB13B8D7-37FB-1B3E-8EB9-65BB413267E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListSubAlbumResponseBodyResult result;

    public static ListSubAlbumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubAlbumResponseBody self = new ListSubAlbumResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubAlbumResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSubAlbumResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubAlbumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubAlbumResponseBody setResult(ListSubAlbumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSubAlbumResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListSubAlbumResponseBodyResultDataListScheduleInfo extends TeaModel {
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        @NameInMap("ScheduleId")
        public Long scheduleId;

        public static ListSubAlbumResponseBodyResultDataListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubAlbumResponseBodyResultDataListScheduleInfo self = new ListSubAlbumResponseBodyResultDataListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListSubAlbumResponseBodyResultDataListScheduleInfo setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public ListSubAlbumResponseBodyResultDataListScheduleInfo setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public ListSubAlbumResponseBodyResultDataListScheduleInfo setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public ListSubAlbumResponseBodyResultDataListScheduleInfo setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public Long getScheduleId() {
            return this.scheduleId;
        }

    }

    public static class ListSubAlbumResponseBodyResultDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4476001</p>
         */
        @NameInMap("AlbumId")
        public String albumId;

        /**
         * <strong>example:</strong>
         * <p>80011</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabs.alibabausercontent.com/images/17825/jknoamc2.jpg">https://ailabs.alibabausercontent.com/images/17825/jknoamc2.jpg</a></p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAdded")
        public Boolean isAdded;

        @NameInMap("ScheduleInfo")
        public ListSubAlbumResponseBodyResultDataListScheduleInfo scheduleInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Long sequence;

        /**
         * <strong>example:</strong>
         * <p>睡前故事</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("TotalEpisode")
        public Integer totalEpisode;

        public static ListSubAlbumResponseBodyResultDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSubAlbumResponseBodyResultDataList self = new ListSubAlbumResponseBodyResultDataList();
            return TeaModel.build(map, self);
        }

        public ListSubAlbumResponseBodyResultDataList setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public ListSubAlbumResponseBodyResultDataList setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public ListSubAlbumResponseBodyResultDataList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListSubAlbumResponseBodyResultDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubAlbumResponseBodyResultDataList setIsAdded(Boolean isAdded) {
            this.isAdded = isAdded;
            return this;
        }
        public Boolean getIsAdded() {
            return this.isAdded;
        }

        public ListSubAlbumResponseBodyResultDataList setScheduleInfo(ListSubAlbumResponseBodyResultDataListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListSubAlbumResponseBodyResultDataListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListSubAlbumResponseBodyResultDataList setSequence(Long sequence) {
            this.sequence = sequence;
            return this;
        }
        public Long getSequence() {
            return this.sequence;
        }

        public ListSubAlbumResponseBodyResultDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListSubAlbumResponseBodyResultDataList setTotalEpisode(Integer totalEpisode) {
            this.totalEpisode = totalEpisode;
            return this;
        }
        public Integer getTotalEpisode() {
            return this.totalEpisode;
        }

    }

    public static class ListSubAlbumResponseBodyResult extends TeaModel {
        @NameInMap("DataList")
        public java.util.List<ListSubAlbumResponseBodyResultDataList> dataList;

        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        public static ListSubAlbumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSubAlbumResponseBodyResult self = new ListSubAlbumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSubAlbumResponseBodyResult setDataList(java.util.List<ListSubAlbumResponseBodyResultDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListSubAlbumResponseBodyResultDataList> getDataList() {
            return this.dataList;
        }

        public ListSubAlbumResponseBodyResult setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListSubAlbumResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListSubAlbumResponseBodyResult setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

    }

}
