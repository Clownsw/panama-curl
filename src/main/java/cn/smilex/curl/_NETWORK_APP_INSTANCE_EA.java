// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NETWORK_APP_INSTANCE_EA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("AppInstanceID"),
        Constants$root.C_LONG$LAYOUT.withName("CsvFlags")
    ).withName("_NETWORK_APP_INSTANCE_EA");
    public static MemoryLayout $LAYOUT() {
        return _NETWORK_APP_INSTANCE_EA.$struct$LAYOUT;
    }
    public static MemorySegment AppInstanceID$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle CsvFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CsvFlags"));
    public static VarHandle CsvFlags$VH() {
        return _NETWORK_APP_INSTANCE_EA.CsvFlags$VH;
    }
    public static int CsvFlags$get(MemorySegment seg) {
        return (int)_NETWORK_APP_INSTANCE_EA.CsvFlags$VH.get(seg);
    }
    public static void CsvFlags$set( MemorySegment seg, int x) {
        _NETWORK_APP_INSTANCE_EA.CsvFlags$VH.set(seg, x);
    }
    public static int CsvFlags$get(MemorySegment seg, long index) {
        return (int)_NETWORK_APP_INSTANCE_EA.CsvFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CsvFlags$set(MemorySegment seg, long index, int x) {
        _NETWORK_APP_INSTANCE_EA.CsvFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


