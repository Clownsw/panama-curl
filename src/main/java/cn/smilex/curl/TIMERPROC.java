// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface TIMERPROC {

    void apply(java.lang.foreign.MemoryAddress _x0, int _x1, long _x2, int _x3);
    static MemorySegment allocate(TIMERPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(TIMERPROC.class, fi, constants$469.TIMERPROC$FUNC, session);
    }
    static TIMERPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, int __x1, long __x2, int __x3) -> {
            try {
                constants$469.TIMERPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


