// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class curl_httppost {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("next"),
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_LONG$LAYOUT.withName("namelength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("contents"),
        Constants$root.C_LONG$LAYOUT.withName("contentslength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("buffer"),
        Constants$root.C_LONG$LAYOUT.withName("bufferlength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("contenttype"),
        Constants$root.C_POINTER$LAYOUT.withName("contentheader"),
        Constants$root.C_POINTER$LAYOUT.withName("more"),
        Constants$root.C_LONG$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("showfilename"),
        Constants$root.C_POINTER$LAYOUT.withName("userp"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("contentlen")
    ).withName("curl_httppost");
    public static MemoryLayout $LAYOUT() {
        return curl_httppost.$struct$LAYOUT;
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return curl_httppost.next$VH;
    }
    public static MemoryAddress next$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.next$VH.get(seg);
    }
    public static void next$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.next$VH.set(seg, x);
    }
    public static MemoryAddress next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return curl_httppost.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle namelength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("namelength"));
    public static VarHandle namelength$VH() {
        return curl_httppost.namelength$VH;
    }
    public static int namelength$get(MemorySegment seg) {
        return (int)curl_httppost.namelength$VH.get(seg);
    }
    public static void namelength$set( MemorySegment seg, int x) {
        curl_httppost.namelength$VH.set(seg, x);
    }
    public static int namelength$get(MemorySegment seg, long index) {
        return (int)curl_httppost.namelength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void namelength$set(MemorySegment seg, long index, int x) {
        curl_httppost.namelength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle contents$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("contents"));
    public static VarHandle contents$VH() {
        return curl_httppost.contents$VH;
    }
    public static MemoryAddress contents$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.contents$VH.get(seg);
    }
    public static void contents$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.contents$VH.set(seg, x);
    }
    public static MemoryAddress contents$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.contents$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void contents$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.contents$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle contentslength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("contentslength"));
    public static VarHandle contentslength$VH() {
        return curl_httppost.contentslength$VH;
    }
    public static int contentslength$get(MemorySegment seg) {
        return (int)curl_httppost.contentslength$VH.get(seg);
    }
    public static void contentslength$set( MemorySegment seg, int x) {
        curl_httppost.contentslength$VH.set(seg, x);
    }
    public static int contentslength$get(MemorySegment seg, long index) {
        return (int)curl_httppost.contentslength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void contentslength$set(MemorySegment seg, long index, int x) {
        curl_httppost.contentslength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle buffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("buffer"));
    public static VarHandle buffer$VH() {
        return curl_httppost.buffer$VH;
    }
    public static MemoryAddress buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.buffer$VH.get(seg);
    }
    public static void buffer$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.buffer$VH.set(seg, x);
    }
    public static MemoryAddress buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bufferlength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bufferlength"));
    public static VarHandle bufferlength$VH() {
        return curl_httppost.bufferlength$VH;
    }
    public static int bufferlength$get(MemorySegment seg) {
        return (int)curl_httppost.bufferlength$VH.get(seg);
    }
    public static void bufferlength$set( MemorySegment seg, int x) {
        curl_httppost.bufferlength$VH.set(seg, x);
    }
    public static int bufferlength$get(MemorySegment seg, long index) {
        return (int)curl_httppost.bufferlength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bufferlength$set(MemorySegment seg, long index, int x) {
        curl_httppost.bufferlength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle contenttype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("contenttype"));
    public static VarHandle contenttype$VH() {
        return curl_httppost.contenttype$VH;
    }
    public static MemoryAddress contenttype$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.contenttype$VH.get(seg);
    }
    public static void contenttype$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.contenttype$VH.set(seg, x);
    }
    public static MemoryAddress contenttype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.contenttype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void contenttype$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.contenttype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle contentheader$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("contentheader"));
    public static VarHandle contentheader$VH() {
        return curl_httppost.contentheader$VH;
    }
    public static MemoryAddress contentheader$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.contentheader$VH.get(seg);
    }
    public static void contentheader$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.contentheader$VH.set(seg, x);
    }
    public static MemoryAddress contentheader$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.contentheader$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void contentheader$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.contentheader$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle more$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("more"));
    public static VarHandle more$VH() {
        return curl_httppost.more$VH;
    }
    public static MemoryAddress more$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.more$VH.get(seg);
    }
    public static void more$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.more$VH.set(seg, x);
    }
    public static MemoryAddress more$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.more$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void more$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.more$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return curl_httppost.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)curl_httppost.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        curl_httppost.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)curl_httppost.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        curl_httppost.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle showfilename$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("showfilename"));
    public static VarHandle showfilename$VH() {
        return curl_httppost.showfilename$VH;
    }
    public static MemoryAddress showfilename$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.showfilename$VH.get(seg);
    }
    public static void showfilename$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.showfilename$VH.set(seg, x);
    }
    public static MemoryAddress showfilename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.showfilename$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void showfilename$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.showfilename$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle userp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("userp"));
    public static VarHandle userp$VH() {
        return curl_httppost.userp$VH;
    }
    public static MemoryAddress userp$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.userp$VH.get(seg);
    }
    public static void userp$set( MemorySegment seg, MemoryAddress x) {
        curl_httppost.userp$VH.set(seg, x);
    }
    public static MemoryAddress userp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_httppost.userp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void userp$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_httppost.userp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle contentlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("contentlen"));
    public static VarHandle contentlen$VH() {
        return curl_httppost.contentlen$VH;
    }
    public static long contentlen$get(MemorySegment seg) {
        return (long)curl_httppost.contentlen$VH.get(seg);
    }
    public static void contentlen$set( MemorySegment seg, long x) {
        curl_httppost.contentlen$VH.set(seg, x);
    }
    public static long contentlen$get(MemorySegment seg, long index) {
        return (long)curl_httppost.contentlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void contentlen$set(MemorySegment seg, long index, long x) {
        curl_httppost.contentlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


