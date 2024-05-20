package com.yupi.xuoj.judge.codesandbox;

import com.yupi.xuoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.xuoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
