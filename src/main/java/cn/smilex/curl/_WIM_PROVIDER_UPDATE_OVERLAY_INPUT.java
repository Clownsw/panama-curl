// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WIM_PROVIDER_UPDATE_OVERLAY_INPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("DataSourceId"),
        Constants$root.C_LONG$LAYOUT.withName("WimFileNameOffset"),
        Constants$root.C_LONG$LAYOUT.withName("WimFileNameLength")
    ).withName("_WIM_PROVIDER_UPDATE_OVERLAY_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _WIM_PROVIDER_UPDATE_OVERLAY_INPUT.$struct$LAYOUT;
    }
    public static MemorySegment DataSourceId$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle WimFileNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WimFileNameOffset"));
    public static VarHandle WimFileNameOffset$VH() {
        return _WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameOffset$VH;
    }
    public static int WimFileNameOffset$get(MemorySegment seg) {
        return (int)_WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameOffset$VH.get(seg);
    }
    public static void WimFileNameOffset$set( MemorySegment seg, int x) {
        _WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameOffset$VH.set(seg, x);
    }
    public static int WimFileNameOffset$get(MemorySegment seg, long index) {
        return (int)_WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WimFileNameOffset$set(MemorySegment seg, long index, int x) {
        _WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WimFileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WimFileNameLength"));
    public static VarHandle WimFileNameLength$VH() {
        return _WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameLength$VH;
    }
    public static int WimFileNameLength$get(MemorySegment seg) {
        return (int)_WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameLength$VH.get(seg);
    }
    public static void WimFileNameLength$set( MemorySegment seg, int x) {
        _WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameLength$VH.set(seg, x);
    }
    public static int WimFileNameLength$get(MemorySegment seg, long index) {
        return (int)_WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WimFileNameLength$set(MemorySegment seg, long index, int x) {
        _WIM_PROVIDER_UPDATE_OVERLAY_INPUT.WimFileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


