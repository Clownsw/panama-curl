// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagWAVEINCAPS2W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szPname"),
        Constants$root.C_LONG$LAYOUT.withName("dwFormats"),
        Constants$root.C_SHORT$LAYOUT.withName("wChannels"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved1"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ManufacturerGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProductGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("NameGuid")
    ).withName("tagWAVEINCAPS2W");
    public static MemoryLayout $LAYOUT() {
        return tagWAVEINCAPS2W.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagWAVEINCAPS2W.wMid$VH;
    }
    public static short wMid$get(MemorySegment seg) {
        return (short)tagWAVEINCAPS2W.wMid$VH.get(seg);
    }
    public static void wMid$set( MemorySegment seg, short x) {
        tagWAVEINCAPS2W.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagWAVEINCAPS2W.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagWAVEINCAPS2W.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagWAVEINCAPS2W.wPid$VH;
    }
    public static short wPid$get(MemorySegment seg) {
        return (short)tagWAVEINCAPS2W.wPid$VH.get(seg);
    }
    public static void wPid$set( MemorySegment seg, short x) {
        tagWAVEINCAPS2W.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagWAVEINCAPS2W.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagWAVEINCAPS2W.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagWAVEINCAPS2W.vDriverVersion$VH;
    }
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagWAVEINCAPS2W.vDriverVersion$VH.get(seg);
    }
    public static void vDriverVersion$set( MemorySegment seg, int x) {
        tagWAVEINCAPS2W.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagWAVEINCAPS2W.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagWAVEINCAPS2W.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    static final VarHandle dwFormats$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFormats"));
    public static VarHandle dwFormats$VH() {
        return tagWAVEINCAPS2W.dwFormats$VH;
    }
    public static int dwFormats$get(MemorySegment seg) {
        return (int)tagWAVEINCAPS2W.dwFormats$VH.get(seg);
    }
    public static void dwFormats$set( MemorySegment seg, int x) {
        tagWAVEINCAPS2W.dwFormats$VH.set(seg, x);
    }
    public static int dwFormats$get(MemorySegment seg, long index) {
        return (int)tagWAVEINCAPS2W.dwFormats$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFormats$set(MemorySegment seg, long index, int x) {
        tagWAVEINCAPS2W.dwFormats$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wChannels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wChannels"));
    public static VarHandle wChannels$VH() {
        return tagWAVEINCAPS2W.wChannels$VH;
    }
    public static short wChannels$get(MemorySegment seg) {
        return (short)tagWAVEINCAPS2W.wChannels$VH.get(seg);
    }
    public static void wChannels$set( MemorySegment seg, short x) {
        tagWAVEINCAPS2W.wChannels$VH.set(seg, x);
    }
    public static short wChannels$get(MemorySegment seg, long index) {
        return (short)tagWAVEINCAPS2W.wChannels$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wChannels$set(MemorySegment seg, long index, short x) {
        tagWAVEINCAPS2W.wChannels$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved1"));
    public static VarHandle wReserved1$VH() {
        return tagWAVEINCAPS2W.wReserved1$VH;
    }
    public static short wReserved1$get(MemorySegment seg) {
        return (short)tagWAVEINCAPS2W.wReserved1$VH.get(seg);
    }
    public static void wReserved1$set( MemorySegment seg, short x) {
        tagWAVEINCAPS2W.wReserved1$VH.set(seg, x);
    }
    public static short wReserved1$get(MemorySegment seg, long index) {
        return (short)tagWAVEINCAPS2W.wReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved1$set(MemorySegment seg, long index, short x) {
        tagWAVEINCAPS2W.wReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ManufacturerGuid$slice(MemorySegment seg) {
        return seg.asSlice(80, 16);
    }
    public static MemorySegment ProductGuid$slice(MemorySegment seg) {
        return seg.asSlice(96, 16);
    }
    public static MemorySegment NameGuid$slice(MemorySegment seg) {
        return seg.asSlice(112, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


