// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushHotelMessageRequest extends TeaModel {
    /**
     * <p>pushHotelMessageReq</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PushHotelMessageReq")
    public PushHotelMessageRequestPushHotelMessageReq pushHotelMessageReq;

    public static PushHotelMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushHotelMessageRequest self = new PushHotelMessageRequest();
        return TeaModel.build(map, self);
    }

    public PushHotelMessageRequest setPushHotelMessageReq(PushHotelMessageRequestPushHotelMessageReq pushHotelMessageReq) {
        this.pushHotelMessageReq = pushHotelMessageReq;
        return this;
    }
    public PushHotelMessageRequestPushHotelMessageReq getPushHotelMessageReq() {
        return this.pushHotelMessageReq;
    }

    public static class PushHotelMessageRequestPushHotelMessageReq extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e6dd44fd16084db8a60d69fd625d9f0f</p>
         */
        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("ParamMap")
        public java.util.Map<String, String> paramMap;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102</p>
         */
        @NameInMap("RoomNo")
        public String roomNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static PushHotelMessageRequestPushHotelMessageReq build(java.util.Map<String, ?> map) throws Exception {
            PushHotelMessageRequestPushHotelMessageReq self = new PushHotelMessageRequestPushHotelMessageReq();
            return TeaModel.build(map, self);
        }

        public PushHotelMessageRequestPushHotelMessageReq setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public PushHotelMessageRequestPushHotelMessageReq setParamMap(java.util.Map<String, String> paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public java.util.Map<String, String> getParamMap() {
            return this.paramMap;
        }

        public PushHotelMessageRequestPushHotelMessageReq setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public PushHotelMessageRequestPushHotelMessageReq setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
