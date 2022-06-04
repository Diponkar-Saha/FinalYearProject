package com.example.hellodoctor;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.hellodoctor.databinding.ActivityLoginBindingImpl;
import com.example.hellodoctor.databinding.ActivityMainBindingImpl;
import com.example.hellodoctor.databinding.ActivitySplashScreenBindingImpl;
import com.example.hellodoctor.databinding.FragmentAddNewCohortBindingImpl;
import com.example.hellodoctor.databinding.FragmentAddNewMemberBindingImpl;
import com.example.hellodoctor.databinding.FragmentAddNewTaskBindingImpl;
import com.example.hellodoctor.databinding.FragmentChatBindingImpl;
import com.example.hellodoctor.databinding.FragmentCohortInfoBindingImpl;
import com.example.hellodoctor.databinding.FragmentCohortsBindingImpl;
import com.example.hellodoctor.databinding.FragmentProfileBindingImpl;
import com.example.hellodoctor.databinding.FragmentSettingsBindingImpl;
import com.example.hellodoctor.databinding.FragmentTaskDetailBindingImpl;
import com.example.hellodoctor.databinding.FragmentTasksBindingImpl;
import com.example.hellodoctor.databinding.FragmentZoomedImageBindingImpl;
import com.example.hellodoctor.databinding.ItemChatImageReceivedBindingImpl;
import com.example.hellodoctor.databinding.ItemChatImageSentBindingImpl;
import com.example.hellodoctor.databinding.ItemChatTextReceivedBindingImpl;
import com.example.hellodoctor.databinding.ItemChatTextSentBindingImpl;
import com.example.hellodoctor.databinding.ItemCohortBindingImpl;
import com.example.hellodoctor.databinding.ItemInfoUserBindingImpl;
import com.example.hellodoctor.databinding.ItemTasksBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYSPLASHSCREEN = 3;

  private static final int LAYOUT_FRAGMENTADDNEWCOHORT = 4;

  private static final int LAYOUT_FRAGMENTADDNEWMEMBER = 5;

  private static final int LAYOUT_FRAGMENTADDNEWTASK = 6;

  private static final int LAYOUT_FRAGMENTCHAT = 7;

  private static final int LAYOUT_FRAGMENTCOHORTINFO = 8;

  private static final int LAYOUT_FRAGMENTCOHORTS = 9;

  private static final int LAYOUT_FRAGMENTPROFILE = 10;

  private static final int LAYOUT_FRAGMENTSETTINGS = 11;

  private static final int LAYOUT_FRAGMENTTASKDETAIL = 12;

  private static final int LAYOUT_FRAGMENTTASKS = 13;

  private static final int LAYOUT_FRAGMENTZOOMEDIMAGE = 14;

  private static final int LAYOUT_ITEMCHATIMAGERECEIVED = 15;

  private static final int LAYOUT_ITEMCHATIMAGESENT = 16;

  private static final int LAYOUT_ITEMCHATTEXTRECEIVED = 17;

  private static final int LAYOUT_ITEMCHATTEXTSENT = 18;

  private static final int LAYOUT_ITEMCOHORT = 19;

  private static final int LAYOUT_ITEMINFOUSER = 20;

  private static final int LAYOUT_ITEMTASKS = 21;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(21);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.activity_splash_screen, LAYOUT_ACTIVITYSPLASHSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_add_new_cohort, LAYOUT_FRAGMENTADDNEWCOHORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_add_new_member, LAYOUT_FRAGMENTADDNEWMEMBER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_add_new_task, LAYOUT_FRAGMENTADDNEWTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_chat, LAYOUT_FRAGMENTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_cohort_info, LAYOUT_FRAGMENTCOHORTINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_cohorts, LAYOUT_FRAGMENTCOHORTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_task_detail, LAYOUT_FRAGMENTTASKDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_tasks, LAYOUT_FRAGMENTTASKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.fragment_zoomed_image, LAYOUT_FRAGMENTZOOMEDIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.item_chat_image_received, LAYOUT_ITEMCHATIMAGERECEIVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.item_chat_image_sent, LAYOUT_ITEMCHATIMAGESENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.item_chat_text_received, LAYOUT_ITEMCHATTEXTRECEIVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.item_chat_text_sent, LAYOUT_ITEMCHATTEXTSENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.item_cohort, LAYOUT_ITEMCOHORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.item_info_user, LAYOUT_ITEMINFOUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.hellodoctor.R.layout.item_tasks, LAYOUT_ITEMTASKS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASHSCREEN: {
          if ("layout/activity_splash_screen_0".equals(tag)) {
            return new ActivitySplashScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDNEWCOHORT: {
          if ("layout/fragment_add_new_cohort_0".equals(tag)) {
            return new FragmentAddNewCohortBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_new_cohort is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDNEWMEMBER: {
          if ("layout/fragment_add_new_member_0".equals(tag)) {
            return new FragmentAddNewMemberBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_new_member is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDNEWTASK: {
          if ("layout/fragment_add_new_task_0".equals(tag)) {
            return new FragmentAddNewTaskBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_new_task is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHAT: {
          if ("layout/fragment_chat_0".equals(tag)) {
            return new FragmentChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOHORTINFO: {
          if ("layout/fragment_cohort_info_0".equals(tag)) {
            return new FragmentCohortInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cohort_info is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOHORTS: {
          if ("layout/fragment_cohorts_0".equals(tag)) {
            return new FragmentCohortsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cohorts is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTASKDETAIL: {
          if ("layout/fragment_task_detail_0".equals(tag)) {
            return new FragmentTaskDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_task_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTASKS: {
          if ("layout/fragment_tasks_0".equals(tag)) {
            return new FragmentTasksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tasks is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTZOOMEDIMAGE: {
          if ("layout/fragment_zoomed_image_0".equals(tag)) {
            return new FragmentZoomedImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_zoomed_image is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHATIMAGERECEIVED: {
          if ("layout/item_chat_image_received_0".equals(tag)) {
            return new ItemChatImageReceivedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_chat_image_received is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHATIMAGESENT: {
          if ("layout/item_chat_image_sent_0".equals(tag)) {
            return new ItemChatImageSentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_chat_image_sent is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHATTEXTRECEIVED: {
          if ("layout/item_chat_text_received_0".equals(tag)) {
            return new ItemChatTextReceivedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_chat_text_received is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHATTEXTSENT: {
          if ("layout/item_chat_text_sent_0".equals(tag)) {
            return new ItemChatTextSentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_chat_text_sent is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOHORT: {
          if ("layout/item_cohort_0".equals(tag)) {
            return new ItemCohortBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cohort is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMINFOUSER: {
          if ("layout/item_info_user_0".equals(tag)) {
            return new ItemInfoUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_info_user is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTASKS: {
          if ("layout/item_tasks_0".equals(tag)) {
            return new ItemTasksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_tasks is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "chat");
      sKeys.put(2, "cohort");
      sKeys.put(3, "currentUser");
      sKeys.put(4, "imageUrl");
      sKeys.put(5, "isEditing");
      sKeys.put(6, "task");
      sKeys.put(7, "user");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(21);

    static {
      sKeys.put("layout/activity_login_0", com.example.hellodoctor.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.example.hellodoctor.R.layout.activity_main);
      sKeys.put("layout/activity_splash_screen_0", com.example.hellodoctor.R.layout.activity_splash_screen);
      sKeys.put("layout/fragment_add_new_cohort_0", com.example.hellodoctor.R.layout.fragment_add_new_cohort);
      sKeys.put("layout/fragment_add_new_member_0", com.example.hellodoctor.R.layout.fragment_add_new_member);
      sKeys.put("layout/fragment_add_new_task_0", com.example.hellodoctor.R.layout.fragment_add_new_task);
      sKeys.put("layout/fragment_chat_0", com.example.hellodoctor.R.layout.fragment_chat);
      sKeys.put("layout/fragment_cohort_info_0", com.example.hellodoctor.R.layout.fragment_cohort_info);
      sKeys.put("layout/fragment_cohorts_0", com.example.hellodoctor.R.layout.fragment_cohorts);
      sKeys.put("layout/fragment_profile_0", com.example.hellodoctor.R.layout.fragment_profile);
      sKeys.put("layout/fragment_settings_0", com.example.hellodoctor.R.layout.fragment_settings);
      sKeys.put("layout/fragment_task_detail_0", com.example.hellodoctor.R.layout.fragment_task_detail);
      sKeys.put("layout/fragment_tasks_0", com.example.hellodoctor.R.layout.fragment_tasks);
      sKeys.put("layout/fragment_zoomed_image_0", com.example.hellodoctor.R.layout.fragment_zoomed_image);
      sKeys.put("layout/item_chat_image_received_0", com.example.hellodoctor.R.layout.item_chat_image_received);
      sKeys.put("layout/item_chat_image_sent_0", com.example.hellodoctor.R.layout.item_chat_image_sent);
      sKeys.put("layout/item_chat_text_received_0", com.example.hellodoctor.R.layout.item_chat_text_received);
      sKeys.put("layout/item_chat_text_sent_0", com.example.hellodoctor.R.layout.item_chat_text_sent);
      sKeys.put("layout/item_cohort_0", com.example.hellodoctor.R.layout.item_cohort);
      sKeys.put("layout/item_info_user_0", com.example.hellodoctor.R.layout.item_info_user);
      sKeys.put("layout/item_tasks_0", com.example.hellodoctor.R.layout.item_tasks);
    }
  }
}
