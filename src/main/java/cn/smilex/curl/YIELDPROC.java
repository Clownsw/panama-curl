// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface YIELDPROC {

    int apply(int mciId, int dwYieldData);
    static MemorySegment allocate(YIELDPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(YIELDPROC.class, fi, constants$677.YIELDPROC$FUNC, session);
    }
    static YIELDPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _mciId, int _dwYieldData) -> {
            try {
                return (int)constants$677.YIELDPROC$MH.invokeExact((Addressable)symbol, _mciId, _dwYieldData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


