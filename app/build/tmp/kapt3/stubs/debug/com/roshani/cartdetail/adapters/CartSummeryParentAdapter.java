package com.roshani.cartdetail.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BU\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J6\u0010 \u001a\u00020\u00132\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/roshani/cartdetail/adapters/CartSummeryParentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/roshani/cartdetail/adapters/CartSummeryParentAdapter$MyViewHolder;", "serviceList", "Ljava/util/ArrayList;", "Lcom/roshani/cartdetail/model/Service;", "Lkotlin/collections/ArrayList;", "productList", "Lcom/roshani/cartdetail/model/Product;", "catList", "Lcom/roshani/cartdetail/model/SubCategory;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onItemClick", "Lkotlin/Function1;", "", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setList", "subList", "productListNew", "MyViewHolder", "app_debug"})
public final class CartSummeryParentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.roshani.cartdetail.adapters.CartSummeryParentAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.roshani.cartdetail.model.Service> serviceList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.roshani.cartdetail.model.Product> productList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.roshani.cartdetail.model.SubCategory> catList;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick;
    
    public CartSummeryParentAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Service> serviceList, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Product> productList, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.SubCategory> catList, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.roshani.cartdetail.adapters.CartSummeryParentAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.roshani.cartdetail.adapters.CartSummeryParentAdapter.MyViewHolder holder, int position) {
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Service> subList, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.roshani.cartdetail.model.Product> productListNew) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/roshani/cartdetail/adapters/CartSummeryParentAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/roshani/cartdetail/databinding/ItemCartParentBinding;", "(Lcom/roshani/cartdetail/databinding/ItemCartParentBinding;)V", "mBinding", "getMBinding", "()Lcom/roshani/cartdetail/databinding/ItemCartParentBinding;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable
        private final com.roshani.cartdetail.databinding.ItemCartParentBinding mBinding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.roshani.cartdetail.databinding.ItemCartParentBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.roshani.cartdetail.databinding.ItemCartParentBinding getMBinding() {
            return null;
        }
    }
}