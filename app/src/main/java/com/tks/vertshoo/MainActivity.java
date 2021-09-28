package com.tks.vertshoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eaglesakura.lib.android.game.activity.GL11GameActivityBase;
import com.eaglesakura.lib.android.game.loop.GameLoopManagerBase;
import com.eaglesakura.lib.android.game.math.Vector2;

public class MainActivity extends GL11GameActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected GameLoopManagerBase createGameLoopManager() {
        return new FoxOne(this, this);
    }

    @Override
    protected Vector2 getVirtualDisplaySize() {
        return new Vector2(Define.VIRTUAL_DISPLAY_WIDTH, Define.VIRTUAL_DISPLAY_HEIGHT);
    }
}
