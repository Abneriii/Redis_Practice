package com.ruyuan.careerplan.goodscart.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 购物车入参对象
 *
 * @author zhonghuashishan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CookBookCartSkuRequest {
    /**
     * 商品编码
     */
    @NotBlank
    private String skuId;

    /**
     * 用户ID
     */
    @NotNull
    private Long userId;

    /**
     * 商品数量
     */
    @NotNull
    @Min(0)
    private Integer count;

    /**
     * 卖家仓库地址
     */
    @NotBlank
    private String warehouse;

    /**
     * 选中状态
     */
    @NotNull
    private Integer checkedStatus;
}
