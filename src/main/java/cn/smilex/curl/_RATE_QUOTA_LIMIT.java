// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RATE_QUOTA_LIMIT {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_LONG$LAYOUT.withName("RateData"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(7).withName("RatePercent"),
                MemoryLayout.paddingLayout(25).withName("Reserved0")
            )
        ).withName("$anon$0")
    ).withName("_RATE_QUOTA_LIMIT");
    public static MemoryLayout $LAYOUT() {
        return _RATE_QUOTA_LIMIT.$union$LAYOUT;
    }
    static final VarHandle RateData$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RateData"));
    public static VarHandle RateData$VH() {
        return _RATE_QUOTA_LIMIT.RateData$VH;
    }
    public static int RateData$get(MemorySegment seg) {
        return (int)_RATE_QUOTA_LIMIT.RateData$VH.get(seg);
    }
    public static void RateData$set( MemorySegment seg, int x) {
        _RATE_QUOTA_LIMIT.RateData$VH.set(seg, x);
    }
    public static int RateData$get(MemorySegment seg, long index) {
        return (int)_RATE_QUOTA_LIMIT.RateData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RateData$set(MemorySegment seg, long index, int x) {
        _RATE_QUOTA_LIMIT.RateData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


