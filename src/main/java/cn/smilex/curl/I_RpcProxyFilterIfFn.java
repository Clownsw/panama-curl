// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface I_RpcProxyFilterIfFn {

    int apply(java.lang.foreign.MemoryAddress Context, java.lang.foreign.MemoryAddress IfUuid, short IfMajorVersion, java.lang.foreign.MemoryAddress fAllow);
    static MemorySegment allocate(I_RpcProxyFilterIfFn fi, MemorySession session) {
        return RuntimeHelper.upcallStub(I_RpcProxyFilterIfFn.class, fi, constants$755.I_RpcProxyFilterIfFn$FUNC, session);
    }
    static I_RpcProxyFilterIfFn ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Context, java.lang.foreign.MemoryAddress _IfUuid, short _IfMajorVersion, java.lang.foreign.MemoryAddress _fAllow) -> {
            try {
                return (int)constants$755.I_RpcProxyFilterIfFn$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Context, (java.lang.foreign.Addressable)_IfUuid, _IfMajorVersion, (java.lang.foreign.Addressable)_fAllow);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


