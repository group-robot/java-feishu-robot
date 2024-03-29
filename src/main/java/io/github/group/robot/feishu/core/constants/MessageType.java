package io.github.group.robot.feishu.core.constants;

import java.io.Serializable;

/**
 * 消息类型
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2021/12/16
 */
public enum MessageType implements Serializable {
    /**
     * 文本
     */
    TEXT("text"),
    /**
     * 富文本
     */
    POST("post"),
    /**
     * 图片
     */
    IMAGE("image"),
    /**
     * 富文本
     */
    INTERACTIVE("interactive");

    /**
     * value
     */
    private final String value;

    MessageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
