// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SE_IMPERSONATION_STATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Token"),
        Constants$root.C_CHAR$LAYOUT.withName("CopyOnOpen"),
        Constants$root.C_CHAR$LAYOUT.withName("EffectiveOnly"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG$LAYOUT.withName("Level")
    ).withName("_SE_IMPERSONATION_STATE");
    public static MemoryLayout $LAYOUT() {
        return _SE_IMPERSONATION_STATE.$struct$LAYOUT;
    }
    static final VarHandle Token$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Token"));
    public static VarHandle Token$VH() {
        return _SE_IMPERSONATION_STATE.Token$VH;
    }
    public static MemoryAddress Token$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_IMPERSONATION_STATE.Token$VH.get(seg);
    }
    public static void Token$set( MemorySegment seg, MemoryAddress x) {
        _SE_IMPERSONATION_STATE.Token$VH.set(seg, x);
    }
    public static MemoryAddress Token$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_IMPERSONATION_STATE.Token$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Token$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_IMPERSONATION_STATE.Token$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CopyOnOpen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CopyOnOpen"));
    public static VarHandle CopyOnOpen$VH() {
        return _SE_IMPERSONATION_STATE.CopyOnOpen$VH;
    }
    public static byte CopyOnOpen$get(MemorySegment seg) {
        return (byte)_SE_IMPERSONATION_STATE.CopyOnOpen$VH.get(seg);
    }
    public static void CopyOnOpen$set( MemorySegment seg, byte x) {
        _SE_IMPERSONATION_STATE.CopyOnOpen$VH.set(seg, x);
    }
    public static byte CopyOnOpen$get(MemorySegment seg, long index) {
        return (byte)_SE_IMPERSONATION_STATE.CopyOnOpen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CopyOnOpen$set(MemorySegment seg, long index, byte x) {
        _SE_IMPERSONATION_STATE.CopyOnOpen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EffectiveOnly$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EffectiveOnly"));
    public static VarHandle EffectiveOnly$VH() {
        return _SE_IMPERSONATION_STATE.EffectiveOnly$VH;
    }
    public static byte EffectiveOnly$get(MemorySegment seg) {
        return (byte)_SE_IMPERSONATION_STATE.EffectiveOnly$VH.get(seg);
    }
    public static void EffectiveOnly$set( MemorySegment seg, byte x) {
        _SE_IMPERSONATION_STATE.EffectiveOnly$VH.set(seg, x);
    }
    public static byte EffectiveOnly$get(MemorySegment seg, long index) {
        return (byte)_SE_IMPERSONATION_STATE.EffectiveOnly$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EffectiveOnly$set(MemorySegment seg, long index, byte x) {
        _SE_IMPERSONATION_STATE.EffectiveOnly$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Level"));
    public static VarHandle Level$VH() {
        return _SE_IMPERSONATION_STATE.Level$VH;
    }
    public static int Level$get(MemorySegment seg) {
        return (int)_SE_IMPERSONATION_STATE.Level$VH.get(seg);
    }
    public static void Level$set( MemorySegment seg, int x) {
        _SE_IMPERSONATION_STATE.Level$VH.set(seg, x);
    }
    public static int Level$get(MemorySegment seg, long index) {
        return (int)_SE_IMPERSONATION_STATE.Level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, int x) {
        _SE_IMPERSONATION_STATE.Level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


