package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Partner;
import lombok.Data;

/**
 * @Author laoazhang
 * @Date 2024/7/14 15:23
 * @Description:
 * @Version 1.0
 */
@Data
public class PartnerVo extends Partner {

    // 点位数量
    private Integer nodeCount;

}
