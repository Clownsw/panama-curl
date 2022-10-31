// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISK_GEOMETRY {

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
        ).withName("Cylinders"),
        Constants$root.C_LONG$LAYOUT.withName("MediaType"),
        Constants$root.C_LONG$LAYOUT.withName("TracksPerCylinder"),
        Constants$root.C_LONG$LAYOUT.withName("SectorsPerTrack"),
        Constants$root.C_LONG$LAYOUT.withName("BytesPerSector")
    ).withName("_DISK_GEOMETRY");
    public static MemoryLayout $LAYOUT() {
        return _DISK_GEOMETRY.$struct$LAYOUT;
    }
    public static MemorySegment Cylinders$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle MediaType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediaType"));
    public static VarHandle MediaType$VH() {
        return _DISK_GEOMETRY.MediaType$VH;
    }
    public static int MediaType$get(MemorySegment seg) {
        return (int)_DISK_GEOMETRY.MediaType$VH.get(seg);
    }
    public static void MediaType$set( MemorySegment seg, int x) {
        _DISK_GEOMETRY.MediaType$VH.set(seg, x);
    }
    public static int MediaType$get(MemorySegment seg, long index) {
        return (int)_DISK_GEOMETRY.MediaType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MediaType$set(MemorySegment seg, long index, int x) {
        _DISK_GEOMETRY.MediaType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TracksPerCylinder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TracksPerCylinder"));
    public static VarHandle TracksPerCylinder$VH() {
        return _DISK_GEOMETRY.TracksPerCylinder$VH;
    }
    public static int TracksPerCylinder$get(MemorySegment seg) {
        return (int)_DISK_GEOMETRY.TracksPerCylinder$VH.get(seg);
    }
    public static void TracksPerCylinder$set( MemorySegment seg, int x) {
        _DISK_GEOMETRY.TracksPerCylinder$VH.set(seg, x);
    }
    public static int TracksPerCylinder$get(MemorySegment seg, long index) {
        return (int)_DISK_GEOMETRY.TracksPerCylinder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TracksPerCylinder$set(MemorySegment seg, long index, int x) {
        _DISK_GEOMETRY.TracksPerCylinder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SectorsPerTrack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SectorsPerTrack"));
    public static VarHandle SectorsPerTrack$VH() {
        return _DISK_GEOMETRY.SectorsPerTrack$VH;
    }
    public static int SectorsPerTrack$get(MemorySegment seg) {
        return (int)_DISK_GEOMETRY.SectorsPerTrack$VH.get(seg);
    }
    public static void SectorsPerTrack$set( MemorySegment seg, int x) {
        _DISK_GEOMETRY.SectorsPerTrack$VH.set(seg, x);
    }
    public static int SectorsPerTrack$get(MemorySegment seg, long index) {
        return (int)_DISK_GEOMETRY.SectorsPerTrack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SectorsPerTrack$set(MemorySegment seg, long index, int x) {
        _DISK_GEOMETRY.SectorsPerTrack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BytesPerSector$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesPerSector"));
    public static VarHandle BytesPerSector$VH() {
        return _DISK_GEOMETRY.BytesPerSector$VH;
    }
    public static int BytesPerSector$get(MemorySegment seg) {
        return (int)_DISK_GEOMETRY.BytesPerSector$VH.get(seg);
    }
    public static void BytesPerSector$set( MemorySegment seg, int x) {
        _DISK_GEOMETRY.BytesPerSector$VH.set(seg, x);
    }
    public static int BytesPerSector$get(MemorySegment seg, long index) {
        return (int)_DISK_GEOMETRY.BytesPerSector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesPerSector$set(MemorySegment seg, long index, int x) {
        _DISK_GEOMETRY.BytesPerSector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


