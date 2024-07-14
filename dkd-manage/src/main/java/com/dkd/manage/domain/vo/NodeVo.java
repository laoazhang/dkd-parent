package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Node;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.Region;
import lombok.Data;

/**
 * @Author laoazhang
 * @Date 2024/7/14 21:36
 * @Description:
 * @Version 1.0
 */
@Data
public class NodeVo extends Node {

    // 设备数量
    private Integer vmCount;

    // 区域信息
    private Region region;

    // 合作商信息
    private Partner partner;
}
