package cloud.seata.order.service.impl;

import cloud.seata.order.mapper.AccountMapper;
import cloud.seata.order.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {
    private final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);
    @Resource
    private AccountMapper accountMapper ;

    @Override
    public Integer updateAccount(Long money) {
        LOGGER.info("Account 扣款 "+money);
        return accountMapper.updateAccount(money);
    }
}
