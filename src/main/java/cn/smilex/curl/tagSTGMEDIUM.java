// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagSTGMEDIUM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("tymed"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hBitmap"),
            Constants$root.C_POINTER$LAYOUT.withName("hMetaFilePict"),
            Constants$root.C_POINTER$LAYOUT.withName("hEnhMetaFile"),
            Constants$root.C_POINTER$LAYOUT.withName("hGlobal"),
            Constants$root.C_POINTER$LAYOUT.withName("lpszFileName"),
            Constants$root.C_POINTER$LAYOUT.withName("pstm"),
            Constants$root.C_POINTER$LAYOUT.withName("pstg")
        ).withName("$anon$0"),
        Constants$root.C_POINTER$LAYOUT.withName("pUnkForRelease")
    ).withName("tagSTGMEDIUM");
    public static MemoryLayout $LAYOUT() {
        return tagSTGMEDIUM.$struct$LAYOUT;
    }
    static final VarHandle tymed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tymed"));
    public static VarHandle tymed$VH() {
        return tagSTGMEDIUM.tymed$VH;
    }
    public static int tymed$get(MemorySegment seg) {
        return (int)tagSTGMEDIUM.tymed$VH.get(seg);
    }
    public static void tymed$set( MemorySegment seg, int x) {
        tagSTGMEDIUM.tymed$VH.set(seg, x);
    }
    public static int tymed$get(MemorySegment seg, long index) {
        return (int)tagSTGMEDIUM.tymed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tymed$set(MemorySegment seg, long index, int x) {
        tagSTGMEDIUM.tymed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hBitmap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hBitmap"));
    public static VarHandle hBitmap$VH() {
        return tagSTGMEDIUM.hBitmap$VH;
    }
    public static MemoryAddress hBitmap$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.hBitmap$VH.get(seg);
    }
    public static void hBitmap$set( MemorySegment seg, MemoryAddress x) {
        tagSTGMEDIUM.hBitmap$VH.set(seg, x);
    }
    public static MemoryAddress hBitmap$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.hBitmap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hBitmap$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGMEDIUM.hBitmap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hMetaFilePict$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hMetaFilePict"));
    public static VarHandle hMetaFilePict$VH() {
        return tagSTGMEDIUM.hMetaFilePict$VH;
    }
    public static MemoryAddress hMetaFilePict$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.hMetaFilePict$VH.get(seg);
    }
    public static void hMetaFilePict$set( MemorySegment seg, MemoryAddress x) {
        tagSTGMEDIUM.hMetaFilePict$VH.set(seg, x);
    }
    public static MemoryAddress hMetaFilePict$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.hMetaFilePict$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hMetaFilePict$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGMEDIUM.hMetaFilePict$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hEnhMetaFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hEnhMetaFile"));
    public static VarHandle hEnhMetaFile$VH() {
        return tagSTGMEDIUM.hEnhMetaFile$VH;
    }
    public static MemoryAddress hEnhMetaFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.hEnhMetaFile$VH.get(seg);
    }
    public static void hEnhMetaFile$set( MemorySegment seg, MemoryAddress x) {
        tagSTGMEDIUM.hEnhMetaFile$VH.set(seg, x);
    }
    public static MemoryAddress hEnhMetaFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.hEnhMetaFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hEnhMetaFile$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGMEDIUM.hEnhMetaFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hGlobal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hGlobal"));
    public static VarHandle hGlobal$VH() {
        return tagSTGMEDIUM.hGlobal$VH;
    }
    public static MemoryAddress hGlobal$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.hGlobal$VH.get(seg);
    }
    public static void hGlobal$set( MemorySegment seg, MemoryAddress x) {
        tagSTGMEDIUM.hGlobal$VH.set(seg, x);
    }
    public static MemoryAddress hGlobal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.hGlobal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hGlobal$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGMEDIUM.hGlobal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszFileName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("lpszFileName"));
    public static VarHandle lpszFileName$VH() {
        return tagSTGMEDIUM.lpszFileName$VH;
    }
    public static MemoryAddress lpszFileName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.lpszFileName$VH.get(seg);
    }
    public static void lpszFileName$set( MemorySegment seg, MemoryAddress x) {
        tagSTGMEDIUM.lpszFileName$VH.set(seg, x);
    }
    public static MemoryAddress lpszFileName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.lpszFileName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszFileName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGMEDIUM.lpszFileName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pstm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pstm"));
    public static VarHandle pstm$VH() {
        return tagSTGMEDIUM.pstm$VH;
    }
    public static MemoryAddress pstm$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.pstm$VH.get(seg);
    }
    public static void pstm$set( MemorySegment seg, MemoryAddress x) {
        tagSTGMEDIUM.pstm$VH.set(seg, x);
    }
    public static MemoryAddress pstm$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.pstm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pstm$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGMEDIUM.pstm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pstg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pstg"));
    public static VarHandle pstg$VH() {
        return tagSTGMEDIUM.pstg$VH;
    }
    public static MemoryAddress pstg$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.pstg$VH.get(seg);
    }
    public static void pstg$set( MemorySegment seg, MemoryAddress x) {
        tagSTGMEDIUM.pstg$VH.set(seg, x);
    }
    public static MemoryAddress pstg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.pstg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pstg$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGMEDIUM.pstg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUnkForRelease$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUnkForRelease"));
    public static VarHandle pUnkForRelease$VH() {
        return tagSTGMEDIUM.pUnkForRelease$VH;
    }
    public static MemoryAddress pUnkForRelease$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.pUnkForRelease$VH.get(seg);
    }
    public static void pUnkForRelease$set( MemorySegment seg, MemoryAddress x) {
        tagSTGMEDIUM.pUnkForRelease$VH.set(seg, x);
    }
    public static MemoryAddress pUnkForRelease$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGMEDIUM.pUnkForRelease$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnkForRelease$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGMEDIUM.pUnkForRelease$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


