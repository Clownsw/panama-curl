// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RpcServerInterfaceGroupCreateA$IdleCallbackFn {

    void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2);
    static MemorySegment allocate(RpcServerInterfaceGroupCreateA$IdleCallbackFn fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RpcServerInterfaceGroupCreateA$IdleCallbackFn.class, fi, constants$736.RpcServerInterfaceGroupCreateA$IdleCallbackFn$FUNC, session);
    }
    static RpcServerInterfaceGroupCreateA$IdleCallbackFn ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2) -> {
            try {
                constants$737.RpcServerInterfaceGroupCreateA$IdleCallbackFn$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

