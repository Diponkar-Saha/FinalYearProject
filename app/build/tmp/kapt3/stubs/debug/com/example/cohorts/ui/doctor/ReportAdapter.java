package com.example.cohorts.ui.doctor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\b0\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/example/cohorts/ui/doctor/ReportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/cohorts/ui/doctor/ReportAdapter$MyViewHolder;", "cellClickListener", "Lcom/example/cohorts/ui/doctor/CellClickListener;", "(Lcom/example/cohorts/ui/doctor/CellClickListener;)V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/cohorts/model/report/rr/ReportResult;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "value", "", "doctorShows", "getDoctorShows", "()Ljava/util/List;", "setDoctorShows", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class ReportAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.cohorts.ui.doctor.ReportAdapter.MyViewHolder> {
    private final com.example.cohorts.ui.doctor.CellClickListener cellClickListener = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.cohorts.model.report.rr.ReportResult> diffCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.cohorts.model.report.rr.ReportResult> differ = null;
    
    public ReportAdapter(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.ui.doctor.CellClickListener cellClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.cohorts.model.report.rr.ReportResult> getDoctorShows() {
        return null;
    }
    
    public final void setDoctorShows(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.cohorts.model.report.rr.ReportResult> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cohorts.ui.doctor.ReportAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.cohorts.ui.doctor.ReportAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/cohorts/ui/doctor/ReportAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/cohorts/databinding/PatientAppointmentBinding;", "(Lcom/example/cohorts/ui/doctor/ReportAdapter;Lcom/example/cohorts/databinding/PatientAppointmentBinding;)V", "getBinding", "()Lcom/example/cohorts/databinding/PatientAppointmentBinding;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.cohorts.databinding.PatientAppointmentBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.cohorts.databinding.PatientAppointmentBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.cohorts.databinding.PatientAppointmentBinding getBinding() {
            return null;
        }
    }
}