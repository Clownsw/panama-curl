// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMONLINKSTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cb"),
        Constants$root.C_LONG$LAYOUT.withName("dwTime"),
        Constants$root.C_POINTER$LAYOUT.withName("hTask"),
        Constants$root.C_LONG$LAYOUT.withName("fEstablished"),
        Constants$root.C_LONG$LAYOUT.withName("fNoData"),
        Constants$root.C_POINTER$LAYOUT.withName("hszSvc"),
        Constants$root.C_POINTER$LAYOUT.withName("hszTopic"),
        Constants$root.C_POINTER$LAYOUT.withName("hszItem"),
        Constants$root.C_LONG$LAYOUT.withName("wFmt"),
        Constants$root.C_LONG$LAYOUT.withName("fServer"),
        Constants$root.C_POINTER$LAYOUT.withName("hConvServer"),
        Constants$root.C_POINTER$LAYOUT.withName("hConvClient")
    ).withName("tagMONLINKSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagMONLINKSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return tagMONLINKSTRUCT.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)tagMONLINKSTRUCT.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        tagMONLINKSTRUCT.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)tagMONLINKSTRUCT.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        tagMONLINKSTRUCT.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTime"));
    public static VarHandle dwTime$VH() {
        return tagMONLINKSTRUCT.dwTime$VH;
    }
    public static int dwTime$get(MemorySegment seg) {
        return (int)tagMONLINKSTRUCT.dwTime$VH.get(seg);
    }
    public static void dwTime$set( MemorySegment seg, int x) {
        tagMONLINKSTRUCT.dwTime$VH.set(seg, x);
    }
    public static int dwTime$get(MemorySegment seg, long index) {
        return (int)tagMONLINKSTRUCT.dwTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTime$set(MemorySegment seg, long index, int x) {
        tagMONLINKSTRUCT.dwTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hTask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hTask"));
    public static VarHandle hTask$VH() {
        return tagMONLINKSTRUCT.hTask$VH;
    }
    public static MemoryAddress hTask$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hTask$VH.get(seg);
    }
    public static void hTask$set( MemorySegment seg, MemoryAddress x) {
        tagMONLINKSTRUCT.hTask$VH.set(seg, x);
    }
    public static MemoryAddress hTask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hTask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hTask$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONLINKSTRUCT.hTask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fEstablished$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fEstablished"));
    public static VarHandle fEstablished$VH() {
        return tagMONLINKSTRUCT.fEstablished$VH;
    }
    public static int fEstablished$get(MemorySegment seg) {
        return (int)tagMONLINKSTRUCT.fEstablished$VH.get(seg);
    }
    public static void fEstablished$set( MemorySegment seg, int x) {
        tagMONLINKSTRUCT.fEstablished$VH.set(seg, x);
    }
    public static int fEstablished$get(MemorySegment seg, long index) {
        return (int)tagMONLINKSTRUCT.fEstablished$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fEstablished$set(MemorySegment seg, long index, int x) {
        tagMONLINKSTRUCT.fEstablished$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fNoData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fNoData"));
    public static VarHandle fNoData$VH() {
        return tagMONLINKSTRUCT.fNoData$VH;
    }
    public static int fNoData$get(MemorySegment seg) {
        return (int)tagMONLINKSTRUCT.fNoData$VH.get(seg);
    }
    public static void fNoData$set( MemorySegment seg, int x) {
        tagMONLINKSTRUCT.fNoData$VH.set(seg, x);
    }
    public static int fNoData$get(MemorySegment seg, long index) {
        return (int)tagMONLINKSTRUCT.fNoData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fNoData$set(MemorySegment seg, long index, int x) {
        tagMONLINKSTRUCT.fNoData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hszSvc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hszSvc"));
    public static VarHandle hszSvc$VH() {
        return tagMONLINKSTRUCT.hszSvc$VH;
    }
    public static MemoryAddress hszSvc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hszSvc$VH.get(seg);
    }
    public static void hszSvc$set( MemorySegment seg, MemoryAddress x) {
        tagMONLINKSTRUCT.hszSvc$VH.set(seg, x);
    }
    public static MemoryAddress hszSvc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hszSvc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hszSvc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONLINKSTRUCT.hszSvc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hszTopic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hszTopic"));
    public static VarHandle hszTopic$VH() {
        return tagMONLINKSTRUCT.hszTopic$VH;
    }
    public static MemoryAddress hszTopic$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hszTopic$VH.get(seg);
    }
    public static void hszTopic$set( MemorySegment seg, MemoryAddress x) {
        tagMONLINKSTRUCT.hszTopic$VH.set(seg, x);
    }
    public static MemoryAddress hszTopic$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hszTopic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hszTopic$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONLINKSTRUCT.hszTopic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hszItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hszItem"));
    public static VarHandle hszItem$VH() {
        return tagMONLINKSTRUCT.hszItem$VH;
    }
    public static MemoryAddress hszItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hszItem$VH.get(seg);
    }
    public static void hszItem$set( MemorySegment seg, MemoryAddress x) {
        tagMONLINKSTRUCT.hszItem$VH.set(seg, x);
    }
    public static MemoryAddress hszItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hszItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hszItem$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONLINKSTRUCT.hszItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFmt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFmt"));
    public static VarHandle wFmt$VH() {
        return tagMONLINKSTRUCT.wFmt$VH;
    }
    public static int wFmt$get(MemorySegment seg) {
        return (int)tagMONLINKSTRUCT.wFmt$VH.get(seg);
    }
    public static void wFmt$set( MemorySegment seg, int x) {
        tagMONLINKSTRUCT.wFmt$VH.set(seg, x);
    }
    public static int wFmt$get(MemorySegment seg, long index) {
        return (int)tagMONLINKSTRUCT.wFmt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFmt$set(MemorySegment seg, long index, int x) {
        tagMONLINKSTRUCT.wFmt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fServer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fServer"));
    public static VarHandle fServer$VH() {
        return tagMONLINKSTRUCT.fServer$VH;
    }
    public static int fServer$get(MemorySegment seg) {
        return (int)tagMONLINKSTRUCT.fServer$VH.get(seg);
    }
    public static void fServer$set( MemorySegment seg, int x) {
        tagMONLINKSTRUCT.fServer$VH.set(seg, x);
    }
    public static int fServer$get(MemorySegment seg, long index) {
        return (int)tagMONLINKSTRUCT.fServer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fServer$set(MemorySegment seg, long index, int x) {
        tagMONLINKSTRUCT.fServer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hConvServer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hConvServer"));
    public static VarHandle hConvServer$VH() {
        return tagMONLINKSTRUCT.hConvServer$VH;
    }
    public static MemoryAddress hConvServer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hConvServer$VH.get(seg);
    }
    public static void hConvServer$set( MemorySegment seg, MemoryAddress x) {
        tagMONLINKSTRUCT.hConvServer$VH.set(seg, x);
    }
    public static MemoryAddress hConvServer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hConvServer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hConvServer$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONLINKSTRUCT.hConvServer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hConvClient$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hConvClient"));
    public static VarHandle hConvClient$VH() {
        return tagMONLINKSTRUCT.hConvClient$VH;
    }
    public static MemoryAddress hConvClient$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hConvClient$VH.get(seg);
    }
    public static void hConvClient$set( MemorySegment seg, MemoryAddress x) {
        tagMONLINKSTRUCT.hConvClient$VH.set(seg, x);
    }
    public static MemoryAddress hConvClient$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMONLINKSTRUCT.hConvClient$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hConvClient$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONLINKSTRUCT.hConvClient$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


