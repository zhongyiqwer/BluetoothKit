package com.inuker.library.connect.response;

/**
 * Created by liwentian on 2016/4/13.
 */
public interface BleUpgradeResponse extends BleResponse<String> {
    void onProgress(int progress);
}
