// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface curl_socket_callback {

    int apply(java.lang.foreign.MemoryAddress easy, long s, int what, java.lang.foreign.MemoryAddress userp, java.lang.foreign.MemoryAddress socketp);
    static MemorySegment allocate(curl_socket_callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(curl_socket_callback.class, fi, constants$1401.curl_socket_callback$FUNC, session);
    }
    static curl_socket_callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _easy, long _s, int _what, java.lang.foreign.MemoryAddress _userp, java.lang.foreign.MemoryAddress _socketp) -> {
            try {
                return (int)constants$1401.curl_socket_callback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_easy, _s, _what, (java.lang.foreign.Addressable)_userp, (java.lang.foreign.Addressable)_socketp);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


