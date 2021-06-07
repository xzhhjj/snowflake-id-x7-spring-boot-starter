package com.github.idgenerator.listenner;

import com.github.idgenerator.snowflake.DataCenterConfig;
import com.github.idgenerator.snowflake.SnowFlake;
import com.github.idgenerator.snowflake.SnowFlakeIdGenerator;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class InitingListenner implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        DataCenterConfig dataCenterConfig = applicationStartedEvent.getApplicationContext().getBean(DataCenterConfig.class);
        SnowFlake snowFlake = applicationStartedEvent.getApplicationContext().getBean(SnowFlake.class);
        SnowFlakeIdGenerator snowFlakeIdGenerator = applicationStartedEvent.getApplicationContext().getBean(SnowFlakeIdGenerator.class);
        snowFlake.init(dataCenterConfig);
        snowFlakeIdGenerator.init(snowFlake);
    }
}
