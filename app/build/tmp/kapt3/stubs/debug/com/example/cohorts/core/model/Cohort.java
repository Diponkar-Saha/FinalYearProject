package com.example.cohorts.core.model;

import java.lang.System;

/**
 * Model class for a Cohort.
 *
 * @param cohortName name of cohort
 * @param cohortDescription description of the cohort
 * @param cohortUid unique id of the cohort
 * @param numberOfMembers the number of members that are in cohort
 * @param cohortMembers list of users that are in this cohort
 * @param isCallOngoing true if call is going on else false
 * @param cohortRoomCode unique room code of this cohort
 * @param membersInMeeting list of users that are in the meeting of this cohort
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003Ji\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\u0007H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00060"}, d2 = {"Lcom/example/cohorts/core/model/Cohort;", "Ljava/io/Serializable;", "cohortName", "", "cohortDescription", "cohortUid", "numberOfMembers", "", "cohortMembers", "", "isCallOngoing", "", "cohortRoomCode", "membersInMeeting", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/lang/String;Ljava/util/List;)V", "getCohortDescription", "()Ljava/lang/String;", "setCohortDescription", "(Ljava/lang/String;)V", "getCohortMembers", "()Ljava/util/List;", "getCohortName", "setCohortName", "getCohortRoomCode", "getCohortUid", "setCohortUid", "()Z", "setCallOngoing", "(Z)V", "getMembersInMeeting", "getNumberOfMembers", "()I", "setNumberOfMembers", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class Cohort implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cohortName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cohortDescription;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cohortUid;
    private int numberOfMembers;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> cohortMembers = null;
    private boolean isCallOngoing;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cohortRoomCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> membersInMeeting = null;
    
    /**
     * Model class for a Cohort.
     *
     * @param cohortName name of cohort
     * @param cohortDescription description of the cohort
     * @param cohortUid unique id of the cohort
     * @param numberOfMembers the number of members that are in cohort
     * @param cohortMembers list of users that are in this cohort
     * @param isCallOngoing true if call is going on else false
     * @param cohortRoomCode unique room code of this cohort
     * @param membersInMeeting list of users that are in the meeting of this cohort
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.cohorts.core.model.Cohort copy(@org.jetbrains.annotations.Nullable()
    java.lang.String cohortName, @org.jetbrains.annotations.Nullable()
    java.lang.String cohortDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid, int numberOfMembers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> cohortMembers, boolean isCallOngoing, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortRoomCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> membersInMeeting) {
        return null;
    }
    
    /**
     * Model class for a Cohort.
     *
     * @param cohortName name of cohort
     * @param cohortDescription description of the cohort
     * @param cohortUid unique id of the cohort
     * @param numberOfMembers the number of members that are in cohort
     * @param cohortMembers list of users that are in this cohort
     * @param isCallOngoing true if call is going on else false
     * @param cohortRoomCode unique room code of this cohort
     * @param membersInMeeting list of users that are in the meeting of this cohort
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model class for a Cohort.
     *
     * @param cohortName name of cohort
     * @param cohortDescription description of the cohort
     * @param cohortUid unique id of the cohort
     * @param numberOfMembers the number of members that are in cohort
     * @param cohortMembers list of users that are in this cohort
     * @param isCallOngoing true if call is going on else false
     * @param cohortRoomCode unique room code of this cohort
     * @param membersInMeeting list of users that are in the meeting of this cohort
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model class for a Cohort.
     *
     * @param cohortName name of cohort
     * @param cohortDescription description of the cohort
     * @param cohortUid unique id of the cohort
     * @param numberOfMembers the number of members that are in cohort
     * @param cohortMembers list of users that are in this cohort
     * @param isCallOngoing true if call is going on else false
     * @param cohortRoomCode unique room code of this cohort
     * @param membersInMeeting list of users that are in the meeting of this cohort
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Cohort() {
        super();
    }
    
    public Cohort(@org.jetbrains.annotations.Nullable()
    java.lang.String cohortName, @org.jetbrains.annotations.Nullable()
    java.lang.String cohortDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortUid, int numberOfMembers, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> cohortMembers, boolean isCallOngoing, @org.jetbrains.annotations.NotNull()
    java.lang.String cohortRoomCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> membersInMeeting) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCohortName() {
        return null;
    }
    
    public final void setCohortName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCohortDescription() {
        return null;
    }
    
    public final void setCohortDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCohortUid() {
        return null;
    }
    
    public final void setCohortUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getNumberOfMembers() {
        return 0;
    }
    
    public final void setNumberOfMembers(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCohortMembers() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean isCallOngoing() {
        return false;
    }
    
    public final void setCallOngoing(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCohortRoomCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMembersInMeeting() {
        return null;
    }
}