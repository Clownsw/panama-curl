// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface I_RpcProxyUpdatePerfCounterFn {

    void apply(int Counter, int ModifyTrend, int Size);
    static MemorySegment allocate(I_RpcProxyUpdatePerfCounterFn fi, MemorySession session) {
        return RuntimeHelper.upcallStub(I_RpcProxyUpdatePerfCounterFn.class, fi, constants$755.I_RpcProxyUpdatePerfCounterFn$FUNC, session);
    }
    static I_RpcProxyUpdatePerfCounterFn ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _Counter, int _ModifyTrend, int _Size) -> {
            try {
                constants$755.I_RpcProxyUpdatePerfCounterFn$MH.invokeExact((Addressable)symbol, _Counter, _ModifyTrend, _Size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


