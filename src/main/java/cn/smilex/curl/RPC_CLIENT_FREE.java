// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RPC_CLIENT_FREE {

    void apply(java.lang.foreign.MemoryAddress Ptr);
    static MemorySegment allocate(RPC_CLIENT_FREE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RPC_CLIENT_FREE.class, fi, constants$909.RPC_CLIENT_FREE$FUNC, session);
    }
    static RPC_CLIENT_FREE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Ptr) -> {
            try {
                constants$909.RPC_CLIENT_FREE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Ptr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


