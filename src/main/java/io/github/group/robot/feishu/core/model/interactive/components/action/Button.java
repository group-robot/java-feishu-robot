package io.github.group.robot.feishu.core.model.interactive.components.action;

import io.github.group.robot.feishu.core.constants.ButtonType;
import io.github.group.robot.feishu.core.model.interactive.components.Text;
import io.github.group.robot.feishu.core.model.interactive.components.action.ele.Confirm;
import io.github.group.robot.feishu.core.model.interactive.components.action.ele.Url;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 卡片 > 交互式组件 > button
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2021/12/16
 */
@Getter
@Setter
public class Button extends ActionComponent {

    private final String tag = "button";

    /**
     * create Button
     *
     * @return {@link  Button}
     */
    public static Button build() {
        return new Button();
    }

    public Button() {
        this(new HashMap<>());
    }

    public Button(Map<String, Object> value) {
        this.value = value;
    }

    /**
     * 按钮中的文本
     */
    private Text text;

    /**
     * set text
     *
     * @param text text
     * @return this
     */
    public Button text(Text text) {
        this.text = text;
        return this;
    }

    /**
     * 跳转链接，和multi_url互斥
     */
    private String url;

    /**
     * set url
     *
     * @param url url
     * @return this
     */
    public Button url(String url) {
        this.url = url;
        return this;
    }

    /**
     * 多端跳转链接
     */
    private Url multiUrl;

    /**
     * set multiUrl
     *
     * @param multiUrl multiUrl
     * @return this
     */
    public Button multiUrl(Url multiUrl) {
        this.multiUrl = multiUrl;
        return this;
    }

    /**
     * 配置按钮样式
     */
    private ButtonType type;

    /**
     * set type
     *
     * @param type button type
     * @return this
     */
    public Button type(ButtonType type) {
        this.type = type;
        return this;
    }

    /**
     * 点击后返回业务方
     */
    private Map<String, Object> value;

    /**
     * set button value
     *
     * @param value button value
     * @return this
     */
    public Button value(Map<String, Object> value) {
        this.value = value;
        return this;
    }

    /**
     * add button value
     *
     * @param key   key
     * @param value value
     * @return this
     */
    public Button addValue(String key, Object value) {
        this.value.put(key, value);
        return this;
    }

    /**
     * 二次确认的弹框
     */
    private Confirm confirm;

    /**
     * set button confirm
     *
     * @param confirm confirm
     * @return this
     */
    private Button confirm(Confirm confirm) {
        this.confirm = confirm;
        return this;
    }

    @Override
    public Map<String, Object> toMessage() {
        Map<String, Object> message = new HashMap<>(4);
        message.put("tag", this.tag);
        message.put("text", this.text.toMessage());
        message.put("url", this.url);
        if (null != this.multiUrl) {
            message.put("multi_url", this.multiUrl.toMessage());
        }

        message.put("type", this.type == null ? ButtonType.DEFAULT.getValue() : this.type.getValue());
        if (!this.value.isEmpty()) {
            message.put("value", this.value);
        }
        if (null != this.confirm) {
            message.put("confirm", this.confirm.toMessage());
        }
        return message;
    }

    @Override
    public String tag() {
        return tag;
    }
}
