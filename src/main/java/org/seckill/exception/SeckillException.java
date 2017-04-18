package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/11
 * Time: 12:57
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
