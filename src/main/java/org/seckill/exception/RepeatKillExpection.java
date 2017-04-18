package org.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/11
 * Time: 12:53
 */
public class RepeatKillExpection extends SeckillException {

    public RepeatKillExpection(String message) {
        super(message);
    }

    public RepeatKillExpection(String message, Throwable cause) {
        super(message, cause);
    }
}
