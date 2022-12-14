// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_RESOURCE_DIRECTORY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Characteristics"),
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfNamedEntries"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfIdEntries")
    ).withName("_IMAGE_RESOURCE_DIRECTORY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_RESOURCE_DIRECTORY.$struct$LAYOUT;
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.Characteristics$VH;
    }
    public static int Characteristics$get(MemorySegment seg) {
        return (int)_IMAGE_RESOURCE_DIRECTORY.Characteristics$VH.get(seg);
    }
    public static void Characteristics$set( MemorySegment seg, int x) {
        _IMAGE_RESOURCE_DIRECTORY.Characteristics$VH.set(seg, x);
    }
    public static int Characteristics$get(MemorySegment seg, long index) {
        return (int)_IMAGE_RESOURCE_DIRECTORY.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, int x) {
        _IMAGE_RESOURCE_DIRECTORY.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH;
    }
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH.get(seg);
    }
    public static void TimeDateStamp$set( MemorySegment seg, int x) {
        _IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorVersion"));
    public static VarHandle MajorVersion$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH;
    }
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH.get(seg);
    }
    public static void MajorVersion$set( MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorVersion"));
    public static VarHandle MinorVersion$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH;
    }
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH.get(seg);
    }
    public static void MinorVersion$set( MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfNamedEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfNamedEntries"));
    public static VarHandle NumberOfNamedEntries$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH;
    }
    public static short NumberOfNamedEntries$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH.get(seg);
    }
    public static void NumberOfNamedEntries$set( MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH.set(seg, x);
    }
    public static short NumberOfNamedEntries$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfNamedEntries$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfIdEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfIdEntries"));
    public static VarHandle NumberOfIdEntries$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH;
    }
    public static short NumberOfIdEntries$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH.get(seg);
    }
    public static void NumberOfIdEntries$set( MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH.set(seg, x);
    }
    public static short NumberOfIdEntries$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfIdEntries$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


