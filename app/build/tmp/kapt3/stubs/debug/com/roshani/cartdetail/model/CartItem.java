package com.roshani.cartdetail.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005H\u00c6\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005H\u00c6\u0003JW\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00052\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/roshani/cartdetail/model/CartItem;", "Ljava/io/Serializable;", "sub_categories", "Ljava/util/ArrayList;", "Lcom/roshani/cartdetail/model/SubCategory;", "Lkotlin/collections/ArrayList;", "products", "Lcom/roshani/cartdetail/model/Product;", "services", "Lcom/roshani/cartdetail/model/Service;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getProducts", "()Ljava/util/ArrayList;", "getServices", "getSub_categories", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
public final class CartItem implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.roshani.cartdetail.model.SubCategory> sub_categories = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.roshani.cartdetail.model.Product> products = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.roshani.cartdetail.model.Service> services = null;
    
    public CartItem(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.SubCategory> sub_categories, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Product> products, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Service> services) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.roshani.cartdetail.model.SubCategory> getSub_categories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.roshani.cartdetail.model.Product> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.roshani.cartdetail.model.Service> getServices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.roshani.cartdetail.model.SubCategory> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.roshani.cartdetail.model.Product> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.roshani.cartdetail.model.Service> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.roshani.cartdetail.model.CartItem copy(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.SubCategory> sub_categories, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Product> products, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Service> services) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}