package tyut.selab.lzc.handler.base;

import tyut.selab.lzc.dto.base.PayRequest;
import tyut.selab.lzc.dto.base.PayResponse;

/**
 * @className: AbstractPayHandler
 * @author: lizhichao
 * @description: TODO
 * @date: 2024/4/7 22:50
 * @version: 1.0
 */
public abstract class AbstractPayHandler {

    /**
     *   支付抽象接口
     * @param payRequest 支付请求参数
     * @return 支付响应参数
     */
    public abstract PayResponse pay(PayRequest payRequest);
}
