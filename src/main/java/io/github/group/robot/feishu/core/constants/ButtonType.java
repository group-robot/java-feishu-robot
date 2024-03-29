package io.github.group.robot.feishu.core.constants;

/**
 * 配置按钮样式
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2021/12/16
 */
public enum ButtonType {
    /**
     * default
     */
    DEFAULT("default"),
    /**
     * primary
     */
    PRIMARY("primary"),
    /**
     * danger
     */
    DANGER("danger"),
    ;
    private final String value;

    ButtonType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
