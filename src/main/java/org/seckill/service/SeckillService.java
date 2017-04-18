package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillExpection;
import org.seckill.exception.SeckillCloseException;

import javax.servlet.ServletException;
import java.util.List;

/**
 * 业务接口：站在“使用者”角度设计接口
 * 三方面：方法定义粒度，参数，返回类型（return 类型/异常）
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/11
 * Time: 12:39
 */
public interface SeckillService {

    /**
     * 查询所有秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开始时，输出秒杀接口地址，
     * 否则输出系统时间和秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws ServletException, RepeatKillExpection, SeckillCloseException;

    /**
     * 执行秒杀操作 by存储过程
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckillByProcedure(long seckillId, long userPhone, String md5)
            throws ServletException, RepeatKillExpection, SeckillCloseException;

}
