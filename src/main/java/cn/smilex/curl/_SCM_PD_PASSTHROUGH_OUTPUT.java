// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCM_PD_PASSTHROUGH_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProtocolGuid"),
        Constants$root.C_LONG$LAYOUT.withName("DataSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
        MemoryLayout.paddingLayout(24)
    ).withName("_SCM_PD_PASSTHROUGH_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PD_PASSTHROUGH_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_PD_PASSTHROUGH_OUTPUT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_PD_PASSTHROUGH_OUTPUT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _SCM_PD_PASSTHROUGH_OUTPUT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PASSTHROUGH_OUTPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PASSTHROUGH_OUTPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_PD_PASSTHROUGH_OUTPUT.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_PD_PASSTHROUGH_OUTPUT.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SCM_PD_PASSTHROUGH_OUTPUT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PASSTHROUGH_OUTPUT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PASSTHROUGH_OUTPUT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProtocolGuid$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle DataSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataSize"));
    public static VarHandle DataSize$VH() {
        return _SCM_PD_PASSTHROUGH_OUTPUT.DataSize$VH;
    }
    public static int DataSize$get(MemorySegment seg) {
        return (int)_SCM_PD_PASSTHROUGH_OUTPUT.DataSize$VH.get(seg);
    }
    public static void DataSize$set( MemorySegment seg, int x) {
        _SCM_PD_PASSTHROUGH_OUTPUT.DataSize$VH.set(seg, x);
    }
    public static int DataSize$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PASSTHROUGH_OUTPUT.DataSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataSize$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PASSTHROUGH_OUTPUT.DataSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(28, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


