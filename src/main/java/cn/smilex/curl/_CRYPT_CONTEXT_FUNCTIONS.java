// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_CONTEXT_FUNCTIONS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cFunctions"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpszFunctions")
    ).withName("_CRYPT_CONTEXT_FUNCTIONS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_CONTEXT_FUNCTIONS.$struct$LAYOUT;
    }
    static final VarHandle cFunctions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cFunctions"));
    public static VarHandle cFunctions$VH() {
        return _CRYPT_CONTEXT_FUNCTIONS.cFunctions$VH;
    }
    public static int cFunctions$get(MemorySegment seg) {
        return (int)_CRYPT_CONTEXT_FUNCTIONS.cFunctions$VH.get(seg);
    }
    public static void cFunctions$set( MemorySegment seg, int x) {
        _CRYPT_CONTEXT_FUNCTIONS.cFunctions$VH.set(seg, x);
    }
    public static int cFunctions$get(MemorySegment seg, long index) {
        return (int)_CRYPT_CONTEXT_FUNCTIONS.cFunctions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cFunctions$set(MemorySegment seg, long index, int x) {
        _CRYPT_CONTEXT_FUNCTIONS.cFunctions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpszFunctions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpszFunctions"));
    public static VarHandle rgpszFunctions$VH() {
        return _CRYPT_CONTEXT_FUNCTIONS.rgpszFunctions$VH;
    }
    public static MemoryAddress rgpszFunctions$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_CONTEXT_FUNCTIONS.rgpszFunctions$VH.get(seg);
    }
    public static void rgpszFunctions$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_CONTEXT_FUNCTIONS.rgpszFunctions$VH.set(seg, x);
    }
    public static MemoryAddress rgpszFunctions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_CONTEXT_FUNCTIONS.rgpszFunctions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszFunctions$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_CONTEXT_FUNCTIONS.rgpszFunctions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


