package com.github.idgenerator.snowflake;

import io.xream.sqli.spi.IdGeneratorProxy;

public class SnowFlakeIdGenerator implements IdGeneratorProxy {

    private SnowFlake snowFlake;

    public void init(SnowFlake snowFlake) {
        this.snowFlake = snowFlake;
    }

    @Override
    public long createId(String s) {
        return snowFlake.nextId();
    }
}
