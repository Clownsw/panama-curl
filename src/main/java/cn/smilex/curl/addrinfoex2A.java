// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class addrinfoex2A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ai_flags"),
        Constants$root.C_LONG$LAYOUT.withName("ai_family"),
        Constants$root.C_LONG$LAYOUT.withName("ai_socktype"),
        Constants$root.C_LONG$LAYOUT.withName("ai_protocol"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ai_addrlen"),
        Constants$root.C_POINTER$LAYOUT.withName("ai_canonname"),
        Constants$root.C_POINTER$LAYOUT.withName("ai_addr"),
        Constants$root.C_POINTER$LAYOUT.withName("ai_blob"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ai_bloblen"),
        Constants$root.C_POINTER$LAYOUT.withName("ai_provider"),
        Constants$root.C_POINTER$LAYOUT.withName("ai_next"),
        Constants$root.C_LONG$LAYOUT.withName("ai_version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ai_fqdn")
    ).withName("addrinfoex2A");
    public static MemoryLayout $LAYOUT() {
        return addrinfoex2A.$struct$LAYOUT;
    }
    static final VarHandle ai_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_flags"));
    public static VarHandle ai_flags$VH() {
        return addrinfoex2A.ai_flags$VH;
    }
    public static int ai_flags$get(MemorySegment seg) {
        return (int)addrinfoex2A.ai_flags$VH.get(seg);
    }
    public static void ai_flags$set( MemorySegment seg, int x) {
        addrinfoex2A.ai_flags$VH.set(seg, x);
    }
    public static int ai_flags$get(MemorySegment seg, long index) {
        return (int)addrinfoex2A.ai_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_flags$set(MemorySegment seg, long index, int x) {
        addrinfoex2A.ai_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_family$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_family"));
    public static VarHandle ai_family$VH() {
        return addrinfoex2A.ai_family$VH;
    }
    public static int ai_family$get(MemorySegment seg) {
        return (int)addrinfoex2A.ai_family$VH.get(seg);
    }
    public static void ai_family$set( MemorySegment seg, int x) {
        addrinfoex2A.ai_family$VH.set(seg, x);
    }
    public static int ai_family$get(MemorySegment seg, long index) {
        return (int)addrinfoex2A.ai_family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_family$set(MemorySegment seg, long index, int x) {
        addrinfoex2A.ai_family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_socktype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_socktype"));
    public static VarHandle ai_socktype$VH() {
        return addrinfoex2A.ai_socktype$VH;
    }
    public static int ai_socktype$get(MemorySegment seg) {
        return (int)addrinfoex2A.ai_socktype$VH.get(seg);
    }
    public static void ai_socktype$set( MemorySegment seg, int x) {
        addrinfoex2A.ai_socktype$VH.set(seg, x);
    }
    public static int ai_socktype$get(MemorySegment seg, long index) {
        return (int)addrinfoex2A.ai_socktype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_socktype$set(MemorySegment seg, long index, int x) {
        addrinfoex2A.ai_socktype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_protocol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_protocol"));
    public static VarHandle ai_protocol$VH() {
        return addrinfoex2A.ai_protocol$VH;
    }
    public static int ai_protocol$get(MemorySegment seg) {
        return (int)addrinfoex2A.ai_protocol$VH.get(seg);
    }
    public static void ai_protocol$set( MemorySegment seg, int x) {
        addrinfoex2A.ai_protocol$VH.set(seg, x);
    }
    public static int ai_protocol$get(MemorySegment seg, long index) {
        return (int)addrinfoex2A.ai_protocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_protocol$set(MemorySegment seg, long index, int x) {
        addrinfoex2A.ai_protocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_addrlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_addrlen"));
    public static VarHandle ai_addrlen$VH() {
        return addrinfoex2A.ai_addrlen$VH;
    }
    public static long ai_addrlen$get(MemorySegment seg) {
        return (long)addrinfoex2A.ai_addrlen$VH.get(seg);
    }
    public static void ai_addrlen$set( MemorySegment seg, long x) {
        addrinfoex2A.ai_addrlen$VH.set(seg, x);
    }
    public static long ai_addrlen$get(MemorySegment seg, long index) {
        return (long)addrinfoex2A.ai_addrlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_addrlen$set(MemorySegment seg, long index, long x) {
        addrinfoex2A.ai_addrlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_canonname$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_canonname"));
    public static VarHandle ai_canonname$VH() {
        return addrinfoex2A.ai_canonname$VH;
    }
    public static MemoryAddress ai_canonname$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_canonname$VH.get(seg);
    }
    public static void ai_canonname$set( MemorySegment seg, MemoryAddress x) {
        addrinfoex2A.ai_canonname$VH.set(seg, x);
    }
    public static MemoryAddress ai_canonname$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_canonname$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_canonname$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoex2A.ai_canonname$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_addr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_addr"));
    public static VarHandle ai_addr$VH() {
        return addrinfoex2A.ai_addr$VH;
    }
    public static MemoryAddress ai_addr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_addr$VH.get(seg);
    }
    public static void ai_addr$set( MemorySegment seg, MemoryAddress x) {
        addrinfoex2A.ai_addr$VH.set(seg, x);
    }
    public static MemoryAddress ai_addr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_addr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_addr$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoex2A.ai_addr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_blob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_blob"));
    public static VarHandle ai_blob$VH() {
        return addrinfoex2A.ai_blob$VH;
    }
    public static MemoryAddress ai_blob$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_blob$VH.get(seg);
    }
    public static void ai_blob$set( MemorySegment seg, MemoryAddress x) {
        addrinfoex2A.ai_blob$VH.set(seg, x);
    }
    public static MemoryAddress ai_blob$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_blob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_blob$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoex2A.ai_blob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_bloblen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_bloblen"));
    public static VarHandle ai_bloblen$VH() {
        return addrinfoex2A.ai_bloblen$VH;
    }
    public static long ai_bloblen$get(MemorySegment seg) {
        return (long)addrinfoex2A.ai_bloblen$VH.get(seg);
    }
    public static void ai_bloblen$set( MemorySegment seg, long x) {
        addrinfoex2A.ai_bloblen$VH.set(seg, x);
    }
    public static long ai_bloblen$get(MemorySegment seg, long index) {
        return (long)addrinfoex2A.ai_bloblen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_bloblen$set(MemorySegment seg, long index, long x) {
        addrinfoex2A.ai_bloblen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_provider$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_provider"));
    public static VarHandle ai_provider$VH() {
        return addrinfoex2A.ai_provider$VH;
    }
    public static MemoryAddress ai_provider$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_provider$VH.get(seg);
    }
    public static void ai_provider$set( MemorySegment seg, MemoryAddress x) {
        addrinfoex2A.ai_provider$VH.set(seg, x);
    }
    public static MemoryAddress ai_provider$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_provider$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_provider$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoex2A.ai_provider$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_next"));
    public static VarHandle ai_next$VH() {
        return addrinfoex2A.ai_next$VH;
    }
    public static MemoryAddress ai_next$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_next$VH.get(seg);
    }
    public static void ai_next$set( MemorySegment seg, MemoryAddress x) {
        addrinfoex2A.ai_next$VH.set(seg, x);
    }
    public static MemoryAddress ai_next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_next$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoex2A.ai_next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_version"));
    public static VarHandle ai_version$VH() {
        return addrinfoex2A.ai_version$VH;
    }
    public static int ai_version$get(MemorySegment seg) {
        return (int)addrinfoex2A.ai_version$VH.get(seg);
    }
    public static void ai_version$set( MemorySegment seg, int x) {
        addrinfoex2A.ai_version$VH.set(seg, x);
    }
    public static int ai_version$get(MemorySegment seg, long index) {
        return (int)addrinfoex2A.ai_version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_version$set(MemorySegment seg, long index, int x) {
        addrinfoex2A.ai_version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ai_fqdn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ai_fqdn"));
    public static VarHandle ai_fqdn$VH() {
        return addrinfoex2A.ai_fqdn$VH;
    }
    public static MemoryAddress ai_fqdn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_fqdn$VH.get(seg);
    }
    public static void ai_fqdn$set( MemorySegment seg, MemoryAddress x) {
        addrinfoex2A.ai_fqdn$VH.set(seg, x);
    }
    public static MemoryAddress ai_fqdn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)addrinfoex2A.ai_fqdn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ai_fqdn$set(MemorySegment seg, long index, MemoryAddress x) {
        addrinfoex2A.ai_fqdn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


