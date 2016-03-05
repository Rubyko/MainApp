package com.rubyko.shared.boss.net;

import com.rubyko.shared.common.net.model.UserNetInfo;

import java.io.Serializable;

/**
 * Created by alex on 28.02.16.
 */
public interface BossUserNetInfoUpdater extends Serializable {
    void update(UserNetInfo userNetInfo);
}