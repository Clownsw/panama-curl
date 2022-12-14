// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("TotalNumberOfRanges"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfRangesReturned"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("StartAddress"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("LengthInBytes")
        ).withName("_DEVICE_STORAGE_ADDRESS_RANGE")).withName("Ranges")
    ).withName("_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNumberOfRanges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfRanges"));
    public static VarHandle TotalNumberOfRanges$VH() {
        return _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.TotalNumberOfRanges$VH;
    }
    public static int TotalNumberOfRanges$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.TotalNumberOfRanges$VH.get(seg);
    }
    public static void TotalNumberOfRanges$set( MemorySegment seg, int x) {
        _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.TotalNumberOfRanges$VH.set(seg, x);
    }
    public static int TotalNumberOfRanges$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.TotalNumberOfRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfRanges$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.TotalNumberOfRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfRangesReturned$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRangesReturned"));
    public static VarHandle NumberOfRangesReturned$VH() {
        return _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.NumberOfRangesReturned$VH;
    }
    public static int NumberOfRangesReturned$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.NumberOfRangesReturned$VH.get(seg);
    }
    public static void NumberOfRangesReturned$set( MemorySegment seg, int x) {
        _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.NumberOfRangesReturned$VH.set(seg, x);
    }
    public static int NumberOfRangesReturned$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.NumberOfRangesReturned$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRangesReturned$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT.NumberOfRangesReturned$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Ranges$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


