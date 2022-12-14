// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENCRYPTION_KEY_CTRL_INPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("HeaderSize"),
        Constants$root.C_LONG$LAYOUT.withName("StructureSize"),
        Constants$root.C_SHORT$LAYOUT.withName("KeyOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("KeySize"),
        Constants$root.C_LONG$LAYOUT.withName("DplLock"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DplUserId"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("DplCredentialId")
    ).withName("_ENCRYPTION_KEY_CTRL_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _ENCRYPTION_KEY_CTRL_INPUT.$struct$LAYOUT;
    }
    static final VarHandle HeaderSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HeaderSize"));
    public static VarHandle HeaderSize$VH() {
        return _ENCRYPTION_KEY_CTRL_INPUT.HeaderSize$VH;
    }
    public static int HeaderSize$get(MemorySegment seg) {
        return (int)_ENCRYPTION_KEY_CTRL_INPUT.HeaderSize$VH.get(seg);
    }
    public static void HeaderSize$set( MemorySegment seg, int x) {
        _ENCRYPTION_KEY_CTRL_INPUT.HeaderSize$VH.set(seg, x);
    }
    public static int HeaderSize$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTION_KEY_CTRL_INPUT.HeaderSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HeaderSize$set(MemorySegment seg, long index, int x) {
        _ENCRYPTION_KEY_CTRL_INPUT.HeaderSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StructureSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StructureSize"));
    public static VarHandle StructureSize$VH() {
        return _ENCRYPTION_KEY_CTRL_INPUT.StructureSize$VH;
    }
    public static int StructureSize$get(MemorySegment seg) {
        return (int)_ENCRYPTION_KEY_CTRL_INPUT.StructureSize$VH.get(seg);
    }
    public static void StructureSize$set( MemorySegment seg, int x) {
        _ENCRYPTION_KEY_CTRL_INPUT.StructureSize$VH.set(seg, x);
    }
    public static int StructureSize$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTION_KEY_CTRL_INPUT.StructureSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StructureSize$set(MemorySegment seg, long index, int x) {
        _ENCRYPTION_KEY_CTRL_INPUT.StructureSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle KeyOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("KeyOffset"));
    public static VarHandle KeyOffset$VH() {
        return _ENCRYPTION_KEY_CTRL_INPUT.KeyOffset$VH;
    }
    public static short KeyOffset$get(MemorySegment seg) {
        return (short)_ENCRYPTION_KEY_CTRL_INPUT.KeyOffset$VH.get(seg);
    }
    public static void KeyOffset$set( MemorySegment seg, short x) {
        _ENCRYPTION_KEY_CTRL_INPUT.KeyOffset$VH.set(seg, x);
    }
    public static short KeyOffset$get(MemorySegment seg, long index) {
        return (short)_ENCRYPTION_KEY_CTRL_INPUT.KeyOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KeyOffset$set(MemorySegment seg, long index, short x) {
        _ENCRYPTION_KEY_CTRL_INPUT.KeyOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle KeySize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("KeySize"));
    public static VarHandle KeySize$VH() {
        return _ENCRYPTION_KEY_CTRL_INPUT.KeySize$VH;
    }
    public static short KeySize$get(MemorySegment seg) {
        return (short)_ENCRYPTION_KEY_CTRL_INPUT.KeySize$VH.get(seg);
    }
    public static void KeySize$set( MemorySegment seg, short x) {
        _ENCRYPTION_KEY_CTRL_INPUT.KeySize$VH.set(seg, x);
    }
    public static short KeySize$get(MemorySegment seg, long index) {
        return (short)_ENCRYPTION_KEY_CTRL_INPUT.KeySize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KeySize$set(MemorySegment seg, long index, short x) {
        _ENCRYPTION_KEY_CTRL_INPUT.KeySize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DplLock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DplLock"));
    public static VarHandle DplLock$VH() {
        return _ENCRYPTION_KEY_CTRL_INPUT.DplLock$VH;
    }
    public static int DplLock$get(MemorySegment seg) {
        return (int)_ENCRYPTION_KEY_CTRL_INPUT.DplLock$VH.get(seg);
    }
    public static void DplLock$set( MemorySegment seg, int x) {
        _ENCRYPTION_KEY_CTRL_INPUT.DplLock$VH.set(seg, x);
    }
    public static int DplLock$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTION_KEY_CTRL_INPUT.DplLock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DplLock$set(MemorySegment seg, long index, int x) {
        _ENCRYPTION_KEY_CTRL_INPUT.DplLock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DplUserId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DplUserId"));
    public static VarHandle DplUserId$VH() {
        return _ENCRYPTION_KEY_CTRL_INPUT.DplUserId$VH;
    }
    public static long DplUserId$get(MemorySegment seg) {
        return (long)_ENCRYPTION_KEY_CTRL_INPUT.DplUserId$VH.get(seg);
    }
    public static void DplUserId$set( MemorySegment seg, long x) {
        _ENCRYPTION_KEY_CTRL_INPUT.DplUserId$VH.set(seg, x);
    }
    public static long DplUserId$get(MemorySegment seg, long index) {
        return (long)_ENCRYPTION_KEY_CTRL_INPUT.DplUserId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DplUserId$set(MemorySegment seg, long index, long x) {
        _ENCRYPTION_KEY_CTRL_INPUT.DplUserId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DplCredentialId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DplCredentialId"));
    public static VarHandle DplCredentialId$VH() {
        return _ENCRYPTION_KEY_CTRL_INPUT.DplCredentialId$VH;
    }
    public static long DplCredentialId$get(MemorySegment seg) {
        return (long)_ENCRYPTION_KEY_CTRL_INPUT.DplCredentialId$VH.get(seg);
    }
    public static void DplCredentialId$set( MemorySegment seg, long x) {
        _ENCRYPTION_KEY_CTRL_INPUT.DplCredentialId$VH.set(seg, x);
    }
    public static long DplCredentialId$get(MemorySegment seg, long index) {
        return (long)_ENCRYPTION_KEY_CTRL_INPUT.DplCredentialId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DplCredentialId$set(MemorySegment seg, long index, long x) {
        _ENCRYPTION_KEY_CTRL_INPUT.DplCredentialId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


