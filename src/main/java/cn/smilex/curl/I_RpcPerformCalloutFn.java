// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface I_RpcPerformCalloutFn {

    int apply(java.lang.foreign.MemoryAddress Context, java.lang.foreign.MemoryAddress CallOutState, int Stage);
    static MemorySegment allocate(I_RpcPerformCalloutFn fi, MemorySession session) {
        return RuntimeHelper.upcallStub(I_RpcPerformCalloutFn.class, fi, constants$754.I_RpcPerformCalloutFn$FUNC, session);
    }
    static I_RpcPerformCalloutFn ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Context, java.lang.foreign.MemoryAddress _CallOutState, int _Stage) -> {
            try {
                return (int)constants$754.I_RpcPerformCalloutFn$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Context, (java.lang.foreign.Addressable)_CallOutState, _Stage);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

