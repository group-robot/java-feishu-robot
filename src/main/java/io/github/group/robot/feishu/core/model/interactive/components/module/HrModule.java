package io.github.group.robot.feishu.core.model.interactive.components.module;

import lombok.Builder;

import java.util.HashMap;
import java.util.Map;

/**
 * 分割线模块
 *
 * @author bing_huang
 * @date 2021/12/16
 */
@Builder
public class HrModule extends AbstractModule {
    private final String tag = "hr";

    @Override
    public String tag() {
        return tag;
    }

    @Override
    public Map<String, Object> toMessage() {
        Map<String, Object> message = new HashMap<>(1);
        message.put("tag", tag());
        return message;
    }
}
