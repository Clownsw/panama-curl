// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface WINSTAENUMPROC {

    int apply(java.lang.foreign.MemoryAddress _x0, long _x1);
    static MemorySegment allocate(WINSTAENUMPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(WINSTAENUMPROC.class, fi, constants$476.WINSTAENUMPROC$FUNC, session);
    }
    static WINSTAENUMPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, long __x1) -> {
            try {
                return (int)constants$476.WINSTAENUMPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


