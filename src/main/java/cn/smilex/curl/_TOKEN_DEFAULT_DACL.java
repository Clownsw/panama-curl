// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TOKEN_DEFAULT_DACL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("DefaultDacl")
    ).withName("_TOKEN_DEFAULT_DACL");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_DEFAULT_DACL.$struct$LAYOUT;
    }
    static final VarHandle DefaultDacl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DefaultDacl"));
    public static VarHandle DefaultDacl$VH() {
        return _TOKEN_DEFAULT_DACL.DefaultDacl$VH;
    }
    public static MemoryAddress DefaultDacl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_TOKEN_DEFAULT_DACL.DefaultDacl$VH.get(seg);
    }
    public static void DefaultDacl$set( MemorySegment seg, MemoryAddress x) {
        _TOKEN_DEFAULT_DACL.DefaultDacl$VH.set(seg, x);
    }
    public static MemoryAddress DefaultDacl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_TOKEN_DEFAULT_DACL.DefaultDacl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultDacl$set(MemorySegment seg, long index, MemoryAddress x) {
        _TOKEN_DEFAULT_DACL.DefaultDacl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


