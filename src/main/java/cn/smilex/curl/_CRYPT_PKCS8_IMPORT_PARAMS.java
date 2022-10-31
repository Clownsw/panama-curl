// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_PKCS8_IMPORT_PARAMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("PrivateKey"),
        Constants$root.C_POINTER$LAYOUT.withName("pResolvehCryptProvFunc"),
        Constants$root.C_POINTER$LAYOUT.withName("pVoidResolveFunc"),
        Constants$root.C_POINTER$LAYOUT.withName("pDecryptPrivateKeyFunc"),
        Constants$root.C_POINTER$LAYOUT.withName("pVoidDecryptFunc")
    ).withName("_CRYPT_PKCS8_IMPORT_PARAMS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_PKCS8_IMPORT_PARAMS.$struct$LAYOUT;
    }
    public static MemorySegment PrivateKey$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle pResolvehCryptProvFunc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pResolvehCryptProvFunc"));
    public static VarHandle pResolvehCryptProvFunc$VH() {
        return _CRYPT_PKCS8_IMPORT_PARAMS.pResolvehCryptProvFunc$VH;
    }
    public static MemoryAddress pResolvehCryptProvFunc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_IMPORT_PARAMS.pResolvehCryptProvFunc$VH.get(seg);
    }
    public static void pResolvehCryptProvFunc$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PKCS8_IMPORT_PARAMS.pResolvehCryptProvFunc$VH.set(seg, x);
    }
    public static MemoryAddress pResolvehCryptProvFunc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_IMPORT_PARAMS.pResolvehCryptProvFunc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pResolvehCryptProvFunc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PKCS8_IMPORT_PARAMS.pResolvehCryptProvFunc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PCRYPT_RESOLVE_HCRYPTPROV_FUNC pResolvehCryptProvFunc (MemorySegment segment, MemorySession session) {
        return PCRYPT_RESOLVE_HCRYPTPROV_FUNC.ofAddress(pResolvehCryptProvFunc$get(segment), session);
    }
    static final VarHandle pVoidResolveFunc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pVoidResolveFunc"));
    public static VarHandle pVoidResolveFunc$VH() {
        return _CRYPT_PKCS8_IMPORT_PARAMS.pVoidResolveFunc$VH;
    }
    public static MemoryAddress pVoidResolveFunc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_IMPORT_PARAMS.pVoidResolveFunc$VH.get(seg);
    }
    public static void pVoidResolveFunc$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PKCS8_IMPORT_PARAMS.pVoidResolveFunc$VH.set(seg, x);
    }
    public static MemoryAddress pVoidResolveFunc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_IMPORT_PARAMS.pVoidResolveFunc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pVoidResolveFunc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PKCS8_IMPORT_PARAMS.pVoidResolveFunc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDecryptPrivateKeyFunc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDecryptPrivateKeyFunc"));
    public static VarHandle pDecryptPrivateKeyFunc$VH() {
        return _CRYPT_PKCS8_IMPORT_PARAMS.pDecryptPrivateKeyFunc$VH;
    }
    public static MemoryAddress pDecryptPrivateKeyFunc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_IMPORT_PARAMS.pDecryptPrivateKeyFunc$VH.get(seg);
    }
    public static void pDecryptPrivateKeyFunc$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PKCS8_IMPORT_PARAMS.pDecryptPrivateKeyFunc$VH.set(seg, x);
    }
    public static MemoryAddress pDecryptPrivateKeyFunc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_IMPORT_PARAMS.pDecryptPrivateKeyFunc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDecryptPrivateKeyFunc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PKCS8_IMPORT_PARAMS.pDecryptPrivateKeyFunc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PCRYPT_DECRYPT_PRIVATE_KEY_FUNC pDecryptPrivateKeyFunc (MemorySegment segment, MemorySession session) {
        return PCRYPT_DECRYPT_PRIVATE_KEY_FUNC.ofAddress(pDecryptPrivateKeyFunc$get(segment), session);
    }
    static final VarHandle pVoidDecryptFunc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pVoidDecryptFunc"));
    public static VarHandle pVoidDecryptFunc$VH() {
        return _CRYPT_PKCS8_IMPORT_PARAMS.pVoidDecryptFunc$VH;
    }
    public static MemoryAddress pVoidDecryptFunc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_IMPORT_PARAMS.pVoidDecryptFunc$VH.get(seg);
    }
    public static void pVoidDecryptFunc$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PKCS8_IMPORT_PARAMS.pVoidDecryptFunc$VH.set(seg, x);
    }
    public static MemoryAddress pVoidDecryptFunc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_IMPORT_PARAMS.pVoidDecryptFunc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pVoidDecryptFunc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PKCS8_IMPORT_PARAMS.pVoidDecryptFunc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


