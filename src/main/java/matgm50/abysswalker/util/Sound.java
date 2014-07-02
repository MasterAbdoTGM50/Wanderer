package matgm50.abysswalker.util;

import net.minecraft.client.audio.ISound;
import net.minecraft.util.ResourceLocation;

/**
 * Created by MasterAbdoTGM50 on 7/1/2014.
 */

public class Sound implements ISound {

    @Override
    public ResourceLocation getPositionedSoundLocation() {
        return null;
    }

    @Override
    public boolean canRepeat() {
        return false;
    }

    @Override
    public int getRepeatDelay() {
        return 0;
    }

    @Override
    public float getVolume() {
        return 0;
    }

    @Override
    public float getPitch() {
        return 0;
    }

    @Override
    public float getXPosF() {
        return 0;
    }

    @Override
    public float getYPosF() {
        return 0;
    }

    @Override
    public float getZPosF() {
        return 0;
    }

    @Override
    public AttenuationType getAttenuationType() {
        return null;
    }

}
