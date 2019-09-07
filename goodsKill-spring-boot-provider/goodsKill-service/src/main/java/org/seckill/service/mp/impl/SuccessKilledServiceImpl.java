package org.seckill.service.mp.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.seckill.entity.SuccessKilled;
import org.seckill.mp.dao.mapper.SuccessKilledMapper;
import org.seckill.service.mp.SuccessKilledService;

/**
 * <p>
 * 秒杀成功明细表 服务实现类
 * </p>
 *
 * @author heng
 * @since 2019-09-07
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class SuccessKilledServiceImpl extends ServiceImpl<SuccessKilledMapper, SuccessKilled> implements SuccessKilledService {

}
