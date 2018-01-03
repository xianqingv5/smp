package com.yiche.smp.common.boostVo;

/**
 * 生成申请单序号的实体
 */
public class BoostSequence {
    private Integer seqId;
    private String description;

    public BoostSequence() {
    }

    public BoostSequence(Integer seqId, String description) {
        this.seqId = seqId;
        this.description = description;
    }

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
