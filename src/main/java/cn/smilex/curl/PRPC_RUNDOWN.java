// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PRPC_RUNDOWN {

    void apply(java.lang.foreign.MemoryAddress AssociationContext);
    static MemorySegment allocate(PRPC_RUNDOWN fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PRPC_RUNDOWN.class, fi, constants$742.PRPC_RUNDOWN$FUNC, session);
    }
    static PRPC_RUNDOWN ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _AssociationContext) -> {
            try {
                constants$742.PRPC_RUNDOWN$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_AssociationContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


