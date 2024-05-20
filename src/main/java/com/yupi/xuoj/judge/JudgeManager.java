package com.yupi.xuoj.judge;

import com.yupi.xuoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.xuoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.xuoj.judge.strategy.JudgeContext;
import com.yupi.xuoj.judge.strategy.JudgeStrategy;
import com.yupi.xuoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.xuoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
