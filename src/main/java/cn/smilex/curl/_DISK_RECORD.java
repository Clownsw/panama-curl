// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISK_RECORD {

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
        ).withName("ByteOffset"),
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
        ).withName("StartTime"),
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
        ).withName("EndTime"),
        Constants$root.C_POINTER$LAYOUT.withName("VirtualAddress"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfBytes"),
        Constants$root.C_CHAR$LAYOUT.withName("DeviceNumber"),
        Constants$root.C_CHAR$LAYOUT.withName("ReadRequest"),
        MemoryLayout.paddingLayout(16)
    ).withName("_DISK_RECORD");
    public static MemoryLayout $LAYOUT() {
        return _DISK_RECORD.$struct$LAYOUT;
    }
    public static MemorySegment ByteOffset$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment StartTime$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment EndTime$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle VirtualAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VirtualAddress"));
    public static VarHandle VirtualAddress$VH() {
        return _DISK_RECORD.VirtualAddress$VH;
    }
    public static MemoryAddress VirtualAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DISK_RECORD.VirtualAddress$VH.get(seg);
    }
    public static void VirtualAddress$set( MemorySegment seg, MemoryAddress x) {
        _DISK_RECORD.VirtualAddress$VH.set(seg, x);
    }
    public static MemoryAddress VirtualAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DISK_RECORD.VirtualAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VirtualAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISK_RECORD.VirtualAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBytes"));
    public static VarHandle NumberOfBytes$VH() {
        return _DISK_RECORD.NumberOfBytes$VH;
    }
    public static int NumberOfBytes$get(MemorySegment seg) {
        return (int)_DISK_RECORD.NumberOfBytes$VH.get(seg);
    }
    public static void NumberOfBytes$set( MemorySegment seg, int x) {
        _DISK_RECORD.NumberOfBytes$VH.set(seg, x);
    }
    public static int NumberOfBytes$get(MemorySegment seg, long index) {
        return (int)_DISK_RECORD.NumberOfBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBytes$set(MemorySegment seg, long index, int x) {
        _DISK_RECORD.NumberOfBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceNumber"));
    public static VarHandle DeviceNumber$VH() {
        return _DISK_RECORD.DeviceNumber$VH;
    }
    public static byte DeviceNumber$get(MemorySegment seg) {
        return (byte)_DISK_RECORD.DeviceNumber$VH.get(seg);
    }
    public static void DeviceNumber$set( MemorySegment seg, byte x) {
        _DISK_RECORD.DeviceNumber$VH.set(seg, x);
    }
    public static byte DeviceNumber$get(MemorySegment seg, long index) {
        return (byte)_DISK_RECORD.DeviceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceNumber$set(MemorySegment seg, long index, byte x) {
        _DISK_RECORD.DeviceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReadRequest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReadRequest"));
    public static VarHandle ReadRequest$VH() {
        return _DISK_RECORD.ReadRequest$VH;
    }
    public static byte ReadRequest$get(MemorySegment seg) {
        return (byte)_DISK_RECORD.ReadRequest$VH.get(seg);
    }
    public static void ReadRequest$set( MemorySegment seg, byte x) {
        _DISK_RECORD.ReadRequest$VH.set(seg, x);
    }
    public static byte ReadRequest$get(MemorySegment seg, long index) {
        return (byte)_DISK_RECORD.ReadRequest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReadRequest$set(MemorySegment seg, long index, byte x) {
        _DISK_RECORD.ReadRequest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


