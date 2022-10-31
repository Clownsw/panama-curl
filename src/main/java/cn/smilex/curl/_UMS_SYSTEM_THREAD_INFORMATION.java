// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _UMS_SYSTEM_THREAD_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("UmsVersion"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("IsUmsSchedulerThread"),
                    MemoryLayout.paddingLayout(1).withName("IsUmsWorkerThread"),
                    MemoryLayout.paddingLayout(30)
                )
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("ThreadUmsFlags")
        ).withName("$anon$0")
    ).withName("_UMS_SYSTEM_THREAD_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _UMS_SYSTEM_THREAD_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle UmsVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UmsVersion"));
    public static VarHandle UmsVersion$VH() {
        return _UMS_SYSTEM_THREAD_INFORMATION.UmsVersion$VH;
    }
    public static int UmsVersion$get(MemorySegment seg) {
        return (int)_UMS_SYSTEM_THREAD_INFORMATION.UmsVersion$VH.get(seg);
    }
    public static void UmsVersion$set( MemorySegment seg, int x) {
        _UMS_SYSTEM_THREAD_INFORMATION.UmsVersion$VH.set(seg, x);
    }
    public static int UmsVersion$get(MemorySegment seg, long index) {
        return (int)_UMS_SYSTEM_THREAD_INFORMATION.UmsVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UmsVersion$set(MemorySegment seg, long index, int x) {
        _UMS_SYSTEM_THREAD_INFORMATION.UmsVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ThreadUmsFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("ThreadUmsFlags"));
    public static VarHandle ThreadUmsFlags$VH() {
        return _UMS_SYSTEM_THREAD_INFORMATION.ThreadUmsFlags$VH;
    }
    public static int ThreadUmsFlags$get(MemorySegment seg) {
        return (int)_UMS_SYSTEM_THREAD_INFORMATION.ThreadUmsFlags$VH.get(seg);
    }
    public static void ThreadUmsFlags$set( MemorySegment seg, int x) {
        _UMS_SYSTEM_THREAD_INFORMATION.ThreadUmsFlags$VH.set(seg, x);
    }
    public static int ThreadUmsFlags$get(MemorySegment seg, long index) {
        return (int)_UMS_SYSTEM_THREAD_INFORMATION.ThreadUmsFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ThreadUmsFlags$set(MemorySegment seg, long index, int x) {
        _UMS_SYSTEM_THREAD_INFORMATION.ThreadUmsFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


