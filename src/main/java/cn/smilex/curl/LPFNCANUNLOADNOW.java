// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPFNCANUNLOADNOW {

    int apply();
    static MemorySegment allocate(LPFNCANUNLOADNOW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPFNCANUNLOADNOW.class, fi, constants$1063.LPFNCANUNLOADNOW$FUNC, session);
    }
    static LPFNCANUNLOADNOW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                return (int)constants$1063.LPFNCANUNLOADNOW$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


