// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class curl_ssl_backend {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("id"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("name")
    ).withName("curl_ssl_backend");
    public static MemoryLayout $LAYOUT() {
        return curl_ssl_backend.$struct$LAYOUT;
    }
    static final VarHandle id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("id"));
    public static VarHandle id$VH() {
        return curl_ssl_backend.id$VH;
    }
    public static int id$get(MemorySegment seg) {
        return (int)curl_ssl_backend.id$VH.get(seg);
    }
    public static void id$set( MemorySegment seg, int x) {
        curl_ssl_backend.id$VH.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)curl_ssl_backend.id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        curl_ssl_backend.id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return curl_ssl_backend.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_ssl_backend.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        curl_ssl_backend.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_ssl_backend.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_ssl_backend.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


