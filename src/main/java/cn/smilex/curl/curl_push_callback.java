// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface curl_push_callback {

    int apply(java.lang.foreign.MemoryAddress parent, java.lang.foreign.MemoryAddress easy, long num_headers, java.lang.foreign.MemoryAddress headers, java.lang.foreign.MemoryAddress userp);
    static MemorySegment allocate(curl_push_callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(curl_push_callback.class, fi, constants$1403.curl_push_callback$FUNC, session);
    }
    static curl_push_callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _parent, java.lang.foreign.MemoryAddress _easy, long _num_headers, java.lang.foreign.MemoryAddress _headers, java.lang.foreign.MemoryAddress _userp) -> {
            try {
                return (int)constants$1403.curl_push_callback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_parent, (java.lang.foreign.Addressable)_easy, _num_headers, (java.lang.foreign.Addressable)_headers, (java.lang.foreign.Addressable)_userp);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

