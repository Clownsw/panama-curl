// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_COMPRESSION_INFO {

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
        ).withName("CompressedFileSize"),
        Constants$root.C_SHORT$LAYOUT.withName("CompressionFormat"),
        Constants$root.C_CHAR$LAYOUT.withName("CompressionUnitShift"),
        Constants$root.C_CHAR$LAYOUT.withName("ChunkShift"),
        Constants$root.C_CHAR$LAYOUT.withName("ClusterShift"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Reserved")
    ).withName("_FILE_COMPRESSION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_COMPRESSION_INFO.$struct$LAYOUT;
    }
    public static MemorySegment CompressedFileSize$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle CompressionFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CompressionFormat"));
    public static VarHandle CompressionFormat$VH() {
        return _FILE_COMPRESSION_INFO.CompressionFormat$VH;
    }
    public static short CompressionFormat$get(MemorySegment seg) {
        return (short)_FILE_COMPRESSION_INFO.CompressionFormat$VH.get(seg);
    }
    public static void CompressionFormat$set( MemorySegment seg, short x) {
        _FILE_COMPRESSION_INFO.CompressionFormat$VH.set(seg, x);
    }
    public static short CompressionFormat$get(MemorySegment seg, long index) {
        return (short)_FILE_COMPRESSION_INFO.CompressionFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CompressionFormat$set(MemorySegment seg, long index, short x) {
        _FILE_COMPRESSION_INFO.CompressionFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CompressionUnitShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CompressionUnitShift"));
    public static VarHandle CompressionUnitShift$VH() {
        return _FILE_COMPRESSION_INFO.CompressionUnitShift$VH;
    }
    public static byte CompressionUnitShift$get(MemorySegment seg) {
        return (byte)_FILE_COMPRESSION_INFO.CompressionUnitShift$VH.get(seg);
    }
    public static void CompressionUnitShift$set( MemorySegment seg, byte x) {
        _FILE_COMPRESSION_INFO.CompressionUnitShift$VH.set(seg, x);
    }
    public static byte CompressionUnitShift$get(MemorySegment seg, long index) {
        return (byte)_FILE_COMPRESSION_INFO.CompressionUnitShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CompressionUnitShift$set(MemorySegment seg, long index, byte x) {
        _FILE_COMPRESSION_INFO.CompressionUnitShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ChunkShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ChunkShift"));
    public static VarHandle ChunkShift$VH() {
        return _FILE_COMPRESSION_INFO.ChunkShift$VH;
    }
    public static byte ChunkShift$get(MemorySegment seg) {
        return (byte)_FILE_COMPRESSION_INFO.ChunkShift$VH.get(seg);
    }
    public static void ChunkShift$set( MemorySegment seg, byte x) {
        _FILE_COMPRESSION_INFO.ChunkShift$VH.set(seg, x);
    }
    public static byte ChunkShift$get(MemorySegment seg, long index) {
        return (byte)_FILE_COMPRESSION_INFO.ChunkShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ChunkShift$set(MemorySegment seg, long index, byte x) {
        _FILE_COMPRESSION_INFO.ChunkShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClusterShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClusterShift"));
    public static VarHandle ClusterShift$VH() {
        return _FILE_COMPRESSION_INFO.ClusterShift$VH;
    }
    public static byte ClusterShift$get(MemorySegment seg) {
        return (byte)_FILE_COMPRESSION_INFO.ClusterShift$VH.get(seg);
    }
    public static void ClusterShift$set( MemorySegment seg, byte x) {
        _FILE_COMPRESSION_INFO.ClusterShift$VH.set(seg, x);
    }
    public static byte ClusterShift$get(MemorySegment seg, long index) {
        return (byte)_FILE_COMPRESSION_INFO.ClusterShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClusterShift$set(MemorySegment seg, long index, byte x) {
        _FILE_COMPRESSION_INFO.ClusterShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(13, 3);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


