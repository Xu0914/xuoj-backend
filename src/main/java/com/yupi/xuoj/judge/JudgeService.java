package com.yupi.xuoj.judge;

import com.yupi.xuoj.model.entity.QuestionSubmit;
import com.yupi.xuoj.model.vo.QuestionSubmitVO;

/**
 * 判题服务
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
