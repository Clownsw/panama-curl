// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface WAITORTIMERCALLBACKFUNC {

    void apply(java.lang.foreign.MemoryAddress _x0, byte _x1);
    static MemorySegment allocate(WAITORTIMERCALLBACKFUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(WAITORTIMERCALLBACKFUNC.class, fi, constants$183.WAITORTIMERCALLBACKFUNC$FUNC, session);
    }
    static WAITORTIMERCALLBACKFUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, byte __x1) -> {
            try {
                constants$183.WAITORTIMERCALLBACKFUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


