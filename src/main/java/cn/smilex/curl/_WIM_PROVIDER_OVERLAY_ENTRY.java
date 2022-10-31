// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WIM_PROVIDER_OVERLAY_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NextEntryOffset"),
        MemoryLayout.paddingLayout(32),
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
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("WimGuid"),
        Constants$root.C_LONG$LAYOUT.withName("WimFileNameOffset"),
        Constants$root.C_LONG$LAYOUT.withName("WimType"),
        Constants$root.C_LONG$LAYOUT.withName("WimIndex"),
        Constants$root.C_LONG$LAYOUT.withName("Flags")
    ).withName("_WIM_PROVIDER_OVERLAY_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _WIM_PROVIDER_OVERLAY_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle NextEntryOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextEntryOffset"));
    public static VarHandle NextEntryOffset$VH() {
        return _WIM_PROVIDER_OVERLAY_ENTRY.NextEntryOffset$VH;
    }
    public static int NextEntryOffset$get(MemorySegment seg) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.NextEntryOffset$VH.get(seg);
    }
    public static void NextEntryOffset$set( MemorySegment seg, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.NextEntryOffset$VH.set(seg, x);
    }
    public static int NextEntryOffset$get(MemorySegment seg, long index) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.NextEntryOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextEntryOffset$set(MemorySegment seg, long index, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.NextEntryOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DataSourceId$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment WimGuid$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle WimFileNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WimFileNameOffset"));
    public static VarHandle WimFileNameOffset$VH() {
        return _WIM_PROVIDER_OVERLAY_ENTRY.WimFileNameOffset$VH;
    }
    public static int WimFileNameOffset$get(MemorySegment seg) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.WimFileNameOffset$VH.get(seg);
    }
    public static void WimFileNameOffset$set( MemorySegment seg, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.WimFileNameOffset$VH.set(seg, x);
    }
    public static int WimFileNameOffset$get(MemorySegment seg, long index) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.WimFileNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WimFileNameOffset$set(MemorySegment seg, long index, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.WimFileNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WimType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WimType"));
    public static VarHandle WimType$VH() {
        return _WIM_PROVIDER_OVERLAY_ENTRY.WimType$VH;
    }
    public static int WimType$get(MemorySegment seg) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.WimType$VH.get(seg);
    }
    public static void WimType$set( MemorySegment seg, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.WimType$VH.set(seg, x);
    }
    public static int WimType$get(MemorySegment seg, long index) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.WimType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WimType$set(MemorySegment seg, long index, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.WimType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WimIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WimIndex"));
    public static VarHandle WimIndex$VH() {
        return _WIM_PROVIDER_OVERLAY_ENTRY.WimIndex$VH;
    }
    public static int WimIndex$get(MemorySegment seg) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.WimIndex$VH.get(seg);
    }
    public static void WimIndex$set( MemorySegment seg, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.WimIndex$VH.set(seg, x);
    }
    public static int WimIndex$get(MemorySegment seg, long index) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.WimIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WimIndex$set(MemorySegment seg, long index, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.WimIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _WIM_PROVIDER_OVERLAY_ENTRY.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_WIM_PROVIDER_OVERLAY_ENTRY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _WIM_PROVIDER_OVERLAY_ENTRY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


