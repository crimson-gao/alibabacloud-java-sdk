// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class RemoveGameFromProjectRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 游戏iD
    @NameInMap("GameId")
    public String gameId;

    public static RemoveGameFromProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGameFromProjectRequest self = new RemoveGameFromProjectRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGameFromProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RemoveGameFromProjectRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

}
