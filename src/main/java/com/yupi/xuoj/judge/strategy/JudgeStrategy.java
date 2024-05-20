package com.yupi.xuoj.judge.strategy;

import com.yupi.xuoj.judge.codesandbox.model.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
