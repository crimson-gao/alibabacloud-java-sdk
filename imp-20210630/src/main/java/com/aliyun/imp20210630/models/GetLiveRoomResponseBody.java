// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 创建场景化直播返回的结果。
    @NameInMap("Result")
    public GetLiveRoomResponseBodyResult result;

    public static GetLiveRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomResponseBody self = new GetLiveRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveRoomResponseBody setResult(GetLiveRoomResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLiveRoomResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLiveRoomResponseBodyResultPluginInstanceInfoList extends TeaModel {
        // 插件唯一标识，取值：live-直播，wb-白板，chat-聊天，rtc。
        @NameInMap("PluginType")
        public String pluginType;

        // 插件实例唯一标识。
        @NameInMap("PluginId")
        public String pluginId;

        // 插件实例创建时间戳，单位：毫秒。
        @NameInMap("CreateTime")
        public Long createTime;

        // 插件拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        public static GetLiveRoomResponseBodyResultPluginInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRoomResponseBodyResultPluginInstanceInfoList self = new GetLiveRoomResponseBodyResultPluginInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public GetLiveRoomResponseBodyResultPluginInstanceInfoList setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public GetLiveRoomResponseBodyResultPluginInstanceInfoList setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetLiveRoomResponseBodyResultPluginInstanceInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLiveRoomResponseBodyResultPluginInstanceInfoList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

    }

    public static class GetLiveRoomResponseBodyResult extends TeaModel {
        // 应用ID。
        @NameInMap("AppId")
        public String appId;

        // 直播ID。
        @NameInMap("LiveId")
        public String liveId;

        // 直播状态，0-在播 1-下播。
        @NameInMap("Status")
        public Integer status;

        // 房间ID。
        @NameInMap("RoomId")
        public String roomId;

        // 聊天ID。
        @NameInMap("ChatId")
        public String chatId;

        // 标题。
        @NameInMap("Title")
        public String title;

        // 公告。
        @NameInMap("Notice")
        public String notice;

        // 封面。
        @NameInMap("CoverUrl")
        public String coverUrl;

        // 主播ID。
        @NameInMap("AnchorId")
        public String anchorId;

        // 访问用户数。
        @NameInMap("Uv")
        public Long uv;

        // 在线用户数。
        @NameInMap("OnlineCount")
        public Long onlineCount;

        // 直播回放地址。
        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        // 直播创建时间，单位：毫秒。
        @NameInMap("CreateTime")
        public Long createTime;

        // 直播结束时间，单位：毫秒。
        @NameInMap("EndTime")
        public Long endTime;

        // 直播推流地址。
        @NameInMap("PushUrl")
        public String pushUrl;

        // 直播拉流地址。
        @NameInMap("LiveUrl")
        public String liveUrl;

        // 活跃插件列表。
        @NameInMap("PluginInstanceInfoList")
        public java.util.List<GetLiveRoomResponseBodyResultPluginInstanceInfoList> pluginInstanceInfoList;

        // 直播拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 访问用户人次。
        @NameInMap("Pv")
        public Long pv;

        // 主播昵称
        @NameInMap("AnchorNick")
        public String anchorNick;

        public static GetLiveRoomResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRoomResponseBodyResult self = new GetLiveRoomResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLiveRoomResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetLiveRoomResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public GetLiveRoomResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetLiveRoomResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetLiveRoomResponseBodyResult setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public GetLiveRoomResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLiveRoomResponseBodyResult setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public GetLiveRoomResponseBodyResult setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetLiveRoomResponseBodyResult setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public GetLiveRoomResponseBodyResult setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

        public GetLiveRoomResponseBodyResult setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public GetLiveRoomResponseBodyResult setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public GetLiveRoomResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLiveRoomResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLiveRoomResponseBodyResult setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public GetLiveRoomResponseBodyResult setLiveUrl(String liveUrl) {
            this.liveUrl = liveUrl;
            return this;
        }
        public String getLiveUrl() {
            return this.liveUrl;
        }

        public GetLiveRoomResponseBodyResult setPluginInstanceInfoList(java.util.List<GetLiveRoomResponseBodyResultPluginInstanceInfoList> pluginInstanceInfoList) {
            this.pluginInstanceInfoList = pluginInstanceInfoList;
            return this;
        }
        public java.util.List<GetLiveRoomResponseBodyResultPluginInstanceInfoList> getPluginInstanceInfoList() {
            return this.pluginInstanceInfoList;
        }

        public GetLiveRoomResponseBodyResult setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public GetLiveRoomResponseBodyResult setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public GetLiveRoomResponseBodyResult setAnchorNick(String anchorNick) {
            this.anchorNick = anchorNick;
            return this;
        }
        public String getAnchorNick() {
            return this.anchorNick;
        }

    }

}
