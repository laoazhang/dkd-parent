package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Region;
import lombok.Data;

/**
 * @Author laoazhang
 * @Date 2024/7/11 20:09
 * @Description:
 * @Version 1.0
 */
@Data
public class RegionVo extends Region {

    //点位数量
    private int nodeCount;
}
