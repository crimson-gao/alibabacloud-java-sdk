// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListDatasRequest extends TeaModel {
    // 云量上限
    @NameInMap("CloudageMax")
    public Integer cloudageMax;

    // 云量下限，注意modis数据云量为0
    @NameInMap("CloudageMin")
    public Integer cloudageMin;

    // 结束日期，例如"2020-06-01"
    @NameInMap("DateEnd")
    public String dateEnd;

    // 开始日期，例如"2020-01-01"
    @NameInMap("DateStart")
    public String dateStart;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 区域选择，wkt格式
    @NameInMap("RegionWkt")
    public String regionWkt;

    // 星源，可多选，枚举值如下：LANDSAT_LC08_C02_T1_L2
    // LANDSAT_LC09_C02_T1_L2
    // LANDSAT_LE07_E02_T1_L2
    // LANDSAT_LT05_T02_T1_L2
    // SENTINEL_GRD
    // SENTINEL_MSIL2A
    // MODIS_MCD12Q1_006
    // MODIS_MCD15A3H_006
    // MODIS_MOD14A2_006
    // MODIS_MOD13Q1_006
    // MODIS_MOD17A2H_006
    // MODIS_MOD17A3HGF_006
    // MODIS_MCD64A1_006
    // MODIS_MOD11A1_006
    @NameInMap("SourceTypeList")
    public java.util.List<String> sourceTypeList;

    public static ListDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasRequest self = new ListDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasRequest setCloudageMax(Integer cloudageMax) {
        this.cloudageMax = cloudageMax;
        return this;
    }
    public Integer getCloudageMax() {
        return this.cloudageMax;
    }

    public ListDatasRequest setCloudageMin(Integer cloudageMin) {
        this.cloudageMin = cloudageMin;
        return this;
    }
    public Integer getCloudageMin() {
        return this.cloudageMin;
    }

    public ListDatasRequest setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }
    public String getDateEnd() {
        return this.dateEnd;
    }

    public ListDatasRequest setDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }
    public String getDateStart() {
        return this.dateStart;
    }

    public ListDatasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasRequest setRegionWkt(String regionWkt) {
        this.regionWkt = regionWkt;
        return this;
    }
    public String getRegionWkt() {
        return this.regionWkt;
    }

    public ListDatasRequest setSourceTypeList(java.util.List<String> sourceTypeList) {
        this.sourceTypeList = sourceTypeList;
        return this;
    }
    public java.util.List<String> getSourceTypeList() {
        return this.sourceTypeList;
    }

}
