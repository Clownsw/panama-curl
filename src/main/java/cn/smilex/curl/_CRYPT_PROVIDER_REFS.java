// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_PROVIDER_REFS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cProviders"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpProviders")
    ).withName("_CRYPT_PROVIDER_REFS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_PROVIDER_REFS.$struct$LAYOUT;
    }
    static final VarHandle cProviders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cProviders"));
    public static VarHandle cProviders$VH() {
        return _CRYPT_PROVIDER_REFS.cProviders$VH;
    }
    public static int cProviders$get(MemorySegment seg) {
        return (int)_CRYPT_PROVIDER_REFS.cProviders$VH.get(seg);
    }
    public static void cProviders$set( MemorySegment seg, int x) {
        _CRYPT_PROVIDER_REFS.cProviders$VH.set(seg, x);
    }
    public static int cProviders$get(MemorySegment seg, long index) {
        return (int)_CRYPT_PROVIDER_REFS.cProviders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cProviders$set(MemorySegment seg, long index, int x) {
        _CRYPT_PROVIDER_REFS.cProviders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpProviders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpProviders"));
    public static VarHandle rgpProviders$VH() {
        return _CRYPT_PROVIDER_REFS.rgpProviders$VH;
    }
    public static MemoryAddress rgpProviders$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROVIDER_REFS.rgpProviders$VH.get(seg);
    }
    public static void rgpProviders$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PROVIDER_REFS.rgpProviders$VH.set(seg, x);
    }
    public static MemoryAddress rgpProviders$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROVIDER_REFS.rgpProviders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpProviders$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PROVIDER_REFS.rgpProviders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

