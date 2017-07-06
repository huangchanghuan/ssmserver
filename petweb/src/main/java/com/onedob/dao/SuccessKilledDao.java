package com.onedob.dao;

import org.apache.ibatis.annotations.Param;
import com.onedob.entity.SuccessKilled;

public interface SuccessKilledDao {
	/**
	 * 插入购买明细，可以过滤重复
	 * @param seckillId
	 * @param userPhone
	 * @return 影响行数
	 */
	int insertSuccessKilled(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
	
	/**
	 * 根据id查询SuccessKilled并携带秒杀产品对象
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);
}
