package io.github.group.robot.feishu.core.exception;

/**
 * 异常
 *
 * @author bing_huang
 * @date 2021/12/16
 */
public class RobotException extends RuntimeException {
    public RobotException(Throwable cause) {
        super(cause);
    }

    public RobotException(String message) {
        super(message);
    }
}
