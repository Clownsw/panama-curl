// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PREGISTERCLASSNAMEW {

    byte apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(PREGISTERCLASSNAMEW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PREGISTERCLASSNAMEW.class, fi, constants$496.PREGISTERCLASSNAMEW$FUNC, session);
    }
    static PREGISTERCLASSNAMEW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (byte)constants$496.PREGISTERCLASSNAMEW$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


