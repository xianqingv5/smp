package com.yiche.smp.common;

/**
 * funtion:渠道质量分布趋势
 *
 * @Author wangyb
 * @Date 2017/12/26
 */
public enum TrendJudgeEnum {

    conform("0", "符合市场趋势"),
    exceed("1", "高于市场趋势"),
    underShopAdd("2", "低于市场趋势（门店数量增加导致）"),
    underClueInsufficient("3", "低于市场趋势（总体线索上涨不足导致）"),
    underClueDecline("4", "! 低于市场趋势（总体线索下滑过多导致）");

    private String code;
    private String message;

    TrendJudgeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
