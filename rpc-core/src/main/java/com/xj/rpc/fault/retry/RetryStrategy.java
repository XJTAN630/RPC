package com.xj.rpc.fault.retry;

import com.xj.rpc.model.RpcResponse;

import java.util.concurrent.Callable;

/**
 * 重试策略
 *

 */
public interface RetryStrategy {

    /**
     * 重试
     *
     * @param callable
     * @return
     * @throws Exception
     */
    RpcResponse doRetry(Callable<RpcResponse> callable) throws Exception;
}
