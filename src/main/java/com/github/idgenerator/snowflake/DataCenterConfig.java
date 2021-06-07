package com.github.idgenerator.snowflake;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:application.properties"})
public class DataCenterConfig {

    @Value("${data.center.id:1}")
    private Integer dataCenterId;

    @Value("${data.machine.id:1}")
    private Integer machineId;

    public Integer getDataCenterId() {
        return this.dataCenterId;
    }

    public void setDataCenterId(Integer dataCenterId) {
        this.dataCenterId = dataCenterId;
    }

    public Integer getMachineId() {
        return this.machineId;

    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }
}
