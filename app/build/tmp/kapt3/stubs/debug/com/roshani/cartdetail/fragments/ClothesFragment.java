package com.roshani.cartdetail.fragments;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u000fj\b\u0012\u0004\u0012\u00020\u0019`\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u000fj\b\u0012\u0004\u0012\u00020\u001b`\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/roshani/cartdetail/fragments/ClothesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/roshani/cartdetail/databinding/FragmentClothesBinding;", "adapterCloth", "Lcom/roshani/cartdetail/adapters/ClothesParentAdapter;", "getAdapterCloth", "()Lcom/roshani/cartdetail/adapters/ClothesParentAdapter;", "setAdapterCloth", "(Lcom/roshani/cartdetail/adapters/ClothesParentAdapter;)V", "binding", "getBinding", "()Lcom/roshani/cartdetail/databinding/FragmentClothesBinding;", "categoryList", "Ljava/util/ArrayList;", "Lcom/roshani/cartdetail/model/SubCategory;", "Lkotlin/collections/ArrayList;", "dataViewModel", "Lcom/roshani/cartdetail/viewmodel/DataViewModel;", "getDataViewModel", "()Lcom/roshani/cartdetail/viewmodel/DataViewModel;", "dataViewModel$delegate", "Lkotlin/Lazy;", "productList", "Lcom/roshani/cartdetail/model/Product;", "serviceList", "Lcom/roshani/cartdetail/model/Service;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "showCustomDialog", "id", "", "idService", "app_debug"})
public final class ClothesFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.roshani.cartdetail.databinding.FragmentClothesBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy dataViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.roshani.cartdetail.model.SubCategory> categoryList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.roshani.cartdetail.model.Product> productList;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.roshani.cartdetail.model.Service> serviceList;
    @org.jetbrains.annotations.Nullable
    private com.roshani.cartdetail.adapters.ClothesParentAdapter adapterCloth;
    
    public ClothesFragment() {
        super();
    }
    
    private final com.roshani.cartdetail.viewmodel.DataViewModel getDataViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.roshani.cartdetail.adapters.ClothesParentAdapter getAdapterCloth() {
        return null;
    }
    
    public final void setAdapterCloth(@org.jetbrains.annotations.Nullable
    com.roshani.cartdetail.adapters.ClothesParentAdapter p0) {
    }
    
    private final com.roshani.cartdetail.databinding.FragmentClothesBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showCustomDialog(java.lang.String id, java.lang.String idService) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}