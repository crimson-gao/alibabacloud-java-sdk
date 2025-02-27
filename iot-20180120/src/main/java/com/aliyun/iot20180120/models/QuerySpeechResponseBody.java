// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.speechsolution.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySpeechResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>speech solution has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySpeechResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechResponseBody self = new QuerySpeechResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpeechResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechResponseBody setData(QuerySpeechResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechResponseBodyData getData() {
        return this.data;
    }

    public QuerySpeechResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySpeechResponseBodyDataSoundCodeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AdditionalDuration")
        public Integer additionalDuration;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
         */
        @NameInMap("SoundCodeContent")
        public String soundCodeContent;

        public static QuerySpeechResponseBodyDataSoundCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechResponseBodyDataSoundCodeConfig self = new QuerySpeechResponseBodyDataSoundCodeConfig();
            return TeaModel.build(map, self);
        }

        public QuerySpeechResponseBodyDataSoundCodeConfig setAdditionalDuration(Integer additionalDuration) {
            this.additionalDuration = additionalDuration;
            return this;
        }
        public Integer getAdditionalDuration() {
            return this.additionalDuration;
        }

        public QuerySpeechResponseBodyDataSoundCodeConfig setSoundCodeContent(String soundCodeContent) {
            this.soundCodeContent = soundCodeContent;
            return this;
        }
        public String getSoundCodeContent() {
            return this.soundCodeContent;
        }

    }

    public static class QuerySpeechResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wav</p>
         */
        @NameInMap("AudioFormat")
        public String audioFormat;

        /**
         * <strong>example:</strong>
         * <p>identifying</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSoundCode")
        public Boolean enableSoundCode;

        @NameInMap("SoundCodeConfig")
        public QuerySpeechResponseBodyDataSoundCodeConfig soundCodeConfig;

        /**
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        @NameInMap("SpeechCode")
        public String speechCode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("SpeechType")
        public String speechType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>Siyue</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static QuerySpeechResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechResponseBodyData self = new QuerySpeechResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechResponseBodyData setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

        public QuerySpeechResponseBodyData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechResponseBodyData setEnableSoundCode(Boolean enableSoundCode) {
            this.enableSoundCode = enableSoundCode;
            return this;
        }
        public Boolean getEnableSoundCode() {
            return this.enableSoundCode;
        }

        public QuerySpeechResponseBodyData setSoundCodeConfig(QuerySpeechResponseBodyDataSoundCodeConfig soundCodeConfig) {
            this.soundCodeConfig = soundCodeConfig;
            return this;
        }
        public QuerySpeechResponseBodyDataSoundCodeConfig getSoundCodeConfig() {
            return this.soundCodeConfig;
        }

        public QuerySpeechResponseBodyData setSpeechCode(String speechCode) {
            this.speechCode = speechCode;
            return this;
        }
        public String getSpeechCode() {
            return this.speechCode;
        }

        public QuerySpeechResponseBodyData setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public QuerySpeechResponseBodyData setSpeechType(String speechType) {
            this.speechType = speechType;
            return this;
        }
        public String getSpeechType() {
            return this.speechType;
        }

        public QuerySpeechResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechResponseBodyData setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public QuerySpeechResponseBodyData setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

}
