package com.yupi.xuoj.judge.codesandbox;

import com.yupi.xuoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.xuoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yupi.xuoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 */
public class CodeSandboxFactory {

    /**
     * 创建代码沙箱实例
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
