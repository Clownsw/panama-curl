// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CSV_QUERY_REDIRECT_STATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("MdsNodeId"),
        Constants$root.C_LONG$LAYOUT.withName("DsNodeId"),
        Constants$root.C_CHAR$LAYOUT.withName("FileRedirected"),
        MemoryLayout.paddingLayout(24)
    ).withName("_CSV_QUERY_REDIRECT_STATE");
    public static MemoryLayout $LAYOUT() {
        return _CSV_QUERY_REDIRECT_STATE.$struct$LAYOUT;
    }
    static final VarHandle MdsNodeId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MdsNodeId"));
    public static VarHandle MdsNodeId$VH() {
        return _CSV_QUERY_REDIRECT_STATE.MdsNodeId$VH;
    }
    public static int MdsNodeId$get(MemorySegment seg) {
        return (int)_CSV_QUERY_REDIRECT_STATE.MdsNodeId$VH.get(seg);
    }
    public static void MdsNodeId$set( MemorySegment seg, int x) {
        _CSV_QUERY_REDIRECT_STATE.MdsNodeId$VH.set(seg, x);
    }
    public static int MdsNodeId$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_REDIRECT_STATE.MdsNodeId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MdsNodeId$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_REDIRECT_STATE.MdsNodeId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DsNodeId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DsNodeId"));
    public static VarHandle DsNodeId$VH() {
        return _CSV_QUERY_REDIRECT_STATE.DsNodeId$VH;
    }
    public static int DsNodeId$get(MemorySegment seg) {
        return (int)_CSV_QUERY_REDIRECT_STATE.DsNodeId$VH.get(seg);
    }
    public static void DsNodeId$set( MemorySegment seg, int x) {
        _CSV_QUERY_REDIRECT_STATE.DsNodeId$VH.set(seg, x);
    }
    public static int DsNodeId$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_REDIRECT_STATE.DsNodeId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DsNodeId$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_REDIRECT_STATE.DsNodeId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileRedirected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileRedirected"));
    public static VarHandle FileRedirected$VH() {
        return _CSV_QUERY_REDIRECT_STATE.FileRedirected$VH;
    }
    public static byte FileRedirected$get(MemorySegment seg) {
        return (byte)_CSV_QUERY_REDIRECT_STATE.FileRedirected$VH.get(seg);
    }
    public static void FileRedirected$set( MemorySegment seg, byte x) {
        _CSV_QUERY_REDIRECT_STATE.FileRedirected$VH.set(seg, x);
    }
    public static byte FileRedirected$get(MemorySegment seg, long index) {
        return (byte)_CSV_QUERY_REDIRECT_STATE.FileRedirected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileRedirected$set(MemorySegment seg, long index, byte x) {
        _CSV_QUERY_REDIRECT_STATE.FileRedirected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


