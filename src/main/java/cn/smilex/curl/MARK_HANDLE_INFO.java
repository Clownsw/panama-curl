// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class MARK_HANDLE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("UsnSourceInfo"),
            Constants$root.C_LONG$LAYOUT.withName("CopyNumber")
        ).withName("$anon$0"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("VolumeHandle"),
        Constants$root.C_LONG$LAYOUT.withName("HandleInfo"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return MARK_HANDLE_INFO.$struct$LAYOUT;
    }
    static final VarHandle UsnSourceInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("UsnSourceInfo"));
    public static VarHandle UsnSourceInfo$VH() {
        return MARK_HANDLE_INFO.UsnSourceInfo$VH;
    }
    public static int UsnSourceInfo$get(MemorySegment seg) {
        return (int)MARK_HANDLE_INFO.UsnSourceInfo$VH.get(seg);
    }
    public static void UsnSourceInfo$set( MemorySegment seg, int x) {
        MARK_HANDLE_INFO.UsnSourceInfo$VH.set(seg, x);
    }
    public static int UsnSourceInfo$get(MemorySegment seg, long index) {
        return (int)MARK_HANDLE_INFO.UsnSourceInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnSourceInfo$set(MemorySegment seg, long index, int x) {
        MARK_HANDLE_INFO.UsnSourceInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CopyNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("CopyNumber"));
    public static VarHandle CopyNumber$VH() {
        return MARK_HANDLE_INFO.CopyNumber$VH;
    }
    public static int CopyNumber$get(MemorySegment seg) {
        return (int)MARK_HANDLE_INFO.CopyNumber$VH.get(seg);
    }
    public static void CopyNumber$set( MemorySegment seg, int x) {
        MARK_HANDLE_INFO.CopyNumber$VH.set(seg, x);
    }
    public static int CopyNumber$get(MemorySegment seg, long index) {
        return (int)MARK_HANDLE_INFO.CopyNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CopyNumber$set(MemorySegment seg, long index, int x) {
        MARK_HANDLE_INFO.CopyNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeHandle"));
    public static VarHandle VolumeHandle$VH() {
        return MARK_HANDLE_INFO.VolumeHandle$VH;
    }
    public static MemoryAddress VolumeHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)MARK_HANDLE_INFO.VolumeHandle$VH.get(seg);
    }
    public static void VolumeHandle$set( MemorySegment seg, MemoryAddress x) {
        MARK_HANDLE_INFO.VolumeHandle$VH.set(seg, x);
    }
    public static MemoryAddress VolumeHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)MARK_HANDLE_INFO.VolumeHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeHandle$set(MemorySegment seg, long index, MemoryAddress x) {
        MARK_HANDLE_INFO.VolumeHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HandleInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HandleInfo"));
    public static VarHandle HandleInfo$VH() {
        return MARK_HANDLE_INFO.HandleInfo$VH;
    }
    public static int HandleInfo$get(MemorySegment seg) {
        return (int)MARK_HANDLE_INFO.HandleInfo$VH.get(seg);
    }
    public static void HandleInfo$set( MemorySegment seg, int x) {
        MARK_HANDLE_INFO.HandleInfo$VH.set(seg, x);
    }
    public static int HandleInfo$get(MemorySegment seg, long index) {
        return (int)MARK_HANDLE_INFO.HandleInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HandleInfo$set(MemorySegment seg, long index, int x) {
        MARK_HANDLE_INFO.HandleInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


