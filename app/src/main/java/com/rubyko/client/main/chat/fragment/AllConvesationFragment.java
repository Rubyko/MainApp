package com.rubyko.client.main.chat.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rubyko.client.R;
import com.rubyko.client.common.RubykoClient;
import com.rubyko.client.common.RubykoFragment;
import com.rubyko.client.main.MainRubykoActivity;
import com.rubyko.shared.common.login.model.User;
import com.rubyko.shared.peer.chat.Conversation;

/**
 * Created by alex on 28.02.16.
 */
public class AllConvesationFragment extends RubykoFragment<MainRubykoActivity> {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater pInflater, ViewGroup pContainer, Bundle savedInstanceState) {
        final View view = pInflater.inflate(R.layout.fragment_chat, pContainer, false);

        // boss server
        final User user = new User("111", "111", "111", "111", "111");

        // peer server
        final Conversation conversation = RubykoClient.lookupService(user, Conversation.class, "111");
        addChatFragment(conversation);

        return view;
    }


    private void addChatFragment(Conversation conversation){
        Bundle bundle = new Bundle();
        bundle.putSerializable(Conversation.class.getName(), conversation);
        getFragmentActivity().replaceFragment(bundle, SpecificConversationFragment.class);
    }

}
