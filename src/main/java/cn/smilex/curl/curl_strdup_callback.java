// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface curl_strdup_callback {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress str);
    static MemorySegment allocate(curl_strdup_callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(curl_strdup_callback.class, fi, constants$1387.curl_strdup_callback$FUNC, session);
    }
    static curl_strdup_callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _str) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$1387.curl_strdup_callback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_str);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

