package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/11
 * Time: 12:56
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {

        super(message, cause);
    }
}
