package tyut.selab.lzc.mq.produce;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import tyut.selab.lzc.mq.event.PayResultCallbackOrderEvent;
import tyut.selab.lzc.mq.produce.bases.AbstractCommonSendProduceTemplate;
import tyut.selab.lzc.mq.produce.bases.BaseSendExtendDTO;

/**
 * @className: PayResultCallbackOrderSendProduce
 * @author: lizhichao
 * @description: TODO
 * @date: 2024/4/8 12:46
 * @version: 1.0
 */
@Slf4j
@Component
public class PayResultCallbackOrderSendProduce extends AbstractCommonSendProduceTemplate<PayResultCallbackOrderEvent> {


    private final ConfigurableEnvironment environment;
    public PayResultCallbackOrderSendProduce(@Autowired  RocketMQTemplate rocketMQTemplate,@Autowired ConfigurableEnvironment environment) {
        super(rocketMQTemplate);
        this.environment = environment;
    }
    @Override
    protected BaseSendExtendDTO buildBaseSendExtendParam(PayResultCallbackOrderEvent messageSendEvent) {
        return null;
    }

    @Override
    protected Message<?> buildMessage(PayResultCallbackOrderEvent messageSendEvent, BaseSendExtendDTO requestParam) {
        return null;
    }
}
