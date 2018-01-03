package com.yiche.smp.common.piechart;

import com.yiche.smp.common.TrendJudgeEnum;

import java.io.Serializable;
import java.util.Arrays;

/**
 * funtion:
 *
 * @Author wangyb
 * @Date 2017/12/12
 */
public class Legend implements Serializable {

    private static final long serialVersionUID = -3598120633927751673L;
    private String orient = "vertical";

    private String[] data = {TrendJudgeEnum.conform.getMessage(), TrendJudgeEnum.exceed.getMessage(),
            TrendJudgeEnum.underShopAdd.getMessage(), TrendJudgeEnum.underClueInsufficient.getMessage(),
            TrendJudgeEnum.underClueDecline.getMessage()};
    public Legend(String orient, String[] data) {
        this.orient = orient;
        this.data = data;
    }

    public Legend() {
    }

    public String getOrient() {
        return orient;
    }

    public void setOrient(String orient) {
        this.orient = orient;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Legend{" +
                "orient='" + orient + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
