// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPHANDLER_FUNCTION {

    void apply(int dwControl);
    static MemorySegment allocate(LPHANDLER_FUNCTION fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPHANDLER_FUNCTION.class, fi, constants$1324.LPHANDLER_FUNCTION$FUNC, session);
    }
    static LPHANDLER_FUNCTION ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwControl) -> {
            try {
                constants$1325.LPHANDLER_FUNCTION$MH.invokeExact((Addressable)symbol, _dwControl);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


