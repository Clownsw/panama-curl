// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_PROVIDER_EXTERNAL_INFO_V0 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Algorithm")
    ).withName("_FILE_PROVIDER_EXTERNAL_INFO_V0");
    public static MemoryLayout $LAYOUT() {
        return _FILE_PROVIDER_EXTERNAL_INFO_V0.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _FILE_PROVIDER_EXTERNAL_INFO_V0.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_FILE_PROVIDER_EXTERNAL_INFO_V0.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _FILE_PROVIDER_EXTERNAL_INFO_V0.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_FILE_PROVIDER_EXTERNAL_INFO_V0.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _FILE_PROVIDER_EXTERNAL_INFO_V0.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Algorithm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Algorithm"));
    public static VarHandle Algorithm$VH() {
        return _FILE_PROVIDER_EXTERNAL_INFO_V0.Algorithm$VH;
    }
    public static int Algorithm$get(MemorySegment seg) {
        return (int)_FILE_PROVIDER_EXTERNAL_INFO_V0.Algorithm$VH.get(seg);
    }
    public static void Algorithm$set( MemorySegment seg, int x) {
        _FILE_PROVIDER_EXTERNAL_INFO_V0.Algorithm$VH.set(seg, x);
    }
    public static int Algorithm$get(MemorySegment seg, long index) {
        return (int)_FILE_PROVIDER_EXTERNAL_INFO_V0.Algorithm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Algorithm$set(MemorySegment seg, long index, int x) {
        _FILE_PROVIDER_EXTERNAL_INFO_V0.Algorithm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


