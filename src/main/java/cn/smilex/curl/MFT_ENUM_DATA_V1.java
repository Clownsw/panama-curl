// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class MFT_ENUM_DATA_V1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("StartFileReferenceNumber"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LowUsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("HighUsn"),
        Constants$root.C_SHORT$LAYOUT.withName("MinMajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MaxMajorVersion"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return MFT_ENUM_DATA_V1.$struct$LAYOUT;
    }
    static final VarHandle StartFileReferenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartFileReferenceNumber"));
    public static VarHandle StartFileReferenceNumber$VH() {
        return MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH;
    }
    public static long StartFileReferenceNumber$get(MemorySegment seg) {
        return (long)MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH.get(seg);
    }
    public static void StartFileReferenceNumber$set( MemorySegment seg, long x) {
        MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH.set(seg, x);
    }
    public static long StartFileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartFileReferenceNumber$set(MemorySegment seg, long index, long x) {
        MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LowUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowUsn"));
    public static VarHandle LowUsn$VH() {
        return MFT_ENUM_DATA_V1.LowUsn$VH;
    }
    public static long LowUsn$get(MemorySegment seg) {
        return (long)MFT_ENUM_DATA_V1.LowUsn$VH.get(seg);
    }
    public static void LowUsn$set( MemorySegment seg, long x) {
        MFT_ENUM_DATA_V1.LowUsn$VH.set(seg, x);
    }
    public static long LowUsn$get(MemorySegment seg, long index) {
        return (long)MFT_ENUM_DATA_V1.LowUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowUsn$set(MemorySegment seg, long index, long x) {
        MFT_ENUM_DATA_V1.LowUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighUsn"));
    public static VarHandle HighUsn$VH() {
        return MFT_ENUM_DATA_V1.HighUsn$VH;
    }
    public static long HighUsn$get(MemorySegment seg) {
        return (long)MFT_ENUM_DATA_V1.HighUsn$VH.get(seg);
    }
    public static void HighUsn$set( MemorySegment seg, long x) {
        MFT_ENUM_DATA_V1.HighUsn$VH.set(seg, x);
    }
    public static long HighUsn$get(MemorySegment seg, long index) {
        return (long)MFT_ENUM_DATA_V1.HighUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighUsn$set(MemorySegment seg, long index, long x) {
        MFT_ENUM_DATA_V1.HighUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinMajorVersion"));
    public static VarHandle MinMajorVersion$VH() {
        return MFT_ENUM_DATA_V1.MinMajorVersion$VH;
    }
    public static short MinMajorVersion$get(MemorySegment seg) {
        return (short)MFT_ENUM_DATA_V1.MinMajorVersion$VH.get(seg);
    }
    public static void MinMajorVersion$set( MemorySegment seg, short x) {
        MFT_ENUM_DATA_V1.MinMajorVersion$VH.set(seg, x);
    }
    public static short MinMajorVersion$get(MemorySegment seg, long index) {
        return (short)MFT_ENUM_DATA_V1.MinMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinMajorVersion$set(MemorySegment seg, long index, short x) {
        MFT_ENUM_DATA_V1.MinMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxMajorVersion"));
    public static VarHandle MaxMajorVersion$VH() {
        return MFT_ENUM_DATA_V1.MaxMajorVersion$VH;
    }
    public static short MaxMajorVersion$get(MemorySegment seg) {
        return (short)MFT_ENUM_DATA_V1.MaxMajorVersion$VH.get(seg);
    }
    public static void MaxMajorVersion$set( MemorySegment seg, short x) {
        MFT_ENUM_DATA_V1.MaxMajorVersion$VH.set(seg, x);
    }
    public static short MaxMajorVersion$get(MemorySegment seg, long index) {
        return (short)MFT_ENUM_DATA_V1.MaxMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxMajorVersion$set(MemorySegment seg, long index, short x) {
        MFT_ENUM_DATA_V1.MaxMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

